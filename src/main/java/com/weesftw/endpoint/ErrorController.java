package com.weesftw.endpoint;

import com.weesftw.Error;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/error")
public class ErrorController
{
    @GetMapping
    public ResponseEntity<Error> foo()
    {
        return ResponseEntity.ok(null);
    }
}
