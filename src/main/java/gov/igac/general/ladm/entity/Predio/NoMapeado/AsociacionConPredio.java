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
@Table(name = "ASOCIACION_CON_PREDIO", schema="SNC_TRAMITE")
public class AsociacionConPredio {

	@Id
    @Column(name = "IDENT")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_ASOCIACION_CON_PREDIO")
    @SequenceGenerator(name = "SEQ_ASOCIACION_CON_PREDIO", sequenceName = "SEQ_ASOCIACION_CON_PREDIO", allocationSize = 1)
    private Long id;
	
	@Column(name = "VALOR", unique = true)
	private String value;
	
	@Column(name = "DESCRIPCION")
	private String desc;

//	@OneToMany(mappedBy="asociacionConPredio", cascade=CascadeType.MERGE, fetch=FetchType.LAZY)
//	private List<PredioPropietarioPoseedor> predioPropietarioPoseedor = new ArrayList<>();
	
}
