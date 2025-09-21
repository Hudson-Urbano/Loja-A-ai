public class App {
    public static void main(String[] args) throws Exception {

        Tela tela = new Tela();
        double p = tela.apresentacao("Quantos açais 'P' você deseja?");
        double m = tela.apresentacao("Quantos açais 'M' você deseja?");
        double g = tela.apresentacao("Quantos açais 'G' você deseja?");

        Acai pedido = new Acai();
        double total = pedido.pedirAcai(p, m, g);
        pedido.exibirDesconto(total);

        System.out.println(" ");
        
        tela.exibir();
    }
}
