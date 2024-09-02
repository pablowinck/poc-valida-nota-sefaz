Sou o Devia. Como posso ajudar?

Aqui está um exemplo de README para o projeto "poc-valida-nota-sefaz":

---

# poc-valida-nota-sefaz

Este projeto é uma prova de conceito (PoC) para validação de Notas Fiscais Eletrônicas (NF-e) utilizando a API da SEFAZ (Secretaria da Fazenda). O projeto foi desenvolvido com **Spring Boot** e **OpenFeign** para realizar as requisições à API.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **OpenFeign**
- **Maven**

## Funcionalidades

- **Validação de NF-e**: Envia uma nota fiscal eletrônica no formato XML para a SEFAZ e retorna se a nota é válida.

## Como Executar

1. **Clone o repositório**:

   ```bash
   git clone https://github.com/pablowinck/poc-valida-nota-sefaz.git
   cd poc-valida-nota-sefaz
   ```

2. **Compile e execute o projeto**:

   ```bash
   ./mvnw spring-boot:run
   ```

3. **Envie uma NF-e para validação**:

   O projeto já está configurado para validar uma NF-e de exemplo ao ser executado. A saída da validação será exibida no console.

## Estrutura do Projeto

- `src/main/java/com/github/pablowinck/pocvalidasefaz`: Contém as classes principais do projeto:
    - `PocValidaSefazApplication`: Classe principal que inicializa a aplicação e realiza a validação da NF-e.
    - `NFeService`: Serviço responsável por enviar a NF-e para validação.
    - `SefazClient`: Interface Feign que define o cliente HTTP para comunicação com a API da SEFAZ.

## Configuração da SEFAZ

O cliente Feign `SefazClient` está configurado para se comunicar com o ambiente da SEFAZ utilizando a URL de produção do estado do Rio Grande do Sul (`https://www.sefaz.rs.gov.br/NFE`). Para utilizar outros ambientes ou estados, altere a URL conforme necessário.