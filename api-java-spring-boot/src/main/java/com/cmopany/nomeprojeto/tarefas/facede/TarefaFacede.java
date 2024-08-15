package com.cmopany.nomeprojeto.tarefas.facede;

import com.cmopany.nomeprojeto.tarefas.dto.TarefaDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TarefaFacede {
    private static final Map<Long, TarefaDTO> tarefas = new HashMap<>();

    public TarefaDTO criar(TarefaDTO tarefaDTO) {
        Long proximoid = tarefas.keySet().size() + 1L;
        tarefaDTO.setId(proximoid);
        tarefas.put(proximoid, tarefaDTO);
        return tarefaDTO;
    }

    public TarefaDTO atualizar(TarefaDTO tarefaDTO, Long tarefaId) {
        tarefaDTO.setId(tarefaId); // Atualize o ID da tarefa com o ID fornecido
        tarefas.put(tarefaId, tarefaDTO); // Substitua a tarefa existente
        return tarefaDTO;
    }


    public TarefaDTO getbyid(Long tarefaId) {
        return tarefas.get(tarefaId);
    }

    public List<TarefaDTO> getAll() {
        return new ArrayList<>(tarefas.values());
    }

    public String deletar(Long tarefaId) {
        tarefas.remove(tarefaId);
        return "DELETED";

    }
}
