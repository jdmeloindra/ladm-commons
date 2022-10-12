package gov.igac.general.ladm.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class PersonaRequestDto {
	
	private Long id;
	
    private Long numeroDocumento;

    private String primerNombre;

    private String segundoNombre;

    private String primerApellido;

    private String segundoApellido;

    private String razonSocial;

    private String sigla;

    private Long digitoVerificacion;

    private Long telefono;

    private Long celular;

    private String correo;
    
    private Long idTipoDocumento;

    private Long idTipoPersona;
    

}
