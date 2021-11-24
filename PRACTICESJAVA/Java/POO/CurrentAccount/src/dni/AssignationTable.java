package dni;

public class AssignationTable {

    char[] table = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
            'H', 'L', 'C', 'K', 'E'};

    public char getLetter (int posicion) {

        return this.table[posicion];
    }


    public int getTableLength (){

        return this.table.length;
    }


    public char findLetter (String Dni){

        int posicion = Integer.parseInt(Dni) % getTableLength();
        return getLetter(posicion);
    }
}
