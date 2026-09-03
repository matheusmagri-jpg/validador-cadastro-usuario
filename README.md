# Validador de Cadastro de Usuário

Aplicação em Java para validar os dados de cadastro de um usuário (nome, e-mail, senha, idade, CPF, entre outros), aplicando regras de validação antes de confirmar o registro.

Projeto desenvolvido como exercício de estudo de Java e Programação Orientada a Objetos (POO).

## ✅ Regras de validação

> Ajuste esta seção conforme as regras realmente implementadas no projeto.

- **Nome**: não pode ser vazio e deve conter apenas letras.
- **E-mail**: deve seguir um formato válido (ex: `usuario@dominio.com`).
- **Senha**: deve atender a critérios mínimos de segurança (tamanho mínimo, letras e números, etc.).
- **Idade**: deve ser um número válido e maior ou igual à idade mínima permitida.
- **CPF**: deve ser válido conforme o algoritmo de verificação de dígitos.

Caso algum campo seja inválido, o sistema deve informar ao usuário qual regra não foi atendida.

## 🚀 Tecnologias utilizadas

- Java
- Programação Orientada a Objetos (POO)

## ▶️ Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/matheusmagri-jpg/validador-cadastro-usuario.git
   ```
2. Compile os arquivos-fonte:
   ```bash
   javac -d build src/**/*.java
   ```
3. Execute a classe principal:
   ```bash
   java -cp build NomeDaClassePrincipal
   ```
   > Substitua `NomeDaClassePrincipal` pelo nome real da classe com o método `main`, e ajuste os caminhos conforme a estrutura de pastas do projeto.

## 📁 Estrutura do projeto

```
validador-cadastro-usuario/
├── src/           # Código-fonte da aplicação
└── README.md
```

> Estrutura ainda inicial — atualize conforme novos arquivos e pacotes forem adicionados ao projeto.

## 📌 Status

Projeto de estudo, em desenvolvimento.

## 📄 Licença

Este projeto é de uso livre para fins de estudo.
