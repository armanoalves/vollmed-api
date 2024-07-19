package voll.med.api.paciente;

import jakarta.validation.Valid;
import voll.med.api.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        Long id,
        String nome,
        String telefone,
        @Valid DadosEndereco endereco
) {
}