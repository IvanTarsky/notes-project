import java.util.Scanner;

public class Authentication {

    public static final String LOGIN = "slava";
    public static final String PASSWORD = "1234";

    public static int authenticate() {
        Scanner s = new Scanner(System.in);

//        int maxCount = 3;
        boolean isLoginSuccess = false;

//        while (maxCount > 0 && !isLoginSuccess) {
//            System.out.print("Login: ");
//            String login = s.nextLine();
//
//            System.out.print("Password: ");
//            String password = s.nextLine();
//
//            if(login.equals(LOGIN) && password.equals(PASSWORD)) {
//                isLoginSuccess = true;
//            }
//
//            maxCount--;
//        }

        for (int maxCount = 3; maxCount > 0 && !isLoginSuccess; maxCount--) {
            System.out.print("Login: ");
            String login = s.nextLine();

            System.out.print("Password: ");
            String password = s.nextLine();

            if(login.equals(LOGIN) && password.equals(PASSWORD)) {
                isLoginSuccess = true;
            }
        }

        return isLoginSuccess ? 0 : -1;
    }
}
