package cn.com.codeele.sign.service.impl;

import cn.com.codeele.sign.domain.Admin;
import cn.com.codeele.sign.repository.AdminRepository;
import cn.com.codeele.sign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository repository;

    @Override
    public Page<Admin> findAll(Pageable pageable) {
        return this.repository.findAll(pageable);
    }

    @Override
    public Admin login(String username, String password) {
        Admin admin = this.repository.findByUsername(username);
        return admin;
    }
}
