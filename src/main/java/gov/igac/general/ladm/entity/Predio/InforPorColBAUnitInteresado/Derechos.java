package gov.igac.general.ladm.entity.Predio.InforPorColBAUnitInteresado;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import com.fasterxml.jackson.annotation.JsonIgnore;

import gov.igac.general.ladm.entity.Predio.Predio;
import gov.igac.general.ladm.entity.Predio.InforPorColBAUnitInteresado.GrupoInteresados.GrupoInteresados;
import gov.igac.general.ladm.entity.Predio.InforPorColBAUnitInteresado.Interesado.Interesado;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Esta tabla es un juego de pares, siempre existe el idPredio y un atributo adicional ya sea terreno, unidad de construccion o servidumbre
 * @author Alejandro
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CSRV_DERECHO", schema="SNC_LADM")
public class Derechos {

	@Id
    @Column(name = "T_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_CSRV_DERECHO")
    @SequenceGenerator(name = "SEQ_CSRV_DERECHO", sequenceName = "SNC_LADM.SEQ_CSRV_DERECHO", allocationSize = 1)
    private Long id;

	@NumberFormat(style = Style.NUMBER, pattern = "#,###.##")
	@Column(name = "FRACCION_DERECHO")
	private String fraccionDerecho;

	@Column(name = "FECHA_INICIO_TENENCIA")
	private LocalDateTime fechaInicioTenencia;

	@Column(name = "DESCRIPCION")
	private String descripcion;

	@Column(name = "COMIENZO_VIDA_UTIL_VERSION")
	private LocalDateTime comienzoVidaUtilVersion;

	@Column(name = "FIN_VIDA_UTIL_VERSION")
	private LocalDateTime finVidaUtilVersion;

	@Column(name = "ESPACIO_DE_NOMBRES")
	private String espacioDeNombres;

	@Column(name = "LOCAL_ID")
	private String localId;

	@ManyToOne
	@JoinColumn(name = "TIPO")//Dominio posesion ocupacion otro
	private TipoDerecho tipoDerecho;

	@ManyToOne
	@JoinColumn(name = "INTERESADO_CSRV_INTERESADO")
    private Interesado interesado;

	@ManyToOne
	@JoinColumn(name = "INTERESADO_CSRV_AGRUPACIONINTERESADOS")
    private GrupoInteresados grupoInteresados;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "UNIDAD")
	private Predio predioC;

}
