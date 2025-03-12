package table.back.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import table.back.entity.Ppp;
import table.back.repository.PppRepository;

import java.util.List;

@Service
public class PppService {

    @Autowired
    private PppRepository pppRepository;

    public List<Ppp> getAllPpp() {
        return pppRepository.findAll();
    }
}
