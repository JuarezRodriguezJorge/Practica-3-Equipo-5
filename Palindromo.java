import java.util.Scanner;

public class Palindromo {

    // Método estático
    static boolean esPalindromo(int num) {

        if (num / 10000 == num % 10 &&
            (num / 1000) % 10 == (num / 10) % 10) {

            return true;
        }
        else {
            return false;
        }
    }


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        long numero;

        // Se repite mientras NO sea un número de 5 dígitos
        do {
            System.out.print("Ingresa un numero de 5 digitos: ");
            numero = entrada.nextLong();

            // Mensaje de error si no tiene 5 dígitos
            if (numero <= 9999 || numero >= 100000) {
                System.out.println("Error: el numero debe tener 5 digitos.");
            }

        } while (numero <= 9999 || numero >= 100000);


        // Como ya sabemos que tiene 5 dígitos,
        // podemos convertirlo a int
        int num = (int) numero;


        if (esPalindromo(num)) {
            System.out.println("Es un palindromo");
        }
        else {
            System.out.println("No es un palindromo");
        }

        entrada.close();
    }
}
