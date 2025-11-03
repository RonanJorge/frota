package com.example.frota.caixa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "caixa")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of ="id")
public class Caixa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "caixa_id")
	private long id;
	
	private int altura;
	private int largura;
	private int comprimento;
	private double limitePeso;
	
	public Caixa(CadastroCaixa dados) {
		this.altura = dados.altura();
		this.largura = dados.largura();
		this.comprimento = dados.comprimento();
		this.limitePeso = dados.limitePeso();
	}
	
	public void atualizarInformacoes(@Valid AtualizacaoCaixa dados) {
		if (dados.altura() != null) {
			this.altura = dados.altura();
			this.largura = dados.largura();
			this.comprimento = dados.comprimento();
			this.limitePeso = dados.limitePeso();
		}
	}
}
