package gov.igac.general.ladm.entity.Tramite;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CSRV_TRAMITECATASTRAL", schema="SNC_LADM")
public class Tramite {
	
	@Id
    @Column(name = "T_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_TCSRV_TRAMITECATASTRAL")
    @SequenceGenerator(name = "SEQ_TCSRV_TRAMITECATASTRAL", sequenceName = "SEQ_TCSRV_TRAMITECATASTRAL", allocationSize = 1)
    private Long id;

	@Column(name = "T_ILI_TID")
    private String tIliTId;

	@ManyToOne
	@JoinColumn(name = "CLASIFICACION_MUTACION")
    private ClasificacionMutacion clasificacionMutacion;

	@Column(name = "NUMERO_RESOLUCION")
    private String numeroResolucion;

	@Column(name = "FECHA_RESOLUCION")
    private LocalDateTime fechaResolucion;

	@Column(name = "FECHA_RADICACION")
    private LocalDateTime fechaRadicacion;

	@JsonIgnore
	 @OneToMany(mappedBy="tramite", cascade=CascadeType.MERGE, fetch=FetchType.LAZY) 
	 private List<TramitePredio> tramitePredio;

}
