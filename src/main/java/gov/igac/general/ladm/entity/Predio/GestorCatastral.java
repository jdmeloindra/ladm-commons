package gov.igac.general.ladm.entity.Predio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "CSRV_GESTORCATASTRAL", schema="SNC_LADM")
public class GestorCatastral {

	@Id
    @Column(name = "T_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_CSRV_GESTORCATASTRAL")
    @SequenceGenerator(name = "SEQ_CSRV_GESTORCATASTRAL", sequenceName = "SNC_LADM.SEQ_CSRV_GESTORCATASTRAL", allocationSize = 1)
    private Long id;

	@Column(name = "T_ILI_TID")
	private String iliTId;

	@Column(name = "NOMBRE_GESTOR")
	private String nombreGestor;

	@Column(name = "NIT_GESTOR_CATASTRAL")
	private String nitGestorCatastral;

	@Column(name = "FECHA_INICIO_PRESTACION_SERVICIO")//nuevo
	private LocalDateTime fechaInicioPrestacionServicio;

	/*@JsonIgnore
	@OneToMany(mappedBy="gestorCatastral", cascade=CascadeType.MERGE, fetch=FetchType.LAZY)
	private List<Predio> predio = new ArrayList<>();*/
}
