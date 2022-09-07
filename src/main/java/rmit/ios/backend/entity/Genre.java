package rmit.ios.backend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
@Table(name = "genre",uniqueConstraints={@UniqueConstraint(columnNames ={"genreId"})})
public class Genre {
    @SequenceGenerator(
            name = "genre_sequence",
            sequenceName = "genre_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "genre_sequence"
    )
    private Long genreId;
    private String genreName;
    @JsonIgnore
    @ManyToMany(mappedBy = "genreList")
    private List<Movie> movieList = new ArrayList<>();

    public Genre(String genreName) {
        this.genreName = genreName;
    }
}
