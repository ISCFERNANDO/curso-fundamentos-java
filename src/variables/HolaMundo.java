package variables;

/**
 *
 * @author fernando
 */
public class HolaMundo {

    public static void main(String[] args) {
        //tipo de dato nombre de la variable;
        int resultado;//declaracion de variable
        int n1, n2, n3;
        int numero1 = 5;
        int numero2 = 10;

        n1 = numero1 + numero2;
        n2 = numero1 - numero2;
        n3 = n1 + n2;
        resultado = n3 + n1 + n2;

        System.out.println("Valor de n1: " + n1);
        System.out.println("Valor de n2: " + n2);
        System.out.println("Valor de n3: " + n3);
        System.out.println("Resultado: " + resultado);
    }
}
