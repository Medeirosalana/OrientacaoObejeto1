package Exemplo;

import java.util.Scanner;

public class Executar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Carro carro = new Carro();
        System.out.println("Ano do carro: ");
        int ano = sc.nextInt();
        System.out.println("Quilometragem: ");
        int km = sc.nextInt();
        System.out.print("Placa: ");
        String placa = sc.next();
        
        Modelo modelo = new Modelo();
        Marca marca = new Marca();
        System.out.print("Marca: ");       
        marca.nome = sc.next();
        modelo.marca = marca;
        
        System.out.print("modelo: ");
        
        modelo.nome = sc.next();
        Carro carro = new Carro(1, modelo, placa, ano, km);
        
        System.out.println(carro.toString());
    }
}
