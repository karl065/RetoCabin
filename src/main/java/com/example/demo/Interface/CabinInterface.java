package com.example.demo.Interface;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.Modelo.Cabin;

public interface CabinInterface extends CrudRepository<Cabin, Integer> {

}
