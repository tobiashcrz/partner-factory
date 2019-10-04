package br.com.partner.factory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.partner.factory.dto.OrderDTO;
import br.com.partner.factory.service.PartnerService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class OrderController {
	@Autowired
	private PartnerService partnerService;

	@GetMapping(value = "/v2/orders", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<OrderDTO> query() {
		log.info("OrderController - start - query");
		OrderDTO orderDTO = partnerService.query();
		log.debug("OrderController - query - orderDTO {}", orderDTO);
		return ResponseEntity.status(HttpStatus.OK).body(orderDTO);
	}
}
