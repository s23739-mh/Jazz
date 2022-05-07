package pj.pjatk.mikhol.mikhol.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pj.pjatk.mikhol.classes.Car;
import pj.pjatk.mikhol.mikhol.service.MikHolService;

import java.util.List;

@RestController
@RequestMapping("/test")
public class MikHolRestController {

    private final MikHolService mikHolService;

    public MikHolRestController(MikHolService mikHolService) {
        this.mikHolService = mikHolService;
    }

    @GetMapping("/exception")
    public ResponseEntity<Exception> exception() {
        throw new RuntimeException("Database has been smoked");
    }

    @GetMapping("/helloworld")
    public ResponseEntity<String> helloworld() {
        return mikHolService.helloworld();
    }

    @GetMapping("/model")
    public ResponseEntity<Car> newCar() {
        return mikHolService.newCar();
    }

    @GetMapping("/hello/{value}")
    public ResponseEntity<String> returnString(@PathVariable String value) {
        return mikHolService.returnString(value);
    }

    @GetMapping("/hello")
    @ResponseBody
    public ResponseEntity<List<String>> getString(@RequestParam List<String> reqParam) {
        return mikHolService.getString(reqParam);
    }


    @RequestMapping(value = "/models", method = RequestMethod.POST)
    public ResponseEntity<Car> giveCar(@RequestBody String name) {
        return mikHolService.giveCar(name);
    }
}
//zrozum czym jest body, bodybuilder etc. np ResponseEntity.BodyBuilder bodyBuilder = ResponseEntity.badRequest();