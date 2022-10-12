package gov.igac.general.ladm.entity.Predio.InfoPorFuenteJustDerProp;

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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CSRV_FUENTEADMINISTRATIVA", schema="SNC_LADM")
public class JustificacionDerechoPropiedad {

	@Id
    @Column(name = "T_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_CSRV_FUENTEADMINISTRATIVA")
    @SequenceGenerator(name = "SEQ_CSRV_FUENTEADMINISTRATIVA", sequenceName = "SNC_LADM.SEQ_CSRV_FUENTEADMINISTRATIVA", allocationSize = 1)
    private Long id;

	@Column(name = "T_ILI_TID")
	private String tIliTId;

	@ManyToOne
	@JoinColumn(name = "TIPO")
	private ModoAdquisicion tipoFuente;
	
	@Column(name = "ENTE_EMISOR") //notaria banco
	private String enteEmisor;

	@Column(name = "OFICINA_ORIGEN") // como codigo
	private Long oficinaOrigen;

	@Column(name = "CIUDAD_ORIGEN")
	private String ciudadOrigen;

	@Column(name = "OBSERVACION")
	private String observacion;

	@Column(name = "NUMERO_FUENTE")
	private String numeroFuente;

	@ManyToOne
	@JoinColumn(name = "ESTADO_DISPONIBILIDAD")
	private EstadoDisponibilidad estadoDisponibilidad;

	@ManyToOne
	@JoinColumn(name = "TIPO_PRINCIPAL")
	private TipoDocumentoJustDerProp tipoPrincipal;

	@JsonIgnore
	@OneToMany(mappedBy="fuenteAdministrativa", cascade=CascadeType.MERGE, fetch=FetchType.LAZY)
	private List<ColUnidadJustDerProp> colUnidadFuente ;
	
	@OneToMany(mappedBy="justificacionDerechoPropiedad", cascade=CascadeType.MERGE, fetch=FetchType.LAZY)
	private List<DocumentoSoporte> documentoSoporte;
}
