package middlewares;

public class CheckPermissionMiddleware extends MiddleWare {

    @Override
    public boolean check(String email, String password) {
        if(email.equals("amanda@email")) {
            System.out.println("Bem vinda administradora!");
        }

        System.out.println("Bem vindo!");

        return checkNext(email,password);
    }

}
