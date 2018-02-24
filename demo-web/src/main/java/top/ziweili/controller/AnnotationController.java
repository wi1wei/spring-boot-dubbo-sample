package top.ziweili.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.ziweili.service.AnnotationService;

@RestController
public class AnnotationController {

    @Reference(version = "1.0.0",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:12345")
    private AnnotationService service;

    @GetMapping("/")
    public String main() {
        return service.say("haha");
    }
}
