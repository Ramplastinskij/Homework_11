public class UserValidation {

    public static void validateUser(String login, String password, String confirmPassword)
        throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20 || !login.matches("[a-zA-Z0-9_]+")) {
            throw new WrongLoginException("Логин должен содержать только латинские буквы, цифры и знак подчеркивания и быть длиной 20 символов или меньше.");
        }
        if (password.length() > 20 || !password.matches("[a-zA-Z0-9_]+")) {
            throw new WrongPasswordException("Пароль должен содержать только латинские буквы, цифры и знак подчеркивания и быть длиной 20 символов или меньше.");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают.");
        }
    }
}