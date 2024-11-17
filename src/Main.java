public class Main {
    public static void main(String[] args) {
        try {
            UserValidation.validateUser("user_name", "Password123", "Password123");
            System.out.println("Пользователь успешно проверен.");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Завершение проверки пользователя.");
        }
    }
}

