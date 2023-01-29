package com.pagar.rest.api;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @GetMapping("/echo/{word}")
    @ResponseBody
    public ResponseEntity echo(@PathVariable String word) {
        return ResponseEntity.ok("Echoing :" + word);

    }
}
