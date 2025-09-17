public class Acai {
    private int pequeno;
    private int medio;
    private int grande;
    private double total;

    private final double Preco_pequeno = 13.50;
    private final double Preco_medio = 15.00;
    private final double Preco_grande = 17.50;

    public void setPequeno(int qtd) { this.pequeno = qtd; }
    public void setMedio(int qtd) { this.medio = qtd; }
    public void setGrande(int qtd) { this.grande = qtd; }

    public int getPequeno() { return pequeno; }
    public int getMedio() { return medio; }
    public int getGrande() { return grande; }
    public double getTotal() { return total; }

    public void calcularTotal(double desconto) {
        double subtotal = (pequeno * Preco_pequeno) + (medio * Preco_medio) + (grande * Preco_grande);
        this.total = subtotal * (1 - desconto / 100);
    }
}