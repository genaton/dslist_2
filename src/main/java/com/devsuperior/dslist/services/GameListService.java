// CAMADA DE SERVICOS ONDE FICAM AS REGRAS DE NEGÓCIOS
// EM FRAMEWORKS COMO O SPRING DEVE-SE REGISTRAR AS CLASSES DE 
// SERVICOS COMO SE FOSSE UM COMPONENTE DA APLICAÇÃO
// PARA ISSO BASTA USAR AS ANOTAÇÕES @Component ou @Service DO SPRING.
// NO CASO DESTE PROJETO O SERVICO DEVOLE O DTO     
package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.devsuperior.dslist.dto.GameListDTO;

import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;




@Service
public class GameListService {

    @Autowired // injeção de componente: injetando a classe do repositorio nesta camada.
    private GameListRepository gameListRepository;
     
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
        

    }
}