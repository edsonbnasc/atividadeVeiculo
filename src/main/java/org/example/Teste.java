package org.example;

import org.example.motor.Motor;
import org.example.veiculo.Veiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        ArrayList<Veiculo> listaDeVeiculos = new ArrayList<Veiculo>(5);
        boolean etapaConcluida = false;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("[1]criar veiculo [2]Imprimir lista de veiculos [3]Sair");
            int opcao = scan.nextInt();
            scan.nextLine();
            switch (opcao){
                case 1:

                     if(listaDeVeiculos.size() < 5){
                        System.out.println("digite a placa do veiculo:");
                        String placa = scan.nextLine();
                        System.out.println("digite a marca veiculo:");
                        String marca = scan.nextLine();
                        System.out.println("digite o modelo do veiculo:");
                        String modelo = scan.nextLine();
                        System.out.println("digite a cor do veiculo:");
                        String cor = scan.nextLine();
                        System.out.println("digite a velocidade maxima do veiculo:");
                        float velocMax = scan.nextFloat();
                        System.out.println("digite a quantidade de rodas do veiculo:");
                        int qtdRodas = scan.nextInt();
                        System.out.println("digite a quantidade de pistao do veiculo:");
                        int qtdPist = scan.nextInt();
                        System.out.println("digite a potencia do veiculo:");
                        int potencia = scan.nextInt();
                        Veiculo veiculo = new Veiculo();
                        veiculo.setPlaca(placa);
                        veiculo.setMarca(marca);
                        veiculo.setModelo(modelo);
                        veiculo.setCor(cor);
                        veiculo.setVelocMax(velocMax);
                        veiculo.setQtdRodas(qtdRodas);
                        Motor motor = new Motor();
                        motor.setQtdPist(qtdPist);
                        motor.setPotencia(potencia);
                        veiculo.setMotor(motor);
                        listaDeVeiculos.add(veiculo);
                    }
                    else {
                        System.out.println("a lista está cheia");

                    }

                    break;
                case 2:
                    for(Veiculo v : listaDeVeiculos){
                        System.out.println(v.toString());
                    }
                    break;
                case 3:
                    etapaConcluida=true;
                    break;
            }
        }while(!etapaConcluida);
    }
}