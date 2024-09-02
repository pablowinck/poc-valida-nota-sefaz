package com.github.pablowinck.pocvalidasefaz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class NFeService {

    @Autowired
    private SefazClient sefazClient;

    public boolean validarNFe(String xml) {
        String cookie = "AffinitySefaz=5dfd3b410ba79396cc309b9568ee09dd60285403b73438981c8123ac04d1491b";
        Map<String, ?> formParams = Map.of("txtxml", xml);
        return sefazClient.validarNFe(cookie, formParams).contains("Assinatura Digital: Válida");
    }
}
