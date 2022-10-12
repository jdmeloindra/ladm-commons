package gov.igac.general.ladm.entity.Tramite;

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

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CSRV_PREDIO_TRAMITECATASTRAL", schema="SNC_LADM")
public class TramitePredio {

	@Id
    @Column(name = "T_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_CSRV_PREDIO_TRAMITECATASTRAL")
    @SequenceGenerator(name = "SEQ_CSRV_PREDIO_TRAMITECATASTRAL", sequenceName = "SNC_LADM.SEQ_CSRV_PREDIO_TRAMITECATASTRAL", allocationSize = 1)
    private Long id;
	
	@ManyToOne
	@JoinColumn(name = "CSRV_TRAMITE_CATASTRAL")
    private Tramite tramite;

	@ManyToOne
	@JoinColumn(name = "CSRV_PREDIO")
	@JsonIgnore
    private Predio predioT;

}
