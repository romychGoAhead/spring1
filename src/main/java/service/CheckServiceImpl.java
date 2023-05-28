package service;
// а в реализации его реализуем

import org.springframework.stereotype.Service;

@Service
public class CheckServiceImpl implements CheckService {

    private static final String REGEX = "^[a-zA-Z0-9_]*$";    // можно проверить через метод matches()


    @Override
    public void check(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if (!login.matches(REGEX)) { // eсли логин не(!) удовлетворяет REGEX
            throw new WrongLoginException("логин содержит неверные символы");
        }
        if (login.length() > 20) {
            throw new WrongLoginException("размер логина не должен превышать 20 символов");
        }

        if (!password.matches(REGEX)) { //eсли пароль не(!) удовлетворяет REGEX
            throw new WrongPasswordException("пароль содержит неверные символы");
        }
        if (password.length() > 20) {
            throw new WrongPasswordException("размер пароля не должен превышать 20 символов");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException(" Пароли не совпали");
        }


    }
}