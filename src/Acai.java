import java.util.Scanner;
public class Acai {
    private  static  final double PRECO_P = 13.50;
    private static final double PRECO_M = 15.00;
    private static final double PRECO_G = 17.50;


    static Scanner leitor = new Scanner (System.in);
    public double pedirAcai (double qtdP, double qtdM, double qtdG) {
        double total = (qtdP * PRECO_P) + (qtdM * PRECO_M) + (qtdG * PRECO_G);
        System.out.printf("Seu pedido total foi: R$%.2f " , total);
        return total;
    }

    public void exibirDesconto (double d) {
        System.out.println("Digite o desconto recebido (ex: 50%): ");
        String descInput = leitor.next();
        descInput = descInput.replace("%", "");

        double desc = Double.parseDouble(descInput);
        double valorDesconto = d - (d * (desc / 100));

        System.out.printf("O valor com o desconto ficou: R$%.2f reais" , valorDesconto);
    }
}