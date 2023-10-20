package com.example.Movie_Rank.mycgv.Controller;


import com.example.Movie_Rank.mycgv.dto.BoardDto;
import com.example.Movie_Rank.mycgv.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;
    @GetMapping("/board/list")
    public String board_list(){
        return "board/board_list";
    }
    @GetMapping("/board/write")
    public String board_write(){
        return "board/board_write";
    }
    @PostMapping("/board/write")
    public String save(@ModelAttribute BoardDto boardDto){
        System.out.println("안녕하세요");
    System.out.println("boardDto"+boardDto.getBoardTitle());
    boardService.save(boardDto);
    return "redirect:/board/list";
    }
    //입력해서 보내면 컨트롤러로 받을 때 클래스 객체를 찾아서 name 끼리 매핑해서  setter호출해서 담아서 dto 세팅
}//controller
