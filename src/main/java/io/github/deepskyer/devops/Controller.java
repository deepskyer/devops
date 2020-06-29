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
        return new ResponseEntity<>("From intellij to github. Jenkins build docker image, push to the hub. K8s pull the image, deploy it using ingress.", HttpStatus.OK);
    }
}
