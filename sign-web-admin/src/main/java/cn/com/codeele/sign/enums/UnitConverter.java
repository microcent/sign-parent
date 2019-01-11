package cn.com.codeele.sign.enums;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class UnitConverter implements AttributeConverter<Unit,String> {

    @Override
    public String convertToDatabaseColumn(Unit unit) {
        return unit.getValue();
    }

    @Override
    public Unit convertToEntityAttribute(String s) {
        return Unit.of(s);
    }
}
