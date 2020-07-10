package com.ejemplo;

import java.util.Random;
import java.util.Scanner;

public class Main {

    // Este ejercicio quiere simular el juego un blackjack de modo simplificado

    public static void main(String[] args) {
	    // El usuario recibe una carta.
        // Calcular si has perdido - Te has pasado de 21
        // Si has perdido, finalizar partida y preguntar si quieres echar otra partida.
        // La banca pide carta si sus cartas no suman mas de 17
        // Calcular si la banca ha perdido - Se ha pasado de 21
        // Si la banca ha perido, finalizar partida y preguntar si quieres echar otra partida.

        // Preguntar la jugador si se planta
            // Si el jugador se planta, la banca pide cartas hasta que gane o pierda
            // Decir quien ha ganado, finalizar partida y preguntar si quieres echar otra partida.
            // Si el jugador no se planta, repetir el proceso

    }



    private static int readIntFromKeyboard(){
        Integer result;
        Scanner keyboardReader = new Scanner(System.in);
        do {
            String selectedOption = keyboardReader.nextLine();
            try {
                result = Integer.parseInt(selectedOption);
            } catch (NumberFormatException e){
                System.out.println("El String introducido no es un número. Introduce un \"int\"");
                result = null;
            }
        } while (result == null);
        keyboardReader.close();
        return result.intValue();
    }


    public static int getCarta(){
        Random rand = new Random();
        int carta = rand.nextInt(11) + 1;
        System.out.println("La carta vale " + carta);
        return carta;
    }
}
