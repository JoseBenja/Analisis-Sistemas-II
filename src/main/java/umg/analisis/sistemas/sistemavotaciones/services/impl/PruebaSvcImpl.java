package umg.analisis.sistemas.sistemavotaciones.services.impl;

import org.springframework.stereotype.Service;
import umg.analisis.sistemas.sistemavotaciones.commons.CommonSvcImpl;
import umg.analisis.sistemas.sistemavotaciones.models.Prueba;
import umg.analisis.sistemas.sistemavotaciones.repositories.PruebaRepository;
import umg.analisis.sistemas.sistemavotaciones.services.PruebaSvc;

@Service
public class PruebaSvcImpl extends CommonSvcImpl<Prueba, PruebaRepository> implements PruebaSvc {
}
