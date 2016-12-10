package Aula4.Exercicios;

public class Quadrado implements AreaCalculavel {
	
    private int lado = 10;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
       
    public double getArea() {
        int area = 0;
        area = lado * lado;

        return area;
    }

   }