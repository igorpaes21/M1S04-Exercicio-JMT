package classes;

import java.util.ArrayList;

public class AreaVerde {

    private String nome;
    private String localizacao;
    private Double tamanho;
    private String statusConservacao;
    private String responsavel;


    public AreaVerde() {}

    public AreaVerde(String nome, String localizacao, Double tamanho, String statusConservacao, String responsavel) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.tamanho = tamanho;
        this.statusConservacao = statusConservacao;
        this.responsavel = responsavel;

    }
    
    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getStatusConservacao() {
        return statusConservacao;
    }

    public void setStatusConservacao(String statusConservacao) {
        this.statusConservacao = statusConservacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }
    public String calcularTamanhoEmHectares(Double tamanho){
       Double resultado = (tamanho / 10000);
       return String.format("\nHECTARES:%s\n", resultado);

    }

    private ArrayList<AreaVerde> AreasVerdes = new ArrayList<>();


    public String details() {
        return String.format("\n----INFORMAÇÕES DA ÁREA----\nNome:%s\nLocalização:%s\nTamanho:%s\nStatus de conservação:%s\nResponsável:%s\n", nome, localizacao, tamanho, statusConservacao, responsavel);
    }

    public String exibirInformacaoAv() {
        return "AreaVerde{" +
                ", nome='" + nome + '\'' +
                ", localizacao='" + localizacao + '\'' +
                ", tamanho=" + tamanho +
                ", statusConservacao='" + statusConservacao + '\'' +
                ", responsavel='" + responsavel + '\'' +
                '}';
    }
}





