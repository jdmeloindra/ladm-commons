package gov.igac.general.ladm.entity.Predio.InfoPorUebaUnitTerrConst.Construccion;

import java.time.LocalDateTime;
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

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import com.fasterxml.jackson.annotation.JsonIgnore;

import gov.igac.general.ladm.entity.Predio.InfoPorUebaUnitTerrConst.Dimension;
import gov.igac.general.ladm.entity.Predio.InfoPorUebaUnitTerrConst.RelacionSuperficie;
import gov.igac.general.ladm.entity.Predio.InfoPorUebaUnitTerrConst.UEBAUnit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CSRV_UNIDADCONSTRUCCION", schema="SNC_LADM")
public class Construccion {

	@Id
    @Column(name = "T_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_CSRV_UNIDADCONSTRUCCION")
    @SequenceGenerator(name = "SEQ_CSRV_UNIDADCONSTRUCCION", sequenceName = "SNC_LADM.SEQ_CSRV_UNIDADCONSTRUCCION", allocationSize = 1)
    private Long id;

	@Column(name = "PLANTA_UBICACION")
	private String plantaUbicacion;

	@NumberFormat(style = Style.NUMBER, pattern = "#,###.##")
	@Column(name = "AREA_CONSTRUIDA")
	private String areaConstruida;

	@NumberFormat(style = Style.NUMBER, pattern = "#,###.##")
	@Column(name = "ALTURA")
	private String altura;

	@Column(name = "GEOMETRIA")
	private String geometria;

	@ManyToOne
	@JoinColumn(name = "CSRV_CARACTERISTICASUNIDADCONSTRUCCION")//nuevo
    private CaracteristicasConstruccion caracteristicasConstruccion;

	@ManyToOne
	@JoinColumn(name = "DIMENSION")
	private Dimension dimension;
	
	@Column(name = "ETIQUETA")
	private String etiqueta;

	@ManyToOne
	@JoinColumn(name = "RELACION_SUPERFICIE")
	private RelacionSuperficie relacionSuperficie;

	@Column(name = "COMIENZO_VIDA_UTIL_VERSION")
	private LocalDateTime comienzaVidaUtilVersion;

	@Column(name = "FIN_VIDA_UTIL_VERSION")
	private LocalDateTime finVidaUtilVersion;

	@Column(name = "ESPACIO_DE_NOMBRES")
	private String espacioDeNombres;

	@Column(name = "LOCAL_ID")
	private String localId;

	@JsonIgnore
	@OneToMany(mappedBy="construccion", cascade=CascadeType.MERGE, fetch=FetchType.LAZY)
	private List<UEBAUnit> uebaUnit;
}
