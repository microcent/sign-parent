package cn.com.codeele.sign.repository;

import cn.com.codeele.sign.domain.Terminal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerminalRepository extends JpaRepository<Terminal, Integer> {
}
