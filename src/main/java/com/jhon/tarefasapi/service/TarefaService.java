package com.jhon.tarefasapi.service;

import com.jhon.tarefasapi.dto.TarefaDTO;
import com.jhon.tarefasapi.model.Tarefa;
import com.jhon.tarefasapi.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository repository;

    public List<TarefaDTO> listar(){
        List<Tarefa> tarefas = repository.findAll();

        List<TarefaDTO> listaDTO = new ArrayList<>();

        for (Tarefa tarefa : tarefas){
            TarefaDTO dto = new TarefaDTO(
                    tarefa.getId(),
                    tarefa.getTitulo(),
                    tarefa.getDescricao(),
                    tarefa.getData(),
                    tarefa.getStatus(),
                    tarefa.getConcluida()
            );
            listaDTO.add(dto);
        }
        return listaDTO;
    }

    public Tarefa salvar(Tarefa tarefa){
        return repository.save(tarefa);
    }

    public Tarefa atualizar(Long id, Tarefa tarefa){
        Tarefa tarefaExistente = repository.findById(id).orElse(null);

        if (tarefaExistente != null){
            tarefaExistente.setTitulo(tarefa.getTitulo());
            tarefaExistente.setDescricao(tarefa.getDescricao());
            tarefaExistente.setData(tarefa.getData());
            tarefaExistente.setStatus(tarefa.getStatus());
            tarefaExistente.setConcluida(tarefa.getConcluida());

            return repository.save(tarefaExistente);
        }
        return null;
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }
}
