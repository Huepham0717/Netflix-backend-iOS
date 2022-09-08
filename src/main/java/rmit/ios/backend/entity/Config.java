package rmit.ios.backend.entity;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

import rmit.ios.backend.repository.*;

// Create dummy data to the database
@Configuration
public class Config {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository, CastRepository castRepository,
            MovieRepository movieRepository, GenreRepository genreRepository) {
        return args -> {
            User user = new User("huepham1707");
            userRepository.saveAll(List.of(user));
            Cast cast = new Cast("Sofia Carson", "sofia-carson");
            // Marvel
            Cast cast1 = new Cast("Elizabeth Olsen", "elizabeth-olsen");
            Cast cast2 = new Cast("Elizabeth Lail", "elizabeth-lail");
            Cast cast3 = new Cast("Benedict Cumberbatch", "benedict-cumberbatch");
            Cast cast4 = new Cast("Daniel Radcliffe", "daniel-radcliffe");
            Cast cast5 = new Cast("Harry Style", "harry-style");
            Cast cast6 = new Cast("Chris Pine", "chris-pine");
            Cast cast7 = new Cast("Chris Evan", "chris-evan");
            Cast cast8 = new Cast("Chris Pratt", "chris-pratt");
            Cast cast9 = new Cast("Tom Holland", "tom-holland");
            Cast cast10 = new Cast("Tom Hiddleston", "tom-hiddleston");
            Cast cast11 = new Cast("Tom Hanks", "tom-hanks");
            Cast cast12 = new Cast("Robert Downey Jr", "robert-downey-jr");
            Cast cast13 = new Cast("Chadwick Boseman", "chadwick-boseman");
            Cast cast14 = new Cast("Gwyneth Paltrow", "gwyneth-paltrow");
            Cast cast15 = new Cast("Samuel L. Jackson", "samuel-l-jackson");
            Cast cast16 = new Cast("Mickey Rourke", "mickey-rourke");
            Cast cast17 = new Cast("Scarlett Johansson", "scarlett-johansson");
            Cast cast18 = new Cast("Don Cheadle", "don-cheadle");
            Cast cast19 = new Cast("Chris Hemsworth", "chris-hemsworth");
            Cast cast20 = new Cast("Natalie Portman", "natalie-portman");
            Cast cast21 = new Cast("Kat Dennings", "kat-dennings");

            // Other movie
            Cast cast22 = new Cast("Tom Cruise", "tom-cruise");
            Cast cast23 = new Cast("Dakota Johnson", "dakota-johnson");
            Cast cast24 = new Cast("Dwayne Johnson", "dwayne-johnson");
            Cast cast25 = new Cast("Emilia Clarke", "emilia-clarke");
            Cast cast26 = new Cast("Sylvester Stallone", "sylvester-stallone");
            Cast cast27 = new Cast("Jason Statham", "jason-staham");
            Cast cast28 = new Cast("Vin Diesel", "vin-diesel");
            Cast cast29 = new Cast("Bruce Willis", "bruce-willis");
            Cast cast30 = new Cast("William Atherton", "william atherton");
            Cast cast31 = new Cast("Reginald VelJohnson", "reginald-velJohnson");
            Cast cast32 = new Cast("Alan Rickman", "alan rickman");

            castRepository.saveAll(List.of(
                    cast, cast1, cast2, cast3, cast4, cast5, cast6, cast7, cast8, cast9,
                    cast10, cast11, cast12, cast13, cast14, cast15, cast16, cast17, cast18, cast19,
                    cast20, cast21, cast22, cast23, cast24, cast25, cast26, cast27, cast28, cast29,
                    cast30, cast31, cast32));

            Genre genre = new Genre("Drama");
            Genre genre1 = new Genre("Music");
            Genre genre2 = new Genre("Action");
            Genre genre3 = new Genre("Adventure");
            Genre genre4 = new Genre("Sitcom");
            Genre genre5 = new Genre("Sci-Fic");
            Genre genre6 = new Genre("Mystery");
            Genre genre7 = new Genre("Anime");
            Genre genre8 = new Genre("Thriller");
            Genre genre9 = new Genre("Fantasy");

            genreRepository.saveAll(List.of(
                    genre, genre1, genre2, genre3, genre4, genre5, genre6, genre7, genre8, genre9));

            // Category: Drama

            // Category: Music

            // Category: Action
            Movie movie = new Movie(
                    "Purple Hearts",
                    "July 29, 2022",
                    "Drama",
                    "WTLgg8oRSBE",
                    "purple-hearts",
                    6.7,
                    "In spite of their many differences, Cassie, a struggling singer-songwriter, and Luke, a troubled Marine, agree to marry solely for military benefits. But when tragedy strikes, the line between real and pretend begins to blur.",
                    "Elizabeth Allen Rosenbaum",
                    List.of(cast, cast1, cast3, cast4),
                    List.of(genre, genre1, genre2));

            Movie movie1 = new Movie(
                    "Die Hard",
                    "July 22, 1988",
                    "Action",
                    "QIOX44m8ktc",
                    "die-hard",
                    8.8,
                    "NYPD cop John McClane goes on a Christmas vacation to visit his wife Holly in Los Angeles where she works for the Nakatomi Corporation. While they are at the Nakatomi headquarters for a Christmas party, a group of robbers led by Hans Gruber take control of the building and hold everyone hostage, with the exception of John, while they plan to perform a lucrative heist.",
                    "John McTiernan",
                    List.of(cast31, cast30, cast32, cast23),
                    List.of(genre2, genre8));

            Movie movie2 = new Movie(
                    "Die Hard 2",
                    "July 2, 1990",
                    "Action",
                    "CvHp7xJZ4_U",
                    "die-hard-2",
                    7.1,
                    "After the terrifying events in LA, John McClane (Willis) is about to go through it all again. A team of terrorists, led by Col. Stuart (Sadler) is holding the entire airport hostage. The terrorists are planning to rescue a drug lord from justice. In order to do so, they have seized control of all electrical equipment affecting all planes. With no runway lights available, all aircraft have to remain in the air, with fuel running low, McClane will need to be fast.",
                    "Renny Harlin",
                    List.of(cast30, cast32, cast31, cast3, cast7),
                    List.of(genre2, genre8));

            Movie movie3 = new Movie(
                    "Die Hard 3",
                    "May 19, 1995",
                    "Action",
                    "_-EX4X13hYc",
                    "die-hard-3",
                    7.6,
                    "John McClane is now almost a full-blown alcoholic and is suspended from the NYPD. But when a bomb goes off in the Bonwit Teller Department Store the police go insane trying to figure out what's going on. Soon, a man named Simon calls and asks for McClane. Simon tells Inspector Walter Cobb that McClane is going to play a game called Simon. He says that McClane is going to do the tasks he assigns him.",
                    "John McTiernan",
                    List.of(cast29, cast31, cast30, cast26, cast25),
                    List.of(genre2, genre8));

            Movie movie4 = new Movie(
                    "Live Free or Die Hard",
                    "June 22, 2007",
                    "Action",
                    "8Jz-8UcCiws",
                    "live-free-or-die-hard",
                    8.8,
                    "When someone hacks into the computers at the FBI's Cyber Crime Division; the Director decides to round up all the hackers who could have done this. When he's told that because it's the 4th of July most of their agents are not around so they might have trouble getting people to get the hackers. So he instructs them to get local PD'S to take care of it. And one of the cops they ask is John McClane who is tasked with bringing a hacker named Farrell to the FBI. But as soon as he gets there someone starts shooting at them.",
                    "Len Wiseman",
                    List.of(cast29, cast31, cast27, cast30),
                    List.of(genre2, genre8));

            Movie movie5 = new Movie(
                    "Iron Man",
                    "May 16, 2008",
                    "Sci-Fic",
                    "8ugaeA-nMTc",
                    "iron-man-1",
                    7.9,
                    "When Tony Stark, an industrialist, is captured, he constructs a high-tech armoured suit to escape. Once he manages to escape, he decides to use his suit to fight against evil forces to save the world.",
                    "Jon Favreau",
                    List.of(cast12, cast14, cast13, cast6),
                    List.of(genre2, genre3, genre5));

            Movie movie6 = new Movie(
                    "Iron Man 2",
                    "May 7, 2010",
                    "Sci-Fic",
                    "BoohRoVA9WQ",
                    "iron-man-2",
                    7.9,
                    "Tony Stark is under pressure from various sources, including the government, to share his technology with the world. He must find a way to fight them while also tackling his other enemies.",
                    "Jon Favreau",
                    List.of(cast12, cast14, cast15, cast16),
                    List.of(genre2, genre3, genre5));

            Movie movie7 = new Movie(
                    "Iron Man 3",
                    "April 26, 2013",
                    "Sci-Fic",
                    "Ke1Y3P9D0Bc",
                    "iron-man-3",
                    7.1,
                    "Tony Stark encounters a formidable foe called the Mandarin. After failing to defeat his enemy, Tony embarks on a journey of self-discovery as he fights against the powerful Mandarin.",
                    "Jon Favreau",
                    List.of(cast12, cast14, cast15, cast16, cast17, cast18),
                    List.of(genre2, genre3, genre5));

            Movie movie8 = new Movie(
                    "Thor",
                    "April 29, 2011",
                    "Action",
                    "JOddp-nlNvQ",
                    "thor",
                    6.8,
                    "Thor is exiled by his father, Odin, the King of Asgard, to the Earth to live among mortals. When he lands on Earth, his trusted weapon Mjolnir is discovered and captured by S.H.I.E.L.D.",
                    "Kenneth Branagh",
                    List.of(cast19, cast10, cast20, cast21),
                    List.of(genre2, genre9, genre5));

            Movie movie9 = new Movie(
                    "Thor 2: Dark World",
                    "November 8, 2013",
                    "Action",
                    "npvJ9FTgZbM",
                    "thor-2",
                    6.8,
                    "Thor sets out on a journey to defeat Malekith, the leader of the Dark Elves when he returns to Asgard to retrieve a dangerous weapon and fulfill his desire of destroying the Nine Realms.",
                    "Alan Taylor",
                    List.of(cast12, cast14, cast15, cast16, cast17, cast18),
                    List.of(genre2, genre9, genre5));

            Movie movie10 = new Movie(
                    "Thor 3: Ragnarok",
                    "November 3, 2017",
                    "Action",
                    "ue80QwXMRHg",
                    "thor-3",
                    7.1,
                    "Deprived of his mighty hammer Mjolnir, Thor must escape the other side of the universe to save his home, Asgard, from Hela, the goddess of death.",
                    "Taika Waititi",
                    List.of(cast12, cast14, cast15, cast16, cast17, cast18),
                    List.of(genre2, genre9, genre5));

            Movie movie11 = new Movie(
                    "Thor 4: Thunder and Love",
                    "July 7, 2022",
                    "Action",
                    "Ke1Y3P9D0Bc",
                    "thor-4",
                    6.7,
                    "Thor: Love and Thunder is a 2022 American superhero film based on Marvel Comics featuring the character Thor, produced by Marvel Studios and distributed by Walt Disney Studios Motion Pictures. It is the sequel to Thor: Ragnarok and the 29th film in the Marvel Cinematic Universe.",
                    "Taika Waititi",
                    List.of(cast12, cast14, cast15, cast16, cast17, cast18),
                    List.of(genre2, genre9, genre5));

            // Category: Adventure

            movieRepository.saveAll(List.of(
                    movie, movie1, movie2, movie3, movie3, movie4, movie5, movie6, movie7, movie8, movie9,
                    movie10, movie11));
        };
    }
}
