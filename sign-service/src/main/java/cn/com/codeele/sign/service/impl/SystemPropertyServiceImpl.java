package cn.com.codeele.sign.service.impl;

import cn.com.codeele.sign.domain.SystemProperty;
import cn.com.codeele.sign.domain.Terminal;
import cn.com.codeele.sign.repository.SystemPropertyRepository;
import cn.com.codeele.sign.repository.TerminalRepository;
import cn.com.codeele.sign.service.SystemPropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class SystemPropertyServiceImpl implements SystemPropertyService {

    @Autowired
    private SystemPropertyRepository repository;

    @Override
    public Page<SystemProperty> findAll(Pageable pageable) {
        return this.repository.findAll(pageable);
    }
}
