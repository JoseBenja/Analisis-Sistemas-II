package umg.analisis.sistemas.sistemavotaciones.controllers;

import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import umg.analisis.sistemas.sistemavotaciones.commons.CommonController;
import umg.analisis.sistemas.sistemavotaciones.dtos.VotanteDto;
import umg.analisis.sistemas.sistemavotaciones.models.VotanteApp;
import umg.analisis.sistemas.sistemavotaciones.projections.CaracteristicasVotanteProjection;
import umg.analisis.sistemas.sistemavotaciones.services.VotanteSvc;

@Api
@RestController
@RequestMapping("/prueba")
public class VotanteController extends CommonController<VotanteApp, VotanteSvc> {

    @GetMapping("/probar-servicio")
    public ResponseEntity<String> probarServicio() {
        return ResponseEntity.ok("Hola Mundo!!");
    }

    @PostMapping("/obtener-caracteristicas-votante")
    public ResponseEntity<CaracteristicasVotanteProjection> getCaracteristicasVotante(@RequestBody VotanteDto votanteDto) {
        return ResponseEntity.ok(this.service.getCaracteristicasVotante(votanteDto));
    }

    @GetMapping("/api-tse/{cui}")
    public ResponseEntity<Object> votanteEmpadronadoExist(@PathVariable String cui) {
        return ResponseEntity.ok(this.service.votanteEmpadronadoExist(cui));
    }

    @GetMapping("/api-renap/{cui}")
    public ResponseEntity<Object> findCiudadanoByCui(@PathVariable String cui) {
        return ResponseEntity.ok(this.service.findCiudadanoByCui(cui));
    }
}
