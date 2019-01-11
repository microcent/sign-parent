package cn.com.codeele.sign.repository;

import cn.com.codeele.sign.domain.SystemProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemPropertyRepository extends JpaRepository<SystemProperty, String> {
}
