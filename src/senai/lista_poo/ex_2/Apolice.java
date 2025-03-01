package senai.lista_poo.ex_2;
public class Apolice {
    
    String nomeAssegurado;
    int idade;
    String cidade;
    double valorApolice;
    
    Apolice(){
        
    }
    Apolice(String nomeAssegurado,int idade, String cidade, float valorApolice){
        
        this.nomeAssegurado = nomeAssegurado;
        this.idade = idade;
        this.cidade = cidade;
        this.valorApolice = valorApolice;
    }
    public void exibirAtributos(){
        
        System.out.println("====== Informacoes do assegurado ======\n");
        
        System.out.println("Nome: "+nomeAssegurado);
        System.out.println("Idade: "+idade);
        System.out.println("cidade onde vive: "+cidade);
        System.out.println("Valor do premio da apolice: "+valorApolice);
        System.out.println("\n");
    }
    
    public void calcularPremioApolice(){
        
        if(idade>=18 && idade<=25){
            
            valorApolice+=(valorApolice*20)/100;
        }
        else if(idade>25 && idade<=36){
            
            valorApolice+=(valorApolice*15)/100;
        }
        else{
            valorApolice+=(valorApolice*10)/100;
        }
        System.out.println("O valor da apolice : "+valorApolice);
        System.out.println("\n");
    }
    public void oferecerDesconto(String cidade){
        
        double desconto;
        
        if(cidade.equalsIgnoreCase("Blumenau")){
            desconto = (valorApolice*20)/100;
            valorApolice -= desconto;
        }
        else if(cidade.equalsIgnoreCase("Sao Paulo")){
            desconto = (valorApolice*15)/100;
            valorApolice -= desconto;
        }
        else if(cidade.equalsIgnoreCase("Porto Alegre")){
            desconto= (valorApolice*10)/100;
            valorApolice -= desconto;
        }
        else if(cidade.equalsIgnoreCase("Belo Horizonte")){
            desconto = (valorApolice*5)/100;
            valorApolice -= desconto;
        }
        else{
            desconto = 0;
        }
        System.out.println("Valor do desconto: "+desconto);
        System.out.println("O valor total da apolice COM DESCONTO será de "+valorApolice);
        System.out.println("\n");
    }
}
