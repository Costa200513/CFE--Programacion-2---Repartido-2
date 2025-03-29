import java.util.Scanner;
public class Ejercicio1
{
    public static void main (String [] args)
    {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num = leer.nextInt();

        if(num>0)
        {
            System.out.println("El numero " + num + " es positivo");
        }
        else if (num<0)
        {
            System.out.println("El numero " + num + " es negativo");
        }
        else
        {
            System.out.println("0 es un valor neutro");
        }
    }
}
