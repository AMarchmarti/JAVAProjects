package org.htlinking.Users;

public  class Login {

    public static Boolean checkEmail(String email, User user){
        if(email.equals(user.getEmail())){
            return true;
        }
        return false;
    }

    public static  Boolean checkPass(String pass, User user){
        if(pass.equals(user.getPassword())){
            return true;
        }
        return false;
    }

    public static Boolean login(String email, String pass, User user){
        if ((checkEmail(email,user)) && checkPass(pass, user)){
            return true;
        }
        return false;
    }
}
