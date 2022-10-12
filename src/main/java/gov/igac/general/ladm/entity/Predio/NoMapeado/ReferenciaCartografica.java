package gov.igac.general.ladm.entity.Predio.NoMapeado;


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
@Table(name = "REFERENCIA_CARTOGRAFICA", schema="SNC_TRAMITE")
public class ReferenciaCartografica {

	@Id
    @Column(name = "IDENT")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_REFERENCIA_CARTOGRAFICA")
    @SequenceGenerator(name = "SEQ_REFERENCIA_CARTOGRAFICA", sequenceName = "SEQ_REFERENCIA_CARTOGRAFICA", allocationSize = 1)
    private Long id;

//	@ManyToOne
//	@JoinColumn(name = "FK_PREDIO")
//	@JsonIgnore
//    private Predio predio;
	
}
