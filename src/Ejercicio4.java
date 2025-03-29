import java.util.Scanner;
public class Ejercicio4
{
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int num1 = leer.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int num2 = leer.nextInt();

        System.out.println("Ingrese el tercer numero: ");
        int num3 = leer.nextInt();

        if (num1>num2 && num1>num3)
        {
            System.out.println("El numero " + num1 + " es el mayor" );
        }
        else if(num2>num1 && num2>num3)
        {
            System.out.println("El numero " + num2 + " es el mayor" );
        }
        else if(num3>num1 && num3>num2)
        {
            System.out.println("El numero " + num3 + " es el mayor" );
        }
        else
        {
            System.out.println("Los 3 numeros son iguales");
        }
    }
}
