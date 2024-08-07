package muscleGosup.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

import muscleGosup.dto.Set.SetUpdateDto;
import muscleGosup.model.Set;


@Component
@Mapper(componentModel = "spring")
public interface SetMapper {
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateSetFromDto(SetUpdateDto setUpdateDto, @MappingTarget Set set);
}
