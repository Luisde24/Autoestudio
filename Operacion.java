package estructuraCondicionales;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;



 public class Operacion {
    /**  Realizar un programa que lea por teclado dos números, si el primero es mayor al segundo informar su suma y diferencia,
     *  en caso contrario informar el producto y la división del primero respecto al segundo.*/


        Scanner teclado = new Scanner(System.in);
        public void productoDivision(){

            System.out.println("Ingrese el Primer Numero");
            int num1 = teclado.nextInt();
            System.out.println("Ingrese un segundo Numero");
            int num2 = teclado.nextInt();

            if(num1>num2){

                int suma = num1 + num2;
                int resta = num1 - num2;
                System.out.println("La suma es: " + suma + " y la resta es: " + resta );
            }else {
                int multiplicacion = num1 + num2;
                int division = num1 - num2;
                System.out.println("La Multiplicacion es: " + multiplicacion + " y la Division es: " + division );
            }




        }




}

class Alumno{
    /**
     * Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar un mensaje "Promocionado".*/
    Scanner teclado = new Scanner(System.in);

    public void notas(){

        System.out.println("Ingrese la nota 1");
        int nota = teclado.nextInt();
        System.out.println("Ingrese la nota 2");
        int nota1 = teclado.nextInt();
        System.out.println("Ingrese la nota 3");
        int nota2 = teclado.nextInt();

        int suma = nota + nota1 + nota2;
        int promedio = suma/3;

        if(promedio >= 7){

            System.out.println("**PROMOCIONADO**");

        }else{
            System.out.println("NO PROMOCIONADO");
        }
    }

}

class Condicion{
    /**
     *Se ingresa por teclado un número positivo de uno o dos dígitos (1..99) mostrar un mensaje indicando
     * si el número tiene uno o dos dígitos.(Tener en cuenta que condición debe cumplirse para tener dos dígitos,
     * un número entero)
     * */
    Scanner teclado = new Scanner(System.in);

    public void mensaje(){

        System.out.println("Ingrese un Numero ");
        int num1 = teclado.nextInt();

        if( num1 <= 9 && num1 >=-9){
            System.out.println("El numero ingresado es de Un digito");
        }else {
            System.out.println("El numero ingresado es de dos digito");
        }



    }



}
class Aplicacion{


    public static void main(String[] args) {
        Operacion primer = new Operacion();
    //    primer.productoDivision();
        Alumno segundo = new Alumno();
       // segundo.notas();
        Condicion tercero = new Condicion();
        tercero.mensaje();


    }
}
