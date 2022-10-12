package gov.igac.general.ladm.entity.Predio.InfoPorUebaUnitTerrConst;


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
import gov.igac.general.ladm.entity.Predio.InfoPorUebaUnitTerrConst.Construccion.Construccion;
import gov.igac.general.ladm.entity.Predio.InfoPorUebaUnitTerrConst.Terreno.Terreno;
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
@Table(name = "COL_UEBAUNIT", schema="SNC_LADM")
public class UEBAUnit {

	@Id
    @Column(name = "T_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_COL_UEBAUNIT")
    @SequenceGenerator(name = "SEQ_COL_UEBAUNIT", sequenceName = "SNC_LADM.SEQ_COL_UEBAUNIT", allocationSize = 1)
    private Long id;

//	@Column(name = "UE_CSRV_NU_ESPACIOJURIDICOUNIDADEDIFICACION")
//	private Long juridicoUnidadEdificacion;
//
//	@Column(name = "UE_CSRV_NU_ESPACIOJURIDICOREDSERVICIOS")
//	private Long juridicoRedServicios;

	@ManyToOne
	@JoinColumn(name = "BAUNIT")
	@JsonIgnore
	private Predio predio;

	@ManyToOne
	@JoinColumn(name = "UE_CSRV_UNIDADCONSTRUCCION")
    private Construccion construccion;

	@ManyToOne
	@JoinColumn(name = "UE_CSRV_TERRENO")
    private Terreno terreno;

	@ManyToOne
	@JoinColumn(name = "UE_CSRV_SERVIDUMBRETRANSITO")
    private Servidumbre servidumbre;

}
