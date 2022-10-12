package gov.igac.general.ladm.dto.request;

import java.io.Serializable;

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
public class SolicitanteRequestDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long numeroDocumento;

    private String primerNombre;

    private String segundoNombre;

    private String primerApellido;

    private String segundoApellido;

    private String razonSocial;

    private String sigla;

    private Integer digitoVerificacion;

    private String telefono;

    private String celular;

    private String correo;
    
    private Long codigoPostal;
	
    private Long tipoDireccion;
	
    private String direccion;
	
    private Long aceptaNotificarCorreo;
	
    private String nombrePredio;
	
    private String barrioVeredaCorr;
	
    private String claseViaPrincipal;
	
    private String no;
    
    private Long idTipoDocumento;
    
    private Long idTipoPersona;
    
    private Long idRelacion;
    
    private Long idMunicipio;

}
