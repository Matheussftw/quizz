//Quiz Brenno. Matheus Oliveira 2° P.java
import java.util.Scanner;

public class quizz {
    public static void main(String[] args) {
        String aluno = "Matheus Oliveira";
        String professor = "Brenno Pimenta";
        String tema = "Conhecimentos Sobre a História do Brasil";
        String faculdade = "Centro Universitario Alfredo Nasser";

        // comandos de impressão de cabeçalho

        System.out.println("Aluno: " + aluno);
        System.out.println("Professor: " + professor);
        System.out.println("Tema: " + tema);
        System.out.println("Faculdade: " + faculdade);

        Scanner scanner = new Scanner(System.in);


        String questao1 = "Qual foi o presidente que ordenou o fim da aldeia de Belo Monte?";
        boolean respostacerta1 = false;

        do {
            System.out.println(questao1);

            System.out.println("1) Prudente de Moraes ");
            System.out.println("2) Getúlio Vargas ");
            System.out.println("3) Marechal Deodoro da Fonseca ");
            System.out.println("4)  Rui Barbosa ");
            System.out.println("5) Marechal Floriano Peixoto");

            System.out.println("Digite sua resposta:");
            String resposta1 = scanner.nextLine();

            if (resposta1.equals("1")) {
                System.out.println("Resposta Certa!");
                respostacerta1 = true;
            } else {
                System.out.println("Resposta Errada! Tente Novamente.");
            }
        } while (!respostacerta1);


        String questao2 = "O que significa PRP e PRM, no contesto da república Oligárquica?";
        boolean respostacerta2 = false;

        do {
            System.out.println(questao2);

            System.out.println("1) Primeiro respeitado Partido e Primeiro Respeitado Moderno. ");
            System.out.println("2) Paz, respeito, paixão e Prosperidade, respeito, melhorias ");
            System.out.println("3) Paciência, riqueza, partido e Promessa, realeza militares. ");
            System.out.println("4) Partido Respeitado Paulista e Partido Respeitado Mineiro. ");
            System.out.println("5) Partido Republicano Paulista e Partido Republicano Mineiro.");


            System.out.println("Digite sua resposta:");
            String resposta2 = scanner.nextLine();

            if (resposta2.equals("5")) {
                System.out.println("Resposta Certa!");
                respostacerta2 = true;
            } else {
                System.out.println("Resposta Errada! Tente Novamente.");
            }
        } while (!respostacerta2);


        String questao3 = "Em qual ano começou a república conhecida como República Oligárquica?";
        boolean respostacerta3 = false;

        do {
            System.out.println(questao3);

            System.out.println("1) 1902 ");
            System.out.println("2) 1930 ");
            System.out.println("3) 1894 ");
            System.out.println("4) 1896 ");
            System.out.println("5) 1897");

            System.out.println("Digite sua resposta:");
            String resposta3 = scanner.nextLine();

            if (resposta3.equals("3")) {
                System.out.println("Resposta Certa!");
                respostacerta3 = true;
            } else {
                System.out.println("Resposta Errada! Tente Novamente.");
            }
        } while (!respostacerta3);


        String questao4 = "Quem consolidou a República Oligárquica?";
        boolean respostacerta4 = false;

        do {
            System.out.println(questao4);

            System.out.println("1) Prudente de Moraes");
            System.out.println("2) Campo Sales");
            System.out.println("3) Rodrigues Alves");
            System.out.println("4) Antônio Conselheiro");
            System.out.println("5) Marechal de ferro");

            System.out.println("Digite sua resposta:");
            String resposta4 = scanner.nextLine();

            if (resposta4.equals("2")) {
                System.out.println("Resposta Certa!");
                respostacerta4 = true;
            } else {
                System.out.println("Resposta Errada! Tente Novamente.");
            }
        } while (!respostacerta4);



        String questao5 = "Qual foi a medida adotada por Campo Sales para consolidar a República Oligárquica?";
        boolean respostacerta5 = false;

        do {
            System.out.println(questao5);

            System.out.println("1) Política divina");
            System.out.println("2) Política da repressão");
            System.out.println("3) Política dos cafeicultores");
            System.out.println("4) Política dos Governadores");
            System.out.println("5) Política do Café com leite");

            System.out.println("Digite sua resposta:");
            String resposta5 = scanner.nextLine();

            if (resposta5.equals("4")) {
                System.out.println("Resposta Certa!");
                respostacerta5 = true;
            } else {
                System.out.println("Resposta Errada! Tente Novamente.");
            }
        } while (!respostacerta5);



        String questao6 = "Qual Presidente ficou no poder após Campo Sales?";
        boolean respostacerta6 = false;

        do {
            System.out.println(questao6);

            System.out.println("1) Rodrigues Alves");
            System.out.println("2) JK");
            System.out.println("3) Getúlio Vargas");
            System.out.println("4) Castelo Branco");
            System.out.println("5) Prudente de Moraes");

            System.out.println("Digite sua resposta:");
            String resposta6 = scanner.nextLine();

            if (resposta6.equals("1")) {
                System.out.println("Resposta Certa!");
                respostacerta6 = true;
            } else {
                System.out.println("Resposta Errada! Tente Novamente.");
            }
        } while (!respostacerta6);



        String questao7 = "Arraial de Belo Monte ficou conhecido também como:";
        boolean respostacerta7 = false;

        do {
            System.out.println(questao7);

            System.out.println("1) Arraial de Faraó");
            System.out.println("2) Arraial de Canaã");
            System.out.println("3) Arraial de Canudos");
            System.out.println("4) Arraial de Conselheiro");
            System.out.println("5) Arraial da Terra Santa");

            System.out.println("Digite sua resposta:");
            String resposta7 = scanner.nextLine();

            if (resposta7.equals("3")) {
                System.out.println("Resposta Certa!");
                respostacerta7 = true;
            } else {
                System.out.println("Resposta Errada! Tente Novamente.");
            }
        } while (!respostacerta7);



        String questao8 = "O inicio da República Oligárquica teve traços de uma crise que aconteceu na República da Espada, essa crise tem o nome de:";
        boolean respostacerta8 = false;

        do {
            System.out.println(questao8);

            System.out.println("1) Crise do encilhamento");
            System.out.println("2) Crise republicana");
            System.out.println("3) Crise do café com leite");
            System.out.println("4) Crise do nordeste");
            System.out.println("5) Crise do governo");


            System.out.println("Digite sua resposta:");
            String resposta8 = scanner.nextLine();

            if (resposta8.equals("1")) {
                System.out.println("Resposta Certa!");
                respostacerta8 = true;
            } else {
                System.out.println("Resposta Errada! Tente Novamente.");
            }
        } while (!respostacerta8);



        String questao9 = "Quanto tempo aproximadamente durou a guerra de Canudos?";
        boolean respostacerta9 = false;

        do {
            System.out.println(questao9);

            System.out.println("1) Quatro anos");
            System.out.println("2) Dois anos");
            System.out.println("3) Vinte anos");
            System.out.println("4) Três anos");
            System.out.println("5) Um ano");

            System.out.println("Digite sua resposta:");
            String resposta9 = scanner.nextLine();

            if (resposta9.equals("5")) {
                System.out.println("Resposta Certa!");
                respostacerta9 = true;
            } else {
                System.out.println("Resposta Errada! Tente Novamente.");
            }
        } while (!respostacerta9);



        String questao10 = "Em  1891 foi feita outra constituição que instaurava o voto Universal e aberto. Na República Oligárquica esses votos eram manipulados por coroneis, que tinham seus Currais Eleitorais essa manipulação era feita pelo:";
        boolean respostacerta10 = false;

        do {
            System.out.println(questao10);
            System.out.println("1) Voto pago");
            System.out.println("2) Voto militar");
            System.out.println("3) Voto de Cabresto");
            System.out.println("4) Voto aberto");
            System.out.println("5) Voto feminino");

            System.out.println("Digite sua resposta:");
            String resposta10 = scanner.nextLine();

            if (resposta10.equals("3")) {
                System.out.println("Resposta Certa!");
                respostacerta10 = true;
            } else {
                System.out.println("Resposta Errada! Tente Novamente.");
            }
        } while (!respostacerta10);



        String questao11 = "Quando ocorreu a Guerra do Contestado?";
        boolean respostacerta11 = false;

        do {
            System.out.println(questao11);

            System.out.println("1) 1912-1916");
            System.out.println("2) 1900-1912");
            System.out.println("3) 1985-1992");
            System.out.println("4) 1715-1800");

            System.out.println("Digite sua resposta:");
            String resposta11 = scanner.nextLine();

            if (resposta11.equals("1")) {
                System.out.println("Resposta Certa!");
                respostacerta11 = true;
            } else {
                System.out.println("Resposta Errada! Tente Novamente.");
            }
        } while (!respostacerta11);



        String questao12 = "Quais eram os Estados Brasileiros envolvidos na Guerra do Contestado?";
        boolean respostacerta12 = false;

        do {
            System.out.println(questao12);

            System.out.println("1) Santa Catarina e Rio Grande do Sul");
            System.out.println("2) Paraná e São Paulo");
            System.out.println("3) Maranhão e Sergipe");
            System.out.println("4) Paraná e Santa Catarina");

            System.out.println("Digite sua resposta:");
            String resposta12 = scanner.nextLine();

            if (resposta12.equals("4")) {
                System.out.println("Resposta Certa!");
                respostacerta12 = true;
            } else {
                System.out.println("Resposta Errada! Tente Novamente.");
            }
        } while (!respostacerta12);



        String questao13 = "Quantos monges tiveram influência na Guerra do Contestado?";
        boolean respostacerta13 = false;

        do {
            System.out.println(questao13);

            System.out.println("1) 5");
            System.out.println("2) 3");
            System.out.println("3) 15");
            System.out.println("4) 1");

            System.out.println("Digite sua resposta:");
            String resposta13 = scanner.nextLine();

            if (resposta13.equals("2")) {
                System.out.println("Resposta Certa!");
                respostacerta13 = true;
            } else {
                System.out.println("Resposta Errada! Tente Novamente.");
            }
        } while (!respostacerta13);



        String questao14 = "Alguns dos principais redudos da Guerra do Contestado:";
        boolean respostacerta14 = false;

        do {
            System.out.println(questao14);

            System.out.println("1) Taquaruçu, Caraguatá, Bom Sossego, Caçador, Santa Maria, São Miguel e São Pedro");
            System.out.println("2) Morro do Taió, Esperança, Vargem Bonita");
            System.out.println("3) Cerro Largo, Rio Grande, Vargem Bonita e Esperança");

            System.out.println("Digite sua resposta:");
            String resposta14 = scanner.nextLine();

            if (resposta14.equals("1")) {
                System.out.println("Resposta Certa!");
                respostacerta14 = true;
            } else {
                System.out.println("Resposta Errada! Tente Novamente.");
            }
        } while (!respostacerta14);



        String questao15 = "Quais as mulheres que foram referência na Guerra do Contestado?";
        boolean respostacerta15 = false;

        do {
            System.out.println(questao15);

            System.out.println("1) Ana Maria Braga, Fátima Bernardes e Chica Pelega");
            System.out.println("2) Madre Teresa, Irmã Doroti e Chica Pelega");
            System.out.println("3) Rosa Paes de Farias, Maria Rosa e Chica Pelega");


            System.out.println("Digite sua resposta:");
            String resposta15 = scanner.nextLine();

            if (resposta15.equals("3")) {
                System.out.println("Resposta Certa!");
                respostacerta15 = true;
            } else {
                System.out.println("Resposta Errada! Tente Novamente.");
            }
        } while (!respostacerta15);

        System.out.println("Parabéns, você completou o quiz!");
        scanner.close();
    }
}
