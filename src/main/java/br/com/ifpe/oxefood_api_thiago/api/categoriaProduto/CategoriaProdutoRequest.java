package br.com.ifpe.oxefood_api_thiago.api.categoriaProduto;

import br.com.ifpe.oxefood_api_thiago.modelo.categoriaProduto.CategoriaProduto;
import br.com.ifpe.oxefood_api_thiago.modelo.cliente.Cliente;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaProdutoRequest {

    private String descricao;

    public CategoriaProduto build() {

        return CategoriaProduto.builder()
                .descricao(descricao)
                .build();
    }

}