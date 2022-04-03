public class Triangulo {
    private float lado;
    private float base;
    private double altura;

    public Triangulo(float lado, float base, double altura) {
        this.lado = lado;
        this.base = base;
        this.altura = altura;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String toString(){
        return "\nLados: " + getLado() + "\nBase: " + getBase();
    }
}
