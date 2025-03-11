package classes;

public class MonitoramentoResiduo {
    private String tipoResiduo;
    private String dataColeta;
    private Double quantidadeKg;
    private String statusColeta;
    private String responsavelColeta;

    public MonitoramentoResiduo() {
    }

    public MonitoramentoResiduo(String dataColeta, Double quantidadeKg, String responsavelColeta, String statusColeta, String tipoResiduo) {
        this.dataColeta = dataColeta;
        this.quantidadeKg = quantidadeKg;
        this.responsavelColeta = responsavelColeta;
        this.statusColeta = statusColeta;
        this.tipoResiduo = tipoResiduo;
    }

    public String getDataColeta() {
        return dataColeta;
    }

    public void setDataColeta(String dataColeta) {
        this.dataColeta = dataColeta;
    }

    public Double getQuantidadeKg() {
        return quantidadeKg;
    }

    public void setQuantidadeKg(Double quantidadeKg) {
        this.quantidadeKg = quantidadeKg;
    }

    public String getResponsavelColeta() {
        return responsavelColeta;
    }

    public void setResponsavelColeta(String responsavelColeta) {
        this.responsavelColeta = responsavelColeta;
    }

    public String getStatusColeta() {
        return statusColeta;
    }

    public void setStatusColeta(String statusColeta) {
        this.statusColeta = statusColeta;
    }

    public String getTipoResiduo() {
        return tipoResiduo;
    }

    public void setTipoResiduo(String tipoResiduo) {
        this.tipoResiduo = tipoResiduo;
    }

    public String calcularResiduosPorMes(Double quantidadeKg) {
        Double resultado = (quantidadeKg / 30);
        return String.format("\nQuantidade de resíduos:%s\n", resultado);
    }

    public String details() {
        return String.format("\n----INFORMAÇÕES DA COLETA----\nTipo de resíduo:%s\nQuantidade:%s\nData da coleta:%s\nStatus da coleta:%s\nResponsável pela coleta:%s\n", tipoResiduo, quantidadeKg, dataColeta, statusColeta, responsavelColeta);
    }

        public String exibirInformacoesMr () {
            return "MonitoramentoResiduo{" +
                    "dataColeta='" + dataColeta + '\'' +
                    ", tipoResiduo='" + tipoResiduo + '\'' +
                    ", quantidadeKg='" + quantidadeKg + '\'' +
                    ", statusColeta='" + statusColeta + '\'' +
                    ", responsavelColeta='" + responsavelColeta + '\'' +
                    '}';
        }
    }
