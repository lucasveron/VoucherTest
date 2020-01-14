package com.prismamp.voucher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vouchers")
public class VoucherController {

	@Autowired
	private VoucherService service;
	
	@RequestMapping(method = RequestMethod.GET, value="get")
	public ResponseEntity<String> getVoucher() {
		
		return service.getVoucher();
	}
}
