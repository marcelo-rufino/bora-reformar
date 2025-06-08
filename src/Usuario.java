public class Usuario {
    public static void main(String[] args) {

        var servico = new Menu();
        servico.exibeListaDeServicos();
        servico.selecionaServico();

        var revestimentoPiso = new RevestimentosPisosParedes();
        revestimentoPiso.setLado1(5);
        revestimentoPiso.setLado2(4);
        System.out.println(revestimentoPiso.calculaAreaPiso());

        var revestimentoParede = new RevestimentosPisosParedes();
        revestimentoParede.setLargura(3);
        revestimentoParede.setAltura(3);
        System.out.println(revestimentoParede.calculaAreaParede());


    }
}
