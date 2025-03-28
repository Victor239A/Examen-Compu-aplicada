import java.util.Scanner;

public class ExamenCompuA {

    public static void main(String[] args) {
        

 System.out.println("Primera Serie: Crear un algoritmo para resolver cada una de las siguientes ecuaciones.");
 System.out.println("");
System.out.println("Numero 1:");
System.out.println("");

Scanner varible= new Scanner(System.in);

System.out.println("Ingrese el valor de x:");
int x= varible.nextInt();
int resultado= x + 2*x;
System.out.println("El resultado de la ecuacion es: " + resultado);
System.out.println("");
System.out.println("Numero 2:");

System.out.println("Ingrese el valor de x:");
int x2= varible.nextInt();
int resultado2= x2*2 - 3 * x2;
System.out.println("El resultado de la ecuacion es: " + resultado2);
System.out.println("");
System.out.println("Numero 3:");
System.out.println("Ingrese el valor de a:");
int a= varible.nextInt();
System.out.println("Ingrese el valor de b:");
int b= varible.nextInt();
System.out.println("Ingrese el valor de c:");
int c= varible.nextInt();
int promedio= (a + b + c) / 3;
System.out.println("El promedio de los 3 numeros es: " + promedio);
System.out.println("");

System.out.println("Numero cuatro:");
System.out.println("Ingrese el numero al cuadrado y el de x (son el mismo):");
int x3= varible.nextInt();
int resultado3= (x3 * x3) +2 * (x3 +1);
System.out.println("El resultado de la ecuación es:"+ resultado3);

System.out.println("");
System.out.println("Segunda Serie:Crea un bucle.");
System.out.println("");


Scanner sc = new Scanner(System.in);
int opcion;

do {
    System.out.println("[ 1 ] Calcular la moda");
    System.out.println("[ 2 ] La mitad del numero es");
    System.out.println("[ 3 ] Di hola mundo");
    System.out.println("[ 4 ] Salir");
    System.out.print("[ ? ]: ");
    
    opcion = sc.nextInt();
switch (opcion) {

    case 1:
    int[] opciones = {5, 8, 12, 5, 9, 7, 12, 14, 8, 5, 9, 12, 7, 5, 8, 14, 8, 12, 7, 9};
    int moda = 0, maxFrecuencia = 0;

    for (int i = 0; i < opciones.length; i++) {
        int frecuencia = 0;
        for (int j = 0; j < opciones.length; j++) {
            if (opciones[i] == opciones[j]) {
                frecuencia++;
            }
        }
        if (frecuencia > maxFrecuencia) {
            maxFrecuencia = frecuencia;
            moda = opciones[i];
        }
    }

    System.out.println("La moda es: " + moda + " con una frecuencia de: " + maxFrecuencia);
    System.out.println("El bucle se repetira hasta que se elija la opcion 4");
    System.out.println("");
    break;
        case 2:
        System.out.println("Ingrese un numero:");
        int numero = sc.nextInt();  
        int mitad = numero / 2;
        System.out.println("La mitad de " + numero + " es: " + mitad);

        System.out.println("El bucle se repetira hasta que se elija la opcion 4");
        System.out.println("");
        break;

        case 3:
        System.out.println("Hola mundo");
        System.out.println("El bucle se repetira hasta que se elija la opcion 4");
        System.out.println("");

        break;

        case 4:
        System.out.println("Saliendo del programa...");

    default:System.out.println("Opcion no valida");
        break;
        }

    }
    
    while (opcion != 4);


}
}





