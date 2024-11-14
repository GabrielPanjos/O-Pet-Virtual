import java.util.ArrayList;
import java.util.List;

public class Inventario {

    int capacidadeDeGuardar = 9;
    List<String> lista = new ArrayList<>();

    public void verBolsa() {
        if (lista.isEmpty()) {
            System.out.println("A bolsa está vazia.");
        } else {
            System.out.println("Itens na bolsa:");
            for (String item : lista) {
                System.out.println("- " + item);
            }
        }
    }

    public void adicionarItem(String item) {
        if (lista.size() < capacidadeDeGuardar) {
            lista.add(item);
            System.out.println(item + " foi adicionado à bolsa.");
        } else {
            System.out.println("A bolsa está cheia! Não é possível adicionar mais itens.");
        }
    }

    public void removerItem(String item) {
        if (lista.remove(item)) {
            System.out.println(item + " foi removido da bolsa.");
        } else {
            System.out.println("O item " + item + " não está na bolsa.");
        }
    }
}
