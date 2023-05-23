// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int numeroIf = 5;

        // if
        if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es 0");
        }

        // while
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("El valor de numeroWhile es: " + numeroWhile);
        }

        // do-while
        int numeroDoWhile = 0;
        do {
            numeroDoWhile++;
            System.out.println("El valor de numeroDoWhile es: " + numeroDoWhile);
        } while (numeroDoWhile < 3);

        // for
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El valor de numeroFor es: " + numeroFor);
        }

        // switch
        String estacion = "verano";
        switch (estacion) {
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "verano":
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("No es una estación válida");
                break;
        }
    }
}