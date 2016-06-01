package com.eomdev.demo.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by eomdev on 2016. 6. 1..
 */
@RestController
public class GatewayController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity welcome(){
        return new ResponseEntity("Welcome. GATEWAY SERVER.", HttpStatus.OK);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public ResponseEntity adminCreate(){
        // TODO: 새로운 ADMIN을 등록하는 내용을 추가한다
        return new ResponseEntity("success.", HttpStatus.OK);
    }


}
