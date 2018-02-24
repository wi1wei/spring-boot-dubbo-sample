package top.ziweili.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import top.ziweili.service.AnnotationService;

@Service(
        version = "1.0.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class AnnotationServiceImpl implements AnnotationService {

    @Override
    public String say(String str) {
        return "say:" + str;
    }
}
