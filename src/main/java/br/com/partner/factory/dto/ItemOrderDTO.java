package br.com.partner.factory.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ItemOrderDTO {
	private Integer id;
	private String name;
	private Double amount;
}
