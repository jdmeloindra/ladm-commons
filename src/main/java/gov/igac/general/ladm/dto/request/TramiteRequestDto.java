package gov.igac.general.ladm.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class TramiteRequestDto {

	@JsonProperty("claseMutacionOut")//JPBPMN
	private String claseMutacion;
	
	@JsonProperty("autoavaluoOut")
	private Long autoavaluoTerreno;
	
	@JsonProperty("autoavaluoConstruccionOut")
	private Long autoavaluoConstruccion;
	
	@JsonProperty("ubicacionPredioOut")
	private String ubicacionPredio;
	
	@JsonProperty("nombrePredioOut")
	private String nombrePredio;
	
	@JsonProperty("omitidoNuevoOut")
	private String omitidoNuevo;
	
	@JsonProperty("manzanasNuevaOut")
	private Long manzanasNuevas;
	
	@JsonProperty("cancelacionPredioOut")
	private String cancelacionPredio;
	
	@JsonProperty("resultadoDocumentoIDOut")
	private Long resultadoDocumentoId;
	
	@JsonProperty("predioIDOut")
	private Long predioId;
	
	@JsonProperty("asociadoTramiteOut")
	private Long asociadoTramiteId;
	
	@JsonProperty("fechaInscripcionCatastralOut")
	private String fechaInscripcion;
	
	@JsonProperty("solicitudIDOut")
	private Long solicitudId;
	
	@JsonProperty("tipoInscripcionOut")
	private String tipoInscripcion;
	
}
