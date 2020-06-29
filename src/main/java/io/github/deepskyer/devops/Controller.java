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
        return new ResponseEntity<>("git commit #triggers CI build\n" +
                "docker build yourimage\n" +
                "docker push yourimage\n" +
                "sed -i 's/{{TAG}}/' deployment.yml\n" +
                "kubectl apply -f deployment.yml", HttpStatus.OK);
    }
}
