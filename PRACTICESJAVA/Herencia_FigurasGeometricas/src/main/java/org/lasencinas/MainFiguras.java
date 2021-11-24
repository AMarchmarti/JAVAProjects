package org.lasencinas;


import java.util.ArrayList;
import java.util.List;

public class MainFiguras
{
    public static void main( String[] args )
    {
        List<FiguraGeometrica> listaFiguras = new ArrayList<>();

        Rectangulo rectangulo = new Rectangulo (4d,5d);
        Rectangulo rectanguloSuper = new Rectangulo("rectangulo", 4d, 5d);

        Circulo circulo = new Circulo(5d);
        Circulo circuloSuper = new Circulo("circulo", 5d);

        Cuadrado cuadrado = new Cuadrado(5d);
        Cuadrado cuadradoSuper = new Cuadrado("cuadrado", 5d);

        Elipse elipse = new Elipse(4d, 5d);
        Elipse elipseSuper = new Elipse("elipse", 4d, 5d);


        listaFiguras.add(rectangulo);
        listaFiguras.add(rectanguloSuper);
        listaFiguras.add(circulo);
        listaFiguras.add(circuloSuper);
        listaFiguras.add(cuadrado);
        listaFiguras.add(cuadradoSuper);
        listaFiguras.add(elipse);
        listaFiguras.add(elipseSuper);

        for (FiguraGeometrica figura : listaFiguras){
            System.out.println("Area del " + figura.getNombre() + " = " + figura.area());
        }
    }
}