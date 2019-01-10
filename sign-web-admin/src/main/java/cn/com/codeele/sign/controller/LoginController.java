package cn.com.codeele.sign.controller;

import cn.com.codeele.sign.service.MachineService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(value = "用户模块", description = "用户模块")
public class LoginController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private MachineService machineService;

    @ApiOperation(value = "用户登录", notes = "")
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ResponseEntity<?> login() {
        return ResponseEntity.ok(this.machineService.findAll());
    }

}
