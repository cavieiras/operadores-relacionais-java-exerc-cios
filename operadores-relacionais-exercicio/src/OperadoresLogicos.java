public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2 " + (b1&&b2));
        System.out.println("b1 && b3 " + (b1&&b3));
        System.out.println("b2 || b3 " + (b2||b3));
        System.out.println("b1 || b3 " + (b1||b3));
        System.out.println("b1 ^ b3 " + (b1^b3));
        System.out.println("b4 ^ b1 " + (b4&&b1));
        System.out.println("!b1 " + (!b1));
        System.out.println("!b2 " + (!b2));


        //Esse bloco de código mostra que é possível obter resultados boolean para
        //variáveis que não são boolean
        
        int numero1 = 10;
        int numero2 = 5;
        float numero3 = 20f;
        float numero4 = 50f;

        System.out.println("(i1 > i2) || (f2 < f1) " + ((numero1 > numero2) || (numero4 < numero3)));
        System.out.println("((i1 + i2) < (f2 - f1)) && true " + (((numero1 + numero2) < (numero4 - numero3)) && true));
        
    }
}
