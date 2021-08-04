package com.teste.empresa.empresaService;

import com.teste.empresa.dto.EmpresaDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmpresaService {

    List<EmpresaDTO> listarEmpresas();
}
