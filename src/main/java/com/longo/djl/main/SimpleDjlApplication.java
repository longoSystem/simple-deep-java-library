/**
 * Aplicando Deep Java Libray com SpringBoot.
 * 
 * Usando deep learning para detectar os elementos que aparecem nas imagens.
 * 
 * @author longo.juliano[at]gm41l.c0m
 * @date 2021/10/17 
 */

package com.longo.djl.main;

import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

import ai.djl.inference.Predictor;
import ai.djl.modality.Classifications.Classification;
import ai.djl.modality.cv.Image;
import ai.djl.modality.cv.ImageFactory;
import ai.djl.modality.cv.output.DetectedObjects;
import ai.djl.translate.TranslateException;

@SpringBootApplication
public class SimpleDjlApplication implements CommandLineRunner {

	private static final Logger LOG = (Logger) LoggerFactory.getLogger(SimpleDjlApplication.class);

	@Resource
	Supplier<Predictor<Image, DetectedObjects>> predictorProvider;

	public static void main(String[] args) {
		SpringApplication.run(SimpleDjlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// criar o vetor de imagens para sofrerem a inferencia.
		org.springframework.core.io.Resource imagens[] = new org.springframework.core.io.Resource[] {
				new ClassPathResource("/images/como-tirar-foto-de-cachorro.jpg"),
				new ClassPathResource("/images/1307576.jpg"), 
				new ClassPathResource("/images/693450.jpg"),
				new ClassPathResource("/images/MichioKaku.jpeg") };

		for (org.springframework.core.io.Resource imagem : imagens) {
			// realiza as análise e devolve as conclusões
			processarInferencia(imagem);
		}
	}

	/**
	 * 
	 * @param imagem
	 * @throws IOException
	 * @throws TranslateException
	 */
	private void processarInferencia(org.springframework.core.io.Resource imagem) throws IOException, TranslateException {
		Image image = ImageFactory.getInstance().fromInputStream(imagem.getInputStream());
		try (Predictor<Image, DetectedObjects> predictor = predictorProvider.get()) {
			DetectedObjects resultados = predictor.predict(image);

			List<Classification> itens = resultados.items();
			for (Classification resultado : itens) {
				LOG.info("Resultados para {}: {}", imagem.getFilename(), resultado.toString());
			}

		}
	}

}
