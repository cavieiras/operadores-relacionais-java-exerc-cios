public class recebimentoAuxilio {
    
    public static void main(String[] args) {
        
        double salarioMensal = 1000;
        double mediaSalario = 1320;

        int quantidadeDependentes = 5;
        int mediaDependentes = 2;

        //Aqui é a expressão completa para cálculo: longa e pode levar a erro na manutenção
        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

       //Aqui é a simplificação da expressao acima;
       //criação de variáveis intermediárias para simplificar o código
        boolean salarioBaixo = (salarioMensal < mediaSalario);
        boolean muitosDependentes = (quantidadeDependentes >= mediaDependentes);
        
        System.out.println((salarioBaixo && muitosDependentes));


        //esse bloco indica uma maior simplificação do expresso acima
        //esse é o exemplo ideal de boas práticas 
        //AJUDA O TRABALHO DO QA NA ANÁLISE DO CÓDIGO
        boolean recebeAuxilio = (salarioBaixo && muitosDependentes);
        System.out.println("Recebe auxílio " + recebeAuxilio);
    }
}
