import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);
    Triangulo triangulo1 = new Triangulo(0, 0, 0);
    public void Introducir(){
        System.out.println("Introduzca un lado: ");
        float lado1 = sc.nextFloat();
        triangulo1.setLado(lado1);
        System.out.println("Introduzca la base: ");
        float base1 = sc.nextFloat();
        triangulo1.setBase(base1);
    }

    public void Perimetro(){
        System.out.println("Calcular Perímetro: ");
        float perimetro = triangulo1.getLado() + triangulo1.getLado() + triangulo1.getBase();
        System.out.println("El perímetro es: " + perimetro);
    }

    public void Area(){
        System.out.println("Calcular Área: ");
        float altura1 = ((triangulo1.getLado() * triangulo1.getLado()) - ((triangulo1.getBase() * triangulo1.getBase()) / 4));
        double resultado = Math.sqrt(altura1);
        triangulo1.setAltura(resultado);
        double area = (triangulo1.getBase() * triangulo1.getAltura()) / 2;
        System.out.println("El área es: " + area);
    }
}
