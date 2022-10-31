package com.example.demo.Repositorio;

import com.example.demo.Modelo.Cabin;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.demo.Interface.CabinInterface;

@Repository
public class CabinRepository {

    @Autowired
    private CabinInterface extencionesCrud;

    public List<Cabin> getAll() {
        return (List<Cabin>) extencionesCrud.findAll();
    }

    public Optional<Cabin> getCabin(int id) {
        return extencionesCrud.findById(id);
    }

    public Cabin save(Cabin cabin) {
        return extencionesCrud.save(cabin);
    }

    public void delete(Cabin cabin) {
        extencionesCrud.delete(cabin);
    }
}
