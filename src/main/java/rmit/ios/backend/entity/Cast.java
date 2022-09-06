package rmit.ios.backend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
@Table(name = "casts",uniqueConstraints={@UniqueConstraint(columnNames ={"castId"})})
public class Cast {
    @SequenceGenerator(
            name = "cast_sequence",
            sequenceName = "cast_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "cast_sequence"
    )
    private Long castId;
    private String castName;
    @JsonIgnore
    @ManyToMany(mappedBy = "castList")
    private List<Movie> movieList = new ArrayList<>();

    public Cast(String castName) {
        this.castName = castName;
    }
}
