package cn.com.codeele.sign.repository;

import cn.com.codeele.sign.domain.Terminal;
import cn.com.codeele.sign.domain.UiScheme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UiSchemeRepository extends JpaRepository<UiScheme, Integer> {
}
