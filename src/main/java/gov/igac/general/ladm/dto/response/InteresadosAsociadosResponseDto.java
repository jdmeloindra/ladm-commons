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
public class InteresadosAsociadosResponseDto {

	@ApiModelProperty(required = true, value = "ID del interesado a asociar", example = "1")
	private Long id;
	
	@ApiModelProperty(required = true, value = "Porcentaje de particiáción del interesado", example = "20")
	private int participacion;
	
}
