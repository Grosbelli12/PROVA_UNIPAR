import java.util.Scanner;

public class Atividade_Criar_um_programa_de_votação_para_um_jogo_de_futebol {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantas pessoas irão votar:");

        int pessoas = entrada.nextInt();

        int[] votos = new int[pessoas];

        int somavotos80 = 0;
        int somavotos70 = 0;
        int somavotos60 = 0;
        int somavotos50 = 0;

        for (int i = 0; i < pessoas; i++) {
            System.out.println(""" 
                    Você tem os seguintes times para votar:
                    80 - Taffismo Club
                    70 - Patinho Branquinho
                    60 - Lucas FC
                    50 - Sport Redes FC
                    digite o numero correspondente do time que escolheu para votar: """);

            votos[i] = entrada.nextInt();

            if (votos[i] != 80 && votos[i] != 70 && votos[i] != 60 && votos[i] != 50) {
                System.out.println("Voto inválido! Por favor vote novamente: ");
                votos[i] = entrada.nextInt();
            }
            if (votos[i] == 80) {
                somavotos80++;
            }
            if (votos[i] == 70) {
                somavotos70++;
            }
            if (votos[i] == 60) {
                somavotos60++;
            }
            if (votos[i] == 50) {
                somavotos50++;
            }
        }

        if (somavotos80 > somavotos70 && somavotos80 > somavotos60 && somavotos80 > somavotos50) {
            System.out.println("O  time vencedor foi Taffismo Club resultado da votação foi:" + somavotos80 + " votos para Taffismo Club, " + somavotos70 + "  votos para Patinho Branquinho," + somavotos60 + " votos para Lucas FC ," + somavotos50 + " votos para Sport Redes FC");
        }
        if (somavotos70 > somavotos80 && somavotos70 > somavotos60 && somavotos70 > somavotos50) {
            System.out.println("O  time vencedor foi  Patinho Branquinho resultado da votação foi:" + somavotos80 + " votos para Taffismo Club, " + somavotos70 + "  votos para Patinho Branquinho," + somavotos60 + " votos para Lucas FC ," + somavotos50 + " votos para Sport Redes FC");
        }
        if (somavotos60 > somavotos80 && somavotos60 > somavotos70 && somavotos60 > somavotos50) {
            System.out.println("O  time vencedor foi Lucas FC resultado da votação foi:" + somavotos80 + " votos para Taffismo Club, " + somavotos70 + "  votos para Patinho Branquinho," + somavotos60 + " votos para Lucas FC ," + somavotos50 + " votos para Sport Redes FC");
        }
        if (somavotos50 > somavotos80 && somavotos50 > somavotos70 && somavotos50 > somavotos60) {
            System.out.println("O  time vencedor foi Sport Redes FC resultado da votação foi:" + somavotos80 + " votos para Taffismo Club, " + somavotos70 + "  votos para Patinho Branquinho," + somavotos60 + " votos para Lucas FC ," + somavotos50 + " votos para Sport Redes FC" );
        }


    }
}

