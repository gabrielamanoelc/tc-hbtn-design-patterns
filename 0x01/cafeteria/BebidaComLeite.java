import java.util.ArrayList; import java.util.List; public class BebidaComLeite extends BebidaDecorator{ public BebidaComLeite(Bebida 
    bebidaDecorada) {
        super(bebidaDecorada);
    }
    @Override public List<String> obterIngredientes() { List<String> result = new ArrayList<>(super.obterIngredientes()); 
        result.add("leite"); return result;
    }
    @Override public double obterPreco() { return super.obterPreco() + 3.2;
    }
}
