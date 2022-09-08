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
@Table(name = "saveList")
public class SaveList {
    @SequenceGenerator(
            name = "saveList_sequence",
            sequenceName = "saveList_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "saveList_sequence"
    )
    private Long saveListId;
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(nullable = false,name = "movieId")
    private Movie movie;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(nullable = false,name = "userId")
    private User user;

    public SaveList(Movie movie, User user) {
        this.movie = movie;
        this.user = user;
    }
}

