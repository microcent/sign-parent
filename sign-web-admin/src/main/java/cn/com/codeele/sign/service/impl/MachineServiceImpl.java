package cn.com.codeele.sign.service.impl;

import cn.com.codeele.sign.domain.Machine;
import cn.com.codeele.sign.repository.MachineRepository;
import cn.com.codeele.sign.service.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MachineServiceImpl implements MachineService {

    @Autowired
    private MachineRepository repository;

    @Override
    public List<Machine> findAll() {
        return this.repository.findAll();
    }

}
