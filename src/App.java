public class App {
    
    public static void main(String[] args) {
        Tela terminal = new Tela();
        Acai acai = new Acai();

        terminal.apresentacao();
        acai.setPequeno(terminal.pedirInt("Quantidade de Açaí Pequeno R$ 13,50: "));
        acai.setMedio(terminal.pedirInt("Quantidade de Açaí Médio R$ 15,00: "));
        acai.setGrande(terminal.pedirInt("Quantidade de Açaí Grande R$ 17,50: "));
        double desconto = terminal.pedirDouble("Desconto (%): ");

        acai.calcularTotal(desconto);

        terminal.exibir(acai, desconto);
    }
    
}