package uniderp.loo.escola.dominio;

public abstract class BaseVeiculoTerrestre extends BaseVeiculo{

    protected String placa;
    protected String codigoRenavam;
    protected int roda;

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCodigoRenavam() {
        return codigoRenavam;
    }
    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }
    public int getRoda() {
        return roda;
    }
    public void setRoda(int roda) {
        this.roda = roda;
    }

    public BaseVeiculoTerrestre(int codigo, String nome, String fabricante, String modelo, String cor, String chassi,
            String tipoCombustivel, String nomePropietario, String estadoUF, String cidadeUF, String tipoVeiculo,
            int anoModelo, int anoFabricacao, int assentos, int qtdeOcupantes, double pesoLiquido, double pesoTotal,
            double potencia, String placa, String codigoRenavam, int roda) {
        super(codigo, nome, fabricante, modelo, cor, chassi, tipoCombustivel, nomePropietario, estadoUF, cidadeUF,
                tipoVeiculo, anoModelo, anoFabricacao, assentos, qtdeOcupantes, pesoLiquido, pesoTotal, potencia);
        this.placa = placa;
        this.codigoRenavam = codigoRenavam;
        this.roda = roda;
    }    
}
