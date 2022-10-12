package gov.igac.general.ladm.entity.Predio.Cartografia;

import java.sql.Clob;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import gov.igac.general.ladm.entity.Predio.InfoPorFuenteJustDerProp.DocumentoSoporte;
import gov.igac.general.ladm.entity.Predio.InfoPorFuenteJustDerProp.EstadoDisponibilidad;
import gov.igac.general.ladm.entity.Predio.InfoPorFuenteJustDerProp.TipoDocumentoJustDerProp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CSRV_FUENTEESPACIAL", schema="SNC_LADM")
public class FuenteEspacial {

	@Id
    @Column(name = "T_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_CSRV_FUENTEESPACIAL")
    @SequenceGenerator(name = "SEQ_CSRV_FUENTEESPACIAL", sequenceName = "SNC_LADM.SEQ_CSRV_FUENTEESPACIAL", allocationSize = 1)
    private Long id;

	@Column(name = "T_ILI_TID")
	private String tIliTId;

	@ManyToOne
	@JoinColumn(name = "TIPO")
	private TipoFuenteEspacial tipoFuente;
	
	@Column(name = "METADATO")
	private Clob metadato;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "DESCRIPCION")
	private Clob descripcion;

	@ManyToOne
	@JoinColumn(name = "ESTADO_DISPONIBILIDAD")
	private EstadoDisponibilidad estadoDisponibilidad;

	@ManyToOne
	@JoinColumn(name = "TIPO_PRINCIPAL")
	private TipoDocumentoJustDerProp tipoPrincipal;

	@Column(name = "FECHA_DOCUMENTO_FUENTE")
	private LocalTime fechaDocumentoFuente;

	@Column(name = "ESPACIO_DE_NOMBRES")
	private String espacioDeNombres;

	@Column(name = "LOCAL_ID")
	private String localId;

	@JsonIgnore
	@OneToMany(mappedBy="fuenteEspacial", cascade=CascadeType.MERGE, fetch=FetchType.LAZY)
	private List<ColUnidadEspacial> colUnidadEspacial ;
	
	@JsonIgnore
	@OneToMany(mappedBy="fuenteEspacial", cascade=CascadeType.MERGE, fetch=FetchType.LAZY)
	private List<DocumentoSoporte> documentoSoporte ;
}
