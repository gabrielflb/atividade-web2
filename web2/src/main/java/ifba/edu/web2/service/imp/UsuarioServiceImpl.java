package ifba.edu.web2.service.imp;

import ifba.edu.web2.domain.dto.UsuarioDTO;
import ifba.edu.web2.domain.entity.Usuario;
import ifba.edu.web2.exception.NotFoundException;
import ifba.edu.web2.mapper.UsuarioMapper;
import ifba.edu.web2.repository.UsuarioRepository;
import ifba.edu.web2.service.UsuarioService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {
    private final UsuarioRepository usuarioRepository;
    private final UsuarioMapper usuarioMapper;
    @Override
    public UsuarioDTO create(UsuarioDTO uDTO) {
        Usuario u = usuarioRepository.save(usuarioMapper.toUsuario(uDTO));
        return usuarioMapper.toUsuarioDTO(u);
    }

    @Override
    public UsuarioDTO update(UsuarioDTO u) {
        if(!usuarioRepository.existsById(u.getId())) throw new NotFoundException("Pessoa not found with id: " + u.getId());
        return create(u);
    }

    @Override
    public void remove(Long id) {
        if(!usuarioRepository.existsById(id)){
            throw new NotFoundException("Pessoa not found with id: " + id);
        }
        usuarioRepository.deleteById(id);
    }

    @Override
    public List<UsuarioDTO> findAll() {
        List<Usuario> listUsu = usuarioRepository.findAll();
        return listUsu.stream().map(p ->
                usuarioMapper.toUsuarioDTO(p)).toList();
    }

    @Override
    public UsuarioDTO findById(Long id) {
        Optional<Usuario> p = usuarioRepository.findById(id);
        if (p.isPresent()) {
            return usuarioMapper.toUsuarioDTO(p.get());
        }
        return null;
    }

    @Override
    public List<UsuarioDTO> findByNome(String nome) {
        List<Usuario> listPessoa = usuarioRepository.findByNome(nome);
        List<UsuarioDTO> pessoasDTO = new ArrayList<>();
        listPessoa.forEach(p ->
                pessoasDTO.add(usuarioMapper.toUsuarioDTO(p)));
        return pessoasDTO;
    }
}


