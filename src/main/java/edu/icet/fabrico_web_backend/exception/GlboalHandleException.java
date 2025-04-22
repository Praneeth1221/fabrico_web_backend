package edu.icet.fabrico_web_backend.exception;

import edu.icet.fabrico_web_backend.exception.Impl.ErrorException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class GlboalHandleException {
    @ExceptionHandler(ErrorException.class)
    public ResponseEntity<edu.icet.fabrico_web_backend.dto.ErrorException> notFountExecption(ErrorException ex){
        return ResponseEntity.ok().body(edu.icet.fabrico_web_backend.dto.ErrorException.builder().status("Failed").message(ex.getMessage()).build());
    }
}
