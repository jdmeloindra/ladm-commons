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
@Table(name = "TERRITORIAL", schema="SNC_TRAMITE")
public class Territorial {

	@Id
    @Column(name = "IDENT")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_TERRITORIAL")
    @SequenceGenerator(name = "SEQ_TERRITORIAL", sequenceName = "SEQ_TERRITORIAL", allocationSize = 1)
    private Long id;
	
	@Column(name = "VALOR", unique = true)
	private String value;
	
	@Column(name = "DESCRIPCION")
	private String desc;

//	@JsonIgnore
//	@OneToMany(mappedBy="territorial", cascade=CascadeType.MERGE, fetch=FetchType.LAZY)
//	private List<Predio> predio = new ArrayList<>();
}
