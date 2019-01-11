package cn.com.codeele.sign.service.impl;

import cn.com.codeele.sign.repository.AdminRepository;
import cn.com.codeele.sign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository repository;

}
