package Class10;

public class Task {
    public static void main(String[] args) {

        String username = "User123";
        String password = "gkm55";
        String confirmPassword = "gkm55";

        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Username or Password cannot be empty");

        } else if (password.length() < 8) {
            System.out.println("Password is too short");
        } else if (password.contains(username)) {
        }
    }
}
