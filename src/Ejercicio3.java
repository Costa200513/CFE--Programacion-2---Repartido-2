import java.util.Scanner;
public class Ejercicio3
{
    public static void main(String [] args)
    {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero entre el 0 y el 999: ");
        int num = leer.nextInt();

        if (num<10)
        {
           System.out.println("El numero " + num + " tiene 1 cifra");
        }
        else if (num>=10 && num<100)
        {
            System.out.println("El numero " + num + " tiene 2 cifras");
        }
        else if (num>=100)
        {
            System.out.println("El numero " + num + " tiene 3 cifras");
        }
        else
        {
            System.out.println("El numero ingresado esta fuera del rango");
        }
    }
}
