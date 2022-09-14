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
			Cast cast31 = new Cast("Reginald VelJohnson", "reginald-veljohnson");
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
			// Cast cast55 = new Cast("Emilia Clarke", "emilia-clarke");
			Cast cast55 = new Cast("Peter Dinklage", "peter-dinklage");
			Cast cast56 = new Cast("Lena Headey", "lena-headey");
			Cast cast57 = new Cast("Kit Harington", "kit-harington");
			Cast cast58 = new Cast("Sophie Turner", "sophie-turner");
			Cast cast59 = new Cast("Matt Smith", "matt-smith");
			Cast cast60 = new Cast("Paddy Considine", "paddy-considine");
			Cast cast61 = new Cast("Milly Alcock", "milly-alcock");
			Cast cast62 = new Cast("Henry Cavill", "henry-cavill");
			Cast cast63 = new Cast("Anya Chalotra", "anya-chalotra");
			Cast cast64 = new Cast("Freya Allan", "freya-allan");
			Cast cast65 = new Cast("Sophie Rundle", "sophie-rundle");
			Cast cast66 = new Cast("Paul Anderson", "paul-anderson");
			Cast cast67 = new Cast("Cillian Murphy", "cillian-murphy");
			Cast cast68 = new Cast("Helen McCrory", "helen-mccrory");

			// Horror casts
			Cast cast69 = new Cast("Annabelle Wallis", "annabelle-wallis");
			Cast cast70 = new Cast("Ward Horton", "ward-horton");
			Cast cast71 = new Cast("Patrick Wilson", "patrick-wilson");
			Cast cast72 = new Cast("Vera Farmiga", "vera-farmiga");
			Cast cast73 = new Cast("Lauren Cohan", "lauren-cohan");
			Cast cast74 = new Cast("Rupert Evans", "rupert-evans");
			Cast cast75 = new Cast("Errol Porter", "errol-porter");
			Cast cast76 = new Cast("Suziey Block", "suziey-block");

			// Comedy casts
			Cast cast77 = new Cast("Adam Sandler", "adam-sandler");
			Cast cast78 = new Cast("Salma Hayek", "salma-hayek");
			Cast cast79 = new Cast("Kevin James", "kevin-james");
			Cast cast80 = new Cast("Chris Rock", "chris-rock");
			Cast cast81 = new Cast("David Spade", "david-spade");
			Cast cast82 = new Cast("Jamie Chung", "jamie-chung");
			Cast cast83 = new Cast("Di Quon", "di-quon");
			Cast cast84 = new Cast("Leslie Mann", "leslie-mann");
			Cast cast85 = new Cast("Dylan Sprouse", "dylan-sprouse");
			Cast cast86 = new Cast("Ben Stiller", "ben-stiller");
			Cast cast87 = new Cast("Carla Gugino", "carla-gugino");
			Cast cast88 = new Cast("Rami Malek", "rami-malek");
			Cast cast89 = new Cast("Owen Wilson", "owen-wilson");
			Cast cast90 = new Cast("Will Ferrell", "will-ferrell");
			Cast cast91 = new Cast("Vince Vaughn", "vince-vaughn");
			Cast cast92 = new Cast("Jack Black", "jack-black");

			// Documentary casts
			Cast cast93 = new Cast("Ryan Reynolds", "ryan-reynolds");
			Cast cast94 = new Cast("Rob McElhenney", "rob-mcelhenney");
			Cast cast95 = new Cast("Nathan Fielder", "nathan-fielder");
			Cast cast96 = new Cast("Swaylee Loughnane", "swaylee-loughnane");
			Cast cast97 = new Cast("Reece Putinas", "reece-putinas");
			Cast cast98 = new Cast("David Attenborough", "david-attenborough");
			Cast cast99 = new Cast("Liev Schreiber", "liev-schreiber");
			Cast cast100 = new Cast("Thomas Middleditch", "thomas-middleditch");
			Cast cast101 = new Cast("T.J. Miller", "t-j-miller");
			Cast cast102 = new Cast("Martin Starr", "martin-starr");
			Cast cast103 = new Cast("Kumail Nanjiani", "kumail-nanjiani");
			Cast cast104 = new Cast("Zach Woods", "zach-woods");

			castRepository.saveAll(List.of(
					cast, cast1, cast2, cast3, cast4, cast5, cast6, cast7, cast8, cast9, cast10,
					cast11, cast12, cast13, cast14, cast15, cast16, cast17, cast18, cast19, cast20,
					cast21, cast22, cast23, cast24, cast25, cast26, cast27, cast28, cast29, cast30,
					cast31, cast32, cast33, cast34, cast35, cast36, cast37, cast38, cast39, cast40,
					cast41, cast42, cast43, cast44, cast45, cast46, cast47, cast48, cast49, cast50,
					cast51, cast52, cast53, cast54, cast55, cast56, cast57, cast58, cast59, cast60,
					cast61, cast62, cast63, cast64, cast65, cast66, cast67, cast68, cast69, cast70,
					cast71, cast72, cast73, cast74, cast75, cast76, cast77, cast78, cast79, cast80,
					cast81, cast82, cast83, cast84, cast85, cast86, cast87, cast88, cast89, cast90,
					cast91, cast92, cast93, cast94, cast95, cast96, cast97, cast98, cast99, cast100,
					cast101, cast102, cast103, cast104));

			Genre genre = new Genre("Drama");
			Genre genre1 = new Genre("Music");
			Genre genre2 = new Genre("Action");
			Genre genre3 = new Genre("Adventure");
			Genre genre4 = new Genre("Sitcom");
			Genre genre5 = new Genre("Sci-Fic");
			Genre genre6 = new Genre("Mystery");
			Genre genre7 = new Genre("Sport");
			Genre genre8 = new Genre("Thriller");
			Genre genre9 = new Genre("Fantasy");
			Genre genre10 = new Genre("Romance");
			Genre genre11 = new Genre("Comedy");
			Genre genre12 = new Genre("Crime");
			Genre genre13 = new Genre("Horror");
			Genre genre14 = new Genre("Documentary");

			genreRepository.saveAll(List.of(
					genre, genre1, genre2, genre3, genre4,
					genre5, genre6, genre7, genre8, genre9,
					genre10, genre11, genre12, genre13, genre14));
			// Category 1: Action
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

			// Category 2: Sci-Fic
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

			// Category 3: Romance
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
					"500-days-of-summer",
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

			// Category 4: TV Series
			Movie movie23 = new Movie(
					"House of The Dragon",
					"2022",
					"TV Series",
					"DotnJ7tTA34",
					"house-of-the-dragon",
					8.8,
					"House of the Dragon tells the story of an internal succession war within House Targaryen at the height of its power, 172 years before the birth of Daenerys Targaryen.",
					"Ryan J. Condal",
					List.of(cast59, cast58, cast61),
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
					List.of(cast62, cast63, cast64),
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
					List.of(cast25, cast55, cast56, cast57, cast58),
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
					List.of(cast65, cast66, cast67, cast68),
					List.of(genre, genre12));

			Movie movie27 = new Movie(
					"Mr. Robot",
					"2015",
					"TV Series",
					"N6HGuJC--rk",
					"mr-robot",
					8.6,
					"Elliot, a brilliant but highly unstable young cyber-security engineer and vigilante hacker, becomes a key figure in a complex game of global dominance when he and his shadowy allies try to take down the corrupt corporation he works for.",
					"Sam Esmail",
					List.of(cast88, cast5, cast57, cast75),
					List.of(genre12, genre, genre8));

			Movie movie28 = new Movie(
					"Silicon Valley",
					"2014",
					"TV Series",
					"Vm4tx1O9GAc",
					"silicon-valley",
					8.5,
					"Follows the struggle of Richard Hendricks, a Silicon Valley engineer trying to build his own company called Pied Piper.",
					"John Altschuler",
					List.of(cast100, cast101, cast102, cast103, cast104),
					List.of(genre14));

			// Category 5: Horror
			Movie movie29 = new Movie(
					"Annabelle",
					"2014",
					"Horror",
					"paFgQNPGlsg",
					"annabelle",
					5.4,
					"A couple begins to experience terrifying supernatural occurrences involving a vintage doll shortly after their home is invaded by satanic cultists.",
					"John R. Leonetti",
					List.of(cast69, cast70, cast26, cast4, cast19),
					List.of(genre13, genre6, genre8));

			Movie movie30 = new Movie(
					"Insidious",
					"2010",
					"Horror",
					"zuZnRUcoWos",
					"insidious",
					6.8,
					"A family looks to prevent evil spirits from trapping their comatose child in a realm called The Further.",
					"James Wan",
					List.of(cast71, cast72, cast69, cast68),
					List.of(genre13, genre6, genre8));

			Movie movie31 = new Movie(
					"The Conjuring",
					"2013",
					"Horror",
					"k10ETZ41q5o",
					"the-conjuring",
					7.5,
					"Paranormal investigators Ed and Lorraine Warren work to help a family terrorized by a dark presence in their farmhouse.",
					"James Wan",
					List.of(cast72, cast71, cast70, cast10, cast1),
					List.of(genre13, genre6, genre8));

			Movie movie32 = new Movie(
					"Annabelle: Creation",
					"2017",
					"Horror",
					"11taaQy2KBg",
					"annabelle-creation",
					6.5,
					"Twelve years after the tragic death of their little girl, a doll-maker and his wife welcome a nun and several girls from a shuttered orphanage into their home, where they become the target of the doll-maker's possessed creation, Annabelle.",
					"David F. Sandberg",
					List.of(cast70, cast69, cast36, cast40, cast11),
					List.of(genre13, genre6, genre8));

			Movie movie33 = new Movie(
					"The Boy",
					"2016",
					"Horror",
					"XGbB9UQ6r1g",
					"the-boy",
					6.0,
					"An American nanny is shocked that her new English family's boy is actually a life-sized doll. After she violates a list of strict rules, disturbing events make her believe that the doll is really alive.",
					"William Brent Bell",
					List.of(cast72, cast71, cast70, cast30, cast12),
					List.of(genre13, genre6, genre8));

			Movie movie34 = new Movie(
					"Insidious: Chapter 2",
					"2013",
					"Horror",
					"fBbi4NeebAk",
					"insidious-2",
					6.5,
					"The Lamberts believe that they have defeated the spirits that have haunted their family, but they soon discover that evil is not beaten so easily.",
					"James Wan",
					List.of(cast71, cast70, cast69, cast65),
					List.of(genre13, genre6, genre8));

			Movie movie35 = new Movie(
					"Horror in the High Desert",
					"2013",
					"Horror",
					"fBbi4NeebAk",
					"horror-in-the-high-desert",
					5.4,
					"In July 2017, an experienced outdoor enthusiast vanished in Northern Nevada while on an outdoor excursion. After an extensive search, he was never located. On the three-year anniversary of his disappearance, friends and loved ones recall the events leading up to his vanishing, and for the first time, speak about the horrifying conclusion of his fate.",
					"Dutch Marich",
					List.of(cast75, cast76, cast49, cast65, cast53),
					List.of(genre13, genre8));

			Movie movie36 = new Movie(
					"The Conjuring 2",
					"2016",
					"Horror",
					"VFsmuRPClr4",
					"the-conjuring-2",
					7.3,
					"Ed and Lorraine Warren travel to North London to help a single mother raising four children alone in a house plagued by a supernatural spirit.",
					"James Wan",
					List.of(cast72, cast71, cast70, cast73),
					List.of(genre13, genre6, genre8));

			// Category 6: Comedy-Family
			Movie movie37 = new Movie(
					"Grown Ups",
					"2010",
					"Comedy",
					"e01NVCveGkg",
					"grown-ups",
					5.9,
					"After their high school basketball coach passes away, five good friends and former teammates reunite for a Fourth of July holiday weekend.",
					"Dennis Dugan",
					List.of(cast77, cast78, cast79, cast80, cast81),
					List.of(genre11));

			Movie movie38 = new Movie(
					"Big Daddy",
					"1999",
					"Comedy",
					"jxnccxgybUI",
					"big-daddy",
					6.4,
					"A lazy law-school grad adopts a kid to impress his girlfriend, but everything doesn't go as planned and he becomes the unlikely foster father.",
					"Dutch Marich",
					List.of(cast77, cast84, cast85, cast79, cast80),
					List.of(genre11));

			Movie movie39 = new Movie(
					"Night at the Museum",
					"2006",
					"Comedy",
					"Ltba1_-tRT4",
					"night-at-the-museum",
					6.4,
					"A newly recruited night security guard at the Museum of Natural History discovers that an ancient curse causes the animals and exhibits on display to come to life and wreak havoc.",
					"Shawn Levy",
					List.of(cast86, cast87, cast88),
					List.of(genre11, genre3));

			Movie movie40 = new Movie(
					"Zoolander",
					"2001",
					"Comedy",
					"YtQq0T3ExLs",
					"zoolander",
					6.5,
					"At the end of his career, a clueless fashion model is brainwashed to kill the Prime Minister of Malaysia.",
					"Ben Stiller",
					List.of(cast86, cast89, cast90),
					List.of(genre11));

			Movie movie41 = new Movie(
					"Nacho Libre",
					"2006",
					"Comedy",
					"5Atg2aASyY4",
					"nacho-libre",
					5.8,
					"Berated all his life by those around him, a monk follows his dream and dons a mask to moonlight as a Luchador (Mexican wrestler).",
					"Jared Hess",
					List.of(cast92, cast89, cast80, cast77),
					List.of(genre11));

			Movie movie42 = new Movie(
					"Wedding Crashers",
					"2005",
					"Comedy",
					"wKahFEgeRg8",
					"wedding-crashers",
					7.0,
					"John Beckwith and Jeremy Grey, a pair of committed womanizers who sneak into weddings to take advantage of the romantic tinge in the air, find themselves at odds with one another when John meets and falls for Claire Cleary.",
					"David Dobkin",
					List.of(cast89, cast91, cast86, cast80),
					List.of(genre11, genre10));

			Movie movie43 = new Movie(
					"School of Rock",
					"2003",
					"Comedy",
					"TExoc0MG4I4",
					"school-of-rock",
					7.2,
					"After being kicked out of his rock band, Dewey Finn becomes a substitute teacher of an uptight elementary private school, only to try and turn his class into a rock band.",
					"Richard Linklater",
					List.of(cast89, cast83, cast78, cast83, cast87),
					List.of(genre11));

			Movie movie44 = new Movie(
					"Billy Mandison",
					"1995",
					"Comedy",
					"x3nXMnzCkz4",
					"billy-maidison",
					6.3,
					"In order to inherit his fed up father's hotel empire, an immature and lazy man must repeat grades 1-12 all over again.",
					"Tamra Davis",
					List.of(cast77, cast89, cast86, cast80),
					List.of(genre11));

			// Category 7: Documentary
			Movie movie45 = new Movie(
					"Welcome to Wrexham",
					"2022",
					"Documentary",
					"C9hLsktkGfA",
					"welcome-to-wrexham",
					8.4,
					"Docuseries chronicling the purchase and stewardship of Wrexham AFC, one of professional football's oldest clubs, by two Hollywood actors, Ryan Reynolds and Rob McElhenney.",
					"Ryan Reynolds",
					List.of(cast93, cast94, cast89, cast91),
					List.of(genre14, genre7));

			Movie movie46 = new Movie(
					"The Rehearsal",
					"2022",
					"Documentary",
					"2fjPFt8cpic",
					"the-rehearsal",
					8.8,
					"Nathan Fielder gives people a chance to rehearse for their own lives in a world where nothing ever works out as expected.",
					"Nathan Fielder",
					List.of(cast95, cast5, cast20, cast12, cast8),
					List.of(genre14));

			Movie movie47 = new Movie(
					"Nathan for You",
					"2013",
					"Documentary",
					"NO8V72pDw1o",
					"nathan-for-you",
					8.9,
					"Nathan Fielder uses his business degree and life experiences to help real small businesses turn a profit. But because of his unorthodox approach, Nathan's genuine efforts to do good often draw real people into an experience far beyond what they signed up for.",
					"Nathan Fielder",
					List.of(cast95, cast55, cast69, cast81, cast38),
					List.of(genre14, genre11));

			Movie movie48 = new Movie(
					"I Am a Killer",
					"2018",
					"Documentary",
					"57au_a4PqG4",
					"i-am-a-killer",
					7.4,
					"Follows Death Row inmates, who tell the story of how they ended up there.",
					"Swaylee Loughnane",
					List.of(cast96, cast97, cast60, cast68),
					List.of(genre14, genre12));

			Movie movie49 = new Movie(
					"Planet Earth II",
					"2016",
					"Documentary",
					"c8aFcHFu8QM",
					"planet-earth-ii",
					9.5,
					"David Attenborough returns with a new wildlife documentary that shows life in a variety of habitats.",
					"David Attenborough",
					List.of(cast98, cast94, cast96),
					List.of(genre14));

			Movie movie50 = new Movie(
					"Hard Knocks",
					"2001",
					"Documentary",
					"EqzybMVURls",
					"hard-knocks",
					8.4,
					"Hard Knocks is a reality sports documentary produced by the NFL and HBO. Each season the show follows an NFL team during training camp in preparation for the upcoming season.",
					"Marty Callner",
					List.of(cast99, cast48, cast11, cast39),
					List.of(genre14, genre7));

			movieRepository.saveAll(List.of(
					movie, movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9,
					movie10, movie11, movie12, movie13, movie14, movie15, movie16, movie17, movie18, movie19,
					movie20, movie21, movie22, movie23, movie24, movie25, movie26, movie27,movie28, movie29,
					movie30, movie31, movie32, movie33, movie34, movie35, movie36, movie37, movie38, movie39,
					movie40, movie41, movie42, movie43, movie44, movie45, movie46, movie47, movie48, movie49,
					movie50));
		};
	}
}