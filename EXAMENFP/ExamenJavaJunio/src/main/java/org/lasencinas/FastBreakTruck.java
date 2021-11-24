package org.lasencinas;




public class FastBreakTruck{

    private static Cereales cereales;

    private static Bebidas bebidas;

    public FastBreakTruck(){}

    public static Desayuno prepararEyeHoles(){
        cereales = new Eyeholes("Eyeholes", (float) 25.0);
        bebidas = new TurbulentJuice("Turbulen juuuuuice", (float) 30.0);
        Desayuno desayuno = new Desayuno();
        desayuno.setItems(cereales);
        desayuno.setItems(bebidas);
        return desayuno;
    }

    public static Desayuno prepararSmiggles(){
        cereales = new Smiggles("Smiggles", (float) 50.0);
        bebidas = new FleebJuice("Fleeb juice", (float) 35.0);
        Desayuno desayuno = new Desayuno();
        desayuno.setItems(cereales);
        desayuno.setItems(bebidas);
        return desayuno;
    }


    public static void incluirJuguete(Desayuno desayuno) {
        if ((desayuno.getItems().contains((Eyeholes) cereales))) {
            desayuno.setItems(new Juguete("Plumbus", 100.0f));
        }
    }
}
