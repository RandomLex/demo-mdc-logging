package com.barzykin.logging.mdc.demo.controllers;

import com.barzykin.logging.mdc.demo.exceptions.ApplicationException;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public ResponseEntity<String> welcome() {
        String result = "Welcome";
        log.info(result);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/error/{err}")
    public ResponseEntity<String> exception(@PathVariable String err) {
        if ("123".equals(err)) {
            throw new ApplicationException("error 123");
        }
        return ResponseEntity.ok(err);
    }
}
