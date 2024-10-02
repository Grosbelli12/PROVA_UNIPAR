import java.util.Scanner;

public class Atividade_crie_um_programa_que_permita_cadastrar_as_avaliacoes_de_uma_lista_de_alimentos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos alimentos você deseja cadastrar: ");
        int al = sc.nextInt();
        double[] alimentos = new double[al];
        int qntavb = 0;
        int qntvr = 0;
        double somaavl = 0;
        for (int i = 0; i < al; i++) {
            System.out.println("digite as avaliações dos alimentos que vc cadastrou em ordem: ");
            alimentos[i] = sc.nextDouble();
            if (alimentos[i] < 0 || alimentos[i] > 10) {
                System.out.println("Avaliação invalida! coloque uma avaliação que esteja entre 0 e 10!");
                System.out.println("Digite a avaliação correta: ");
                alimentos[i] = sc.nextDouble();
            }
            if (alimentos[i] >= 6) {
                qntavb++;
            }
            if (alimentos[i] < 6) {
                qntvr++;
            }
            somaavl += alimentos[i];
        }
        if (qntavb > 0) {
            System.out.println("A quantidade de avaliações boas é: " + qntavb);
        }
        if (qntvr > 0) {
            System.out.println("A quantidade de avaliações ruins são: " + qntvr);
        }
        double media = somaavl / al;
        System.out.println("A média das avaliações foram de: " + media);
    }
}