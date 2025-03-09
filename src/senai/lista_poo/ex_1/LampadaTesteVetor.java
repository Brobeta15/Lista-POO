package senai.lista_poo.ex_1;

import java.util.Scanner;
import static senai.lista_poo.ex_1.Lampada.exibirMenorPreco;
import static senai.lista_poo.ex_1.Lampada.exibirQuantidadeLampada;
import static senai.lista_poo.ex_1.Lampada.exibirQuantidadePotencia;
import static senai.lista_poo.ex_1.Lampada.exibirStatusLampadas;

public class LampadaTesteVetor {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        
        Lampada[] lampadas = new Lampada[15];
        
        int contCadastros = 0;
        int opcao;
        
        do{
            System.out.println("==== Escolha sua opçao ====");
            System.out.println("1 - cadastrar lampada");
            System.out.println("2 - exibir lampada cadastradas");
            System.out.println("3 - exibir quantidade de lampadas cadastradas");
            System.out.println("4 - exibir quantidade de determinada potencia");
            System.out.println("5 - Exibir os dados das lâmpadas com preço menor do que o preço médio");
            System.out.println("6 - Exibir quantidade de lampadas acessas e apagadas");
            System.out.println("7 - sair");
            opcao = sc.nextInt();
            
            sc.nextLine();
            
            switch (opcao) {
                case 1:
                    if(contCadastros<15){
                        
                        System.out.println("=== Inicializando cadastro ===\n");
                   
                        lampadas[contCadastros] = new Lampada().cadastrarLampada(sc);
                        
                        contCadastros++;
                   
                        System.out.println("=== Cadastro finalizado ===\n");
                        
                    }else{
                        System.out.println("\nLimite de cadastros de lampadas atingido!\n");
                    }
                    break;
                case 2:
                    if(contCadastros>0){
                        
                        System.out.println("\n=== Inicializando Exibicao ===\n");
                        
                        for (int i = 0; i < contCadastros; i++) {
                            
                            System.out.println("\n"+(i+1)+"ª LAMPADA");
                            lampadas[i].exibirLampadas();
                        }
                    }else{
                        System.out.println("\nNenhuma lampada foi cadastrada\n");
                        break;
                    }
                    System.out.println("\n=== Exibicao finalizada ===\n");
                    break;
                case 3:
                    System.out.println("\n=== Inicializando quantidade de lampadas cadastradas ===\n");
                    
                    exibirQuantidadeLampada(contCadastros);
                    
                    System.out.println("\n=== Exibicao finalizada ===\n");
                    break;
                    
                case 4:
                    if(contCadastros>0){
                          
                        System.out.println("Informe o valor da potencia que deseja verificar");
                        float potenciaValor = sc.nextFloat();
                    
                        System.out.println("=== Inicializando Exibicao da Potencia ===\n");
                    
                        exibirQuantidadePotencia(potenciaValor, lampadas, contCadastros);
                    
                        System.out.println("\n=== Exibicao finalizada ===\n");
                        
                    }else{
                        System.out.println("Nenhuma lamapda cadastrada!\n");
                    }
                    break;
                    
                case 5:
                    System.out.println("=== Inicializando Exibicao do menor preco ===\n");
                    
                    exibirMenorPreco(lampadas, contCadastros);
                    
                    System.out.println("\n=== Exibicao finalizada ===\n");
                    
                    break;
                case 6: 
                    System.out.println("=== Inicializando Exibicao de status das lamapdas ===\n");
                    
                    exibirStatusLampadas(lampadas, contCadastros);
                    
                    System.out.println("\n=== Exibicao finalizada ===\n");
                    break;
                case 7:
                    System.out.println("\nPrograma finalizado!");
                    break;
                default:
                    System.out.println("\nOpcao invalidade! Tente novamente\n");
            }
        }while(opcao!=7);
        
        sc.close();
    }
}
