package gov.igac.general.ladm.entity.Predio.NoMapeado;

import java.time.LocalDateTime;

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
@Table(name = "REGISTRO_FOTOGRAFICO", schema="SNC_TRAMITE")
public class RegistroFotografico {

	@Id
    @Column(name = "IDENT")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_REGISTRO_FOTOGRAFICO")
    @SequenceGenerator(name = "SEQ_REGISTRO_FOTOGRAFICO", sequenceName = "SEQ_REGISTRO_FOTOGRAFICO", allocationSize = 1)
    private Long id;
	
	@Column(name = "UNIDAD", unique = true)
	private long unidad;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;

	@Column(name = "FECHA_REGISTRO")
	private LocalDateTime fechaRegistro;

//	@ManyToOne
//	@JoinColumn(name = "FK_TIPO_FOTOGRAFIA")
//	@JsonIgnore
//    private TipoFotografia tipoFotografia;
//
//	@ManyToOne
//	@JoinColumn(name = "FK_PREDIO")
//	@JsonIgnore
//    private Predio predio;
	
}
