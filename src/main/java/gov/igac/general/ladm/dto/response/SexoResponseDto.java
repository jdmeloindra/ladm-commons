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
public class SexoResponseDto {

	@ApiModelProperty(required = true, value = "ID del sexo", example = "1")
	private Long id;

	@ApiModelProperty(required = true, value = "Valor a mostrar del sexo", example = "Sin determinar")
	private String dispName;

}
