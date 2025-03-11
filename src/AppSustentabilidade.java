import classes.AreaVerde;
import classes.MonitoramentoResiduo;

import java.util.ArrayList;
import java.util.Scanner;

public class AppSustentabilidade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<AreaVerde> AreasVerdes = new ArrayList<>();
        ArrayList<MonitoramentoResiduo> MonRes = new ArrayList<>();


        AreaVerde areaVerde01 = new AreaVerde();
        AreaVerde areaVerde02 = new AreaVerde();

        areaVerde01.setNome("Praça da lagoa");
        areaVerde01.setLocalizacao("Rua do príncipe");
        areaVerde01.setTamanho(250D);
        areaVerde01.setStatusConservacao("Limpo");
        areaVerde01.setResponsavel("Alfredo");
        areaVerde01.calcularTamanhoEmHectares(areaVerde01.getTamanho());
        System.out.println("Exibindo inforamações: " + areaVerde01.exibirInformacaoAv());

        areaVerde02.setNome("Alameda das flores");
        areaVerde02.setLocalizacao("Rua das hortencias");
        areaVerde02.setTamanho(100D);
        areaVerde02.setStatusConservacao("Limpo");
        areaVerde02.setResponsavel("Luiz");
        areaVerde02.calcularTamanhoEmHectares(areaVerde02.getTamanho());
        System.out.println("Exibindo inforamações do tamanho da área: " + areaVerde02.exibirInformacaoAv());

        AreasVerdes.add(areaVerde01);
        AreasVerdes.add(areaVerde02);

        System.out.println(areaVerde01.details());
        System.out.println(areaVerde02.details());

        MonitoramentoResiduo monitoramentoResiduo01 = new MonitoramentoResiduo();
        MonitoramentoResiduo monitoramentoResiduo02 = new MonitoramentoResiduo();

        monitoramentoResiduo01.setTipoResiduo("Plástico");
        monitoramentoResiduo01.setQuantidadeKg(50D);
        monitoramentoResiduo01.setDataColeta("10/03/2025");
        monitoramentoResiduo01.setStatusColeta("Executado");
        monitoramentoResiduo01.setResponsavelColeta("Fritz");
        monitoramentoResiduo01.calcularResiduosPorMes(monitoramentoResiduo01.getQuantidadeKg());
        System.out.println("Quantidade coletada durante o mês:" + monitoramentoResiduo01.exibirInformacoesMr());

        monitoramentoResiduo02.setTipoResiduo("Orgânico");
        monitoramentoResiduo02.setQuantidadeKg(120D);
        monitoramentoResiduo02.setDataColeta("11/03/2025");
        monitoramentoResiduo02.setStatusColeta("Não Executado");
        monitoramentoResiduo02.setResponsavelColeta("Amon");
        monitoramentoResiduo01.calcularResiduosPorMes(monitoramentoResiduo02.getQuantidadeKg());
        System.out.println("Quantidade coletada durante o mês:" + monitoramentoResiduo02.exibirInformacoesMr());

        MonRes.add(monitoramentoResiduo01);
        MonRes.add(monitoramentoResiduo02);

        System.out.println(monitoramentoResiduo01.details());
        System.out.println(monitoramentoResiduo02.details());
    }

}
