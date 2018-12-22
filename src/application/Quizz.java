package application;

import java.util.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class Quizz extends Application {

	//initialisation
	Label l = new Label();//label questions
	Label l2 = new Label();//label réponses



	TextField text = new TextField();
	Button button = new Button();
	Button button1 = new Button();
	Button buttonverification = new Button();
	Button retourmenu = new Button();
	Button suivant = new Button();
	Button redemmarage = new Button();
	final Button btn = new Button();
	private ArrayList<String> questions;
	private ArrayList<String> reponses;

	int countNote = 0;
	int countTotal = 0;
	int i;
	Label fin = new Label();
	String quest;
	String rep;
	
	public void start(Stage primaryStage) {


		Questions random = new Questions();
		this.questions = random.initQuestions();
		this.reponses = random.initReponses();
		i = random.getRandom();


		BorderPane root = new BorderPane();
		BorderPane root1 = new BorderPane();
		BorderPane root2 = new BorderPane();

		root.setCenter(createCenterPane());
		root.setBottom(createBottomPane());
		root1.setCenter(createCenterPane1());
		root1.setBottom(createBottomPane1());
		root2.setCenter(createCenterPane2());
		root2.setBottom(createBottomPane2());


		Scene scene = new Scene(root, 1200, 250);
		Scene scene1 = new Scene(root1, 1200, 250);
		Scene scene2 = new Scene(root2, 1200, 250);

		primaryStage.setTitle("Quizz");
		primaryStage.setScene(scene);
		primaryStage.show();
		// Create MenuBar
		MenuBar menuBar = new MenuBar();
		MenuBar menuBar1 = new MenuBar();
		MenuBar menuBar2 = new MenuBar();

		// Create menus
		Menu fileMenu = new Menu("File");


		MenuItem exitItem = new MenuItem("Exit");
		// Set Accelerator for Exit MenuItem.
		exitItem.setAccelerator(KeyCombination.keyCombination("Ctrl+X"));
		// When user click on the Exit item, use anonymous inner class
		exitItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.exit(0);
			}
		});
		fileMenu.getItems().addAll(exitItem);

		menuBar.getMenus().addAll(fileMenu);
		menuBar1.getMenus().addAll(fileMenu);
		menuBar2.getMenus().addAll(fileMenu);

		root.setTop(menuBar);
		root1.setTop(menuBar1);
		root2.setTop(menuBar2);

		button.setOnAction(event -> {
			primaryStage.setScene(scene1);
			primaryStage.show();
		});

		quest = questions.get(i);
		rep = reponses.get(i);
		buttonverification.setText("Vérification");
		suivant.setText("Suivant");
		suivant.setDisable(true);
		//écrire le texte de la question
		l.setText(quest);

		buttonverification.setOnAction(event -> {

			String marep = String.valueOf(text.getText());
			if (text.getText() != null && !text.getText().isEmpty()) {

				countTotal++;
				if (marep.equals(rep)) {
					countNote++;
					l2.setText("Bravo" + "\n Score: " + countNote + "/" + countTotal);
					buttonverification.setDisable(true);
					suivant.setDisable(false);

				} else {
					l2.setText("Perdu... La réponse était: " + rep + "\n Score: " + countNote + "/" + countTotal);
					buttonverification.setDisable(true);
					suivant.setDisable(false);
					suivant.setOnAction(event1 -> {

						i = random.getRandom();

						quest = questions.get(i);
						rep = reponses.get(i);
						l.setText(quest);
						text.setText(null);

						buttonverification.setDisable(false);
						suivant.setDisable(true);
						primaryStage.setScene(scene1);
						primaryStage.show();
					});
				}
				if (countTotal == 20) {
					retourmenu.setText("Menu principal");
					if(countNote<10) {
						fin.setText("Dommage, vous avez un score de " + countNote + "/" + countTotal + " essaye encore.");
					}
					else if(countNote>=10) {
						fin.setText("Bravo vous avez fini, vous avez un score de " + countNote + "/" + countTotal);
					}
					redemmarage.setText("Réessayer");
					redemmarage.setOnAction(event3->{
						primaryStage.setScene(scene1);
						primaryStage.show();
						countNote = 0;
						countTotal=0;
						buttonverification.setDisable(false);
						suivant.setDisable(true);
						l2.setText(null);
						i = random.getRandom();
						quest = questions.get(i);
						rep = reponses.get(i);
						l.setText(quest);
						text.setText(null);

					});
					retourmenu.setOnAction(event3 -> {
						primaryStage.setScene(scene);
						primaryStage.show();						
						countNote = 0;
						countTotal=0;
						buttonverification.setDisable(false);
						suivant.setDisable(true);
						l2.setText(null);
						i = random.getRandom();
						quest = questions.get(i);
						rep = reponses.get(i);
						l.setText(quest);
						text.setText(null);
						
					});

					primaryStage.setScene(scene2);
					primaryStage.show();
				} else {
					suivant.setOnAction(event1 -> {
						i = random.getRandom();
						quest = questions.get(i);
						rep = reponses.get(i);
						l.setText(quest);

						buttonverification.setDisable(false);
						suivant.setDisable(true);
						l2.setText(null);
						text.setText(null);
						primaryStage.setScene(scene1);
						primaryStage.show();

					});
				}
			}

		});

	}

	/**
	 * creates the label in the top pane
	 * 
	 * @return the top pane as a hbox
	 */
	Pane createCenterPane() {

		Text text = new Text("Ce quizz est composé de 20 questions, vous devez vérifier votre réponse avant de passer à la question suivante." 
				+ "\n" + "Vous obtiendrez 1 point par bonne réponse. Bonne chance!");

		text.setFont(Font.font(null, FontWeight.LIGHT, 15));
		text.setFill(Color.CRIMSON);

		HBox boxTop = new HBox(10, text);
		boxTop.setAlignment(Pos.BOTTOM_CENTER);

		return boxTop;
	}

	/**
	 * creates a growable Button in the center pane
	 * 
	 * @return the center pane as a hbox
	 */
	Pane createBottomPane() {

		button.setText("Start");

		Rectangle rectLeft = new Rectangle(100, 100);
		rectLeft.setFill(Color.TRANSPARENT);
		Rectangle rectRight = new Rectangle(100, 100);
		rectRight.setFill(Color.TRANSPARENT);

		HBox boxCenter = new HBox( rectLeft, button, rectRight);
		boxCenter.setAlignment(Pos.CENTER);
		HBox.setHgrow(button, Priority.ALWAYS);

		return boxCenter;

	}
	/**
	 * creates the label in the top pane
	 * 
	 * @return the top pane as a hbox
	 */
	Pane createCenterPane1() {

		HBox boxTop1 = new HBox(10, l, text, buttonverification );
		boxTop1.setAlignment(Pos.CENTER);

		return boxTop1;
	}

	/**
	 * creates a growable Button in the center pane
	 * 
	 * @return the center pane as a hbox
	 */
	Pane createBottomPane1() {

		HBox boxCenter1 = new HBox(l2,suivant);
		boxCenter1.setAlignment(Pos.CENTER_RIGHT);

		return boxCenter1;

	}
	/**
	 * creates the label in the top pane
	 * 
	 * @return the top pane as a hbox
	 */
	Pane createCenterPane2() {

		HBox boxTop2 = new HBox(10, fin );

		boxTop2.setAlignment(Pos.CENTER);

		return boxTop2;
	}


	/**
	 * creates a growable Button in the center pane
	 * 
	 * @return the center pane as a hbox
	 */
	Pane createBottomPane2() {

		HBox boxCenter2 = new HBox(10,retourmenu, redemmarage);
		boxCenter2.setAlignment(Pos.TOP_CENTER);
		

		return boxCenter2;

	}


	public static void main(String[] args) {
		launch(args);
	}


}


