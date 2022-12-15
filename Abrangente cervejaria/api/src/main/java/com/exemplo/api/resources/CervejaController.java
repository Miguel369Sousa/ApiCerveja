package com.exemplo.api.resources;

import com.exemplo.api.models.Cerveja;
import com.exemplo.api.repository.CervejaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cerveja")
public class CervejaController {


    @Autowired
    CervejaRepository cervejaRepository;

    @PostMapping("/cerveja")
    public Cerveja salvaCerveja(@RequestBody Cerveja cerveja) {
        return cervejaRepository.save(cerveja);
    }

    @GetMapping("/cerveja")
    public List<Cerveja> listaCerveja() {

        return cervejaRepository.findAll();
    }

}