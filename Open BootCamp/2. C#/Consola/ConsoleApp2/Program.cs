// See https://aka.ms/new-console-template for more information
// Solicitar datos de la persona

//Ejercicio 1:
Console.Write("Ingrese su nombre: ");
string nombre = Console.ReadLine();

Console.Write("Ingrese su apellido: ");
string apellido = Console.ReadLine();

Console.Write("Ingrese su edad: ");
int edad = int.Parse(Console.ReadLine());

Console.Write("¿Sabe programar? (Sí/No): ");
bool sabeProgramar = Console.ReadLine().ToLower() == "sí";

// Generar el mensaje
string mensaje = "Bienvenido, " + nombre + " " + apellido + ". ";

if (edad >= 18)
{
    mensaje += "Eres mayor de edad. ";
}
else
{
    mensaje += "Eres menor de edad. ";
}

if (sabeProgramar)
{
    mensaje += "Sabes programar.";
}
else
{
    mensaje += "No sabes programar.";
}

// Mostrar el mensaje
Console.WriteLine(mensaje);