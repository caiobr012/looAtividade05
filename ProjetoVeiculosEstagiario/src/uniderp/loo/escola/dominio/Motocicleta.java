package uniderp.loo.escola.dominio;

public class Motocicleta extends BaseVeiculoTerrestre {

    private String categoria;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Motocicleta(int codigo, String nome, String fabricante, String modelo, String cor, String chassi,
            String tipoCombustivel, String nomePropietario, String estadoUF, String cidadeUF, String tipoVeiculo,
            int anoModelo, int anoFabricacao, int assentos, int qtdeOcupantes, double pesoLiquido, double pesoTotal,
            double potencia, String placa, String codigoRenavam, int roda, String categoria) {
        super(codigo, nome, fabricante, modelo, cor, chassi, tipoCombustivel, nomePropietario, estadoUF, cidadeUF,
                tipoVeiculo, anoModelo, anoFabricacao, assentos, qtdeOcupantes, pesoLiquido, pesoTotal, potencia, placa,
                codigoRenavam, roda);
        this.categoria = categoria;
    }

    @Override
    public void Imprime() {
        System.out.println("Código: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Número do Chassi: " + this.chassi);
        System.out.println("Tipo de Combústivel: " + this.tipoCombustivel);
        System.out.println("Nome do Propietário: " + this.nomePropietario);
        System.out.println("Estado de Origem: " + this.estadoUF);
        System.out.println("Cidade de Origem: "+ this.cidadeUF);
        System.out.println("Tipo de Veículo: " + this.tipoVeiculo);
        System.out.println("Ano do Modelo: " + this.anoModelo);
        System.out.println("Ano de Fabricação: " + this.anoFabricacao);
        System.out.println("Quantidade de Assentos: " + this.assentos);
        System.out.println("Quantidade de Ocupantes: " + this.qtdeOcupantes);
        System.out.println("Peso Líquido em Kg: " + this.pesoLiquido);
        System.out.println("Peso Total em Kg " + this.pesoTotal);
        System.out.println("Potência: " + this.potencia);
        System.out.println("Identificação da Placa: " + this.placa);
        System.out.println("Código Renavam: " + this.codigoRenavam);
        System.out.println("Quantidade de Rodas: " + this.roda);
        System.out.println("Categoria: " + this.categoria);
    }
}
