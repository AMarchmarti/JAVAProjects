package tarjetaUsuario;

public class TarjetaUsuario {

        private int id = 0;
        private Boolean activada = false;

        public TarjetaUsuario(String id, Boolean valor) {
                if (id.length() == 9) {
                        try {
                                int num = Integer.parseInt(id);
                                this.id = num;
                        } catch (NumberFormatException num) {
                                this.id = 0;
                        }
                }
                this.activada = valor;
        }

        public int getTarjetaId(){
                return this.id;
        }


        public void setActivada(Boolean valor){
                this.activada = valor;
        }


        public Boolean getActivada(){
                return this.activada;
        }
}
