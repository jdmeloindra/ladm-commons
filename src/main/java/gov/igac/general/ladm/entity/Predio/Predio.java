package gov.igac.general.ladm.entity.Predio;

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

import gov.igac.general.ladm.entity.Predio.Direccion.Direccion;
import gov.igac.general.ladm.entity.Predio.InfoPorFuenteJustDerProp.ColUnidadJustDerProp;
import gov.igac.general.ladm.entity.Predio.InfoPorUebaUnitTerrConst.UEBAUnit;
import gov.igac.general.ladm.entity.Predio.InforPorColBAUnitInteresado.Derecho;
import gov.igac.general.ladm.entity.Tramite.TramitePredio;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CSRV_PREDIO", schema="SNC_LADM")
public class Predio {
	
	@Id
    @Column(name = "T_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_CSRV_PREDIO")
    @SequenceGenerator(name = "SEQ_CSRV_PREDIO", sequenceName = "SNC_LADM.SEQ_CSRV_PREDIO", allocationSize = 1)
    private Long id;

	@Column(name = "DEPARTAMENTO")
    private String departamento;

	@Column(name = "MUNICIPIO")
    private String municipio;

	@Column(name = "CODIGO_HOMOLOGADO") // si tiene codigo holomago esta interrelacionado con el SNR
    private String codigoHomologado;

	@Column(name = "NUPRE")
    private String nupre;

	@Column(name = "CODIGO_ORIP")//circuloRegistral
    private String codigoORIP;

	@Column(name = "MATRICULA_INMOBILIARIA")// es el mismo numeroRegistro
    private String matriculaInmobiliaria;

	@Column(name = "NUMERO_PREDIAL")
    private String numeroPredial;

	@Column(name = "NUMERO_PREDIAL_ANTERIOR")
    private String numeroPredialAnterior;

	@Column(name = "FECHA_INSCRIPCION_CATASTRAL")
	private LocalDateTime fechaInscripcionCatastral;

	@ManyToOne
	@JoinColumn(name = "CONDICION_PREDIO")//fk
    private CondicionPredio condicionPredio;

	@ManyToOne
	@JoinColumn(name = "DESTINACION_ECONOMICA")
    private DestinacionEconomica destinacionEconomica;

	@ManyToOne
	@JoinColumn(name = "TIPO")
    private TipoPredio tipoPredio;

	@Column(name = "AVALUO_CATASTRAL")
    private Double avaluoCatastral;

	@ManyToOne
	@JoinColumn(name = "ZONA")//fk
    private Zona zona;

	@Column(name = "VIGENCIA_ACTUALIZACION_CATASTRAL")//nuevo
	private LocalDateTime vigenciaActualizacionCatastral;

	@ManyToOne
	@JoinColumn(name = "ESTADO")
    private EstadoPredio estadoPredio;

	@ManyToOne
	@JoinColumn(name = "CATASTRO")//nuevo
    private Catastro catastro;

	/*@ManyToOne
	@JoinColumn(name = "csrv_gestorcatastral")//nuevo
    private GestorCatastral gestorCatastral;*/

	/*@ManyToOne
	@JoinColumn(name = "csrv_operadorcatastral")//nuevo
    private OperadorCatastral operadorCatastral;*/

	@Column(name = "NOMBRE")
    private String nombre;

	@Column(name = "COMIENZO_VIDA_UTIL_VERSION")//nuevo
	private LocalDateTime comienzoVidaUtilVersion;

	@Column(name = "FIN_VIDA_UTIL_VERSION")//nuevo
	private LocalDateTime finVidaUtilVersion;

	@Column(name = "ESPACIO_DE_NOMBRES")//nuevo
    private String espacioDeNombres;

	@Column(name = "LOCAL_ID")//nuevo
    private String localId;
	
	@OneToMany(mappedBy="predio", cascade=CascadeType.MERGE, fetch=FetchType.LAZY) 
	private List<UEBAUnit> uebaUnit;

	@OneToMany(mappedBy="predioC", cascade=CascadeType.MERGE, fetch=FetchType.LAZY) 
	private List<Derecho> derechos;
	
	@OneToMany(mappedBy="predioD", cascade=CascadeType.MERGE, fetch=FetchType.LAZY) 
	private List<Direccion> direccion;//tipodir es estructurada (se llena todo) o no estructurada (solo se diligencia nombre predio)
	
	@OneToMany(mappedBy="predioT", cascade=CascadeType.MERGE, fetch=FetchType.LAZY) 
	private List<TramitePredio> tramitePredio;
	 
	 @OneToMany(mappedBy="predioF", cascade=CascadeType.MERGE, fetch=FetchType.LAZY) 
	 private List<ColUnidadJustDerProp> colUnidadJustDerProp;

	 
	
	/*
	 * Num Predial
	 * @Column(name = "BARRIO_VEREDA_CORREGIMIENTO") private String barrioVeredaCorregimiento;// se puede sacar de Predio-numero predial
	 * @Column(name = "MANZANA_VEREDA") private Integer manzanaVereda;// se puede sacar de Predio-numero predial es el mismo de arriba
	 * @Column(name = "BARRIO") private Integer barrio; // se puede sacar de Predio-numero predial
	 * @Column(name = "SECTOR") private Integer sector;// se puede sacar de Predio-numero predial
	 * @Column(name = "COMUNA") private Integer comuna;// se puede sacar de Predio-numero predial
	 * @Column(name = "CONDICION_PROPIEDAD") private String condicionPropiedad;// se puede sacar de Predio-numero predial es la misma condicion predio?
	 * @Column(name = "EDIFICIO") private String edifico;// se puede sacar de Predio-numero predial
	 * @Column(name = "PISO") private String piso;// se puede sacar de Predio-numero predial
	 * @Column(name = "UNIDAD") private String unidad;// se puede sacar de Predio-numero predial
	 * 
	 * 
	 * UEBAUnit:
	 * @Column(name = "AREA_TERRENO") private Double areaTerreno; // se puede sacar de terreno
	 * @Column(name = "AREA_CONSTRUCCION") private Double areaConstruccion; //se puede sacar de Construccion
	 * @JsonIgnore
	 * @OneToMany(mappedBy="predio", cascade=CascadeType.MERGE,
	 * fetch=FetchType.LAZY) private List<ServidumbrePredio> servidumbrePredio; // se obtiene por servidumbre uebaunit
	 * ColBAUnitComoInteresados
	 * @JsonIgnore
	 * @OneToMany(mappedBy="predio", cascade=CascadeType.MERGE,
	 * fetch=FetchType.LAZY) private List<PredioPropietarioPoseedor>; // se puede sacar de interesados a traves de colbaunitcomointeresado
	 * @Column(name = "DIRECCION_PREDIO") private String direccionPredio; // se puede sacar extdireccion tipodir es estructurada (se llena todo) o no estructurada (solo se diligencia nombre predio)
	 * @JsonIgnore
	 * @OneToMany(mappedBy="predio", cascade=CascadeType.MERGE,
	 * fetch=FetchType.LAZY) private List<JustificacionDerechoPropiedad>-- sale de fuenteadministrativa conecta con predio por colunidadfuente
	 * justificacionDerechoPropiedad;
	 *  
	 * 
	 * Para Implementar en LADM
	 * @Column(name = "ES_ANTIGUO_SISTEMA") private Long esAntiguoSistema; // se debe implementar en LADM junto a otra informacion adicional
	 * @Column(name = "NUMERO_REGISTRO_ANTERIOR") private String numeroRegistroAnterior; // este existe si es del antiguo sistema que es una matricula anterior
	 * @Column(name = "CLASE_SUELO") private String claseSuelo; // debe ser implementado en LADM
	 * @ManyToOne
	 * @JoinColumn(name = "FK_UNID_OPERATIVA_CATASTRAL") private UnidadOperativaCatastral unidadOperativaCatastral; // posible integracion en LADM
	 * @Column(name = "TIPO_AVALUO") private String tipoAvaluo; // Se va a evaluar para implementacion en LADM-- Como se define que tipo de avaluo de uso respecto al avaluo del predio actual?
	 * @JsonIgnore
	 * @OneToMany(mappedBy="predio", cascade=CascadeType.MERGE,
	 * fetch=FetchType.LAZY) private List<Avaluo> avaluo = new ArrayList<>();--historico se incluira en LADM aun no esta definido
	 * @JsonIgnore
	 * @OneToMany(mappedBy="predio", cascade=CascadeType.MERGE,
	 * fetch=FetchType.LAZY) private List<RegistroFotografico> registroFotografico; -- archivos // deberia ir en el LADM pero no esta definido pero puede estar referenciado en fuente
	 * 
	 * 
	 * 
	 * @Column(name = "ES_MARCADO") private Long esMarcado; --que es este elemento? tramite en ejecucion ese va en radicacion no en LADM
	 * 
	 * @ManyToOne
	 * @JoinColumn(name = "FK_TERRITORIAL") private Territorial territorial; -- indefinido
	 * 
	 * @Column(name = "ANO_ULTIMA_RESOLUCION") private Integer anoUltimaResolucion; // puede ser resolucion de avaulo o tramite catastral, cual es?
	 * 
	 * @Column(name = "NUMERO_ULTIMA_RESOLUCION") private String numeroUltimaResolucion;// puede ser resolucion de avaulo o tramite catastral, cual es?
	 * 
	 * @Column(name = "TIENE_FMI") private String tieneFMI; -- tiene folio de matriula inmobiliaria
	 * 
	 * @Column(name = "TIPO_INFORMALIDAD") private String tipoInformalidad pasa a ser tipo de derecho; //se puede definir la informalidad en numero de matricula en la posicion 22 o en la condicion del predio, y el tipo de derecho --Que es un predio informal y como se debe definir?
	 * 
	 * @JsonIgnore
	 * @OneToMany(mappedBy="predio", cascade=CascadeType.MERGE,
	 * fetch=FetchType.LAZY) private List<ReferenciaCartografica>; // fuente espacial en el LADM se define que fue usado para crear esa informacion, y un metadato y la descripcion de la fuente, pero fuente es un servicio de cartografia
	 * 
	 *  
	 *  
	 * @Column(name = "TIENE_AREA_REGISTRAL") private String tieneAreaRegistral;-- no deberia ir en LADM
	 * 
	 * @Column(name = "AREA_REGISTRAL") private Double areaRegistral; // es el area territorial pero registrada en registro -- no deberia ir en LADM
	 * 
	 * @Column(name = "PROCEDIMIENTO_CATASTRAL") private String procedimientoCatastral; --asumimos es el mismo tramite que ya es un objeto en LADM
	 * 
	 */
	
}
