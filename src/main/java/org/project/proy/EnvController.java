package org.project.proy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvController {
    @Autowired
    private Environment env;
    @GetMapping("/env")
    public String env()
    {
        return "I am on env"+env.getActiveProfiles()[0];
    }
}
