package table.back.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import table.back.entity.Norm;
import table.back.repository.NormRepository;

import java.util.List;

@Service
public class NormService {

    @Autowired
    private NormRepository normRepository;

    public List<Norm> getAllNorm() {
        return normRepository.findAll();
    }
}
