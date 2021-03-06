package zh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import zh.service.ContentService;
import zh.service.PointService;

/**
 * Created: OCEAN on 2017/7/18
 * Email: oceanstation@163.com
 * Description: 代码控制层的逻辑，每个方法对应前端一个请求
 */
@Controller
@RequestMapping("/api")
public class ApiController {
    // 海量点数据请求
    @Autowired
    @Qualifier("pointService")
    private PointService pointService;

    @RequestMapping(value = "/position", method = RequestMethod.GET, produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String getPoint(int startTime, int endTime, int type) {
        return pointService.getPoints(startTime, endTime, type);
    }

    // 短信内容数据请求
    @Autowired
    @Qualifier("contentService")
    private ContentService contentService;

    @RequestMapping(value = "/content", method = RequestMethod.GET, produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String getContent(int startTime, int endTime, String phone, int type) {
        return contentService.getContents(startTime, endTime, phone, type);
    }
}
