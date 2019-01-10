package cn.com.codeele.sign.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_machine")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Machine implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "mac")
    private String mac;

    @Column(name = "ip")
    private String ip;

    @Column(name = "create_time")
    private long createTime;

}