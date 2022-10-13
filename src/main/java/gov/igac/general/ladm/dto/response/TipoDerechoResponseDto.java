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
public class TipoDerechoResponseDto {
	
	@ApiModelProperty(required = true, value = "Valor a mostrar el tipo de derecho", example = "Dominio")
	private String dispName;
	
}
