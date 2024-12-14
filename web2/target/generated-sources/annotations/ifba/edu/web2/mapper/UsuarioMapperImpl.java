package ifba.edu.web2.mapper;

import ifba.edu.web2.domain.dto.UsuarioDTO;
import ifba.edu.web2.domain.entity.Usuario;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-14T13:38:19-0300",
    comments = "version: 1.6.0, compiler: Eclipse JDT (IDE) 3.40.0.z20241112-1021, environment: Java 17.0.13 (Eclipse Adoptium)"
)
@Component
public class UsuarioMapperImpl extends UsuarioMapper {

    @Override
    public UsuarioDTO toUsuarioDTO(Usuario source) {
        if ( source == null ) {
            return null;
        }

        UsuarioDTO.UsuarioDTOBuilder usuarioDTO = UsuarioDTO.builder();

        usuarioDTO.dataNascimento( source.getDataNascimento() );
        usuarioDTO.id( source.getId() );
        usuarioDTO.nome( source.getNome() );

        usuarioDTO.idade( getIdadeEmAnos(source.getDataNascimento()) );

        return usuarioDTO.build();
    }

    @Override
    public Usuario toUsuario(UsuarioDTO source) {
        if ( source == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setDataNascimento( source.getDataNascimento() );
        usuario.setId( source.getId() );
        usuario.setNome( source.getNome() );

        return usuario;
    }
}
