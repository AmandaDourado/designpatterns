package server;

import middlewares.MiddleWare;

import java.util.HashMap;
import java.util.Map;

public class Server {

    private Map<String,String> users = new HashMap<>();
    private MiddleWare middleWare;

    public void setMiddleWare(MiddleWare middleWare) {
        this.middleWare = middleWare;
    }

    public boolean login(String email, String password) {
        if(middleWare.check(email, password)) {
            System.out.println("Usuário autenticado com sucesso!");
            return true;
        }

        return false;
    }

    public void registerUser(String email, String password) {
        users.put(email,password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}
