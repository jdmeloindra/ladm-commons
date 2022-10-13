package gov.igac.general.ladm.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@ApiModel
@AllArgsConstructor
@Data
public class InteresadoResponseDto {

	@ApiModelProperty(required = true, value = "ID de interesado", example = "1")
	private Long id;

	@ApiModelProperty(required = false, value = "Número de identificación del interesado", example = "1667746593")
	private String documentoIdentidad;

	@ApiModelProperty(required = true, value = "Primer nombre del interesado", example = "Manuel")
	private String primerNombre;
	
	@ApiModelProperty(required = false, value = "Segundo nombre del interesado", example = "Daniel")
	private String segundoNombre;

	@ApiModelProperty(required = true, value = "Primer apellido del interesado", example = "Lauft")
	private String primerApellido;

	@ApiModelProperty(required = true, value = "Segundo apellido del interesado", example = "Lauft")
	private String segundoApellido;

	@ApiModelProperty(required = false, value = "Razón social del interesado", example = "IGAC")
	private String razonSocial;

	@ApiModelProperty(required = true, value = "Nombre del intereado", example = "Manuel Daniel")
	private String nombre;

	@ApiModelProperty(required = true, value = "Clase TipoDocumentoResponseDto")
	private TipoDocumentoResponseDto tipoDocumento;

	@ApiModelProperty(required = true, value = "Clase TipoInteresadoResponseDto")
	private TipoInteresadoResponseDto tipoInteresado;

	@ApiModelProperty(required = true, value = "Clase SexoResponseDto")
	private SexoResponseDto sexo;

	@ApiModelProperty(required = false, value = "Clase GrupoEtnicoResponseDto")
	private GrupoEtnicoResponseDto grupoEtnico;

	@ApiModelProperty(required = false, value = "Clase EstadoCiviloResponseDto")
	private EstadoCivilResponseDto estadoCivil;

}
