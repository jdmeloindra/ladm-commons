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
public class EstadoCivilResponseDto {
	
	@ApiModelProperty(required = true, value = "ID de grupo estado civil", example = "1")
	private Long id;
	
	@ApiModelProperty(required = true, value = "Valor a mostrar del estado civil", example = "Soltero")
	private String dispName;
	
}
