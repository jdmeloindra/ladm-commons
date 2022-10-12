package gov.igac.general.ladm.entity.Predio.InfoPorFuenteJustDerProp;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "col_estadodisponibilidadtipo", schema="SNC_LADM")
public class EstadoDisponibilidad {

	@Id
    @Column(name = "T_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_col_estadodisponibilidadtipo")
    @SequenceGenerator(name = "SEQ_col_estadodisponibilidadtipo", sequenceName = "SNC_LADM.SEQ_col_estadodisponibilidadtipo", allocationSize = 1)
    private Long id;

	@Column(name = "THISCLASS")
	private String thisClass;

	@Column(name = "BASECLASS")
	private String baseClass;

	@Column(name = "ITFCODE")
	private int itfCode;
	
	@Column(name = "ILICODE")
	private String value;

	@Column(name = "SEQ")
	private String seq;

//	@Column(name = "INACTIVE")
//	private int inactive;
	
	@Column(name = "DISPNAME")
	private String dispName;

	@Column(name = "DESCRIPTION")
	private String desc;

	@JsonIgnore
	@OneToMany(mappedBy="estadoDisponibilidad", cascade=CascadeType.MERGE, fetch=FetchType.LAZY)
	private List<JustificacionDerechoPropiedad> justificacionDerechoPropiedad;

	@JsonIgnore
	@OneToMany(mappedBy="estadoDisponibilidad", cascade=CascadeType.MERGE, fetch=FetchType.EAGER)
	private List<FuenteEspacial> fuenteEspacial;
}
