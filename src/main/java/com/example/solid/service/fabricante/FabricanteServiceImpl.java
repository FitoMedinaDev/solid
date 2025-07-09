package com.example.solid.service.fabricante;

import com.example.solid.dto.fabricante.FabricanteCreateDto;
import com.example.solid.dto.fabricante.FabricanteDto;
import com.example.solid.entity.Fabricante;
import com.example.solid.mapper.FabricanteMapper;
import com.example.solid.repository.FabricanteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FabricanteServiceImpl implements FabricanteService {

    private final FabricanteRepository fabricanteRepository;
    private final FabricanteMapper fabricanteMapper;

    public FabricanteServiceImpl(FabricanteRepository fabricanteRepository,
                                 FabricanteMapper fabricanteMapper) {
        this.fabricanteRepository = fabricanteRepository;
        this.fabricanteMapper = fabricanteMapper;
    }

    @Override
    public FabricanteDto createFabricante(FabricanteCreateDto fabricanteCreateDto) {
        Fabricante fabricante = fabricanteMapper.toEntity(fabricanteCreateDto);
        return fabricanteMapper.toDto(fabricanteRepository.save(fabricante));
    }

    @Override
    public FabricanteDto getFabricanteById(long id) {
        return fabricanteRepository.findById(id)
                .map(fabricanteMapper::toDto)
                .orElseThrow(() -> new RuntimeException("Fabricante not found with id: " + id));
    }

    @Override
    public List<FabricanteDto> getAllFabricantes() {
        return fabricanteRepository.findAll()
                .stream()
                .map(fabricanteMapper::toDto)
                .toList();
    }


}
