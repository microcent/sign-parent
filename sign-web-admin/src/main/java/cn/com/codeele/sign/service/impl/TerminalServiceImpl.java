package cn.com.codeele.sign.service.impl;

import cn.com.codeele.sign.domain.SystemProperty;
import cn.com.codeele.sign.domain.Terminal;
import cn.com.codeele.sign.repository.SystemPropertyRepository;
import cn.com.codeele.sign.repository.TerminalRepository;
import cn.com.codeele.sign.service.TerminalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class TerminalServiceImpl implements TerminalService {

    @Autowired
    private TerminalRepository terminalRepository;

    @Autowired
    private SystemPropertyRepository systemPropertyRepository;

    @Override
    public Map<String, Integer> find(String mac) {
        List<SystemProperty> systemProperties = this.systemPropertyRepository.findAll();
        Map<String,Integer> map = systemProperties.stream().collect(Collectors.toMap(m -> m.getPropertyKey(),v -> Integer.parseInt(v.getValue())));
        return map;
    }

    @Override
    public Page<Terminal> findAll(Pageable pageable) {
        return this.terminalRepository.findAll(pageable);
    }
}
