package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VocabularyPracticeApplication extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage window) {
        Dictionary dictionary = new Dictionary();
        Button EnterWords = new Button("Enter new words");
        Button Practice = new Button("Practice");
        Button AddWordsToTheDictionary = new Button("Add the word pair");
        Label Word = new Label("Word");
        Label Translation = new Label("Translation");
        TextField WordTxtField = new TextField();
        TextField TranslationField = new TextField();

        AddWordsToTheDictionary.setOnAction((value) -> {
            dictionary.add(WordTxtField.getText(), TranslationField.getText());
            WordTxtField.clear();
            TranslationField.clear();
        });

        HBox HorizontalLayout = new HBox();
        HorizontalLayout.setSpacing(10);
        HorizontalLayout.getChildren().add(EnterWords);
        HorizontalLayout.getChildren().add(Practice);

        VBox VerticalLayout = new VBox();
        VerticalLayout.setSpacing(10);
        VerticalLayout.setPadding(new Insets(10, 10, 10, 10));
        VerticalLayout.getChildren().add(Word);
        VerticalLayout.getChildren().add(WordTxtField);
        VerticalLayout.getChildren().add(Translation);
        VerticalLayout.getChildren().add(TranslationField);
        VerticalLayout.getChildren().add(AddWordsToTheDictionary);

        BorderPane pane = new BorderPane();
        pane.setTop(HorizontalLayout);
        pane.setCenter(VerticalLayout);

        Scene WindowContent = new Scene(pane);

        EnterWords.setOnAction((value) -> {
            window.setScene(WindowContent);
            window.show();
        });

        Label command = new Label();
        TextField PracticeTxtField = new TextField();
        Label results = new Label();
        Label randomizer = new Label();
        BorderPane PracticePane = new BorderPane();
        Button PracticeEnterWords = new Button("Enter new words");
        Button PracticeResultsButton = new Button("Check");

        HBox PracticeHorizontalLayout = new HBox();
        PracticeHorizontalLayout.setSpacing(10);
        PracticeHorizontalLayout.getChildren().add(PracticeEnterWords);

        VBox PracticeVerticalLayout = new VBox();
        PracticeVerticalLayout.setSpacing(10);
        PracticeVerticalLayout.setPadding(new Insets(10, 10, 10, 10));
        PracticeVerticalLayout.getChildren().add(command);
        PracticeVerticalLayout.getChildren().add(PracticeTxtField);
        PracticeVerticalLayout.getChildren().add(PracticeResultsButton);
        PracticeVerticalLayout.getChildren().add(results);

        PracticePane.setTop(PracticeHorizontalLayout);
        PracticePane.setCenter(PracticeVerticalLayout);
        Scene PracticeContent = new Scene(PracticePane);

        Practice.setOnAction((value) -> {
            randomizer.setText(dictionary.getRandomizedWord());
            command.setText("Translate the word" + " '" + randomizer.getText() + "'");
            window.setScene(PracticeContent);
            window.show();
        });

        PracticeResultsButton.setOnAction((value) -> {
            String UserInput = PracticeTxtField.getText();
            String Translated = dictionary.getTranslation(randomizer.getText());

            if (UserInput.equals(Translated)) {
                results.setText("Correct!");
            }
            else{
            results.setText("Incorrect!");
        }});

        PracticeEnterWords.setOnAction((value) -> {
            window.setScene(WindowContent);
            window.show();
        });

        window.setScene(WindowContent);
        window.show();
    }
}
