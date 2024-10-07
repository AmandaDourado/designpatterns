package middlewares;

public abstract class MiddleWare {

    private MiddleWare next;

    public void linkWith(MiddleWare next) {
        this.next = next;
    }

    public abstract boolean check(String email, String password);

    protected boolean checkNext(String email, String password) {
        if(next == null) {
            return true;
        }

        return next.check(email,password);
    }
}
