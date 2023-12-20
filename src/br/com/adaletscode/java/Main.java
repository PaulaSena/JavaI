package br.com.adaletscode.java;

public class Main {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println(" ######  Variaveis Primitivas");
        System.out.println("");

        byte byteVar = 127;
        short shortVar = 32767;
        int intVar = 2147483647;
        long longVar = 9223372036854775807L;
        float floatVar = 3.14f;
        double doubleVar = 3.14159265359;
        char charVar = 'A';
        boolean booleanVar = true;

        // Variável de referência (String)
        String stringVar = "Let's code";

        // Imprimir variáveis
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + charVar);
        System.out.println("booleanVar: " + booleanVar);
        System.out.println("stringVar: " + stringVar);

        System.out.println("");
        System.out.println(" ######  Calculos Simples  ######");
        System.out.println("");

        int a;
        int b=2;
        a=3;
        int soma= a+b;
        int subtracao=a-b;
        int multiplicao=a*b;
        float divisao = (float) a/b; // converte int a, b para Float.

        System.out.println("Soma = " +soma);
        System.out.println("Subtracao = " +subtracao);
        System.out.println("Multiplicacao = " +multiplicao);
        System.out.println("Divisao = " +divisao);
    }
}
