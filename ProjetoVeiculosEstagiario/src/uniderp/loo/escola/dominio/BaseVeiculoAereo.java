package uniderp.loo.escola.dominio;

public abstract class BaseVeiculoAereo extends BaseVeiculo {

    protected int qtdeMotores;

    public int getQtdeMotores() {
        return qtdeMotores;
    }

    public void setQtdeMotores(int qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
    }

    public BaseVeiculoAereo(int codigo, String nome, String fabricante, String modelo, String cor, String chassi,
            String tipoCombustivel, String nomePropietario, String estadoUF, String cidadeUF, String tipoVeiculo,
            int anoModelo, int anoFabricacao, int assentos, int qtdeOcupantes, double pesoLiquido,
            double pesoTotal, double potencia, int qtdeMotores) {
        super(codigo, nome, fabricante, modelo, cor, chassi, tipoCombustivel, nomePropietario, estadoUF, cidadeUF,
                tipoVeiculo, anoModelo, anoFabricacao, assentos, qtdeOcupantes, pesoLiquido, pesoTotal,
                potencia);
        this.qtdeMotores = qtdeMotores;
    }
}
