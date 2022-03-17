package com.weesftw.endpoint;

import com.weesftw.Error;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/error")
public class ErrorController
{
    @PostMapping
    public ResponseEntity<Error> foo(Error error)
    {
        return ResponseEntity.ok(error);
    }
}
