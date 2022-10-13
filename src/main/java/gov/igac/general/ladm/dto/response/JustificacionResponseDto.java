package gov.igac.general.ladm.dto.response;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@ApiModel
@AllArgsConstructor
@Data
public class JustificacionResponseDto {
	
	@ApiModelProperty(required = true, value = "ID de la justificación", example = "1")
	private Long id;
	
	@ApiModelProperty(required = false, value = "Ente que emite el documento de justificación", example = "Notaría")
	private String enteEmisor;
	
	@ApiModelProperty(required = false, value = "Oficina de origen de la justificación", example = "QUINTA")
	private Long oficinaOrigen;
	
	@ApiModelProperty(required = true, value = "Código de la ciudad de origen de la justificación", example = "17001")
	private String ciudadOrigen;
	
	@ApiModelProperty(required = false, value = "Observación asociada a la justificación", example = "Texto de observación")
	private String observacion;
	
	@ApiModelProperty(required = true, value = "Número de la fuente de la justificación", example = "1234")
	private String numeroFuente;
	
	@ApiModelProperty(required = true, value = "Clase TipoDocumentoJustificacionDerechoPropiedadResponseDto")
	private TipoDocumentoJustificacionDerechoPropiedadResponseDto tipo; 
	
	@ApiModelProperty(required = true, value = "Arreglo de IDs correspondientes a los derechos asociados a la justificación", example = "[1, 2, 3]")
	List<Long> derechosAsociados;

}
