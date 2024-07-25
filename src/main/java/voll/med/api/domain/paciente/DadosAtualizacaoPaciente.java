package voll.med.api.domain.paciente;

import jakarta.validation.Valid;
import voll.med.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        Long id,
        String nome,
        String telefone,
        @Valid DadosEndereco endereco
) {
}