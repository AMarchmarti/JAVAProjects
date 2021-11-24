import dni.Dni;

public class CurrentAccount {

        private String name = null;
        private String surname = null;
        private String direction = null;
        private String phone = null;
        private Dni dni = null;
        private Double balance = 0.0d;
        private Boolean bankruptcy = false;


        /*Constructor*/
        public CurrentAccount(String name, String surname, String direction, String phone, Dni dni, Double balance,
                              Boolean bankruptcy){

                this.name = name;
                this.surname = surname;
                this.direction = direction;
                this.phone = phone;
                this.dni = dni;
                this.balance = balance;
                this.bankruptcy = bankruptcy;
        }


        public void setName(String name){
                this.name = name;
        }


        public String getName(){
                return this.name;
        }


        public void setSurname (String surname){
                this.surname = surname;
        }


        public String getSurname(){
                return this.surname;
        }


        public void setDirection (String direction){
                this.direction = direction;
        }


        public String getDirection(){
                return this.direction;
        }


        public void setPhone(String Phone){
                this.phone = phone;
        }


        public String getPhone(){
                return this.phone;
        }


        public void setDni(Dni dni){
                this.dni = dni;
        }


        public Dni getDni(){
                return this.dni;
        }


        public void setBalance(Double balance){
                this.balance = balance;
        }


        public Double getBalance(){
                return this.balance;
        }


        private void setBankruptcy(){
                if (this.balance < 0){
                        this.bankruptcy = true;
                }else{
                        this.bankruptcy = false;
                }
        }


        public Boolean getBankruptcy(){
                return this.bankruptcy;
        }


        public void withdrawBalance(Double amount){
                this.balance -= amount;
                this.setBankruptcy();
        }


        public  void depositMoney (Double amount){
                this.balance += amount;
                this.setBankruptcy();
        }


        public void currentAccount(){

                ;
        }


}
