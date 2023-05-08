package br.dev.jeffersonricardo.sistemaponto.model;

import java.time.LocalDateTime;

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
public class Calendario {
	@Id
	private Long id;
	private TipoData tipoData;
	private String descricao;
	private LocalDateTime dataEspecial;
}
