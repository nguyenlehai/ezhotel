package com.cyan.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: Naichuan Zhang
 * @create: 02-Nov-2019
 **/

@Controller
public class RoomController {

    @GetMapping(value = "/room")
    public String room() {
        return "room";
    }
}