

import java.util.Scanner;

public class Polimorfismo {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce primer numero: ");
        double a = sc.nextDouble();
        System.out.println("Introduce segundo numero: ");
        double b = sc.nextDouble();

        Calculadora c = new Calculadora(a,b);

        System.out.println(c.suma());

    }

}
