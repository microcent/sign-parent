package cn.com.codeele.sign.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_terminal")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Terminal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String mac;

    @Column
    private String ip;

    @Column(name = "create_time")
    private long createTime;

}