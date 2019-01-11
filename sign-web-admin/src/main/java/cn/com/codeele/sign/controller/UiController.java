package cn.com.codeele.sign.controller;

import cn.com.codeele.sign.service.TerminalService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/ui")
@Api(value = "UI模块", description = "UI模块")
public class UiController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UiController.class);

    @Autowired
    private TerminalService terminalService;

    @ApiOperation(value = "获取UI配置", notes = "")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<?> index() {
        Map<String,Integer> map=  this.terminalService.find("");
        return ResponseEntity.ok(map);
    }

}
