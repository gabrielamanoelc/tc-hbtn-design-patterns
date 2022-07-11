public class ItemPedido {

   private TipoItemPedido tipo;
   private String nome;

    public void setTipo(TipoItemPedido tipo) {
        this.tipo = tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoItemPedido getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }
}
