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
			// Marvel movie casts
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

			// Action movie casts
			Cast cast22 = new Cast("Tom Cruise", "tom-cruise");
			Cast cast23 = new Cast("Dakota Johnson", "dakota-johnson");
			Cast cast24 = new Cast("Dwayne Johnson", "dwayne-johnson");
			Cast cast25 = new Cast("Emilia Clarke", "emilia-clarke");
			Cast cast26 = new Cast("Sylvester Stallone", "sylvester-stallone");
			Cast cast27 = new Cast("Jason Statham", "jason-staham");
			Cast cast28 = new Cast("Vin Diesel", "vin-diesel");
			Cast cast29 = new Cast("Bruce Willis", "bruce-willis");
			Cast cast30 = new Cast("William Atherton", "william-atherton");
			Cast cast31 = new Cast("Reginald VelJohnson", "reginald-velJohnson");
			Cast cast32 = new Cast("Alan Rickman", "alan-rickman");

			// Sci-Fic movie casts
			Cast cast33 = new Cast("Zachary Quinto", "zachary-quinto");
			Cast cast34 = new Cast("Zoe Saldana", "zoe-saldana");
			Cast cast35 = new Cast("Simon Pegg", "simon-pegg");
			Cast cast36 = new Cast("Bruce Greenwood", "bruce-greenwood");
			Cast cast37 = new Cast("Charlie Hunnam", "charlie-hunnam");
			Cast cast38 = new Cast("Rinko Kikuchi", "rinko-kikuchi");
			Cast cast39 = new Cast("Charlie Day", "charlie-day");
			Cast cast40 = new Cast("John Boyega", "john-boyega");
			Cast cast41 = new Cast("Scott Eastwood", "scott-eastwood");

			// Romance movie casts
			Cast cast42 = new Cast("Idris Elba", "idris-elba");
			Cast cast43 = new Cast("Tilda Swinton", "tilda-swinton");
			Cast cast44 = new Cast("Pia Thunderbolt", "pia-thunderbolt");
			Cast cast45 = new Cast("Leonardo DiCaprio", "leonardo-dicaprio");
			Cast cast46 = new Cast("Kate Winslet", "kate-winslet");
			Cast cast47 = new Cast("Billy Zane", "billy-zane");
			Cast cast48 = new Cast("Kathy Bates", "kathy-bates");
			Cast cast49 = new Cast("Joseph Gordon-Levitt", "joseph-gordon-levitt");
			Cast cast50 = new Cast("Zooey Deschanel", "zooey-deschanel");
			Cast cast51 = new Cast("Geoffrey Arend", "geoffrey-arend");
			Cast cast52 = new Cast("Jamie Dornan", "jamie-dornan");
			Cast cast53 = new Cast("Jennifer Ehle", "dennifer-ehle");
			Cast cast54 = new Cast("Eloise Mumford", "eloise-mumford");

			// TV Series casts
			Cast cast55 = new Cast("Emilia Clarke", "emilia-clarke");
			Cast cast56 = new Cast("Peter Dinklage", "peter-dinklage");
			Cast cast57 = new Cast("Lena Headey", "lena-headey");
			Cast cast58 = new Cast("Kit Harington", "kit-harington");
			Cast cast59 = new Cast("Sophie Turner", "sophie-turner");
			Cast cast60 = new Cast("Matt Smith", "matt-smith");
			Cast cast61 = new Cast("Paddy Considine", "paddy-considine");
			Cast cast62 = new Cast("Milly Alcock", "milly-alcock");
			Cast cast63 = new Cast("Henry Cavill", "henry-cavill");
			Cast cast64 = new Cast("Anya Chalotra", "anya-chalotra");
			Cast cast65 = new Cast("Freya Allan", "freya-allan");
			Cast cast66 = new Cast("Sophie Rundle", "sophie-rundle");
			Cast cast67 = new Cast("Paul Anderson", "paul-anderson");
			Cast cast68 = new Cast("Cillian Murphy", "cillian-murphy");
			Cast cast69 = new Cast("Helen McCrory", "helen-mcCrory");

			castRepository.saveAll(List.of(
					cast, cast1, cast2, cast3, cast4, cast5, cast6, cast7, cast8, cast9,
					cast10, cast11, cast12, cast13, cast14, cast15, cast16, cast17, cast18, cast19,
					cast20, cast21, cast22, cast23, cast24, cast25, cast26, cast27, cast28, cast29,
					cast30, cast31, cast32, cast33, cast34, cast35, cast36, cast37, cast38, cast39,
					cast40, cast41, cast42, cast43, cast44, cast45, cast46, cast47, cast48, cast49,
					cast50, cast51, cast52, cast53, cast54, cast55, cast56, cast57, cast58, cast59,
					cast60, cast61, cast62, cast63, cast64, cast65, cast66, cast67, cast68, cast69));

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
			Genre genre10 = new Genre("Romance");
			Genre genre11 = new Genre("Comedy");
			Genre genre12 = new Genre("Crime");

			genreRepository.saveAll(List.of(
					genre, genre1, genre2, genre3, genre4,
					genre5, genre6, genre7, genre8, genre9,
					genre10, genre11, genre12));

			// Category: Action
			Movie movie1 = new Movie(
					"Die Hard",
					"1988",
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
					"1990",
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
					"1995",
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
					"2007",
					"Action",
					"8Jz-8UcCiws",
					"live-free-or-die-hard",
					8.8,
					"When someone hacks into the computers at the FBI's Cyber Crime Division; the Director decides to round up all the hackers who could have done this. When he's told that because it's the 4th of July most of their agents are not around so they might have trouble getting people to get the hackers. So he instructs them to get local PD'S to take care of it. And one of the cops they ask is John McClane who is tasked with bringing a hacker named Farrell to the FBI. But as soon as he gets there someone starts shooting at them.",
					"Len Wiseman",
					List.of(cast29, cast31, cast27, cast30),
					List.of(genre2, genre8));

			Movie movie5 = new Movie(
					"Thor",
					"2011",
					"Action",
					"JOddp-nlNvQ",
					"thor",
					6.8,
					"Thor is exiled by his father, Odin, the King of Asgard, to the Earth to live among mortals. When he lands on Earth, his trusted weapon Mjolnir is discovered and captured by S.H.I.E.L.D.",
					"Kenneth Branagh",
					List.of(cast19, cast10, cast20, cast21),
					List.of(genre2, genre9, genre5));

			Movie movie6 = new Movie(
					"Thor 2: Dark World",
					"2013",
					"Action",
					"npvJ9FTgZbM",
					"thor-2",
					6.8,
					"Thor sets out on a journey to defeat Malekith, the leader of the Dark Elves when he returns to Asgard to retrieve a dangerous weapon and fulfill his desire of destroying the Nine Realms.",
					"Alan Taylor",
					List.of(cast12, cast14, cast15, cast16, cast17, cast18),
					List.of(genre2, genre9, genre5));

			Movie movie7 = new Movie(
					"Thor 3: Ragnarok",
					"2017",
					"Action",
					"ue80QwXMRHg",
					"thor-3",
					7.1,
					"Deprived of his mighty hammer Mjolnir, Thor must escape the other side of the universe to save his home, Asgard, from Hela, the goddess of death.",
					"Taika Waititi",
					List.of(cast12, cast14, cast15, cast16, cast17, cast18),
					List.of(genre2, genre9, genre5));

			Movie movie8 = new Movie(
					"Thor 4: Thunder and Love",
					"2022",
					"Action",
					"Ke1Y3P9D0Bc",
					"thor-4",
					6.7,
					"Thor: Love and Thunder is a 2022 American superhero film based on Marvel Comics featuring the character Thor, produced by Marvel Studios and distributed by Walt Disney Studios Motion Pictures. It is the sequel to Thor: Ragnarok and the 29th film in the Marvel Cinematic Universe.",
					"Taika Waititi",
					List.of(cast12, cast14, cast15, cast16, cast17, cast18),
					List.of(genre2, genre9, genre5));

			Movie movie9 = new Movie(
					"Iron Man",
					"2008",
					"Action",
					"8ugaeA-nMTc",
					"iron-man-1",
					7.9,
					"When Tony Stark, an industrialist, is captured, he constructs a high-tech armoured suit to escape. Once he manages to escape, he decides to use his suit to fight against evil forces to save the world.",
					"Jon Favreau",
					List.of(cast12, cast14, cast13, cast6),
					List.of(genre2, genre3, genre5));

			Movie movie10 = new Movie(
					"Iron Man 2",
					"2010",
					"Action",
					"BoohRoVA9WQ",
					"iron-man-2",
					7.9,
					"Tony Stark is under pressure from various sources, including the government, to share his technology with the world. He must find a way to fight them while also tackling his other enemies.",
					"Jon Favreau",
					List.of(cast12, cast14, cast15, cast16),
					List.of(genre2, genre3, genre5));

			Movie movie11 = new Movie(
					"Iron Man 3",
					"2013",
					"Action",
					"Ke1Y3P9D0Bc",
					"iron-man-3",
					7.1,
					"Tony Stark encounters a formidable foe called the Mandarin. After failing to defeat his enemy, Tony embarks on a journey of self-discovery as he fights against the powerful Mandarin.",
					"Jon Favreau",
					List.of(cast12, cast14, cast15, cast16, cast17, cast18),
					List.of(genre2, genre3, genre5));

			// Category: Sci-Fic
			Movie movie12 = new Movie(
					"Star Trek",
					"2009",
					"Sci-Fic",
					"pKFUZ10Wmbw",
					"star-trek",
					7.9,
					"The brash James T. Kirk tries to live up to his father's legacy with Mr. Spock keeping him in check as a vengeful Romulan from the future creates black holes to destroy the Federation one planet at a time.",
					"J.J. Abrams",
					List.of(cast6, cast33, cast34, cast35, cast36),
					List.of(genre5, genre3, genre2));

			Movie movie13 = new Movie(
					"Star Trek 2: Into Darkness",
					"2013",
					"Sci-Fic",
					"QAEkuVgt6Aw",
					"star-trek-2",
					7.7,
					"After the crew of the Enterprise find an unstoppable force of terror from within their own organization, Captain Kirk leads a manhunt to a war-zone world to capture a one-man weapon of mass destruction.",
					"J.J. Abrams",
					List.of(cast6, cast34, cast33, cast36, cast35),
					List.of(genre5, genre3, genre2));

			Movie movie14 = new Movie(
					"Star Trek 3: Beyond",
					"2018",
					"Sci-Fic",
					"dCyv5xKIqlw",
					"star-trek-3",
					7.0,
					"The crew of the USS Enterprise explores the furthest reaches of uncharted space, where they encounter a new ruthless enemy, who puts them, and everything the Federation stands for, to the test.",
					"Justin Lin",
					List.of(cast6, cast33, cast35, cast33, cast32),
					List.of(genre5, genre3, genre2));

			Movie movie15 = new Movie(
					"Pacific Rim",
					"2013",
					"Sci-Fic",
					"5guMumPFBag",
					"pacific-rim",
					6.9,
					"As a war between humankind and monstrous sea creatures wages on, a former pilot and a trainee are paired up to drive a seemingly obsolete special weapon in a desperate effort to save the world from the apocalypse.",
					"Guillermo del Toro",
					List.of(cast40, cast37, cast38, cast39),
					List.of(genre5, genre2, genre3));

			Movie movie16 = new Movie(
					"Pacific Rim: Uprising",
					"2018",
					"Sci-Fic",
					"8BAhwgjMvnM",
					"pacfic-rim-uprising",
					5.6,
					"Jake Pentecost, son of Stacker Pentecost, reunites with Mako Mori to lead a new generation of Jaeger pilots, including rival Lambert and 15-year-old hacker Amara, against a new Kaiju threat.",
					"Steven S. DeKnight",
					List.of(cast41, cast40, cast38, cast37),
					List.of(genre5, genre2, genre3));

			// Category: Romance
			Movie movie17 = new Movie(
					"Three Thousand Years of Longing",
					"2022",
					"Romance",
					"TWGvntl9itE",
					"three-thousand-years-of-longing",
					6.9,
					"Three Thousand Years of Longing is a 2022 fantasy romantic drama film directed by George Miller and starring Tilda Swinton and Idris Elba. Miller wrote the screenplay with Augusta Gore, adapting the 1994 short story The Djinn in the Nightingale's Eye",
					"George Miller",
					List.of(cast33, cast34, cast35, cast18, cast20, cast28),
					List.of(genre10, genre9, genre));

			Movie movie18 = new Movie(
					"Titanic",
					"2002",
					"Romance",
					"3gK_2XdjOdY",
					"titanic",
					7.9,
					"Seventeen-year-old Rose hails from an aristocratic family and is set to be married. When she boards the Titanic, she meets Jack Dawson, an artist, and falls in love with him.",
					"Jame Cameron",
					List.of(cast36, cast37, cast38, cast39),
					List.of(genre10, genre));

			Movie movie19 = new Movie(
					"500 Days of Summer",
					"2009",
					"Romance",
					"PsD0NpFSADM",
					"365-days-of-summer",
					7.7,
					"After being dumped by the girl he believes to be his soulmate, hopeless romantic Tom Hansen reflects on their relationship to try and figure out where things went wrong and how he can win her back.",
					"Marc Webb",
					List.of(cast49, cast50, cast51, cast47),
					List.of(genre10, genre11, genre));

			Movie movie = new Movie(
					"Purple Hearts",
					"2022",
					"Romance",
					"WTLgg8oRSBE",
					"purple-hearts",
					6.7,
					"In spite of their many differences, Cassie, a struggling singer-songwriter, and Luke, a troubled Marine, agree to marry solely for military benefits. But when tragedy strikes, the line between real and pretend begins to blur.",
					"Elizabeth Allen Rosenbaum",
					List.of(cast, cast1, cast3, cast4),
					List.of(genre, genre1, genre2));

			Movie movie20 = new Movie(
					"Fifty Shades of Grey",
					"2015",
					"Romance",
					"SfZWFDs0LxA",
					"fifty-shades-of-grey",
					4.1,
					"Literature student Anastasia Steele's life changes forever when she meets handsome, yet tormented, billionaire Christian Grey.",
					"Sam Taylor-Johnson",
					List.of(cast23, cast52, cast53, cast54),
					List.of(genre10, genre, genre8));

			Movie movie21 = new Movie(
					"Fifty Shades Daker",
					"2017",
					"Romance",
					"n6BVyk7hty8",
					"fifty-shades-darker",
					4.5,
					"While Christian wrestles with his inner demons, Anastasia must confront the anger and envy of the women who came before her.",
					"James Foley",
					List.of(cast23, cast52, cast54, cast44),
					List.of(genre10, genre, genre8));

			Movie movie22 = new Movie(
					"Fifty Shades Freed",
					"2018",
					"Romance",
					"av4zbG8dAhk",
					"fifty-shades-freed",
					4.5,
					"Anastasia and Christian get married, but Jack Hyde continues to threaten their relationship.",
					"James Foley",
					List.of(cast23, cast52, cast54, cast44),
					List.of(genre10, genre, genre8));

			// Category: TV Series
			Movie movie23 = new Movie(
					"House of The Dragon",
					"2022",
					"TV Series",
					"DotnJ7tTA34",
					"house-of-the-dragon",
					8.8,
					"House of the Dragon tells the story of an internal succession war within House Targaryen at the height of its power, 172 years before the birth of Daenerys Targaryen.",
					"Ryan J. Condal",
					List.of(cast60, cast61, cast62),
					List.of(genre2, genre3, genre));

			Movie movie24 = new Movie(
					"The Witcher",
					"2019",
					"TV Series",
					"ndl1W4ltcmg",
					"the-witcher",
					8.2,
					"Geralt of Rivia, a solitary monster hunter, struggles to find his place in a world where people often prove more wicked than beasts.",
					"David Benioff",
					List.of(cast63, cast64, cast65),
					List.of(genre2, genre3, genre));

			Movie movie25 = new Movie(
					"Game of Thrones",
					"2011",
					"TV Series",
					"gcTkNV5Vg1E",
					"game-of-thrones",
					9.2,
					"Nine noble families fight for control over the lands of Westeros, while an ancient enemy returns after being dormant for millennia.",
					"David Benioff",
					List.of(cast55, cast56, cast57, cast58, cast59),
					List.of(genre, genre2, genre3));

			Movie movie26 = new Movie(
					"Peaky Blinders",
					"2013",
					"TV Series",
					"Ruyl8_PT_y8",
					"peaky-blinders",
					8.8,
					"A gangster family epic set in 1900s England, centering on a gang who sew razor blades in the peaks of their caps, and their fierce boss Tommy Shelby.",
					"Steven Knight",
					List.of(cast66, cast67, cast68, cast69),
					List.of(genre, genre12));

			movieRepository.saveAll(List.of(
					movie, movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9,
					movie10, movie11, movie12, movie13, movie14, movie15, movie16, movie17, movie18, movie19,
					movie20, movie21, movie22, movie23, movie24, movie25, movie26));
		};
	}
}
