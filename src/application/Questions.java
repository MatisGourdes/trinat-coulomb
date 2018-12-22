package application;


import java.util.ArrayList;
import java.util.Random;

public class Questions {

	private ArrayList<String> questions = new ArrayList<String>();
	private Random random = new Random();
	private ArrayList<String> reponses = new ArrayList<String>();


	public Questions() {
		initQuestions();
		initReponses();	 
		getRandom();
	}


	public ArrayList<String> initQuestions() {

		questions.add("En 9 lettres : accord entre 2 pays pour arrêter une guerre.");
		questions.add("Quelle sculpture égyptienne monumentale a une tête humaine et un corps de lion ?");
		questions.add("Quel est le dieu principal dans la mythologie latine ?");
		questions.add("Comment appelle-t-on les Français qui vivaient en Algérie au XXème siècle ?");
		questions.add("Comment appelle-t-on le temple d'Athéna sur l'Acropole ?");
		questions.add("Comment appelle-t-on une image entièrement créée par ordinateur ? Une image de ...");
		questions.add("Un avion décolle-t-il face au vent ou dos au vent ?");
		questions.add("Quelle est la principale unité monétaire de la Chine ?");
		questions.add("Combien de muscles sont sollicités quand on fronce les sourcils : 1, 5 ou plus de 10 ?");
		questions.add("Quelle plante n'a ni tige, ni feuilles, ni fleurs, ni chlorophylle ?");

		questions.add("Quel est le PGCD de 12 et 30 ?");
		questions.add("Calculez 650/26.");
		questions.add("Léo pèse 80 kg. Il grossit de 10%, puis maigrit de 10%. Quel est son nouveau poids ?");
		questions.add("Combien font 64% de 120 ?");
		questions.add("Quelle figure géométrique, dont le nom commence par P, admet une infinité d'axes de symétrie ?");
		questions.add("Dans quel pays peut-on trouver la Catalogne, l’Andalousie et la Castille ?");
		questions.add("Qui a dit « le sort en est jeté » (Alea jacta est) ?" + "\n" + "Hitler, Napoléon, Jules César, Staline ?");
		questions.add("Quel cinéaste a réalisé « Parle avec elle » et « Volver » ?" + "\n" + "Pablo Trapero, Pedro Almodovar, Woody Allen, Guillermo del Toro ?");
		questions.add("A qui doit-on la chanson “I Shot the Sheriff” ?"+"\n"+ "Bob Marley, Eric Clapton, UB40, Jim Morrison");
		questions.add("Quel pays a remporté la coupe du monde de football en 2018 ?");
		
		questions.add("Dans quelle ville italienne se situe l’action de la pièce de Shakespeare « Roméo et Juliette » ?");
		questions.add("Par quel mot désigne-t-on une belle-mère cruelle ?" + "\n" + "Une jocrisse, chenapan, godiche, marâtre ?");
		questions.add("Qui était le dieu de la guerre dans la mythologie grecque ?");
		questions.add("Parmi les animaux suivants, lequel peut se déplacer le plus rapidement ?" + "\n" + "Le chevreuil, guépard, springbok, léopard ?");
		questions.add("Quel est l’impératif du verbe feindre à la première personne du pluriel ?");
		questions.add("Quel roi de France proclama l’Edit de Nantes ? " + "\n" + "Louis XIV, François 1er, Henri IV, Louis XIII ?");
		questions.add("A quel écrivain attribue-t-on la rédaction de l’Illiade et l’Odyssée ?");
		questions.add("Quel acteur américain incarne le héros du film de Christopher Nolan de 2014 « Interstellar » ?" + "\n" + "Léonardo di Caprio, Brad Pitt, Matthew MacConaughey, Tom Cruise");
		questions.add("Quel est le plus long fleuve en France ? " + "\n" + "le Rhône, la Loire, le Rhin, la Seine ?");
		questions.add("Le drapeau russe est blanc, bleu et … ?");
		
		questions.add("Quel journal a été attaqué par des terroristes islamiques en janvier 2015 ?");
		questions.add("Quel animal andin de la famille des camélidés est élevé pour sa laine ?");
		questions.add("Quel pays a décidé par referendum de quitter l’UE ?");
		questions.add("Dans quelle ville le Colisée (l’amphithéâtre Flavien) se trouve-t-il ?");
		questions.add("A quel écrivain doit-on le personnage de Boule-de-Suif ?" + "\n" + "Maupassant, Voltaire, Balzac, Stendhal ?");
		questions.add("Combien de jours une année bissextile compte-t-elle ?");
		questions.add("Quel animal est « pan-pan » dans Bambi ?");
		questions.add("A quel animal l’adjectif « hippique » se rapporte-t-il ?");
		questions.add("Quel est le nom usuel d’un terrain de tennis ?");
		questions.add("Qui a composé « L’Ode à la joie », hymne de l’UE ?" + "\n" + "Wagner, Beethoven, Bach, Mozart ?");
		
		questions.add("Quelle capitale actuelle a été physiquement coupée en 2 de 1961 à 1989 ?");
		questions.add("Quel animal peut être marteau, tigre ou pèlerin ?");
		questions.add("En quelle année Neil Armstrong déclare-t-il « C’est un petit pas pour l’homme, un bon de géant pour l’humanité » ?");
		questions.add("Qui a dit « Ich bin ein Berliner » ?" + "\n" + "Bismarck, Reagan, De Gaulle, Kennedy ?");
		questions.add("Complétez la liste : Athos, Porthos et … ?" + "\n" + "Lagardère, Aramis, Bayard, D’Artagnan ?");
		questions.add("Quel philosophe conclut « Je pense, donc je suis. » ?" + "\n" + "Platon, Socrate, Descartes, Hegel");
		questions.add("Que collectionne un philatéliste ?");
		questions.add("Quel est le plus petit Etat du monde ?" + "\n" + "Saint-Marin, le Vatican, Andorre, Monaco ?");
		questions.add("Quel groupe de musique est composé de 2 dj portant des casques de robot ?");
		questions.add("Quel est l’athlète le plus titré de l’histoire des JO ?");
		
		questions.add("Quelle est la femelle du cochon ?");
		questions.add("Quel es l’organe respiratoire des poissons ?");
		questions.add("En quelle année Adolf Hitler prend-il le pouvoir en Allemagne ?");
		questions.add("Quel pays surnomme-t-on « Le pays du Soleil levant » ?");
		questions.add("Dans quel film d’animation retrouve-t-on le personnage de Buzz l’éclair ?");
		questions.add("Quel est le plus grand Etat du monde ?");
		questions.add("Quel animal appelle-t-on aussi le « hérisson des mers » ?");
		questions.add("Dans quel univers se situe la « Terre du milieu » ?");
		questions.add("Qui interprète la chanson du film « Skyfall » ?");
		questions.add("Quel personnage chante avec Mowgli « Il en faut peu pour être heureux » ?");
		
		questions.add("Comment appelle-t-on le fruit du plaqueminier ?");
		questions.add("Comment s’appelle le meilleur ami de Pumba dans « Le roi lion » ?");
		questions.add("Comment s’appelle la flûte à bec la plus aiguë ?");
		questions.add("Comment s’appelle l’engin de construction qui a le même nom qu’un oiseau ?");
		questions.add("Lors d’un combat de boxe anglaise, combien de temps un adversaire doit-il rester au sol pour être déclaré knock out (KO) ?");
		questions.add("Qui fut le plus jeune vainqueur du tournoi de Roland-Garros ?"+ "\n" +"Michael Chang, Andres Gimeno, Yannick Noah, Roger Federer");
		questions.add("Combien de joueurs d’une même équipe y a-t-il sur un terrain de basket-ball ?");
		questions.add("Dans quel sport emploi-t-on les termes suivants : split, spare, strike, …. ?");
		questions.add("Dans quel sport utilise-t-on un sand wedge ?");
		questions.add("Au judo, quel est la couleur de la ceinture la plus élevée ?");
		
		questions.add("Quel est le plus petit organisme vivant ?");
		questions.add("Les fonctions de relation sont assurées par l’appareil circulatoire, le système nerveux, ou les organes de sens ?");
		questions.add("Au niveau des reins, on trouve les vertèbres dorsales, sacrées, ou lombaires ?");
		questions.add("Le carpe regroupe les os de l’avant-bras, la face, ou la main ?");
		questions.add("Comment se nomme le plus petit os du corps humain ?" + "\n" + "L’étrier, le colimaçon ou la phalange ?");
		questions.add("L’os est un tissu inerte, mort ou vivant ?");
		questions.add("Quel est le prénom de l’acteur De Funès ?");
		questions.add("Quel nom porte la partie extrême à l'avant d'un navire, décorée autrefois de sculptures ?");
		questions.add("Quelle est l'unité de vitesse d'un navire ?");
		questions.add("Dans quel fruit, placé sur la tête de son fils, Guillaume Tell fut-il obligé de tirer une flèche ?");
		
		questions.add("Quel mot algonquin signifie le « Grand esprit », dieu des Amérindiens ? II signifie aujourd'hui un personnage très puissant.");
		questions.add("Quel nom désigne la boussole magnétique ou gyroscopique d'un navire, indiquant l'angle entre l'axe de celui-ci et le méridien Nord ?");
		questions.add("Combien de syllabes possède un vers en alexandrins ?");
		questions.add("Complétez l’expression suivante : les bons comptent font …");
		questions.add("Complétez l’expression suivante : autant en emporte …");
		questions.add("Quel mot de quatre lettres désigne la sonnerie de cloches annonçant la mort ou les funérailles de quelqu'un ?");
		questions.add("En musique, combien y a-t-il de noires dans une blanche ?");
		questions.add("Quel mot désigne un événement qui revient tous les six mois ?");
		questions.add("Comment nomme-t-on la période de forte chaleur durant la période de l'été ?");
		questions.add("Quel nom de noces porte la célébration de 50 ans de mariage ?");
		
		questions.add("Quel nom de noces porte la célébration de 25 ans de mariage ?");
		questions.add("Comment appelle-t-on les colonnes de calcaire qui pendent du sommet d'une grotte ?");
		questions.add("Que désigne-t-on par le fidèle compagnon de l’homme ?");
		questions.add("Qu’entend-on par un Disciple d’Esculape ?");
		questions.add("Quelle est la première lettre de l’alphabet grec ?");
		questions.add("Comment appelle-t-on un coup d'État organisé par un groupe armé ?");
		questions.add("En 1975, sous quel nom les Américains Steve Jobs et Stephen Wozniac présentèrent-ils leur premier ordinateur personnel ?");
		questions.add("Quelle expression élogieuse employant le nom d'une couleur désigne une personne sachant bien cuisiner ?");
		questions.add("Comment appelle-t-on la saison de la cueillette des raisins ?");
		questions.add("Quel mot, commençant par la lettre L, désigne un réseau complexe de chemins dont on a peine à sortir ?");

		return questions;
	}

	
	public ArrayList<String> initReponses() {

		reponses.add("armistice");
		reponses.add("sphynx");
		reponses.add("jupiter");
		reponses.add("pieds-noirs");
		reponses.add("parthénon");
		reponses.add("synthèse");
		reponses.add("face au vent");
		reponses.add("yuan");
		reponses.add("plus de 10");
		reponses.add("champignon");

		reponses.add("6");
		reponses.add("25");
		reponses.add("79.2");
		reponses.add("76.8");
		reponses.add("point");
		reponses.add("espagne");
		reponses.add("jules césar");
		reponses.add("pedro almodovar");
		reponses.add("bob marley");
		reponses.add("france");
		
		reponses.add("vérone");
		reponses.add("marâtre");
		reponses.add("arès");
		reponses.add("guépard");
		reponses.add("feignons");
		reponses.add("henri IV");
		reponses.add("homère");
		reponses.add("matthew macconaughey");
		reponses.add("la loire");
		reponses.add("rouge");
		
		reponses.add("charlie hebdo");
		reponses.add("lama");
		reponses.add("royaume-uni");
		reponses.add("rome");
		reponses.add("maupassant");
		reponses.add("366");
		reponses.add("lapin");
		reponses.add("cheval");
		reponses.add("court");
		reponses.add("beethoven");
		
		reponses.add("berlin");
		reponses.add("requin");
		reponses.add("1969");
		reponses.add("kennedy");
		reponses.add("aramis");
		reponses.add("descartes");
		reponses.add("timbres");
		reponses.add("le vatican");
		reponses.add("daft punk");
		reponses.add("michael phelps");
		
		reponses.add("truie");
		reponses.add("branchies");
		reponses.add("1933");
		reponses.add("japon");
		reponses.add("toy story");
		reponses.add("russie");
		reponses.add("oursin");
		reponses.add("le seigneur des anneaux");
		reponses.add("adèle");
		reponses.add("baloo");
		
		reponses.add("kaki");
		reponses.add("timon");
		reponses.add("sopranino");
		reponses.add("grue");
		reponses.add("10s");
		reponses.add("michael chang");
		reponses.add("5");
		reponses.add("bowling");
		reponses.add("golf");
		reponses.add("noire");
		
		reponses.add("cellule");
		reponses.add("le système nerveux");
		reponses.add("lombaires");
		reponses.add("la main");
		reponses.add("l’étrier");
		reponses.add("vivant");
		reponses.add("louis");
		reponses.add("proue");
		reponses.add("noeud");
		reponses.add("pomme");
		
		reponses.add("manitou");
		reponses.add("compas");
		reponses.add("12");
		reponses.add("les bons amis");
		reponses.add("le vent");
		reponses.add("glas");
		reponses.add("2");
		reponses.add("semestriel");
		reponses.add("canicule");
		reponses.add("or");
		
		reponses.add("argent");
		reponses.add("stalactites");
		reponses.add("chien");
		reponses.add("médecin");
		reponses.add("alpha");
		reponses.add("putsch");
		reponses.add("apple");
		reponses.add("cordon bleu");
		reponses.add("vendanges");
		reponses.add("labyrinthe");

		return reponses;
	}


	public int getRandom() {

		return random.nextInt(questions.size());
	}


	//Getter
	public ArrayList<String> getQuestions() {
		return questions;
	}

	public ArrayList<String> getReponses() {
		return reponses;
	}

}