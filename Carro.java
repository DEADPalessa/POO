
package aula01poo;


public class Carro {
    //Atributos
    public String cor = "Vermelho";
    private Integer chassi;
    protected Double pot= 500.0;
    public String nome = "Fiat 147";
    //Métodos
    public void Acelerar(){
        System.out.println("Vrum Vrum!:)");
    }
    public void Frear(){
        System.out.println("Stop please!!");
    }
    public void LigarFarol(){
        System.out.println("Farol ligado!");
    }
    //Lâmpada, Televisão, Elevador, Cadeira, Aluno, Datashow e Microondas
}
