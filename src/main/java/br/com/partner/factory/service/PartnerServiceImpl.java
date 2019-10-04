package br.com.partner.factory.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import br.com.partner.factory.dto.ItemOrderDTO;
import br.com.partner.factory.dto.OrderDTO;

@Service
public class PartnerServiceImpl implements PartnerService {

	@Override
	public OrderDTO query() {
		ItemOrderDTO itemOrderDTO1 = new ItemOrderDTO(1, "Porta interna compensado 0,80 x 2,10", 240.00);
		ItemOrderDTO itemOrderDTO2 = new ItemOrderDTO(2, "Porta interna compensado 0,90 x 2,10", 280.00);
		ItemOrderDTO itemOrderDTO3 = new ItemOrderDTO(3, "Porta externa almofada 0,80 x 2,10", 300.00);
		
		OrderDTO orderDTO = new OrderDTO();
		orderDTO.setItems(Arrays.asList(itemOrderDTO1, itemOrderDTO2, itemOrderDTO3));

		return orderDTO;
	}

}
