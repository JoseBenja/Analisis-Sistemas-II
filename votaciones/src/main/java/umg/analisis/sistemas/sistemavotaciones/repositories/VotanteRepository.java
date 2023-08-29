package umg.analisis.sistemas.sistemavotaciones.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import umg.analisis.sistemas.sistemavotaciones.models.VotanteApp;
import umg.analisis.sistemas.sistemavotaciones.projections.CaracteristicasVotanteProjection;


public interface VotanteRepository extends CrudRepository<VotanteApp, Object> {

    @Query(value = "SELECT " +
            "v.etnia as etnia, " +
            "v.analfabeta as analfabeta, " +
            "v.discapacidad as discapacidad " +
            "FROM sistema_votaciones.votante v " +
            "WHERE " +
            "v.nombre = :nombre " +
            "AND v.apellido = :apellido",
            nativeQuery = true)
    public CaracteristicasVotanteProjection getCaracteristicasVotante(@Param("nombre") String nombre, @Param("apellido") String apellido);
}
