public static void main(String[] args) {
    try {
        UserValidation.validateUser("user_name_Roman", "Password132", "Password321");
        System.out.println("Пользователь успешно проверен.");
    } catch (WrongLoginException | WrongPasswordException e) {
        System.err.println("Ошибка: " + e.getMessage());
    } finally {
        System.out.println("Завершение проверки пользователя.");
    }
}

