package tacos.design.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class Taco {

    @NotNull
    private Long id;

    @NonNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;

    @Size(min = 1, message = "You must select at least 1 ingredient")
    private List<Ingredient> ingredients = new ArrayList<>();

    private Date createdAt;
}
