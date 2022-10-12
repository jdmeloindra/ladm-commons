package gov.igac.general.ladm.dto.response;

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
public class SolicitanteBusquedaResponseDto {

	private String tipoPersona;
	
	private String tipoDocumento;
	
	private Long numeroDocumento;
	
	private String correo;

	private String relacionValor;

	private String paisValor;

	private String departamentoValor;

	private String municipioValor;

	private String direccion;

	private String celular;
	
	private Long codigoPostal;

    private Long idRelacion;
	
}
