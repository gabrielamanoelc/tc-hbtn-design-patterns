public class PedidoBuilder extends PedidoAbstractBuilder{

    private Pedido pedido;

    public PedidoBuilder() {
        this.pedido = new Pedido();
    }

    @Override
    void setLanche(TipoLanche tipo) {
        ItemPedido item = new ItemPedido();
        item.setTipo(TipoItemPedido.LANCHE);
        item.setNome(String.valueOf(tipo));

        pedido.adicionarItemDentroCaixa(item);
    }

    @Override
    void setBatata(TamanhoBatata tamanho) {
        ItemPedido item = new ItemPedido();
        item.setTipo(TipoItemPedido.BATATA);
        item.setNome(String.valueOf(tamanho));

        pedido.adicionarItemDentroCaixa(item);
    }

    @Override
    void setBrinde(TipoBrinde tipo) {
        ItemPedido item = new ItemPedido();
        item.setTipo(TipoItemPedido.BRINDE);
        item.setNome(String.valueOf(tipo));

        pedido.adicionarItemDentroCaixa(item);
    }

    @Override
    void setBebida(TipoBebida tipo) {
        ItemPedido item = new ItemPedido();
        item.setTipo(TipoItemPedido.BEBIDA);
        item.setNome(String.valueOf(tipo));

        pedido.adicionarItemForaCaixa(item);

    }

   public Pedido build(){
        return pedido;
    }
}
