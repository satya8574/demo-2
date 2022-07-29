package com.tmz.websocketcore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "websocketcore")
public class DummyController {
	 @GetMapping(path = "message")
	    public String ping(){
	        return "Welcome to websocket core.";
	    }
}

