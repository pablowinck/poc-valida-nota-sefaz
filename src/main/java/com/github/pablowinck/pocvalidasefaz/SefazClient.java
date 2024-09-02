package com.github.pablowinck.pocvalidasefaz;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Map;

@FeignClient(name = "sefazClient", url = "https://www.sefaz.rs.gov.br/NFE")
public interface SefazClient {

    @PostMapping(value = "/NFE-VAL.aspx", consumes = "application/x-www-form-urlencoded")
    String validarNFe(
            @RequestHeader("Cookie") String cookie,
            Map<String, ?> formParams
    );
}
