
package com.fstg.inscription.rest;

import com.fstg.inscription.bean.Departement;
import com.fstg.inscription.service.DepartementService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Imane
 */
@RestController
@RequestMapping("/inscription-api/departement")
public class DepartementRest {

    @Autowired
    private DepartementService departementService;

    @PostMapping("/")
    public void save(@RequestBody Departement departement) {
        departementService.save(departement);
    }

    @GetMapping("/")
    public List<Departement> findAll() {
        return departementService.findAll();
    }

    @GetMapping("/libelle/{libelle}")
    public Departement findByLibelle(@PathVariable String libelle) {
        return departementService.findByLibelle(libelle);
    }


   

}
