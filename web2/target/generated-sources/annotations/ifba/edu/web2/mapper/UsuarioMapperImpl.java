package ifba.edu.web2.mapper;

import ifba.edu.web2.domain.dto.UsuarioDTO;
import ifba.edu.web2.domain.entity.Usuario;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-14T20:59:04-0300",
    comments = "version: 1.6.0, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class UsuarioMapperImpl extends UsuarioMapper {

    @Override
    public UsuarioDTO toUsuarioDTO(Usuario source) {
        if ( source == null ) {
            return null;
        }

        UsuarioDTO.UsuarioDTOBuilder usuarioDTO = UsuarioDTO.builder();

        usuarioDTO.id( source.getId() );
        usuarioDTO.nome( source.getNome() );
        usuarioDTO.dataNascimento( source.getDataNascimento() );

        usuarioDTO.idade( getIdadeEmAnos(source.getDataNascimento()) );

        return usuarioDTO.build();
    }

    @Override
    public Usuario toUsuario(UsuarioDTO source) {
        if ( source == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setId( source.getId() );
        usuario.setNome( source.getNome() );
        usuario.setDataNascimento( source.getDataNascimento() );

        return usuario;
    }
}
