package com.p.Project.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequiredArgsConstructor
@Log4j2
//context mapping(/board)
// board 하위에 오는 모든 요청은 이 컨트롤러를 잡습니다.
public class SiteController {


    //이번엔 각 컨텍스트 하위의 요청마다 처리해줄 요청 매핑을 선언 해야합니다.
    //기본적으로 get 은 @Get...Post-->@Post...
    @GetMapping("index")
    public void index() {
        System.out.println("인덱스 진짜 왜안됑!!!!!!");
    }

    @GetMapping("loginPage")
    public void register() {
        log.info("신규 글 등록 폼");
        System.out.println("젭라");
        
    }

//    @PostMapping("/login")
//    public void login{
//        System.out.println("포스트 매핑 로그인 부분");
//        return "redirect:/practice/indexMain";
//    }



}
