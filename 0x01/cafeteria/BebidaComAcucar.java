import java.util.ArrayList; import java.util.List; public class BebidaComAcucar extends BebidaDecorator{ public BebidaComAcucar(Bebida 
    bebidaDecorada) {
        super(bebidaDecorada);
    }
    @Override public List<String> obterIngredientes() { List<String> result = new ArrayList<>(super.obterIngredientes()); 
        result.add("acucar"); return result;
    }
    @Override public double obterPreco() { return super.obterPreco() + 1.9;
    }
}
