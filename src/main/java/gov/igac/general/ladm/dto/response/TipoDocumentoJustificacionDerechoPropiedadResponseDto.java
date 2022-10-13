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
public class TipoDocumentoJustificacionDerechoPropiedadResponseDto {

	@ApiModelProperty(required = true, value = "Valor a mostrar del tipo de documento de justificación de derecho propiedad", example = "(Documento público) Escritura pública")
	private String dispName;
	
}
