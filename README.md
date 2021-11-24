# Overview

Este projeto serve como referência para o desenvolvimento de software com **SpringBoot** e **Deep Java Libray** para aplicar a inferência de classificação de images e assim tentar identificar os objetos 
existentes em imagens.

## Principais tratativas

- Padronizar o desenvolvimento aplicações com aprendizado de máquinas em Java;
- A JSR 381 foi desenvolvida para preencher essa lacuna;
- O Deep Java Library (DLJ) da Amazon é uma das diversas implementações desta nova padronização;
- Uma parte da JSR 381 é o reconhecimento visual (VisRec) de imagens;
- O DLJ inclui um conjunto de modelos pré-treinados.

### Implementando Deep Java Libary com Spring Boot e Java 11

O Spring Boot é um framework de código aberto muito popular e amplamente difundido na comunidade de desenvolvedores Java, muito usado para o desenvolvimento de microsserviços e simplificou a 
implementações de Machine Learning em sistemas distribuídos.
<br/><br/>

A **Deep Java Library (DJL)** é uma API Java de código aberto de alto nível e independente de estrutura para Deep Learning, ela foi projetada para ser de fácil utilização e para simplificar a aplicação de inteligência artificial em projetos Java.
<br/><br/>

O uso da biblioteca do DJL é específica da plataforma, mas ela te fornece maneiras de pesquisar automaticamente a dependência correta com base no sistema operacional de destino. Mas para os mecanismos subjacentes (como MXNet, PyTorch ou TensorFlow), é preciso que você saiba qual você vai usar. 
<br/><br/>

Neste projetos usaremos a API MXNet que oferece suporte para realizar inferência em um modelo treinado. A API MXNet Java Inference é uma extensão da API Scala Infer que fornece carregamento de modelo e funcionalidade de inferência. O objetivo do pacote MXNet Java é fornecer uma API de inferência eficiente e fácil de usar. O pacote MXNet Java torna mais fácil implementar rapidamente um modelo existente em um ecossistema Java de nível de produção.

## Requisitos
1. Java versão 11;
2. Sólidos conhecimentos em Java Fundamentos;
3. Noções de algorítimos de Deep Learning;


