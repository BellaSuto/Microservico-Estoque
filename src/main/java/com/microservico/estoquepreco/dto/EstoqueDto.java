package com.microservico.estoquepreco.dto;

import java.io.Serializable;

public class EstoqueDto implements Serializable {
    public String codigoProduto;
    public int quantidade;

    public EstoqueDto() {
    }
}
