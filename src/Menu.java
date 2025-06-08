import java.util.Scanner;

public class Menu {
    private String nome;
    private int quantidade;
    private String sistemaUnidade;


    public void exibeListaDeServicos() {
        String menu = """
                1 - Revestimentos de pisos e paredes
                2 - Pintura e textura
                3 - Instalações hidrossanitárias
                4 - Instalações elétricas
                5 - Alvenaria
                6 - Chapisco / Emboço / Contrapiso
                7 - Sair
                """;
        System.out.println("Digite a opção correspondente ao serviço desejado:\n");
        System.out.println(menu);
    }

    public void selecionaServico() {
        int servico = 0;
        Scanner leitura = new Scanner(System.in);

        while (servico != 7) {
            servico = leitura.nextInt();
            switch (servico) {
                case 1:
                    System.out.println("""
                            Agora escolha o tipo de serviço abaixo:
                            1 - Revestimento de piso
                            2 - Revestimento de parede
                            """);
                    break;

                case 2:
                    System.out.println("""
                    Agora escolha o tipo de serviço abaixo:
                    1 - Pintura com tinta acrílica
                    2 - Pintura com tinta PVA
                    3 - Pintura com tinta emborrachada
                    4 - Pintura com esmalte sintético
                    5 - Textura efeito chapisco
                    6 - Textura grafiatto
                    """);
                    break;

                case 3:
                    System.out.println("Instalações hidrossanitárias");
                    break;

                case 4:
                    System.out.println("Instalações elétricas");
                    break;

                case 5:
                    System.out.println("Alvenaria");
                    break;

                case 6:
                    System.out.println("Chapisco / Emboço / Contrapiso");

            }
        }
    }
}
