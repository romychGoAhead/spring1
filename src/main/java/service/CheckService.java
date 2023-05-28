package service;

// сюда мы переносим проверку т е в интерфейсе проверяем
public interface CheckService {


    void check(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException;// переносим метод


}
