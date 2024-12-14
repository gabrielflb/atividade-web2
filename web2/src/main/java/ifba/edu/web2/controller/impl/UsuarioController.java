package ifba.edu.web2.controller.impl;

import ifba.edu.web2.domain.dto.UsuarioDTO;
import ifba.edu.web2.service.UsuarioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UsuarioController {
    private final UsuarioService usuarioService;

    @PostMapping
    public UsuarioDTO create(@RequestBody @Valid UsuarioDTO pessoaDTO) {
        return usuarioService.create(pessoaDTO);
    }

    @PutMapping
    public UsuarioDTO update(@RequestBody @Valid UsuarioDTO pessoaDTO) {
        return usuarioService.update(pessoaDTO);
    }

    @PutMapping("/{id}")
    public  UsuarioDTO update(@PathVariable("id") Long id, @RequestBody @Valid UsuarioDTO pessoaDTO ) {
        pessoaDTO.setId(id);
        return usuarioService.update(pessoaDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        usuarioService.remove(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public List<UsuarioDTO> findAll() {
        return usuarioService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDTO> findById(@PathVariable("id") Long id) {
        UsuarioDTO p = usuarioService.findById(id);
        if(p != null) {
            return ResponseEntity.ok(p);
        }else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/nome/{nome}")
    public List<UsuarioDTO> findByNome(@PathVariable("nome") String nome) {
        return usuarioService.findByNome(nome);
    }
}
