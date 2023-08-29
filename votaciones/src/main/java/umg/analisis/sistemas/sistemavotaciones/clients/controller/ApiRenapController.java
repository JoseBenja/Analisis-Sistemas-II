package umg.analisis.sistemas.sistemavotaciones.clients.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umg.analisis.sistemas.sistemavotaciones.clients.ApiRenap;
import umg.analisis.sistemas.sistemavotaciones.models.VotanteApp;

@RestController
@RequestMapping("/api-renap")
public class ApiRenapController {

    private final ApiRenap apiRenap;

    @Autowired
    public ApiRenapController(ApiRenap apiRenap) {
        this.apiRenap = apiRenap;
    }

    @GetMapping("/consume")
    public Object consumeApiRenap(String cui) {
        String apiUrl = "http://localhost:8081/dpi/buscar-ciudadano/";
        return apiRenap.consumeApiRenap(apiUrl + cui);
    }
}
