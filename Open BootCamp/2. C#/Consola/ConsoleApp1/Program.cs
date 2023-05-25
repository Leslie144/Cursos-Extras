//EJERCICIO 1
//Escribe un programa que reciba tu nombre y lo escriba por consola

Console.WriteLine("Introduce tu nombre: ");
string nombre = Console.ReadLine();


Console.WriteLine("Hola, " + nombre);


//EJERCICIO 2
//Escribe un programa que tome la hora y escriba por pantalla
// Obtener la hora actual del sistema
DateTime horaActual = DateTime.Now;

// Mostrar la hora en la consola
Console.WriteLine("La hora actual es: " + horaActual.ToString("HH:mm:ss"));
