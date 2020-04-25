package tacos.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
@Component
@ConfigurationProperties(prefix = "taco.orders")
public class OrderProps {

    @Min(value = 5, message = "Value must be greater than 5")
    @Max(value = 20, message = "Value must be smaller than 25")
    private int pageSize = 20;
}
