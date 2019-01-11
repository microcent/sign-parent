package cn.com.codeele.sign.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum Unit {

    /**
     * 无
     */
    NONE("NNN", UnitType.NONE, 1),
    /**
     * 毫秒
     */
    MILLISECOND("TMS", UnitType.TIME, 1),
    /**
     * 秒
     */
    SECOND("TSC", UnitType.TIME, 1000),
    /**
     * 分钟
     */
    MINUTE("TMN", UnitType.TIME, 1000 * 60),
    /**
     * 小时
     */
    HOUR("THR", UnitType.TIME, 1000 * 60 * 60),
    /**
     * 天
     */
    DAY("TDY", UnitType.TIME, 1000 * 60 * 60 * 24),

    /**
     * 克
     */
    GRAM("WGR", UnitType.WEIGHT, 1),
    /**
     * 千克
     */
    KILOGRAM("WKG", UnitType.WEIGHT, 1000),
    /**
     * 吨
     */
    TON("WTN", UnitType.WEIGHT, 1000 * 1000),

    /**
     * 个
     */
    AN("QAN", UnitType.QUANTITY, 1),
    /**
     * 千
     */
    THOUSAND("QTH", UnitType.QUANTITY, 1000),
    /**
     * 万
     */
    TEN_THOUSAND("QTT", UnitType.QUANTITY, 10000),
    /**
     * 百万
     */
    MILLION("QML", UnitType.QUANTITY, 1000 * 1000),
    /**
     * 亿
     */
    HUNDRED_MILLION("QHM", UnitType.QUANTITY, 10000 * 10000),
    /**
     * 十亿
     */
    BILLION("QBL", UnitType.QUANTITY, 1000 * 1000 * 1000);

    /**
     * 单位值
     */
    private String value;

    /**
     * 单位类型
     */
    private UnitType type;
    /**
     * 相对于基准单位的倍数
     */
    private int multiple;

    public static final Unit of(String value) {
        Objects.requireNonNull(value, "value can not be null");

        for (Unit element : Unit.values()) {
            if (element.value.equals(value)) {
                return element;
            }
        }

        return Unit.AN;
    }

}
