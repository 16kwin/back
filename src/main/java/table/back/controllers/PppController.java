package table.back.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import table.back.entity.Ppp;
import table.back.service.PppService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3001")
@RequestMapping("/api") 
public class PppController {

    @Autowired
    private PppService pppService;

    @GetMapping("/ppp")
    public ResponseEntity<List<Ppp>> getAllPpp() {
        List<Ppp> pppList = pppService.getAllPpp();
        return ResponseEntity.ok(pppList);
    }
}