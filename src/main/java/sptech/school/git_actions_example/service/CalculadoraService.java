package sptech.school.git_actions_example.service;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CalculadoraService {
    public double dividir(double num1, double num2) {
        if (num2 == 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Não é possível dividir por zero");
        }
        return num1 / num2;
    }
}
