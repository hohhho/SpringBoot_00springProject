package com.myproject.springProject.member.controller;

import com.myproject.springProject.member.request.MemberRegisterRequest;
import com.myproject.springProject.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/signup")
    public String signUp(@RequestBody MemberRegisterRequest request){
        return memberService.signUp(request);
    }
}
