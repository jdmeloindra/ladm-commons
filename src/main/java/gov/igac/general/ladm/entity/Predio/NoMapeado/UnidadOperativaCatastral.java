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
@Table(name = "UNIDAD_OPERATIVA_CATASTRAL", schema="SNC_TRAMITE")
public class UnidadOperativaCatastral {

	@Id
    @Column(name = "IDENT")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_UNIDAD_OPERATIVA_CATASTRAL")
    @SequenceGenerator(name = "SEQ_UNIDAD_OPERATIVA_CATASTRAL", sequenceName = "SEQ_UNIDAD_OPERATIVA_CATASTRAL", allocationSize = 1)
    private Long id;
	
	@Column(name = "VALOR", unique = true)
	private String value;
	
	@Column(name = "DESCRIPCION")
	private String desc;

//	@JsonIgnore
//	@OneToMany(mappedBy="unidadOperativaCatastral", cascade=CascadeType.MERGE, fetch=FetchType.LAZY)
//	private List<Predio> predio = new ArrayList<>();
}
