import middlewares.CheckPermissionMiddleware;
import middlewares.CheckUserMiddleWare;
import middlewares.MiddleWare;
import middlewares.TestMiddleWare;
import server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void main(String[] args) throws IOException {
        init();

        boolean done;

        do {
            System.out.print("Digite o e-mail: ");
            String email = reader.readLine();

            System.out.print("Digite sua senha: ");
            String password = reader.readLine();

            done = server.login(email,password);
        } while(!done);
    }

    public static void init() {
        server = new Server();
        server.registerUser("user@hcode","123");
        server.registerUser("amanda@email","321");

        CheckUserMiddleWare checkUser = new CheckUserMiddleWare(server);
        CheckPermissionMiddleware checkPermission = new CheckPermissionMiddleware();
        checkUser.linkWith(checkPermission);
        checkPermission.linkWith(new TestMiddleWare());

        server.setMiddleWare(checkUser);
    }
}