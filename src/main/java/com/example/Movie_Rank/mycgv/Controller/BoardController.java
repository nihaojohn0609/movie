package com.example.Movie_Rank.mycgv.Controller;


import com.example.Movie_Rank.mycgv.dto.BoardDto;
import com.example.Movie_Rank.mycgv.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;
    @GetMapping("/list")
    public String board_list(){
        return "board/board_list";
    }
    @GetMapping("/write")
    public String board_write(){
        return "board/board_write";
    }
    @PostMapping("/write")
    public String save(@ModelAttribute BoardDto boardDto){
        System.out.println("boardDto"+boardDto);
    boardService.save(boardDto);
    return "redirect:/board_list";
    }
}//controller
