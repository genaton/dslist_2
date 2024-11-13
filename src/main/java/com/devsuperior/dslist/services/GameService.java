// CAMADA DE SERVICOS ONDE FICAM AS REGRAS DE NEGÓCIOS
// EM FRAMEWORKS COMO O SPRING DEVE-SE REGISTRAR AS CLASSES DE 
// SERVICOS COMO SE FOSSE UM COMPONENTE DA APLICAÇÃO
// PARA ISSO BASTA USAR AS ANOTAÇÕES @Component ou @Service DO SPRING.
// NO CASO DESTE PROJETO O SERVICO DEVOLE O DTO     
package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired // injeção de componente: injetando a classe do repositorio nesta camada.
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;

    }
}