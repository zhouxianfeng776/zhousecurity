package com.zhou.test.controller;

import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.jwk.RSAKey;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.resource.ResourceServerProperties;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.KeyPair;
import java.security.interfaces.RSAPublicKey;
import java.util.Map;

/**
 * @author 01384526
 * @title: TestController
 * @projectName zhousecurity
 * @description: TODO
 * @date 2019/5/1413:53
 */
@RestController
public class TestController {

    @RequestMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    //@PreAuthorize("hasAuthority('ROLE_TELLER')")
    //@PreAuthorize("isAnonymous()")
    public String hasRoleAdmin(){
        return "admin success";
    }

    @RequestMapping("/product")
    @PreAuthorize("hasAuthority('product:read')")
    //@PreAuthorize("isAnonymous()")
    public String hasAuthority(){
        return "admin success";
    }


    @Autowired
    KeyPair keyPair;

    @RequestMapping("/public")
    public Map<String, Object> getpublic(){
        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
        RSAKey key = new RSAKey.Builder(publicKey).build();
        //System.out.println("public key:"+ Base64.encodeBase64String(keyPair.getPublic().getEncoded()));
        return new JWKSet(key).toJSONObject();
    }
}
