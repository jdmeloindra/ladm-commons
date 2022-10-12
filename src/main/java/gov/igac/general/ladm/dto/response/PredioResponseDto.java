package gov.igac.general.ladm.dto.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PredioResponseDto{

	private Long numeroPredial;
	
	private String direccion;
	
	private Long matriculaInmobiliaria;

	private String codigoHomologado;

	private String nombre;

	private String apellido;

	private String razonSocial;
	
	private String nombre2;

	private String apellido2;

	private String razonSocial2;
		
	
	
//	private Long numeroSolicitud;

}
