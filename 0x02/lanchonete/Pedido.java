import java.util.HashSet;

public class Pedido {
    private HashSet<ItemPedido> itensDentroCaixa;
    private HashSet<ItemPedido> itensForaCaixa;

    public Pedido() {
        this.itensDentroCaixa = new HashSet<>();
        this.itensForaCaixa = new HashSet<>();
    }


    void adicionarItemDentroCaixa(ItemPedido item){
        this.itensDentroCaixa.add(item);
    }

    void adicionarItemForaCaixa(ItemPedido item){
        this.itensForaCaixa.add(item);
    }


    @Override
    public String toString() {

        String foraDaCaixa = "\tFora da Caixa:\n";
        String dentroDaCaixa = "\tDentro da Caixa:\n";

        for (ItemPedido item : itensForaCaixa) {
            foraDaCaixa += "\t\t- " + item.getTipo() + " " +item.getNome() + "\n";
        }

        for (ItemPedido item: itensDentroCaixa) {
            dentroDaCaixa += "\t\t- " + item.getTipo() + " " + item.getNome() + "\n";
        }

        return foraDaCaixa + dentroDaCaixa;
    }
}
