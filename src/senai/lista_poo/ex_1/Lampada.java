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
        this.status = status;
    }
    private boolean acenderLampada(){
        
        return this.status = true;
    }
    private boolean apagarLampada(){
        
        return this.status= false;
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
        
        sc.nextLine();
                    
        System.out.println("Deseja acender a lampada?");
        String acender = sc.nextLine().trim();
                    
        boolean status;
        
        if(acender.equalsIgnoreCase("sim")){
                        
            status = acenderLampada();
        }else{
            status = apagarLampada();
        }
        Lampada novaLampada = new Lampada(tipo,voltagem,cor,marca,preco,potencia,status);
        return novaLampada;
    }
    private void verificarStatus(boolean status){
        
        if(status==true){
            System.out.println("O status: acessa");
        }else{
            System.out.println("O status: apagada");
        }
    }
    public void exibirLampadas(){
        System.out.println("O tipo: "+tipo);
        System.out.println("A voltagem: "+voltagem);
        System.out.println("A cor: "+cor);
        System.out.println("A marca: "+marca);
        System.out.println("O preco: "+preco);
        System.out.println("A potencia: "+potencia);
        verificarStatus(status);
    }
    public static void exibirQuantidadeLampada(int contCadastros){
        
        System.out.println(contCadastros+" lampadas cadastrada");
    }
    public static void exibirQuantidadePotencia(float potenciaValor,Lampada[] lampadas,int contCadastros){
     
        int contPotencia = 0;
                    
        for (int i = 0; i < contCadastros; i++) {
                        
            if(lampadas[i]!= null  && lampadas[i].potencia == potenciaValor){
            
                contPotencia++;
            }
        }
        System.out.println("A quantidade de potencias "+potenciaValor+" e: "+contPotencia);
    }
    private float calcularMediaPreco(Lampada[] lampadas, int contCadastros){
        
        float somaPreco = 0;
        
        for (int i = 0; i <= contCadastros; i++) {
            
            somaPreco += lampadas[i].preco;
            
        }
        float mediaPreco = somaPreco/(contCadastros+1);
        return mediaPreco;
    }
}
