package umg.analisis.sistemas.sistemavotaciones.dtos;

import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VotanteDto {

    private String dpi;
    private String nombre;
    private String apellido;
    private String sexo;
}
