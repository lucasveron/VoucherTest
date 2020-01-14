package com.prismamp.voucher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
public class VoucherService {
	
	@Value("${restTemplate.facturaYa.url}")
	private String url;
	
	private static final String CONTENT_TYPE_FORM_URLENCODED = "application/x-www-form-urlencoded";
	
	@Autowired
	private RestTemplate restTemplate;
	
	public ResponseEntity<String> getVoucher() {
		HttpHeaders headers = new HttpHeaders();
		//"Content-Type"
		headers.add(HttpHeaders.CONTENT_TYPE,CONTENT_TYPE_FORM_URLENCODED);
		
		MultiValueMap<String, String> bodyMap = new LinkedMultiValueMap<>();
		bodyMap.add("pCuit", "30714600288");
		bodyMap.add("pUsuario", "ws_consulta");
		bodyMap.add("pContrasena", "fCIvspJ9goryL1khNOiTJIBjfA0=");
		bodyMap.add("pPunto_Venta", "1");
		bodyMap.add("pTipo_Comprobante", "6");
		bodyMap.add("pNro_Comprobante", "1");
		
		HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(bodyMap, headers);
		final ResponseEntity<String> vr = restTemplate.postForEntity(url, requestEntity, String.class);
		return vr;
	}
}
