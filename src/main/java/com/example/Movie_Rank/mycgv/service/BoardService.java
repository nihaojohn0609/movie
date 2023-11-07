/*
package com.example.Movie_Rank.mycgv.service;

import com.example.Movie_Rank.mycgv.dto.BoardDto;
import com.example.Movie_Rank.mycgv.entity.BoardEntity;
import com.example.Movie_Rank.mycgv.repository.BoardRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;
    public Page<BoardDto> paging(Pageable pageable){

        int page = pageable.getNumberOfPages() -1 ;
        int pageLimit = 3;
       Page<BoardEntity> boardEntities =
        boardRepository.findAll(PageRequest.of(page,pageLimit, Sort.by(Sort.Direction.DESC,"id")));
       //받을때 하나 빠진 값을 받기 때문에 헷갈릴수 있으므로 하나 뺴줘야함
    }

    public BoardDto update(BoardDto boardDto){
        BoardEntity boardEntity = BoardEntity.toUpdateEntity(boardDto);
        boardRepository.save(boardEntity);
        return findById(boardDto.getId());

    }
    public BoardDto findById(Long id){
        Optional<BoardEntity> optionalBoardEntity =boardRepository.findById(id);
        if(optionalBoardEntity.isPresent()){
            BoardEntity boardEntity = optionalBoardEntity.get();
            BoardDto boarDTO = BoardDto.toBoardDto(boardEntity);
            return boarDTO;
        }
        return null;
    }
    @Transactional
    public void updateHits(Long id){
    boardRepository.updateHits(id);
    }
    public void save(BoardDto boardDto){
        BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDto);
        boardRepository.save(boardEntity);
    }
    public List<BoardDto> findAll(){
        List<BoardEntity> boardEntityList = boardRepository.findAll();
        List<BoardDto> boardDtoList = new ArrayList<>();
        //엔티티 객체를 dto로 옮겨담는다
        for(BoardEntity boardEntity: boardEntityList){
            boardDtoList.add(BoardDto.toBoardDto(boardEntity));
        }
        return boardDtoList;
    }

}
*/
