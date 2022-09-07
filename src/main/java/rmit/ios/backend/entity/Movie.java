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
@Table(name = "movie",uniqueConstraints={@UniqueConstraint(columnNames ={"movieId"})})
public class Movie {
    @SequenceGenerator(
            name = "movie_sequence",
            sequenceName = "movie_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "movie_sequence"
    )
    private Long movieId;
    private String title;
    private String publishedDate;
    private String categories;
    private String youtubeID;
    private String imageName;
    private double rating;
    private String description;
    private String creator;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "Movie_Casts",
            joinColumns = { @JoinColumn(name = "movie_id") },
            inverseJoinColumns = { @JoinColumn(name = "cast_id")}
    )
    private List<Cast> castList;

    @ManyToMany()
    @JoinTable(
            name = "Movie_Gener",
            joinColumns = { @JoinColumn(name = "movie_id") },
            inverseJoinColumns = { @JoinColumn(name = "gener_id")}
    )
    private List<Genre> genreList;

    @JsonIgnore
    @ManyToMany(mappedBy = "movieList")
    private List<User> userList = new ArrayList<>();

    public Movie(String title, String publishedDate, String categories, String youtubeID, String imageName, double rating, String description, String creator, List<Cast> castList, List<Genre> genreList) {
        this.title = title;
        this.publishedDate = publishedDate;
        this.categories = categories;
        this.youtubeID = youtubeID;
        this.imageName = imageName;
        this.rating = rating;
        this.description = description;
        this.creator = creator;
        this.castList = castList;
        this.genreList = genreList;
    }
}
