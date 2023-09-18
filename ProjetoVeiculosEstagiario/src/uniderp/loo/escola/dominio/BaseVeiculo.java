package uniderp.loo.escola.dominio;

public abstract class BaseVeiculo 
extends BaseDadosVeiculo
implements IImpressao {

    protected String cor;
    protected String chassi;
    protected String tipoCombustivel;
    protected String nomePropietario;
    protected String estadoUF;
    protected String cidadeUF;
    protected String tipoVeiculo;
    protected int anoModelo;
    protected int anoFabricacao;
    protected int assentos;
    protected int qtdeOcupantes;
    protected double pesoLiquido;
    protected double pesoTotal;
    protected double potencia;
    
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public String getNomePropietario() {
        return nomePropietario;
    }
    public void setNomePropietario(String nomePropietario) {
        this.nomePropietario = nomePropietario;
    }
    public String getEstadoUF() {
        return estadoUF;
    }
    public void setEstadoUF(String estadoUF) {
        this.estadoUF = estadoUF;
    }
    public String getCidadeUF() {
        return cidadeUF;
    }
    public void setCidadeUF(String cidadeUF) {
        this.cidadeUF = cidadeUF;
    }
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }
    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
    public int getAnoModelo() {
        return anoModelo;
    }
    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public int getQtdeOcupantes() {
        return qtdeOcupantes;
    }
    public void setQtdeOcupantes(int qtdeOcupantes) {
        this.qtdeOcupantes = qtdeOcupantes;
    }
    public double getPesoLiquido() {
        return pesoLiquido;
    }
    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }
    public double getPesoTotal() {
        return pesoTotal;
    }
    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public BaseVeiculo(int codigo, String nome, String fabricante, String modelo, String cor, String chassi,
            String tipoCombustivel, String nomePropietario, String estadoUF, String cidadeUF, String tipoVeiculo,
            int anoModelo, int anoFabricacao, int assentos, int qtdeOcupantes, double pesoLiquido,
            double pesoTotal, double potencia) {
        super(codigo, nome, fabricante, modelo);
        this.cor = cor;
        this.chassi = chassi;
        this.tipoCombustivel = tipoCombustivel;
        this.nomePropietario = nomePropietario;
        this.estadoUF = estadoUF;
        this.cidadeUF = cidadeUF;
        this.tipoVeiculo = tipoVeiculo;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.assentos = assentos;
        this.qtdeOcupantes = qtdeOcupantes;
        this.pesoLiquido = pesoLiquido;
        this.pesoTotal = pesoTotal;
        this.potencia = potencia;
    }    
}