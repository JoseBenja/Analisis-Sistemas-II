package umg.analisis.sistemas.sistemavotaciones.controllers;

import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umg.analisis.sistemas.sistemavotaciones.commons.CommonController;
import umg.analisis.sistemas.sistemavotaciones.models.Prueba;
import umg.analisis.sistemas.sistemavotaciones.services.PruebaSvc;

@Api
@RestController
@RequestMapping("/prueba")
public class PruebaController extends CommonController<Prueba, PruebaSvc> {

    @GetMapping("/probar-servicio")
    public ResponseEntity<String> probarServicio() {
        return ResponseEntity.ok("Hola Mundo!!");
    }

}
