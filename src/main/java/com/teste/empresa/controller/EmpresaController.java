package com.teste.empresa.controller;

import java.util.List;
import com.teste.empresa.dto.EmpresaDTO;
import com.teste.empresa.empresaService.EmpresaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class EmpresaController {

    private final EmpresaService empresaService;


    @GetMapping("/listaEmpresas")
    public ResponseEntity<List<EmpresaDTO>> listarEmpresas(){
      return ResponseEntity.ok().body(empresaService.listarEmpresas());
    }


}
