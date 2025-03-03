package senai.lista_poo.ex_1;

import java.util.Scanner;

public class LampadaTesteVetor {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        
        Lampada[] lampadas = new Lampada[15];
        
        int contCadastros = 0;
        int opcao;
        
        do{
            System.out.println("==== Escolha sua opçao ====");
            System.out.println("1 - cadastrar lampada");
            System.out.println("8 - sair");
            opcao = sc.nextInt();
            
            sc.nextLine();
            
            switch (opcao) {
                case 1:
                    if(contCadastros<15){
                        System.out.println("=== Inicializando cadastro ===");
                   
                        
                        lampadas[contCadastros] = new Lampada().cadastrarLampada(sc);
                        
                        contCadastros++;
                   
                        System.out.println("=== Cadastro finalizado ===");
                    }else{
                        System.out.println("Limite de cadastros de lampadas atingido!");
                    }
                    break;
                case 8:
                    System.out.println("Finalizando programa");
                    break;
                default:
                    System.out.println("Opcao invalidade! Tente novamente.");
            }
        }while(opcao!=8);
        
        
        sc.close();
    }
}
