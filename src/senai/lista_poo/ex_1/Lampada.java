package senai.lista_poo.ex_1;

import java.util.Scanner;

public class Lampada {
    
    private String tipo;
    private float voltagem;
    private String cor;
    private String marca;
    private float preco;
    private float potencia;
    private boolean status;
    
    Lampada(){
        
    }
    Lampada(String tipo,float voltagem,String cor,String marca,float preco,float potencia,boolean status){
        this.tipo = tipo;
        this.voltagem = voltagem;
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
        this.potencia = potencia;
    }
    private void acenderLampada(){
        
        status = true;
    }
    private void apagarLampada(){
        
        status= false;
    }
    public Lampada cadastrarLampada(Scanner sc){
                    
        System.out.println("Informe o tipo da lampada: ");
        String tipo = sc.nextLine();
        
                    
        System.out.println("Informe a voltagem da lampada: ");
        float voltagem = sc.nextFloat();
                    
        sc.nextLine();
                    
        System.out.println("Informe a cor da lampada: ");
        String cor = sc.nextLine();
                    
        System.out.println("Informe a marca da lampada: ");
        String marca = sc.nextLine();
                    
        System.out.println("Informe o preco da lampada: ");
        float preco = sc.nextFloat();
                    
        System.out.println("Informe a potencia da lampada: ");
        float potencia = sc.nextFloat();
                    
        System.out.println("Deseja acender a lampada?");
        String acender = sc.nextLine().trim();
                    
        if(acender.equalsIgnoreCase("sim")){
                        
            acenderLampada();
        }else{
            apagarLampada();
        }
        Lampada novaLampada = new Lampada(tipo,voltagem,cor,marca,preco,potencia,status); 
        return novaLampada;
    }
}
