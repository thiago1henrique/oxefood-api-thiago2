package br.com.ifpe.oxefood_api_thiago.modelo.produto;

import br.com.ifpe.oxefood_api_thiago.util.entity.EntidadeAuditavel;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.SQLRestriction;

import java.time.LocalDate;

@Entity
@Table(name = "Produto")
@SQLRestriction("habilitado = true")

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produto extends EntidadeAuditavel  {

    private String codigo;

    private String titulo;

    private String descricao;

    private String valorUnitario;

    private int tempoEntregaMinimo;

    private int tempoEntregaMaximo;

}
