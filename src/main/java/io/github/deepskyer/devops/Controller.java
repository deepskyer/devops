package io.github.deepskyer.devops;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    @ResponseBody
    public ResponseEntity<?> gethome(){
        return new ResponseEntity<>("Hello World from github", HttpStatus.OK);
    }
}
