package Exemplo;

public class Carro {
     private int id;
     private Modelo modelo;
     private Marca marca;
     private String placa;
     private int ano;
     private int km;
     
     public Carro(){}
     
     public Carro(int id,Modelo modelo,String placa, int ano,int km){
         this.id = id;
         this.modelo = modelo;         
         this.ano = ano;
         this.km = km;
         this.placa = placa;
     }

    
              
    public int getKm() {
        return this.km;
    }
     public void setKm(int km){
        this.km = km;
     }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro{" + "id=" + id + ", modelo=" + modelo + ", marca=" + marca + ", placa=" + placa + ", ano=" + ano + ", km=" + km + '}';
    }
     
     

}
