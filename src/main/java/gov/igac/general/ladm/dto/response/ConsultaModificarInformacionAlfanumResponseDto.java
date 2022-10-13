package gov.igac.general.ladm.dto.response;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author SoporteTI
 *
 */
@Builder
@ApiModel
@AllArgsConstructor
@Data
public class ConsultaModificarInformacionAlfanumResponseDto {
	
	@ApiModelProperty(required = true, value = "Arreglo de interesados")
	private List<InteresadoResponseDto> interesados;
	
	@ApiModelProperty(required = true, value = "Arreglo de derechos")
	private List<DerechoResponseDto> derechos;
	
	@ApiModelProperty(required = true, value = "Arreglo de justificaciones de derecho")
	private List<JustificacionResponseDto> justificaciones;

}
