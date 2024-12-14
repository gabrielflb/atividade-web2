package ifba.edu.web2.mapper;


import ifba.edu.web2.domain.dto.UsuarioDTO;
import ifba.edu.web2.domain.entity.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Mapper(componentModel = "spring")
public abstract class UsuarioMapper {


    @Mapping(target = "idade", expression = "java(getIdadeEmAnos(source.getDataNascimento()))")
    public abstract UsuarioDTO toUsuarioDTO(Usuario source);

    public abstract Usuario toUsuario(UsuarioDTO source);

    public Long getIdadeEmAnos(LocalDate dataNascimento) {
        return ChronoUnit.YEARS.between(dataNascimento, LocalDate.now());

    }

}
