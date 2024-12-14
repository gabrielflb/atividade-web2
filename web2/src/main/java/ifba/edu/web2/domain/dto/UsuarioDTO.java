package ifba.edu.web2.domain.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class UsuarioDTO {
    private long id;

    @NotEmpty
    @Size(max = 100)
    private String nome;

    @NonNull
    private LocalDate dataNascimento;

    private Long idade;

    void calculaIdade() {
        ChronoUnit.YEARS.between(dataNascimento, LocalDate.now());
    }
}
