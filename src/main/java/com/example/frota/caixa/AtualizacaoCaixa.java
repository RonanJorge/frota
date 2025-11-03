package com.example.frota.caixa;

import jakarta.validation.constraints.NotNull;

public record AtualizacaoCaixa(
		@NotNull
		Long id,
		Integer altura,
		Integer largura,
		Integer comprimento,
		Double limitePeso) {

}
