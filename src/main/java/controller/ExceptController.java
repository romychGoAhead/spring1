package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.CheckService;

@RestController
public class ExceptController {
    private final CheckService checkService;

    public ExceptController(CheckService checkService) {
        this.checkService = checkService;
    }


    @GetMapping("/check")

    public String check(String login, String password, String confirmPassword) {
        checkService.check("study", "123", "1234"); //наверное сюда

        return "проверка пройдена";
    }
}
   // check("study", "123", "1234"); куда поставить??? String login, String password, String confirmPassword

