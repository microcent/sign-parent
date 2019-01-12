package cn.com.codeele.sign.service;

import cn.com.codeele.sign.domain.Admin;
import cn.com.codeele.sign.domain.Terminal;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AdminService {

    Page<Admin> findAll(Pageable pageable);

    Admin login(String username, String password);

}
