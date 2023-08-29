package umg.analisis.sistemas.sistemavotaciones.services;

import umg.analisis.sistemas.sistemavotaciones.commons.CommonSvc;
import umg.analisis.sistemas.sistemavotaciones.dtos.VotanteDto;
import umg.analisis.sistemas.sistemavotaciones.models.VotanteApp;
import umg.analisis.sistemas.sistemavotaciones.projections.CaracteristicasVotanteProjection;

import java.util.List;

public interface VotanteSvc extends CommonSvc<VotanteApp> {

    public CaracteristicasVotanteProjection getCaracteristicasVotante(VotanteDto votanteDto);

    public Object votanteEmpadronadoExist(String cui);

    public Object findCiudadanoByCui(String cui);
}
