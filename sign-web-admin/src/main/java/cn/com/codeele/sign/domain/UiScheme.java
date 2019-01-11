package cn.com.codeele.sign.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_ui_scheme")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UiScheme implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "terminal_id")
    private int terminalId;

    @Column(name = "header_url")
    private String headerUrl;

    @Column(name = "footer_url")
    private String footerUrl;

    @Column(name = "ad_urls")
    private String adUrls;

    @Column(name = "update_time")
    private long updateTime;

}