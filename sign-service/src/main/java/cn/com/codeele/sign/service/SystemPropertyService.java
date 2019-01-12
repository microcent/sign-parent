package cn.com.codeele.sign.service;

import cn.com.codeele.sign.domain.SystemProperty;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SystemPropertyService {

    Page<SystemProperty> findAll(Pageable pageable);

}
