/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validador.cadastro.usuario;

import java.util.Scanner; // Lê dados do teclado/arquivo (entrada do usuário)
//import java.util.ArrayList; // Lista dinâmica que cresce automaticamente
//import java.util.HashMap; // Mapa chave→valor, acesso rápido por chave
//import java.util.Map; // Interface base para mapas como HashMap e TreeMap
//import java.util.Date; // Representa uma data e hora específicas
//import java.text.SimpleDateFormat; // Formata e analisa datas no formato desejado
//import java.util.Random; // Gera números pseudoaleatórios
//import java.util.Arrays; // Utilitários para trabalhar com arrays (ordenar, buscar, comparar)
//import java.util.Collections; // Operações prontas para coleções (ordenar, embaralhar, máximo/mínimo)
//import java.math.BigDecimal; // Números decimais com precisão exata (evita erros de ponto flutuante)
//import java.io.IOException; // Exceção para erros de entrada e saída (leitura/escrita de arquivos)

/**
 *
 * @author matheus
 */
public class ValidadorCadastroUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("CADASTRO DE USUARIO");

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu e-mail: ");
        String email = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        System.out.print("Confirme sua senha: ");
        String confirmacao = scanner.nextLine();

        boolean cadastroValido = true;

       
        if (nome.trim().length() < 3) {

            System.out.println("Nome invalido!");
            System.out.println("O nome deve ter no minimo 3 caracteres.");

            cadastroValido = false;
        }


        boolean temArroba = email.contains("@");
        boolean temPonto = email.contains(".");
        boolean comecaComArroba = email.startsWith("@");
        boolean terminaComPonto = email.endsWith(".");
        int posicaoArroba = email.indexOf("@");

        if (!temArroba) {

            System.out.println("Email invalido: nao possui @.");
            cadastroValido = false;

        } else if (!temPonto) {

            System.out.println("Email invalido: nao possui ponto.");
            cadastroValido = false;

        } else if (comecaComArroba) {

            System.out.println("Email invalido: nao pode comecar com @.");
            cadastroValido = false;

        } else if (terminaComPonto) {

            System.out.println("Email invalido: não pode terminar com ponto.");
            cadastroValido = false;

        } else {

           
            String usuarioEmail = email.substring(0, posicaoArroba);
            String dominioEmail = email.substring(posicaoArroba + 1);

            System.out.println("\nUsuario do Email: " + usuarioEmail);
            System.out.println("Dominio do Email: " + dominioEmail);
        }

    
        if (senha.length() < 6) {

            System.out.println("Senha invalida!");
            System.out.println("A senha deve ter no minimo 6 caracteres.");

            cadastroValido = false;
        }

        boolean temMaiuscula = false;

        for (int i = 0; i < senha.length(); i++) {

            char caractere = senha.charAt(i);

            if (Character.isUpperCase(caractere)) {

                temMaiuscula = true;
                break;
            }
        }

        if (!temMaiuscula) {

            System.out.println(
                    "Senha invalida: deve possuir pelo menos "
                    + "uma letra maiuscula."
            );

            cadastroValido = false;
        }



        if (!senha.equals(confirmacao)) {

            System.out.println("As senhas nao sao iguais.");

            cadastroValido = false;
        }



        System.out.println("\nRESULTADO");

        if (cadastroValido) {

        
            String nomeUsuario = nome.trim()
                    .toLowerCase()
                    .replace(" ", "_");

        
            String nomeMaiusculo = nome.trim()
                    .toUpperCase();

            System.out.println("Cadastro realizado com sucesso!");
            System.out.println("Nome: " + nomeMaiusculo);
            System.out.println("Nome de usuario: " + nomeUsuario);
            System.out.println("Email: " + email);

        } else {

            System.out.println("Cadastro invalido!");
            System.out.println("Corrija os dados informados.");
        }

        scanner.close();
    }
    
}
