package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.CheckService;

@RestController
public class ExceptController {
    private final CheckService checkService;


    public ExceptController(CheckService checkService) {
        this.checkService = checkService;
    }


    @GetMapping ("/check")

    public String check(@RequestParam String login,@RequestParam String password,
                        @RequestParam String confirmPassword) {
        checkService.check(login,password,confirmPassword); //наверное сюда поставить но выходит ошибка 404

        return "проверка пройдена";
    }
}
   // check("study", "123", "1234"); куда поставить??? все уже перепробовал.



