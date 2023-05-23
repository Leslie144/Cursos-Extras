// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//Primera parte:
//Crear una función con tres parámetros que sean números que se suman entre sí.
//Llamar a la función en el main y darle valores.
public class Main {

    public static void sumarNumeros(int num1, int num2, int num3) {
        int suma = num1 + num2 + num3;
        System.out.println("La suma de los tres números es: " + suma);
    }

    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int numero1 = 25;
        int numero2 = 10;
        int numero3 = 15;
        sumarNumeros(numero1, numero2, numero3);
    }
}