package cn.com.codeele.sign.domain;

import cn.com.codeele.sign.enums.Unit;
import cn.com.codeele.sign.enums.UnitConverter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_system_property")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SystemProperty implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "property_key")
    private String propertyKey;

    @Column
    private String caption;

    @Column
    private String value;

    @Column
    @Convert(converter = UnitConverter.class)
    private Unit unit;

}