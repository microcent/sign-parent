package cn.com.codeele.sign.controller;

import cn.com.codeele.sign.domain.Terminal;
import cn.com.codeele.sign.entity.Response;
import cn.com.codeele.sign.service.TerminalService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/terminal")
@Api(value = "终端模块", description = "终端模块")
public class TerminalController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TerminalController.class);

    @Autowired
    private TerminalService terminalService;

    @ApiOperation(value = "获取终端列表", notes = "")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Response list(@RequestParam(name = "page", required = false, defaultValue = "1") int page,
                         @RequestParam(name = "size", required = false, defaultValue = "20") int size) {
        Pageable pageable = PageRequest.of(page - 1, size, Sort.Direction.ASC, "id");
        Page<Terminal> list = this.terminalService.findAll(pageable);
        Map<String, Object> map = new HashMap<>();
        map.put("list", list.getContent());
        map.put("total", list.getTotalElements());
        return Response.success(map);
    }

}
