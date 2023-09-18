package uniderp.loo.escola.dominio;

public abstract class BaseDadosVeiculo extends BaseIdentificadorVeiculo {
    
    protected String nome;
    protected String fabricante;
    protected String modelo;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public BaseDadosVeiculo(int codigo, String nome, String fabricante, String modelo) {
        super(codigo);
        this.nome = nome;
        this.fabricante = fabricante;
        this.modelo = modelo;
    }
}
