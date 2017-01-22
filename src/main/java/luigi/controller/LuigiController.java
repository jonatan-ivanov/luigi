package luigi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author Jonatan Ivanov
 */
@RestController
public class LuigiController {
    @RequestMapping(path = "/hello", method = GET, produces = TEXT_PLAIN_VALUE)
    public String hello() {
        return "Hello, I'm Luigi.";
    }
}
