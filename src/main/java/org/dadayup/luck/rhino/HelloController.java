package org.dadayup.luck.rhino;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cook on 2020/4/17
 */
@RestController
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    public String hello(@RequestParam(value = "username", required = false, defaultValue = "world") String username) {
        return "Hello, " + username + "!";
    }

}
