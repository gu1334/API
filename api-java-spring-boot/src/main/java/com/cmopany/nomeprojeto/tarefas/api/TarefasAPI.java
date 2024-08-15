package com.cmopany.nomeprojeto.tarefas.api;
import com.cmopany.nomeprojeto.tarefas.dto.TarefaDTO;
import com.cmopany.nomeprojeto.tarefas.facede.TarefaFacede;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@Controller
@RequestMapping(value = "/tarefas", produces = MediaType.APPLICATION_JSON_VALUE)
public class TarefasAPI {
    @Autowired
    private TarefaFacede tarefaFacede;

    @Operation(description = "Cria tarefas novas")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Sucesso"),
            @ApiResponse(responseCode = "400", description = "Erro")
    })
    @PostMapping
    @ResponseBody
    public TarefaDTO criar(@RequestBody TarefaDTO tarefaDTO) {
        return tarefaFacede.criar(tarefaDTO);
    }



    @Operation(description = "Atualizar Tarefas")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Atualiza com Sucesso"),
            @ApiResponse(responseCode = "400", description = "Erro ao atualizar")
    })
    @PutMapping("/{tarefaId}")
    @ResponseBody
    public ResponseEntity<TarefaDTO> atualizar(@PathVariable("tarefaId") Long tarefaId,
                                               @RequestBody TarefaDTO tarefaDTO) {
        TarefaDTO tarefaAtualizada = tarefaFacede.atualizar(tarefaDTO, tarefaId);
        return ResponseEntity.ok(tarefaAtualizada);
    }

    @Operation(description = "buscar tarefas")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "retorna a tarefa"),
            @ApiResponse(responseCode = "400", description = "não existe a tarefa")
    })
    @GetMapping
    @ResponseBody
    public List<TarefaDTO>getAll(){
        return tarefaFacede.getAll();
    }


    @Operation(description = "Deletar tarefas")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Sucesso ao tarefa"),
            @ApiResponse(responseCode = "400", description = "Erro ao tarefa")
    })
    @DeleteMapping("/{tarefaId}")
    @ResponseBody
    public String deletar(@PathVariable("tarefaId") Long tarefaId) {
        return tarefaFacede.deletar(tarefaId);
    }

}
