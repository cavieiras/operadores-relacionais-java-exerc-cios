import java.util.Scanner; //importa para meu código a utilidade Scanner

public class ControleFluxo {

    public static void main(String[] args) {

        try (
        // cria um novo objeto que permite procurar no código o valor escolhido pelo usuário
        Scanner entrada = new Scanner(System.in)
        ) {
            //comando para o usuário
            System.out.println("Escolha um número de 1 a 12.");
            int mes = entrada.nextInt(); // permite o usuário colocar o número escolhido
                                        //procura nas variáveis o valor (int) fornecido pelo usuário
            
            if (mes == 1) {
                System.out.println("Janeiro");
            }
            else if (mes == 2) {
                System.out.println("Fevereiro");
            }
            else if (mes == 3) {
                System.out.println("Março");
            }
            else if (mes == 4) {
                System.out.println("Abril");
            }
            else if (mes == 5) {
                System.out.println("Maio");
            }
            else if (mes == 6) {
                System.out.println("Junho");
            }
            else if (mes == 7) {
                System.out.println("Julho");
            }
            else if (mes == 8) {
                System.out.println("Agosto");
            }
            else if (mes == 9) {
                System.out.println("Setembro");
            }
            else if (mes == 10) {
                System.out.println("Outubro");
            }
            else if (mes == 11) {
                System.out.println("Novembro");
            }
            else if (mes == 12) {
                System.out.println("Dezembro");
            }
            
            // meses que são meses de férias
            int mes1 = 1;
            int mes2 = 7;
            int mes3 = 12;
            
            //a variável férias é uma variável intermediária
            // ela faz a comparação entre os meses de férias e o mês que o usuário escolheu
            boolean ferias = ((mes1 == mes) || (mes2 == mes) || (mes3 == mes));
      
            if (ferias) {
                System.out.println("Férias");
            }

            
            //comando para o usuário; aparece depois que o os if's foram executados
            System.out.println("Escolha um número de 1 a 7.");
            int dia = entrada.nextInt();

            switch (dia) {
                case 1:
                System.out.println("Domingo");
                break;
                case 2:
                System.out.println("Segunda");
                break;
                case 3:
                System.out.println("Terça");
                break;
                case 4:
                System.out.println("Quarta");
                break;
                case 5:
                System.out.println("Quinta");
                break;
                case 6:
                System.out.println("Sexta");
                break;
                case 7:
                System.out.println("Sábado");
                break;
                default:
                System.out.println("Valor inválido. Escolha um número entre 1 e 7.");
            }

         

        }
        
        
    }
    
}
