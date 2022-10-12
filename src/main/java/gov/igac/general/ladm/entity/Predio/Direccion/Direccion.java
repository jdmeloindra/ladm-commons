package gov.igac.general.ladm.entity.Predio.Direccion;

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

import gov.igac.general.ladm.entity.Predio.Predio;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EXTDIRECCION", schema="SNC_LADM")
public class Direccion {
	//tipodir es estructurada (se llena todo) o no estructurada (solo se diligencia nombre predio)
	@Id
    @Column(name = "T_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_EXTDIRECCION")
    @SequenceGenerator(name = "SEQ_EXTDIRECCION", sequenceName = "SNC_LADM.SEQ_EXTDIRECCION", allocationSize = 1)
    private Long id;

	@Column(name = "T_ILI_TID")
	private String tIliTId;

	@Column(name = "T_SEQ")
	private int tSeq;

	@ManyToOne
	@JoinColumn(name = "TIPO_DIRECCION")
	private TipoDireccion tipoDireccion;
	
	@Column(name = "ES_DIRECCION_PRINCIPAL")
	private boolean esDireccionPrincipal;
	
	@Column(name = "LOCALIZACION")
	private String localizacion;

	@Column(name = "CODIGO_POSTAL")
	private String codigoPostal;
	
	@ManyToOne
	@JoinColumn(name = "CLASE_VIA_PRINCIPAL")
	private ClaseViaPrincipal claseViaPrincipal;

	@Column(name = "VALOR_VIA_PRINCIPAL")
	private String valorViaPrincipal;

	@Column(name = "LETRA_VIA_PRINCIPAL")
	private String letraViaPrincipal;

	@ManyToOne
	@JoinColumn(name = "SECTOR_CIUDAD")
	private SectorCiudad sectorCiudad;

	@Column(name = "VALOR_VIA_GENERADORA")
	private String valorViaGeneradora;
	
	@Column(name = "LETRA_VIA_GENERADORA")
	private String letraViaGeneradora;

	@Column(name = "NUMERO_PREDIO")
	private String numeroPredio;

	@ManyToOne
	@JoinColumn(name = "SECTOR_PREDIO")
	private SectorPredio sectorPredio;

	@Column(name = "COMPLEMENTO")
	private String complemento;

	@Column(name = "NOMBRE_PREDIO")
	private String nombrePredio;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "CSRV_PREDIO_DIRECCION")
	private Predio predioD;
	
}
