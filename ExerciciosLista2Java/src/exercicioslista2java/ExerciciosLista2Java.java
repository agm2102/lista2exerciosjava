/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioslista2java;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 60001286
 */
public class ExerciciosLista2Java {

    static Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //exibirDoisValores();
        //exibirDoisValoresDeNovo();
        //exibirIntervaloEntreDoisNumeros();
        //somarValoresPares();
        //adivinharValor();
        //contagemRegressiva();
        somaImparesMultiplosTres();
    }

    private static void exibirDoisValores() {

        int valor1, valor2;

        System.out.println("Informe o primeiro valor: ");
        valor1 = scanner.nextInt();

        System.out.println("Informe o segundo valor: ");
        valor2 = scanner.nextInt();

        System.out.println("Valores digitado: " + valor1 + " e " + valor2);
    }

    private static void exibirDoisValoresDeNovo() {

        int valor1, valor2;

        System.out.println("Informe o primeiro valor: ");
        valor1 = scanner.nextInt();

        System.out.println("Informe o segundo valor: ");
        valor2 = scanner.nextInt();

        if (valor2 > valor1) {
            System.out.println("Valores digitado: " + valor1 + " e " + valor2);
        }
    }

    private static void exibirIntervaloEntreDoisNumeros() {

        int valor1, valor2;

        System.out.println("Informe o primeiro valor: ");
        valor1 = scanner.nextInt();

        System.out.println("Informe o segundo valor: ");
        valor2 = scanner.nextInt();

        if (valor2 > valor1) {
            for (int i = valor1; i <= valor2; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = valor1; i >= valor2; i--) {
                System.out.println(i);
            }
        }
    }

    private static void somarValoresPares() {

        int valor, soma = 0;

        do {
            System.out.println("Informe um valor entre 0 e 100");
            valor = scanner.nextInt();

            if (valor >= 0 || valor <= 100) {
                if (valor % 2 == 0) {
                    soma = soma + valor;
                }
            } else {
                System.out.println("Valor Invalido");
            }

        } while (valor != 0);
        System.out.println("Soma: " + soma);
    }

    private static void adivinharValor() {
        Random random = new Random();
        int valorAleatorio = random.nextInt(0, 5);
        int valorEscolhido;

        System.out.println("Tente adivinhar o numero aleatorio escolhido entre 0 e 5");

        while (true) {
            System.out.println("Valor: ");
            valorEscolhido = scanner.nextInt();
            if (valorAleatorio > valorEscolhido) {
                System.out.println("Chute foi baixo!");
            } else if (valorAleatorio < valorEscolhido) {
                System.out.println("Chute foi alto!");
            } else {
                System.out.println("Acertou!");
                break;
            }
        }
    }

    private static void contagemRegressiva() {
        int minutos = 10;

        for (int i = 0; i < 10; i++) {      
            for (int j = 0; j < 60; j++) {
                System.out.print(minutos);
                if(j > 9){
                    System.out.println(":" + j);
                }
                else
                    System.out.println(":0" + j);
                if (j == 59) {
                    minutos--;
                }
            }
        }
    }
    private static void somaImparesMultiplosTres(){
        int soma = 0;
        
        for(int i = 0; i <= 100; i++){
            if(i % 2 != 0 && i % 3 == 0 ){
                System.out.println(i);
                soma = soma + i;
            }
        }
        System.out.println(soma);
    }
}
