package uniderp.loo.escola.dominio;

public abstract class BaseVeiculoTransporte extends BaseVeiculoTerrestre{

    protected int eixo;
    protected int porta;

    public int getEixo() {
        return eixo;
    }
    public void setEixo(int eixo) {
        this.eixo = eixo;
    }
    public int getPorta() {
        return porta;
    }
    public void setPorta(int porta) {
        this.porta = porta;
    }

    public BaseVeiculoTransporte(int codigo, String nome, String fabricante, String modelo, String cor, String chassi,
            String tipoCombustivel, String nomePropietario, String estadoUF, String cidadeUF, String tipoVeiculo,
            int anoModelo, int anoFabricacao, int assentos, int qtdeOcupantes, double pesoLiquido, double pesoTotal,
            double potencia, String placa, String codigoRenavam, int roda, int eixo, int porta) {
        super(codigo, nome, fabricante, modelo, cor, chassi, tipoCombustivel, nomePropietario, estadoUF, cidadeUF,
                tipoVeiculo, anoModelo, anoFabricacao, assentos, qtdeOcupantes, pesoLiquido, pesoTotal, potencia, placa,
                codigoRenavam, roda);
        this.eixo = eixo;
        this.porta = porta;
    }    
}
