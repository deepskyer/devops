package io.github.deepskyer.devops;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class Controller {

    @RequestMapping("/")
    @ResponseBody
    public ResponseEntity<Map<String, String>> gethome(){
        Map<String, String> msg = new LinkedHashMap<>();
        msg.put("test", "1");

        return new ResponseEntity<>(msg, HttpStatus.OK);
    }
}
