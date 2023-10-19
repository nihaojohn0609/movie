package com.example.Movie_Rank.mycgv.service;

import com.example.Movie_Rank.mycgv.dto.BoardDto;
import com.example.Movie_Rank.mycgv.entity.BoardEntity;
import com.example.Movie_Rank.mycgv.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;
    public void save(BoardDto boardDto){
        BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDto);
        boardRepository.save(boardEntity);
    }
}
