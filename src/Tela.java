import java.util.Scanner;
public class Tela {
    static Scanner leitor = new Scanner(System.in);
     double apresentacao (String msg) {
        System.out.println(msg);
        double d = leitor.nextDouble();
        return d;
    }

     void exibir () {
        System.out.println("Obrigado por comprar conosco! ");
    }
}
