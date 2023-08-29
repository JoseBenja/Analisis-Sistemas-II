package umg.analisis.sistemas.sistemavotaciones.dtos;

import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiRenapDto {

    private String cui;
    private String nombreCompleto;
    private String sexo;
    private String nacionalidad;
    private String direccionCompleta;
    private String etnia;
    private boolean analfabeta;
    private String idioma;
    private String discapacidad;
}
