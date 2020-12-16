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
        msg.put("Step0", "get all requirements running, including webhook");
        msg.put("Step1", "git commit triggers CI build");
        msg.put("Step2", "docker build your image");
        msg.put("Step3", "docker push your image to a hub");
        msg.put("Step4", "kubectl create deployment, service and ingress.");
        msg.put("Step5", "kubectl apply -f deployment.yml");
        msg.put("update Step1", "git commit change and build a new docker image");
        msg.put("update Step2", "change to the new docker image version");
        msg.put("update Step3", "kubectl apply -f deployment.yml");

        return new ResponseEntity<>(msg, HttpStatus.OK);
    }
}
