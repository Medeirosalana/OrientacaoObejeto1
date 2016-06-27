package Exemplo;

public class Carro {
     int id;
     Modelo modelo;
     Marca marca;
     String placa;
     int ano;
     int km;
     
     public Carro(){}
     
     public Carro(int id,Modelo modelo,String placa, int ano,int km){
         this.id = id;
         this.modelo = modelo;         
         this.ano = ano;
         this.km = km;
         this.placa = placa;
     }

    @Override
    public String toString() {
        return "Carro " + this.id + ":"
                + "\nModelo: " + this.modelo.nome
                + "\nMarca: " + this.modelo.marca.nome
                + "\nAno: " + this.ano
                + "\nKM: " + this.km
                + "\nPLaca: " + this.placa;
                
    }
     
     

}
