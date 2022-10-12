package gov.igac.general.ladm.dto.request;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class SolicitudRequestDto {
	
	 private Long numeroSolicitud;
	 private LocalDateTime fecha;
	 private Integer anexos;
	 private Integer folios;
	 private String asunto;
	 private String observaciones;
	 private Long idTipoSolicitud;
	 private Long idFormaPeticion;
	 private Long idCanalRecepcion;
	 private Long idEstadoSolicitud;
	 
}
