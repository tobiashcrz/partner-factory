package br.com.partner.factory.dto;

import java.util.List;

import lombok.Data;

@Data
public class OrderDTO {
	private List<ItemOrderDTO> items;
}
