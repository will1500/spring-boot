package com.apple.norman;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class NormanController {

 	@GetMapping("/")

 	public String Hello() {

 		return "Greetings from Norman!";

 	}
    @GetMapping("/norman")

 	public String Hi() {

 		return "Greetings from Norman!";

 	}
 }
    

