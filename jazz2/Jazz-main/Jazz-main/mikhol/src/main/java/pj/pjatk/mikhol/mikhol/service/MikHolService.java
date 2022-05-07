package pj.pjatk.mikhol.mikhol.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import pj.pjatk.mikhol.classes.Car;

import java.util.List;

@Service
public class MikHolService {
    public ResponseEntity<String> handleRuntimeException(RuntimeException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).
                body("Exception! Message:" + e.getLocalizedMessage());
    }

    public ResponseEntity<String> handleException() {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).
                body("Unknown Exception! Backup message: Everything is fine");
    }

    public ResponseEntity<String> helloworld() {
        ResponseEntity<String> hello_world = ResponseEntity.ok("Hello World");
        ResponseEntity.BodyBuilder ok = ResponseEntity.ok();
        ResponseEntity<Object> build = ResponseEntity.ok().build();
        return ResponseEntity.ok("Hello world");
    }

    public ResponseEntity<Car> newCar() {
        Car newCar = new Car("toyota", "krzysiu", 1000);
        return ResponseEntity.ok(newCar);
    }

    public ResponseEntity<String> returnString(@PathVariable String value) {
        return ResponseEntity.ok(value);
    }

    public ResponseEntity<List<String>> getString(@RequestParam List<String> reqParam) {
        return ResponseEntity.ok(reqParam);
    }

    public ResponseEntity<Car> giveCar(@RequestBody String name) {
        Car car = new Car(name, "krzysiu", 10);
        return ResponseEntity.ok(car);
    }
}
