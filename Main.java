
//Desenvolva algoritmos recursivos para os seguintes problemas e implemente-os (em Java, por exemplo):
//Multiplicação de dois números naturais, através de somas sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4

import java.util.Vector;

import static java.util.Collections.swap;

public class Main {
    public static int multiply(int a, int b) {
        if (a == 0) { return 0;}

        return b + multiply(a-1, b);
    }
    //Soma de dois números naturais, através de incrementos sucessivos (Ex.: 3 + 2 = + + (+ + + 1)).

    public static int increment(int a, int b) {
        if (b == 0) { return a;}

        return increment(a+1, b-1);
    }
//Cálculo de 1 + 1/2 + 1/3 + 1/4 + ... + 1/N.
    public static float dividir(float n){
        if (n == 0){return 0;}
        return 1/n + dividir(n-1);
    }
    //Inversão de uma string.
    public static String invert(String a){
        if (a.isEmpty()){ return a;}
        return invert(a.substring(1))+a.charAt(0);
    }
    //Gerador da sequência dada por:
    //F(1) = 1
    //F(2) = 2
    //F(n) = 2 ∗ F(n − 1) + 3 ∗ F(n − 2).
    public static int fibbo(int n){
        if (n == 0){return 0;}
        if (n == 1){return 1;}
        if (n == 2){return 2;}
        return 2*fibbo(n-1) + 3*fibbo(n-2);
    }
    //Gerador de Sequência de Ackerman:
    //A(m, n) = n + 1, se m = 0
    //A(m, n) = A(m − 1, 1), se m != 0 e n = 0
    //A(m, n) = A(m − 1, A(m, n − 1)), se m != 0 e n != 0.
    public static int ackermann(int m, int n){
        if (m == 0) {
            return n + 1;
        }
        else if (n == 0) {
            return ackermann(m - 1, 1);
        }
        else {
            return ackermann(m - 1, ackermann(m, n - 1));
        }
    }

    //A partir de um vetor de números inteiros, calcule a soma e o produto dos elementos do vetor.
    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }
    public static void permuta(char[] letras, int inicio) {
        if (inicio == letras.length - 1) {
            System.out.println(new String(letras));
            return;
        }
        for (int i = inicio; i < letras.length; i++) {
            swap(letras, inicio, i);
            permuta(letras, inicio + 1);
            swap(letras, inicio, i);
        }
    }

    public static boolean isPalindromo(String s, int inicio, int fim) {
        if (inicio >= fim) return true;
        if (s.charAt(inicio) != s.charAt(fim)) return false;
        return isPalindromo(s, inicio +1,fim-1);
    }
    public static int fibg(int f0, int f1, int n) {
        if (n == 0) return f0;
        if (n == 1) return f1;
        return fibg(f0, f1, n - 1) + fibg(f0,f1,n-2);
    }
    public static void main(String[] args) {
        //String a = args[0];
        int a = Integer.parseInt(args[0]);
        //int b = Integer.parseInt(args[1]);
        int c = fibbo(a);

        System.out.println(c);
    }
}