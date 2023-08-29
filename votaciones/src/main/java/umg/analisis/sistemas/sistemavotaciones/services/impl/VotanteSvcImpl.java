package umg.analisis.sistemas.sistemavotaciones.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umg.analisis.sistemas.sistemavotaciones.clients.controller.ApiRenapController;
import umg.analisis.sistemas.sistemavotaciones.clients.controller.ApiTseController;
import umg.analisis.sistemas.sistemavotaciones.commons.CommonSvcImpl;
import umg.analisis.sistemas.sistemavotaciones.dtos.VotanteDto;
import umg.analisis.sistemas.sistemavotaciones.models.VotanteApp;
import umg.analisis.sistemas.sistemavotaciones.projections.CaracteristicasVotanteProjection;
import umg.analisis.sistemas.sistemavotaciones.repositories.VotanteRepository;
import umg.analisis.sistemas.sistemavotaciones.services.VotanteSvc;

import java.util.Collections;
import java.util.List;

@Service
public class VotanteSvcImpl extends CommonSvcImpl<VotanteApp, VotanteRepository> implements VotanteSvc {

    @Autowired
    VotanteRepository votanteRepository;

    @Autowired
    ApiTseController apiTseController;

    @Autowired
    ApiRenapController apiRenapController;

    @Override
    public CaracteristicasVotanteProjection getCaracteristicasVotante(VotanteDto votanteDto) {
        try {
            return votanteRepository.getCaracteristicasVotante(votanteDto.getNombre(), votanteDto.getApellido());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Object votanteEmpadronadoExist(String cui) {
        return Collections.singletonList(apiTseController.consumeApiTse(cui));
    }

    @Override
    public Object findCiudadanoByCui(String cui) {
        return Collections.singletonList(apiRenapController.consumeApiRenap(cui));
    }
}
