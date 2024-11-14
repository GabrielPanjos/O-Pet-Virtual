public class Comida {

    String nome;
    double feedFome;
    int nivelDeSabor;
    double feedSede;
    int quantidade;


    Inventario inventario;


    public Comida(String nome, double feedFome, int nivelDeSabor, double feedSede, int quantidade, Inventario inventario) {
        this.nome = nome;
        this.feedFome = feedFome;
        this.nivelDeSabor = nivelDeSabor;
        this.feedSede = feedSede;
        this.quantidade = quantidade;
        this.inventario = inventario;

        if (quantidade > 0) {
            inventario.adicionarItem(this.nome);
        }
    }

    public static void main(String[] args) {

        Inventario inventario = new Inventario();


        Comida pao = new Comida("Pedaço de Pão", 10, 10, 0, 1, inventario);
        Comida queijo = new Comida("Queijo", 5, 8, 0, 2, inventario);


        inventario.verBolsa();
    }
}
