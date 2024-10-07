package middlewares;

public class TestMiddleWare extends MiddleWare {

    @Override
    public boolean check(String email, String password) {
        System.out.println("email = " + email + ", password = " + password);
        return checkNext(email,password);
    }
}
