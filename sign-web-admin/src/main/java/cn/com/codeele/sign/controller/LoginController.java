package cn.com.codeele.sign.controller;

import cn.com.codeele.sign.domain.Admin;
import cn.com.codeele.sign.entity.LoginModel;
import cn.com.codeele.sign.entity.Response;
import cn.com.codeele.sign.service.AdminService;
import cn.com.codeele.sign.service.TerminalService;
import com.google.common.collect.Lists;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/user")
@Api(value = "用户模块", description = "用户模块")
public class LoginController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private TerminalService terminalService;

    @Autowired
    private AdminService adminService;

    @ApiOperation(value = "用户登录", notes = "")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Response login(@RequestBody LoginModel model) {
        try {
            Admin admin = this.adminService.login(model.getUsername(), model.getPassword());
        }catch (Exception e){
            e.printStackTrace();
        }
        Admin admin = this.adminService.login(model.getUsername(), model.getPassword());
        return Response.success(new HashMap<String, Object>() {{
            put("username", admin.getUsername());
            put("nickname", admin.getNickname());
            put("avatar", admin.getAvatar());
            put("roles", Lists.newArrayList("admin"));
            put("token", "TOKEN");
        }});
    }

    @ApiOperation(value = "用户登出", notes = "")
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public Response logout() {
        return Response.success();
    }

    @ApiOperation(value = "用户信息", notes = "")
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public Response info() {
        return Response.success(new HashMap<String, Object>() {{
            put("username", "superadmin");
            put("nickname", "超级管理员");
            put("avatar", "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
            put("roles", Lists.newArrayList("admin"));
            put("token", "TOKEN");
        }});
    }

}
