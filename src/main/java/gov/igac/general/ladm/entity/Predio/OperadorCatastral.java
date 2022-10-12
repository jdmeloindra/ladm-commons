package gov.igac.general.ladm.entity.Predio;

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
@Table(name = "CSRV_OPERADORCATASTRAL", schema="SNC_LADM")
public class OperadorCatastral {

	@Id
    @Column(name = "T_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_CSRV_OPERADORCATASTRAL")
    @SequenceGenerator(name = "SEQ_CSRV_OPERADORCATASTRAL", sequenceName = ".SNC_LADMSEQ_CSRV_OPERADORCATASTRAL", allocationSize = 1)
    private Long id;

	@Column(name = "T_ILI_TID")
	private String iliTId;

	@Column(name = "NOMBRE_OPERADOR")
	private String nombreOperador;

	@Column(name = "NIT_OPERADOR_CATASTRAL")
	private String nitOperadorCatastral;

	@JsonIgnore
	@OneToMany(mappedBy="operadorCatastral", cascade=CascadeType.MERGE, fetch=FetchType.LAZY)
	private List<Predio> predio = new ArrayList<>();
}
