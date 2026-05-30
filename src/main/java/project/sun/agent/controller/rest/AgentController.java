package project.sun.agent.controller.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/agent")
@RequiredArgsConstructor
public class AgentController {

    @GetMapping("/hello")
    public ResponseEntity<String> helloFromAgent(@RequestParam(required = false) String name) {
        return ResponseEntity.ok("Hello "+name+" from agent!");
    }

}