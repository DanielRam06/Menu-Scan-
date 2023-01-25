import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String figura;
        double lado;
        String operacion;

        System.out.println("¿Qué figura deseas calcular? (escriba: circulo o cuadrado)");
        figura = scanner.nextLine();

        System.out.println("¿Cuál es la longitud del radio o lado " + figura + "? (escriba el valor)");
        lado = scanner.nextDouble();

        System.out.println("¿Qué operación deseas realizar? (elija: diagonal, perímetro, area o circunferencia)");
        operacion = scanner.next();

        if (figura.equals("circulo")) {
            Circulo2 circle = new Circulo2((double) lado);
            if (operacion.equals("circunferencia")) {
                System.out.println("La circunferencia del círculo es: " + circle.getCircumference());
            } else if (operacion.equals("area")) {
                System.out.println("El área del círculo es: " + circle.getArea());
            } else {
                System.out.println("Operación inválida para un círculo");
            }
        } else if (figura.equals("cuadrado")) {
            Cuadrado1 square = new Cuadrado1((double) lado);
            if (operacion.equals("diagonal")) {
                System.out.println("La diagonal del cuadrado es: " + square.getDiagonal());
            } else if (operacion.equals("perimetro")) {
                System.out.println("El perímetro del cuadrado es: " + square.getPerimeter());
            } else if (operacion.equals("area")) {
                System.out.println("El área del cuadrado es: " + square.getArea());
            } else {
                System.out.println("Operación inválida para un cuadrado");
            }
        } else {
            System.out.println("Figura inválida");
        }
    }
}
