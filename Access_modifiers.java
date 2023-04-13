class account {
    public String name;
    protected String email;
    private String password;

    public String getpassword() {
        return this.password;
    }

    public void setpassword(String pass) {
        this.password = pass;
    }

}

public class Access_modifiers {
    public static void main(String args[]) {
        account account1 = new account();
        account1.name = "Apna bank";
        account1.email = "apnaemail@gmail.com";
        // account1.password ="abcd";
        // System.out.println(account1.name);
        account1.setpassword("abcd");
        System.out.println(account1.getpassword());
    }
}
