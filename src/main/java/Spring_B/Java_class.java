package Spring_B;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Java_class {

    @Value("${app.example.integer-value}")
    private Integer valueInteger;

    @Value("${app.example.decimal-value}")
    private Double valueDouble;

    @Value("${app.example.boolean-value}")
    private Boolean valueBoolean;

    // Getters (and optionally setters)
    public Integer getValueInteger() {
        return valueInteger;
    }

    public Double getValueDouble() {
        return valueDouble;
    }

    public Boolean getValueBoolean() {
        return valueBoolean;
    }
}
