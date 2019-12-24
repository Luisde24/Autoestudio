package estructuraCondicionales;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class OperacionesAnidadas {

  /**Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos.* */
 public void operacion(){
     Scanner teclado = new Scanner(System.in);
     System.out.println("Ingrese el Primero Numero");
     int num1=teclado.nextInt();
     System.out.println("Ingrese el Segundo Numero");
     int num2 = teclado.nextInt();
     System.out.println("Ingrese el Tercer Numero");
     int num3 = teclado.nextInt();

     if(num1>num2 && num1>num3){

         System.out.println("El mayor Numero es el Primero: " + num1);

     }else if(num2>num1 && num2>num3){

         System.out.println("El mayor Numero es el Segundo: " + num2);


     } else {
         System.out.println("El mayor Numero es el Tercero: " + num3);

     }

 }



}
class Numero{
/**Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo, nulo o negativo. */
public void valor(){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese un Valor numerico entero");
    int valor=teclado.nextInt();

    if(valor>0){
        System.out.println("El Numero Ingresado es Positivo: " + valor);


    }
    else if(valor == 0){

        System.out.println("El numero Ingresado  es Nulo: " + valor);

    }else{
        System.out.println("El numero Ingresado es Negativo: " + valor);
    }

  }
}
class Menssager{
    /** Confeccionar un programa que permita cargar un número entero positivo de hasta tres cifras y
     * muestre un mensaje indicando si tiene 1, 2, o 3 cifras. Mostrar un mensaje de error si el número de cifras es mayor.*/
    public void mensaje(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese Un Numero que se encuentre entre -999 y 999");
        int numero = teclado.nextInt();

        if(numero >= -9 && numero <= 9){
            System.out.println("El numero Ingresado es una cifra");

        }else if(numero>9 && numero<100 || numero<-9 ){
            System.out.println("El numero Ingresado es de dos Cifras");

        }else {
            System.out.println("El numero es de tres cifras");

        }

    }


}

class Empledo{
    /** Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información: cantidad total de
     *  preguntas que se le realizaron y la cantidad de preguntas que contestó correctamente. Se pide confeccionar un programa
     *  que ingrese los dos datos por teclado e informe el nivel del mismo según el porcentaje de respuestas correctas
     *  que ha obtenido, y sabiendo que:
     Nivel máximo:	Porcentaje>=90%.
     Nivel medio:	Porcentaje>=75% y <90%.
     Nivel regular:	Porcentaje>=50% y <75%.
     Fuera de nivel:	Porcentaje<50%. **/

    public void resultado(){
        Scanner teclado = new Scanner(System.in);

       double porcentaje=0.0;

        System.out.println("Ingrese la cantidad Total de Preguntas ");
        int cantPregunta = teclado.nextInt();
        System.out.println("Ingrese la Cantidad de Prenguntas Buenas");
        int pBuenas = teclado.nextInt();

        porcentaje = (pBuenas*100)/cantPregunta;
        if(pBuenas>cantPregunta){
            System.out.println("Tu respuesta es incorrecta, verifica nuevamente");
        } else if(porcentaje>=90){
            System.out.println("Su nivel de respuesta es el Maximo");

        }else if(porcentaje >= 75 && porcentaje <90){

            System.out.println("Su nivel de respuesta es Medio");

        }else if(porcentaje >= 50 && porcentaje<75) {
            System.out.println("Su nivel de respuesta es Regular");

        }
        else{

            System.out.println("Su nivel de respuesta es muy bajo, por lo tanto esta Fuera del rango");
        }

    }
}
class Aplicaciones{

    public static void main(String[] args) {

        OperacionesAnidadas primero = new OperacionesAnidadas();
        //primero.operacion();
        Numero segundo = new Numero();
        //segundo.valor();
        Menssager tercero = new Menssager();
       // tercero.mensaje();
        Empledo cuarto = new Empledo();
        cuarto.resultado();
    }
}
