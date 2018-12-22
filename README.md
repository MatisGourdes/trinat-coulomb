# trinat-coulomb
# trinat-coulomb
**Quizz Project**
***
Elise Gebhard, Emilie Gehl, Aurélien Rosenkranz, Bastien Perrissoud

# Software Engineering

## 1. Einleitung
Unser Projekt ist eine Quizz für Personen zwischen 6-99 Jahre. Man kann alleine und überall spielen um neue Kenntnisse zu erlernen.  
### Ziele
Es soll ein kleines Programm erstellt werden bei dem Fragen gestellt und die Richtige Lösung angezeigt werden. Die Verwendung des Programms soll auf dem Desktop eines MAC, Windows oder Linux Computer ausgeführt werden können.

### Randbedingungen:
- Die Programmierung der Anwendung soll in JAVA erfolgen.
- Die Klassen des Programms sollen über die entsprechenden Unit-Tests verfügen.
- Das Projekt soll auf GitHub veröffentlich werden.
- Die Buildautomatisierung soll mit MAVEN erfolgen.
- Das Programm soll mittels einer dafür erstellten JAR-Datei und dem Befehl java-jar xxxxx.jar ausgeführt werden können.

## 2. Build-Anleitung

Git clone:  https://github.com/elisegebhard/trinat-EBAE
In Git program: 
1. Speichern Sie Ihre src Datei von Ihre Git Projekt auf Ihre Rechner.
2. Löschen Sie Ihre src Datei von Ihre Git Projekt.
3. Fügen Sie die pom.xml Datei mit die geeignete Initialiesierung in das Git Projekt.
4. Fügen Sie die src Ordner von einen Maven Projekt in das Git Projekt.
5. Klicken Sie auf den rechten Maus Taste in "trinat-EBAE": ->Configure ->Convert to Maven.
6. Fügen Sie Ihre eigene Package in das Ordner src/main/java.
7. Klicken Sie auf den rechten Maus Taste in "trinat-EBAE": ->Run as ->Maven clean.
8. Klicken Sie auf den rechten Maus Taste in "trinat-EBAE": ->Run as ->Maven install.
9. Prüfen Sie in das Ordner "target" ob Sie eine Datei .jar haben.

## 3. Bedienungsanleitung:
1. Öffnen Sie das spiel.
2. Klicken Sie auf starten um zu beginnen. 
3. Antworten Sie auf die Frage.
4. Klicken Sie auf „Vérifier“ um das Resultat zu korrigieren. 
5. Klicken sie auf „Suivant“ um die nächste Frage zu sehen. 
6. Wiederholen Sie die Schritte 3 bis 5.
7. Zum Schluss bekommen Sie Ihre Note, und können auf die Startseite zurück gehen.
8. Sie können immer mit „Ctrl+X“ das Spiel schließen oder mit „File -> Exit“.

## 4. Userstory:


US  |SP | Priorität | Akzeptanzkriterium 
----|:---:|:-----------:|-------------------
1  Als Benutzer möchte ich mich Unterhalten während 5 Minuten um neue allgemeine Bildung zu lernen.| 3 | 1 | Das Spiel soll in max 5 Minuten zu ende sein
2  Als Benutzer möchte ich für alle meine Antworten wissen, ob sie richtig war oder nicht um mich zu bewerten. | 3| 2 | Nachdem man die Frage beantwortet hat soll die Antwort angezeigt werden falls es falsch ist
3  Als Entwickler möchte ich beliebige Fragen hinzufügen können um immer innovativ zu sein. | 5 | 4 | Eine Spezielle Klasse für Fragen und Antworten soll hinzugefügt werden
4 Als Benutzer möchte ich eine Vielfalt an Fragen gestellt bekommen um immer etwas Neues zu entdecken. | 3 | 3 | Es sollen mindestens 100 Fragen gespeichert sein
5 Als Entwickler möchte ich ein einfach wartbares Programm damit alle Informatiker es bearbeiten können. | 5 | 5 | Es sollen 2 Klassen und eine Klasse zum testen existieren
6 Als Benutzer möchte ich ohne Internet spielen können um mich so oft wie möglich zu amüsieren. | 2 | 6 | Das Spiel soll offline gespielt werden können
7  Als Benutzer möchte ich, dass Spielrunden zeit gestoppt werden um meine Schnelligkeit zu testen | 8 | 7 | Nach 20 Sekunden soll die nächste Frage angezeigt werden


**Story Points:** 8

**Ziele:**
 * Unterhalten des Kunden
* Allgemeinbildung verbessern 

**Features:**
 * Fragen stellen
 * Antworten prüfen 
 * Ergebnis und Gefühl geben

## 5. Releaseplan mit den Ausbaustufen

Sprint 1 | Sprint 2 |
---|---
US1 bis US 6 |US7


## 6. Taskliste für die Umsetzung der User Story

User Story 1 | Als Benutzer möchte ich mich Unterhalten während 5 Minuten um neue allgemeine Bildung zu lernen | Zeitaufwandschätzung
---|---|---
Task 1 | 100 Fragen suchen und implementiert | 1 Stunde 
Task 2 | 100 Antworten suchen und implementiert | 1 Stunde 

User Story 2 | Als Benutzer möchte ich für alle meine Antworten wissen, ob sie richtig war oder nicht um mich zu bewerten | Zeitaufwandschätzung
---|---|---
Task 1 | Eine Kontrollmethode soll erstellt werden die den User Eintrag mit der richtigen Antwort vergleicht | 1 Stunde
Task 2 | Der Aktuelle Notenstand soll unter der Antwort angeschrieben werden | 1 Stunde

User Story 3 | Als Entwickler möchte ich beliebige Fragen hinzufügen können um immer innovativ zu sein. | Zeitaufwandschätzung
---|---|---
Task 1 | eine neue Klasse “Questions” erstellen | 1 Stunde
Task 2 | Fragen und Antworten müssen in die Klasse “Questions” eingefügen| 1 Stunde

User Story 4 | Als Benutzer möchte ich eine Vielfalt an Fragen gestellt bekommen um immer etwas Neues zu entdecken. | Zeitaufwandschätzung
---|---|---
Task 1 | Ein Knopf soll zur nächsten Fragen gelangen | 2 Stunde

User Story 5 | Als Entwickler möchte ich ein einfach wartbares Programm damit alle Informatiker es bearbeiten können. | Zeitaufwandschätzung
---|---|---
Task 1 | Mehrere Klassen hinzufügen | 1 Stunde
Task 2 | Logisches Design und liesbar | 1 Stunde

User Story 6 | Als Benutzer möchte ich ohne Internet spielen können um mich so oft wie möglich zu amüsieren. | Zeitaufwandschätzung
---|---|---
Task 1 | Das Programm soll nicht über Internet die Fragen bekommen sondern Lokal  | 30 Minuten

User Story 7 | Als Benutzer möchte ich, dass Spielrunden zeit gestoppt werden um meine Schnelligkeit zu testen | Zeitaufwandschätzung
---|---|---
Task 1 | Ein Timer soll beim start einer Frage die Zeit bis zum antworten stoppen | 3 Stunde


Taskliste | Stunden 
---|---
Fragen/Antworten erstellen | 3h
Startseite erstellen | 1h 
Fragenseite erstellen | 4h
Endseiten erstellen | 1h
Zufallsmethode | 1h
Prüfmethode | 2h
Notenberechnung | 1h
Design | 4h
Testen | 3h

## Umsetzung

Start Seite | Frage Seite | End Seite
---|---|---
File| File|File
Bedienungsanleitung | Frage/Anwort| Ergebnis
Strat| Note|Start Seite/Wiederholungsversuch

## Klassendiagramm

|Quizz|Questions|
|---|---|
|Questions|QuestionsTest|                        

## Dokumentation wichtiger Code Snippets

  
**Random Methode**
	public int getRandom() {

		return random.nextInt(questions.size());
	}

Diese Methode gibt eine Zufallszahl von 0 bis die grösse von questions. Questions ist in der andere Klasse "Questions" in eine ArrayList gespeichert.

**Array Lists**
	public ArrayList<String> getQuestions() {
		return questions;
	}

	public ArrayList<String> getReponses() {
		return reponses;
	}

Diese Methode bekommen wir "die questions" oder "reponses" von der ArrayList. 
	
**Pane**
	Pane createCenterPane() {

		Text text = new Text("Ce quizz est composé de 20 questions, vous devez vérifier votre réponse avant de passer à la question suivante." 
				+ "\n" + "Vous obtiendrez 1 point par bonne réponse. Bonne chance!");

		text.setFont(Font.font(null, FontWeight.LIGHT, 15));
		text.setFill(Color.CRIMSON);

		HBox boxTop = new HBox(10, text);
		boxTop.setAlignment(Pos.BOTTOM_CENTER);

		return boxTop;
	}

Diese Methode zeigt wie die Center Panel gebaut ist. Zuerst gibt es eine Text. 
Dieses Text hat die originale Schrifftarte, dünn geschrieben und 15 grösse. 
Dieses Text ist in Farbe "Crimson" geschrieben.
HBox ist eine neue Layout Klasse um das Text zu zeigen.
Dieses neues Layout Klasse ist unten, mitte positioniert.

	
***
Projekt Mechatronik Trinational Promotion Coulomb Dez. 2018 

