package Exemplo;



public class Executar {
    public static void main(String[] args) {
        
        Marca marca = new Marca(1, "Honda");
        Modelo modelo = new Modelo(1,"Civic", marca);
        Carro carro = new Carro(1, modelo,"XYZ-9999",2010,22000);
        System.out.println(carro);
        
    }
}
