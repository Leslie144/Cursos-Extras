// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

//En este ejercicio practicarás las estructuras de control,
// para ello deberás crear:
//Usando un if, crear una condición que compare si la variable
// numeroIf es positivo, negativo, o 0.
//Pista: Los números inferiores a 0 son negativos y los superiores,
// positivos.
//Crea un bucle While, este bucle tendrá que tener como condición
// que la variable numeroWhile sea inferior a 3, el bloque de código que
// tendrá el bucle deberá:
//Incrementar el valor de la variable en uno cada vez que se ejecute.
//Mostrarlo por pantalla cada vez que se ejecute.
//Para el bucle Do While, deberás crear la misma estructura que en el
// While, pero solo se debe ejecutar una vez.
//Para el bucle For, crea una variable numeroFor, esta variable tendrá
// como valor 0 y su condición será que la variable sea igual o menor
// que 3, se irá incrementando en 1 su valor cada vez que se ejecute y
// deberá mostrarse por pantalla.
//Por último, para el Switch, deberás crear la variable estacion, y
// distintos case para las cuatro estaciones del año. Dependiendo del
// valor de la variable estacion se deberá mandar un mensaje por consola
// informando de la estación en la que está. También habrá que poner un
// default para cuando el valor de la variable no sea una estación.
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