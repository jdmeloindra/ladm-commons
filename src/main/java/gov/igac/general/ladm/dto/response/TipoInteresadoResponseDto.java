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
public class TipoInteresadoResponseDto {

	@ApiModelProperty(required = true, value = "ID del tipo de interesado")
	private Long id;
	
	@ApiModelProperty(required = true, value = "Valor a mostrar del tipo de interesado", example = "Natural")
	private String dispName;
	
}
