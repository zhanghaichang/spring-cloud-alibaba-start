package alibaba.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RefreshScope
public class TestController {

    @Value("${didispace.title:}")
    private String title;

    @RequestMapping(value = "/config", method = RequestMethod.GET)
    public String config() {
        log.info("config =" + title);
        return "hello, " + title;
    }

}
