package com.teste.empresa.repository;

import lombok.Value;
import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.empresa.model.Empresa;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

    @Query(value = "SELECT E FROM Empresa E")
    List<Empresa> findAllEmpresas();

}
