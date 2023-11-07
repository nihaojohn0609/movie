package com.example.Movie_Rank.mycgv.entity;

import com.example.Movie_Rank.mycgv.dto.BoardDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

//DB의 테이블 역할을 하는 클래스
@Entity
@Getter
@Setter
@Table(name = "board_table")
public class BoardEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length =20, nullable = false)
    private String boardWriter;
    @Column(length = 500)
    private String boardContents;
    @Column
    private String boardTitle;
    @Column
    private int boardHits;
    public static BoardEntity toSaveEntity(BoardDto boardDto){
        BoardEntity boardEntity =  new BoardEntity();
        boardEntity.setBoardWriter(boardDto.getBoardWriter());
        boardEntity.setBoardTitle(boardDto.getBoardTitle());
        boardEntity.setBoardContents(boardDto.getBoardContents());
        boardEntity.setBoardHits(0);
        return boardEntity;

    }
    public static BoardEntity toUpdateEntity(BoardDto boardDto){
        BoardEntity boardEntity =  new BoardEntity();
        boardEntity.setId(boardDto.getId());
        boardEntity.setBoardWriter(boardDto.getBoardWriter());
        boardEntity.setBoardTitle(boardDto.getBoardTitle());
        boardEntity.setBoardContents(boardDto.getBoardContents());
        boardEntity.setBoardHits(boardEntity.getBoardHits());
        return boardEntity;

    }
}
