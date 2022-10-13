package gov.igac.general.ladm.entity.Predio.InforPorColBAUnitInteresado.GrupoInteresados;


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

import gov.igac.general.ladm.entity.Predio.InforPorColBAUnitInteresado.Derecho;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "csrv_agrupacioninteresados", schema="SNC_LADM")
public class GrupoInteresados {

	@Id
    @Column(name = "T_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQ_csrv_agrupacioninteresados")
    @SequenceGenerator(name = "SEQ_csrv_agrupacioninteresados", sequenceName = "SNC_LADM.SEQ_csrv_agrupacioninteresados", allocationSize = 1)
    private Long id;

	@Column(name = "T_ILI_TID")
	private String tIliTId;

	@ManyToOne
	@JoinColumn(name = "TIPO")
	private TipoGrupoInteresado tipoGrupoInteresado;
	
	@Column(name = "NOMBRE")
	private String nombre;

	@JsonIgnore
	@OneToMany(mappedBy="grupoInteresados", cascade=CascadeType.MERGE, fetch=FetchType.LAZY)
	private List<Derecho> derechos;

	@OneToMany(mappedBy="grupoInteresados", cascade=CascadeType.MERGE, fetch=FetchType.LAZY)
	private List<MiembrosGrupo> miembrosGrupo;
	
}
