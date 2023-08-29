package umg.analisis.sistemas.sistemavotaciones.dtos;

import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiTseDto {

    private int noEmpadronado;
    private String cui;
    private String direccionCompleta;
}
