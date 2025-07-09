package com.example.solid.service.grupo;

import com.example.solid.dto.grupo.GrupoCreateDto;
import com.example.solid.dto.grupo.GrupoDto;
import com.example.solid.entity.Grupo;
import com.example.solid.mapper.GrupoMapper;
import com.example.solid.mapper.ProveedorMapper;
import com.example.solid.repository.GrupoRepository;
import com.example.solid.repository.ProveedorRepository;
import com.example.solid.service.proveedor.ProveedorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrupoServiceImpl implements GrupoService{

    private final GrupoRepository grupoRepository;
    private final GrupoMapper grupoMapper;

    public GrupoServiceImpl(GrupoRepository grupoRepository,
                            GrupoMapper grupoMapper) {
        this.grupoRepository = grupoRepository;
        this.grupoMapper = grupoMapper;
    }

    @Override
    public GrupoDto createGrupo(GrupoCreateDto grupoCreateDto) {
        Grupo grupo = GrupoMapper.toEntity(grupoCreateDto);
        return grupoMapper.toDto(grupoRepository.save(grupo));
    }

    @Override
    public GrupoDto getGrupoById(long id) {
        return grupoRepository.findById(id)
                .map(grupoMapper::toDto)
                .orElseThrow(() -> new RuntimeException("Grupo not found with id: " + id));
    }

    @Override
    public List<GrupoDto> getAllGrupos() {
        return grupoRepository.findAll()
                .stream()
                .map(grupoMapper::toDto)
                .toList();
    }
}
