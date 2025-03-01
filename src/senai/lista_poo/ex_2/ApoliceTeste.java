
package senai.lista_poo.ex_2;

public class ApoliceTeste {
    public static void main(String[] args) {
        
        Apolice apolice1 = new Apolice("Roberta", 18, "Blumenau", 1000f);
        
        System.out.println("== Exibindo dados da apolice ==");
        apolice1.exibirAtributos();
        
        
        System.out.println("== Calculo do preco da apolice ==");
        apolice1.calcularPremioApolice();
        
        System.out.println("== Desconto da apolice ==");
        apolice1.oferecerDesconto(apolice1.cidade);
        
    }
}
