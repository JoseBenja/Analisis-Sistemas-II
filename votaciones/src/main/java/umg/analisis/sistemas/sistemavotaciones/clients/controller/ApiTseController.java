package umg.analisis.sistemas.sistemavotaciones.clients.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umg.analisis.sistemas.sistemavotaciones.clients.ApiRenap;
import umg.analisis.sistemas.sistemavotaciones.clients.ApiTse;

@RestController
@RequestMapping("/api-tse")
public class ApiTseController {
    private final ApiTse apiTse;

    @Autowired
    public ApiTseController(ApiTse apiTse) {
        this.apiTse = apiTse;
    }

    @GetMapping("/consume")
    public Object consumeApiTse(String cui) {
        String apiUrl = "http://localhost:8082/votante/empadronado/";
        return apiTse.consumeApiTse(apiUrl + cui);
    }
}
