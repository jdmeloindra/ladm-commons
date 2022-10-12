package gov.igac.general.ladm.entity.Predio;

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
@Table(name = "PROPIETARIO_POSEEDOR", schema="SNC_TRAMITE")
public class PropietarioPoseedor {

	@Id
    @Column(name = "IDENT")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_PROPIETARIO_POSEEDOR")
    @SequenceGenerator(name = "SEQ_PROPIETARIO_POSEEDOR", sequenceName = "SEQ_PROPIETARIO_POSEEDOR", allocationSize = 1)
    private Long id;
	
	@Column(name = "ES_BLOQUEADO")
	private boolean esBloqueado;
	
}
