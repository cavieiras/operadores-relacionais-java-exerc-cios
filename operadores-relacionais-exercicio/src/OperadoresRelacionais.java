import javax.lang.model.util.ElementScanner14;

public class OperadoresRelacionais {
    public static void main(String[] args) throws Exception {

        int numero1 = 10;
        int numero2 = 20;
        float numero3 = 4.5f;
        float numero4 = 3.5f;
        char caractere1 = 'x';
        char caractere2 = 'y';
        String texto1 = "Fulano";
        String texto2 = "Fulano";
        boolean teste1 = true;
        boolean teste2 = false;

       
            System.out.println ("Número um é igual a número 2 " + (numero1 == numero2));
            System.out.println("Número um é diferente de número dois " + (numero1 != numero2));
            System.out.println("Número um é maior que número dois " + (numero1 > numero2));
            System.out.println("Número um é maior igual a número dois " + (numero1 >= numero2));
            System.out.println("Número um é menor e diferente de número dois " + (numero1 <= numero2));
            System.out.print("Número dois é maior que número um " + (numero1 < numero2));


        
        
    }
}
