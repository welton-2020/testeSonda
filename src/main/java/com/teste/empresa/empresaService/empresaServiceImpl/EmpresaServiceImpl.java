package com.teste.empresa.empresaService.empresaServiceImpl;

import com.teste.empresa.EmpresaExceptions.EmpresaException;
import com.teste.empresa.dto.EmpresaDTO;
import com.teste.empresa.empresaService.EmpresaService;
import com.teste.empresa.model.Empresa;
import com.teste.empresa.repository.EmpresaRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class EmpresaServiceImpl implements EmpresaService {

    private final EmpresaRepository empresaRepository;

    private final ModelMapper modelMapper;

    @Override
    public List<EmpresaDTO> listarEmpresas() {
            List<Empresa> listaEmpresas = empresaRepository.findAllEmpresas();
            if (listaEmpresas.isEmpty()) throw new  EmpresaException("Lista de empresas se encontra vazia");

         List<EmpresaDTO> listaEmpresaDto = new ArrayList<>();

         listaEmpresas.forEach(
                 empresa ->{
               EmpresaDTO empresaDTO = modelMapper.map(empresa, EmpresaDTO.class);
                 listaEmpresaDto.add(empresaDTO);
         });
         return listaEmpresaDto;
    }
}
