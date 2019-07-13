package in.git.controller;


import lombok.RequiredArgsConstructor;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping("/v1/git")
public class GitIntegrationController {

    @GetMapping("/test")
    public String test() {
        return "Welcome Manish";
    }

    @PostMapping("/gitpush")
    public ResponseEntity createSurvey(@RequestBody String gitLog) {
        try {

            return new ResponseEntity<>(gitLog, HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(e.getMessage());
        }


    }


}
