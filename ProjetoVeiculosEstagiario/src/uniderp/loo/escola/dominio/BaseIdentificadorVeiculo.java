package uniderp.loo.escola.dominio;

public abstract class BaseIdentificadorVeiculo {
 
    protected int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public BaseIdentificadorVeiculo(int codigo) {
        this.codigo = codigo;
    }
}