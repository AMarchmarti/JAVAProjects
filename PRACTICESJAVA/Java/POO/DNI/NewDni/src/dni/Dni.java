package dni;

import java.io.IOException;

public class Dni {

    private String dni = null;
    private Boolean numeroSano = false;
    private Boolean letraSana = false;
    private Boolean dniSano = false;
    private AssignationTable table = new AssignationTable();

    public Dni (String dni){
        this.dni = dni;
    }


    public void setDni(String cadena){
        this.dni = cadena;
    }


    public String getDni(){
        return this.dni;
    }


    private void setNumeroSano(Boolean valor){
        this.numeroSano = valor;
    }


    public Boolean getNumeroSano (){
        return this.numeroSano;
    }


    private void setLetraSana(Boolean valor){
        this.letraSana = valor;
    }


    public Boolean getLetraSana() {
        return this.letraSana;
    }


    public void setDniSano (Boolean valor){
        this.dniSano = valor;
    }


    public Boolean getDniSano (){
        return this.dniSano;
    }


    public Boolean checkDniCif(){
        setDniSano(checkDni() && checkLetra());
        return getDniSano();
    }


    public Boolean checkDni() {
        setNumeroSano(checkLength() && dniNumbers(getNumbers()));
        return getNumeroSano();
    }

    public Boolean checkLetra(){
        if (getNumeroSano()){
            setLetraSana(Character.isUpperCase(getLetters()) && letraValida());
            return getLetraSana();
        }else{
            return false;
        }
    }

    public Character obtenerLetra() throws IOException {
        if (getNumeroSano()) {
            return this.table.findLetter(getNumbers());
        }else{
            throw new IOException("Numeros incorrectos");
        }}


    public Boolean checkLength(){
        if (getDni().length() == 9) {
            return true;
        }
        else{
            return false;
        }
    }


    public Boolean dniNumbers (String cadena){
        try {
            int num = Integer.parseInt(cadena.substring(0, cadena.length() - 1));
            return true;
        } catch (NumberFormatException num) {
            return false;
        }
    }


    public Boolean letraValida (){
        try {return obtenerLetra() == getLetters();

        }catch (IOException ioexception){
            return false;}
    }


    public String getNumbers(){
        return (String) dni.substring(0, dni.length() - 1);
    }

    public Character getLetters(){
        return dni.charAt(dni.length() - 1);
    }
}
