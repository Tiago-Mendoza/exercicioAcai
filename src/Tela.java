import java.util.Scanner;

public class Tela {
    Scanner ler = new Scanner(System.in);

    public void apresentacao() {
        System.out.println("=== Sistema de Venda de Açaí ===");
    }

    public int pedirInt(String msg) {
        System.out.print(msg);
        return ler.nextInt();
    }

    public double pedirDouble(String msg) {
        System.out.print(msg);
        return ler.nextDouble();
    }

    public void exibir(Acai acai, double desconto) {
        System.out.println("\nSeu pedido foi registrado.\n");
        System.out.println("- Açaí Pequeno: " + acai.getPequeno());
        System.out.println("- Açaí Media: " + acai.getMedio());
        System.out.println("- Açaí Grande: " + acai.getGrande());
        System.out.printf("Desconto de %.0f%% aplicado.\n", desconto);
        System.out.printf("Total: R$ %.2f\n", acai.getTotal());
    }
}