package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nome;
        String cognome;
        String colore;
        int giorno;
        int mese;
        int anno;

        System.out.println("Inserisci il tuo nome");
        nome = in.nextLine();
        System.out.println("Inserisci il tuo cognome");
        cognome = in.nextLine();
        System.out.println("Inserisci il tuo colore preferito");
        colore = in.nextLine();
        System.out.println("Inserisci il tuo giorno di nascita");
        giorno = in.nextInt();
        System.out.println("Inserisci il tuo mese di nascita");
        mese = in.nextInt();
        System.out.println("Inserisci il tuo anno di nascita");
        anno = in.nextInt();

        int sumDate = giorno + mese + anno;
        
        System.out.println("la tua password é: " + nome + "-" + cognome + "-" + colore + "-" + sumDate);

    }
}
