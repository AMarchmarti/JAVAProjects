package org.lasencinas.bowlinGameProfessor;

import java.util.ArrayList;

public class Tarjeta {

    /* Declaración variables */

    private String tarjetaPuntos = "";
    private int puntacionTotal = 0;
    String pines = "-123456789";
    private int puntuacionTotal;

    private int STRIKE = 10;
    private int SPARE = 10;
    private int CERO = 0;

    /* Constructores */

    public Tarjeta() {
        this.tarjetaPuntos = "";
    }


    public Tarjeta(String tarjetaPuntos) {
        this.tarjetaPuntos = tarjetaPuntos;
    }



    /* getters y setters */

    public int getStrike() {
        return this.STRIKE;
    }

    public int getSpare() { return this.SPARE; }

    public int getPuntacionTotal() {
        return this.puntacionTotal;
    }


    /* Parte privada */

    /* Interfaz Publica */


    //Método para calcular Strike//
    public void computarStrike(int bola, String tarjeta) {
        if ((tarjeta.charAt(bola + 1) == 'X') && (tarjeta.charAt(bola + 2) == 'X')) {
            this.puntuacionTotal += this.STRIKE * 3;
        } else if ((tarjeta.charAt(bola + 1) == 'X') && (tarjeta.charAt(bola + 2) != 'X')) {
            this.puntuacionTotal += this.STRIKE * 2 + this.computarPines(tarjeta.charAt(bola + 2));
        } else if ((tarjeta.charAt(bola + 1) != 'X') && (tarjeta.charAt(bola + 2)) == '/') {
            this.puntuacionTotal += this.STRIKE * 2;
        } else
            this.puntuacionTotal += this.STRIKE + computarPines(tarjeta.charAt(bola + 1)) + this.computarPines(tarjeta.charAt(bola + 2));
    }

    //Método para el cálculo del Spare//
    public void computarSpare(int pos, String tarjeta) {

        try {
            Character a = tarjeta.charAt(pos + 1);
            this.puntuacionTotal -= this.computarPines(tarjeta.charAt(pos - 1));
            if (a == 'X') {
                this.puntuacionTotal += this.SPARE + this.STRIKE;
            } else {
                this.puntuacionTotal += this.SPARE + this.computarPines(a);
            }
        } catch (StringIndexOutOfBoundsException a) {
            this.puntuacionTotal += this.SPARE;
        }

    }


    //Método para calcular la tirada extra//
    public ArrayList extraTirada(String tarjeta){
        ArrayList <ArrayList> newCard = new ArrayList<ArrayList>();
        int bola = 0;
        while (bola < tarjeta.length()) {
            ArrayList <Character> frame = new ArrayList<Character>();
            try{
                char extra = tarjeta.charAt(bola +1);
                if (tarjeta.charAt(bola) == 'X'){
                    frame.add(tarjeta.charAt(bola));
                    newCard.add(frame);
                    bola++;
                } else{
                    frame.add(tarjeta.charAt(bola));
                    frame.add(extra);
                    newCard.add(frame);
                    bola += 2;}

            }catch (StringIndexOutOfBoundsException extra){
                frame.add(tarjeta.charAt(bola));
                newCard.add(frame);
                return newCard;
            }
        }
        return newCard;
    }

    //Método para saber si tenemos o no una extra tirada//
    public Boolean esExtraTirada(String tarjeta){
        ArrayList newCard = extraTirada(tarjeta);
        int lastPos = newCard.size() - 1;
        Object lastFrame = newCard.get(lastPos);
        String ultimoFrame = lastFrame.toString();

        if  (ultimoFrame.length() == 3){
            return true;
        }else{
            return false;
        }
    }


    //Método para obtener los bolos que no son Spare o Strike//
    public int computarPines(char pins) {
        return this.pines.indexOf(pins);
    }


    //Metodo para una tirada normal//
    public void tiradaNormal(String tarjeta, int bola){
        Character actual = tarjeta.charAt(bola);
        if (actual == 'X') {
            computarStrike(bola, tarjeta);
        } else if (actual == '/') {
            computarSpare(bola, tarjeta);
        } else {
            this.puntuacionTotal += this.computarPines(actual);}}

    //Aqui vamos a formar la logica para sumar los puntos y nos devuelva la puntuación total//
    public int computarTarjeta(String tarjeta) {
        Character bolaEspecial = tarjeta.charAt(tarjeta.length() - 3);
        Character especial = tarjeta.charAt(tarjeta.length() - 2);
        if (esExtraTirada(tarjeta)){
            for (int bola = 0; bola < tarjeta.length(); bola++) {
            if ((bolaEspecial == 'X') && (bola == tarjeta.length() - 3 )){
                computarStrike(bola, tarjeta);
                return this.puntuacionTotal;
            }else if ((especial == '/') && (bola == tarjeta.length() - 2)){
                computarSpare(bola,tarjeta);
                return this.puntuacionTotal;}
            else{tiradaNormal(tarjeta, bola);}}
        }else{
            for (int bola = 0; bola < tarjeta.length(); bola++) {
                tiradaNormal(tarjeta, bola);
            }

        }

        return this.puntuacionTotal;}}

