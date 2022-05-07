package pj.pjatk.mikhol.mikhol.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pj.pjatk.mikhol.mikhol.service.MikHolService;

@RestControllerAdvice
public class MikHolAdvice {
    private final MikHolService mikHolService;

    public MikHolAdvice(MikHolService mikHolService) {
        this.mikHolService = mikHolService;
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleRuntimeException(RuntimeException ex) {
        return mikHolService.handleRuntimeException(ex);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException() {
        return mikHolService.handleException();
    }
}
