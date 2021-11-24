package org.htlinking.Users;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public class Register {

        private Map<PrivateKey,User> information = new HashMap<>();

        //Getters


        public Map<PrivateKey, User> getInformation() {
                return this.information;
        }

        public void register(User user){
                PrivateKey key = user.getPriKey();
                getInformation().putIfAbsent(key, user);
        }


}
