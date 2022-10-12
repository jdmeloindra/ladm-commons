package gov.igac.general.ladm.dto.response;

public interface SolicitanteResponseProjection {
	
	String getTipoPersona();
	
	String getTipoDocumento();
	
	Long getNumeroDocumento();
	
	String getCorreo();

	String getRelacionValor();

	String getPaisValor();

	String getDepartamentoValor();

	String getMunicipioValor();

	String getDireccion();

	String getCelular();
	
	Long getCodigoPostal();

    Long getIdRelacion();
}
