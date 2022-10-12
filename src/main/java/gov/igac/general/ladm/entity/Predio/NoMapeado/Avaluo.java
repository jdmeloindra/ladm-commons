package gov.igac.general.ladm.entity.Predio.NoMapeado;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "AVALUO", schema="SNC_TRAMITE")
public class Avaluo {

	@Id
    @Column(name = "IDENT")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_AVALUO")
    @SequenceGenerator(name = "SEQ_AVALUO", sequenceName = "SEQ_AVALUO", allocationSize = 1)
    private Long id;
	
	@Column(name = "VALOR_AVALUO", unique = true)
	private double valorAvaluo;

	@Column(name = "FECHA_DECRETO")
	private LocalDateTime fechaDecreto;

	@Column(name = "DECRETO")
	private String decreto;

	@Column(name = "ANO")
	private int ano;

	@Column(name = "ES_AUTOESTIMACION")
	private boolean esAutoestimacion;

//	@ManyToOne
//	@JoinColumn(name="FK_PREDIO")
//	@JsonIgnore
//	private Predio predio;

}
