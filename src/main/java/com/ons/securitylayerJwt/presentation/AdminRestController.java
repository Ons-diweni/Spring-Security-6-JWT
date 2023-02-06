package com.ons.securitylayerJwt.presentation;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminRestController {


    //RessourceEndPoint:http://localhost:8087/api/admin/hello
    @GetMapping("/hello")
    public String sayHello ()
    { return "Hello" ;}


}
