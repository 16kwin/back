package table.back.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import table.back.entity.Ppp;
import table.back.service.PppService;
import table.back.service.NormService;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

@RestController
@CrossOrigin(origins = "http://localhost:3003")
@RequestMapping("/api")
public class PppController {

    @Autowired
    private PppService pppService;

    @Autowired
    private NormService normService;

    @GetMapping("/ppp")
    public ResponseEntity<Map<String, Object>> getAllPpp() {
        List<Ppp> pppList = pppService.getAllPpp();
        List<table.back.entity.Norm> normList = normService.getAllNorm();

        Map<String, Object> response = new HashMap<>();
        response.put("pppList", pppList);
        response.put("normList", normList);

        return ResponseEntity.ok(response);
    }
}