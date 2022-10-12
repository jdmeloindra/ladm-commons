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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CSRV_CARACTERISTICASUNIDADCONSTRUCCION", schema="SNC_LADM")
public class CaracteristicasConstruccion {

	@Id
    @Column(name = "T_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_CSRV_CARACTERISTICASUNIDADCONSTRUCCION")
    @SequenceGenerator(name = "SEQ_CSRV_CARACTERISTICASUNIDADCONSTRUCCION", sequenceName = "SNC_LADM.SEQ_CSRV_CARACTERISTICASUNIDADCONSTRUCCION", allocationSize = 1)
    private Long id;

	@Column(name = "T_ILI_TID")
	private String tIliTId;

	@Column(name = "IDENTIFICADOR")
	private String identificador;

	@ManyToOne
	@JoinColumn(name = "TIPO_CONSTRUCCION")
	private TipoConstruccion tipoConstruccion;

	@ManyToOne
	@JoinColumn(name = "TIPO_DOMINIO")
	private TipoDominio tipoDominio;

	@ManyToOne
	@JoinColumn(name = "TIPO_UNIDAD_CONSTRUCCION")
	private TipoUnidadConstruccion tipoUnidadConstruccion;

	@Column(name = "TOTAL_HABITACIONES")
	private String totalHabitaciones;

	@Column(name = "TOTAL_BANIOS")
	private String totalBanios;

	@Column(name = "TOTAL_LOCALES")
	private String totalLocales;

	@Column(name = "TOTAL_PLANTAS")
	private String totalPlantas;

	@ManyToOne
	@JoinColumn(name = "USO")
	private Uso uso;

	@Column(name = "ANIO_CONSTRUCCION")
	private Long anioConstrucion;

	@NumberFormat(style = Style.NUMBER, pattern = "#,###.##")
	@Column(name = "AREA_CONSTRUIDA")
	private String areaConstruida;

	@NumberFormat(style = Style.NUMBER, pattern = "#,###.##")
	@Column(name = "AREA_PRIVADA_CONSTRUIDA")
	private String areaPrivadaConstruida;

	@Column(name = "OBSERVACIONES")
	private String observaciones;

	@Column(name = "COMIENZO_VIDA_UTIL_VERSION")//nuevo
	private LocalDateTime comienzoVidaUtilVersion;

	@Column(name = "FIN_VIDA_UTIL_VERSION")//nuevo
	private LocalDateTime finVidaUtilVersion;

	@Column(name = "ESPACIO_DE_NOMBRES")//nuevo
    private String espacioDeNombres;

	@Column(name = "LOCAL_ID")//nuevo
    private String localId;

	@JsonIgnore
	@OneToMany(mappedBy="caracteristicasConstruccion", cascade=CascadeType.MERGE, fetch=FetchType.LAZY)
	private List<Construccion> construccion;
}
