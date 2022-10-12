package gov.igac.general.ladm.entity.Predio.InforPorColBAUnitInteresado.GrupoInteresados;


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
@Table(name = "col_miembros", schema="SNC_LADM")
public class MiembrosGrupo {

	@Id
    @Column(name = "T_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_COL_MIEMBROS")
    @SequenceGenerator(name = "SEQ_COL_MIEMBROS", sequenceName = "SNC_LADM.SEQ_COL_MIEMBROS", allocationSize = 1)
    private Long id;

	@NumberFormat(style = Style.NUMBER, pattern = "#,###.##")
	@Column(name = "participacion")
	private String participacion;

	@ManyToOne
	@JoinColumn(name = "INTERESADO_CSRV_INTERESADO")
    private Interesado interesado;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "agrupacion")
    private GrupoInteresados grupoInteresados;
	
}
