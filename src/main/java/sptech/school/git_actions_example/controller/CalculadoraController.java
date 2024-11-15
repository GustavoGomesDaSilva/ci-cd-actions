package sptech.school.git_actions_example.controller;

import sptech.school.git_actions_example.service.CalculadoraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {
    // testando git actions gustavo gomes

    private final CalculadoraService calculadoraService;

    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @PostMapping("/divisao/{num1}/{num2}")
    public ResponseEntity<Double> divisao(@PathVariable double num1, @PathVariable double num2) {
        return ResponseEntity.ok(calculadoraService.dividir(num1, num2));
    }

}
