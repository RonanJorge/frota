package com.example.frota.caixa;

import jakarta.validation.constraints.NotNull;

public record CadastroCaixa(
		@NotNull
		Integer altura,
		Integer largura,
		Integer comprimento,
		Double limitePeso) {

}
