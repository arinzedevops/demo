/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BLADE
 */
@RestController
@RequestMapping("/demo")
public class DemoResource {
    
        @RequestMapping(path = "/test", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<String> subscribe() {
        System.out.println("Testing");
        return ResponseEntity.ok("Testing Azure DevOps");
    }
}
