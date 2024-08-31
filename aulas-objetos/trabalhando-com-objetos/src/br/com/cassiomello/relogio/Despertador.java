package br.com.cassiomello.relogio;
public class Despertador {
    int horas;
    int minutos;
    int soneca;


    void ativarSoneca(){
        System.out.println("Só mais " + soneca + " minutinhos");
    }

    String agendarAlarme(){
        return "Seu alarme foi configurado às " + horas + ":" + minutos;
    }
}
