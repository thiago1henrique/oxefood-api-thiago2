package br.com.ifpe.oxefood_api_thiago.util.entity;

import java.time.LocalDate;

import br.com.ifpe.oxefood_api_thiago.util.entity.EntidadeNegocio;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class EntidadeAuditavel extends EntidadeNegocio {

    private Long versao;

    private LocalDate dataCriacao;

    private LocalDate dataUltimaModificacao;

    private Long criadoPor; // Id do usuário que o criou

    private Long ultimaModificacaoPor; // Id do usuário que fez a última alteração

}
