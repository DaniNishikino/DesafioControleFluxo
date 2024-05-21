package Aplication;

import Exceptions.ParametroInvalidoExeption;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        int parametroUm = terminal.nextInt();
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch (ParametroInvalidoExeption exeption){
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametroInvalidoExeption{
        if (parametroUm > parametroDois){
            throw new ParametroInvalidoExeption();
        }else {
            int contagem = parametroDois - parametroUm;
            for (int i = 0; i < contagem; i++) {
                System.out.println("Numero: " + i);
            }
        }
    }
}
