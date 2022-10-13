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
public class DerechoResponseDto {

	@ApiModelProperty(required = true, value = "ID de derecho", example = "1")
	private Long id;
	
	@ApiModelProperty(required = true, value = "Porcentaje de la fracción de derecho", example = "70")
	private String fraccionDerecho;
	
	@ApiModelProperty(required = true, value = "Clase TipoDerechoResponseDto")
	private TipoDerechoResponseDto tipoDerecho;
	
	@ApiModelProperty(required = true, value = "Arreglo con las referencias de los interesados asociados al derecho")
	private List<InteresadosAsociadosResponseDto> interesadosAsociados;
	
}
