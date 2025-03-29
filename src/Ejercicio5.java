import java.util.Scanner;
public class Ejercicio5
{
    public static void main(String [] args)
    {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su peso en kg:");
        double peso = leer.nextDouble();

        System.out.println("Ingrese su altura en m:");
        double altura = leer.nextDouble();

        System.out.println("Su IMC es de: " + peso / (altura*altura));
    }
}
