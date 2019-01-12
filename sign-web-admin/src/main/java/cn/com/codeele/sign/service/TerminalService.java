package cn.com.codeele.sign.service;

import cn.com.codeele.sign.domain.Terminal;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Map;

public interface TerminalService {

    Map<String, Integer> find(String mac);

    Page<Terminal> findAll(Pageable pageable);

}
