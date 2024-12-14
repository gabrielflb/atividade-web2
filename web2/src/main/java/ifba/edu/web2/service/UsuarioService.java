package ifba.edu.web2.service;

import ifba.edu.web2.domain.dto.UsuarioDTO;
import ifba.edu.web2.domain.entity.Usuario;

import java.util.List;

public interface UsuarioService {

    UsuarioDTO create(UsuarioDTO u);

    UsuarioDTO update(UsuarioDTO u);

    void remove(Long id);

    List<UsuarioDTO> findAll();

    UsuarioDTO findById(Long id);

    List<UsuarioDTO> findByNome(String nome);
}
