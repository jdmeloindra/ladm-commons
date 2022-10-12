package gov.igac.general.ladm.entity.Predio.InforPorColBAUnitInteresado.Interesado;


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

import gov.igac.general.ladm.entity.Predio.InforPorColBAUnitInteresado.Derechos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CSRV_INTERESADO", schema="SNC_LADM")
public class Interesado {

	@Id
    @Column(name = "T_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_CSRV_INTERESADO")
    @SequenceGenerator(name = "SEQ_CSRV_INTERESADO", sequenceName = "SNC_LADM.SEQ_CSRV_INTERESADO", allocationSize = 1)
    private Long id;

	@Column(name = "T_ILI_TID")
	private String tIliTId;

	@Column(name = "DOCUMENTO_IDENTIDAD")
	private String documentoIdentidad;

	@Column(name = "PRIMER_NOMBRE")
	private String primerNombre;

	@Column(name = "SEGUNDO_NOMBRE")
	private String segundoNombre;

	@Column(name = "PRIMER_APELLIDO")
	private String primerApellido;

	@Column(name = "SEGUNDO_APELLIDO")
	private String segundoApellido;

	@Column(name = "RAZON_SOCIAL")
	private String razonSocial;

	@Column(name = "NOMBRE")
	private String nombre;

	@ManyToOne
	@JoinColumn(name = "TIPO_DOCUMENTO")
	private TipoDocumento tipoDocumento;//NIT NUIP CC ETC
	
	@ManyToOne
	@JoinColumn(name = "TIPO")//NATURAL JURIDICO
	private TipoInteresado tipoInteresado;

	@ManyToOne
	@JoinColumn(name = "SEXO")
	private Sexo sexo;

	@ManyToOne
	@JoinColumn(name = "GRUPOETNICO")
	private GrupoEtnico grupoEtnico;

	@ManyToOne
	@JoinColumn(name = "ESTADO_CIVIL")
	private EstadoCivil estadoCivil;

	@JsonIgnore
	@OneToMany(mappedBy="interesado", cascade=CascadeType.MERGE, fetch=FetchType.LAZY)
	private List<Derechos> derechos;
}
