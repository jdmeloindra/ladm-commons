package gov.igac.general.ladm.entity.Predio.InfoPorFuenteJustDerProp;


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

/**
 * Esta tabla es un juego de pares, siempre existe el idPredio y un atributo adicional ya sea terreno, unidad de construccion o servidumbre
 * @author Alejandro
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "COL_UNIDADFUENTE", schema="SNC_LADM")
public class ColUnidadJustDerProp {

	@Id
    @Column(name = "T_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_COL_UNIDADFUENTE")
    @SequenceGenerator(name = "SEQ_COL_UNIDADFUENTE", sequenceName = "SNC_LADM.SEQ_COL_UNIDADFUENTE", allocationSize = 1)
    private Long id;

	@ManyToOne
	@JoinColumn(name = "UNIDAD")
	@JsonIgnore
	private Predio predioF;

	@ManyToOne
	@JoinColumn(name = "FUENTE_ADMINISTRATIVA")
    private JustificacionDerechoPropiedad fuenteAdministrativa;

}
