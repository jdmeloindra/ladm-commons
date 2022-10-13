package gov.igac.general.ladm.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import gov.igac.general.ladm.dto.response.DerechoResponseDto;
import gov.igac.general.ladm.entity.Predio.InforPorColBAUnitInteresado.Derecho;

@Component
@Mapper(componentModel = "spring")
public interface IDerechoMapper {
	
	List<DerechoResponseDto> consultanInformacionAlfanumerica(List<Derecho> derecho);
	
}
