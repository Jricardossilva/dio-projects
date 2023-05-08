package br.dev.jeffersonricardo.sistemaponto.model;

import org.hibernate.envers.Audited;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Ocorrencia {
	@Id
	private Long id;
	private String nome;
	private String descricao;
}
