package gov.igac.general.ladm.entity.Predio.InfoPorFuenteJustDerProp;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import gov.igac.general.ladm.entity.Predio.Cartografia.FuenteEspacial;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EXTARCHIVO", schema="SNC_LADM")
public class DocumentoSoporte {

	@Id
    @Column(name = "T_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_EXTARCHIVO")
    @SequenceGenerator(name = "SEQ_EXTARCHIVO", sequenceName = "SNC_LADM.SEQ_EXTARCHIVO", allocationSize = 1)
    private Long id;

	@Column(name = "T_ILI_TID")
	private String tIliTId;

	@Column(name = "T_SEQ")
	private String tSeq;

	@Column(name = "FECHA_ACEPTACION")
	private LocalTime fechaAceptacion;

	@Column(name = "DATOS")
	private String datos;

	@Column(name = "EXTRACCION")
	private LocalTime fechaExtraccion;

	@Column(name = "FECHA_GRABACION")
	private LocalTime fechaGrabacion;

	@Column(name = "FECHA_ENTREGA")
	private LocalTime fechaEntrega;

	@Column(name = "ESPACIO_DE_NOMBRES")
	private String espacioDeNombres;

	@Column(name = "LOCAL_ID")
	private String localId;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "CSRV_FUENTEADMNSTRTIVA_EXT_ARCHIVO_ID")
	private JustificacionDerechoPropiedad justificacionDerechoPropiedad;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "CSRV_FUENTEESPACIAL_EXT_ARCHIVO_ID")
	private FuenteEspacial fuenteEspacial;

}
