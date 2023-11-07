/*
package com.example.Movie_Rank.mycgv.Controller;


import com.example.Movie_Rank.mycgv.dto.BoardDto;
import com.example.Movie_Rank.mycgv.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.awt.print.Pageable;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/paging")
    public String paging(@PageableDefault(page = 1) Pageable pageable, Model model){
        //페이징 처리 데이터 가져가기 위해 모델객체 사용
        Page<BoardDto> boardList  = boardService.paging(pageable);

    }

    @PostMapping("/board_update")
    public String update(@ModelAttribute BoardDto boardDto, Model model){
        BoardDto board = boardService.update(boardDto);
        model.addAttribute("board", board);
        return "redirect:/board_content/" + boardDto.getId();
    }

    @GetMapping("/board_update/{id}")
    public String updateForm(@PathVariable Long id , Model model){
        BoardDto boardDto = boardService.findById(id);
        model.addAttribute("boardUpdate", boardDto);
        return "board/board_update";
    }
    @GetMapping("/board_content/{id}")
    public String findById(@PathVariable Long id, Model model){
        //게시글 조회수 올리고 게시글 데이터 가져와서 detail.html에 출력
        boardService.updateHits(id);
        BoardDto boardDto = boardService.findById(id);
        model.addAttribute("board", boardDto);
        return "board/board_content";


    }
    @GetMapping("/board/list")
    public String board_list(Model model){
    //DB에서 전체 게시글 데이터를 가져와서 list.html에 보여준다
    List<BoardDto> boardDtoList = boardService.findAll();
    model.addAttribute("boardList", boardDtoList);
        return "board/board_list";
    }
    @GetMapping("/board/write")
    public String board_write(){
        return "board/board_write";
    }
    @PostMapping("/board/write")
    public String save(@ModelAttribute BoardDto boardDto){
    boardService.save(boardDto);

    return "redirect:/board/list";
    }
    //입력해서 보내면 컨트롤러로 받을 때 클래스 객체를 찾아서 name 끼리 매핑해서  setter호출해서 담아서 dto 세팅
}//controller
*/
