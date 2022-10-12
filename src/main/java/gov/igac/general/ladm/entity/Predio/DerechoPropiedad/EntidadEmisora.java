package gov.igac.general.ladm.entity.Predio.DerechoPropiedad;

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
@Table(name = "ENTIDAD_EMISORA", schema="SNC_LADM")
public class EntidadEmisora {

	@Id
    @Column(name = "IDENT")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "")
    @SequenceGenerator(name = "", sequenceName = "", allocationSize = 1)
    private Long id;
	
	@Column(name = "VALOR", unique = true)
	private String value;
	
	@Column(name = "DESCRIPCION")
	private String desc;

//	@OneToMany(mappedBy="entidadEmisora", cascade=CascadeType.MERGE, fetch=FetchType.LAZY)
//	private List<JustificacionDerechoPropiedad> justificacionDerechoPropiedad = new ArrayList<>();
	
}
