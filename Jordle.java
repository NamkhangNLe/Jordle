import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import java.util.Arrays;

/**
 * @author Namkhang
 * @version 8
 */
public class Jordle extends Application {
    /**
     * @param args main method.
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * @param primaryStage primary stage.
     */
    public void start(Stage primaryStage) {
        //page name.
        primaryStage.setTitle("Jordle");

        //page layout.
        BorderPane pane = new BorderPane();

        //game name.
        Label topTitle = new Label("Jordle");
        Font font = Font.font(30);
        topTitle.setFont(font);
        topTitle.setTextFill(Color.BLACK);
        BorderPane.setAlignment(topTitle, Pos.CENTER);
        pane.setTop(topTitle);

        //game state.
        Label gameState = new Label("Try guessing a word!");
        BorderPane.setAlignment(gameState, Pos.CENTER);
        pane.setBottom(gameState);

        //instruction button.
        Button instructions = new Button();
        instructions.setText("Instructions");
        instructions.setOnAction(event -> {

            GridPane secondaryLayout = new GridPane();
            secondaryLayout.setAlignment(Pos.CENTER);
            secondaryLayout.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
            secondaryLayout.setHgap(5.5);
            secondaryLayout.setVgap(5.5);

            secondaryLayout.add(new Label("Welcome to Jordle!"), 0, 0);
            secondaryLayout.add(new Label("Try guessing some words! You will have 6 guesses."), 0, 1);
            secondaryLayout.add(new Label("All of which consists of real 5 letter words."), 0, 2);
            secondaryLayout.add(new Label("Letters in the correct location turn green."), 0, 3);
            secondaryLayout.add(new Label("Letters in the wrong location turn yellow."), 0, 4);
            secondaryLayout.add(new Label("Letters that are incorrect turn grey."), 0, 5);
            secondaryLayout.add(new Label("Don't forget to share:)"), 0, 6);

            Scene secondScene = new Scene(secondaryLayout, 330, 200);
            Stage newWindow = new Stage();
            newWindow.setTitle("Instructions");
            newWindow.setScene(secondScene);
            newWindow.setX(primaryStage.getX() + 200);
            newWindow.setY(primaryStage.getY() + 100);

            newWindow.show();
        });
        BorderPane.setAlignment(instructions, Pos.CENTER);
        pane.setLeft(instructions);

        //restart button.
        Button restart = new Button();
        restart.setText("Restart");
        restart.setOnAction(event -> System.out.println("Restart text"));
        BorderPane.setAlignment(restart, Pos.CENTER);
        pane.setRight(restart);

        //Sets up middle GridPane playing area.
        GridPane p1 = new GridPane();
        pane.setCenter(p1);

        p1.setAlignment(Pos.CENTER);
        p1.setPadding(new Insets(10));
        p1.setHgap(5);
        p1.setVgap(1);
        GridPane.setHalignment(restart, HPos.RIGHT);

        Scene scene = new Scene(pane, 750, 750);
        primaryStage.setScene(scene);
        primaryStage.show();

        Label s01 = new Label("   ");
        s01.setFont(font);
        s01.setTextFill(Color.BLACK);
        s01.setPadding(new Insets(25, 30, 25, 30));
        s01.setStyle("-fx-text-fill: black;"
        + "-fx-background-color: white;" + "-fx-border-color:     black;");
        p1.add(s01, 0, 1);

        Label s11 = new Label("   ");
        s11.setFont(font);
        s11.setTextFill(Color.BLACK);
        s11.setPadding(new Insets(25, 30, 25, 30));
        s11.setStyle("-fx-text-fill: black;"
        + "-fx-background-color: white;" + "-fx-border-color:     black;");
        p1.add(s11, 1, 1);

        Label s21 = new Label("   ");
        s21.setFont(font);
        s21.setTextFill(Color.BLACK);
        s21.setPadding(new Insets(25, 30, 25, 30));
        s21.setStyle("-fx-text-fill: black;"
        + "-fx-background-color: white;" + "-fx-border-color:     black;");
        p1.add(s21, 2, 1);

        Label s31 = new Label("   ");
        s31.setFont(font);
        s31.setTextFill(Color.BLACK);
        s31.setPadding(new Insets(25, 30, 25, 30));
        s31.setStyle("-fx-text-fill: black;"
        + "-fx-background-color: white;" + "-fx-border-color:     black;");
        p1.add(s31, 3, 1);

        Label s41 = new Label("   ");
        s41.setFont(font);
        s41.setTextFill(Color.BLACK);
        s41.setPadding(new Insets(25, 30, 25, 30));
        s41.setStyle("-fx-text-fill: black;"
        + "-fx-background-color: white;" + "-fx-border-color:     black;");
        p1.add(s41, 4, 1);

        Label s02 = new Label("   ");
        s02.setFont(font);
        s02.setTextFill(Color.BLACK);
        s02.setPadding(new Insets(25, 30, 25, 30));
        s02.setStyle("-fx-text-fill: black;"
        + "-fx-background-color: white;" + "-fx-border-color:     black;");
        p1.add(s02, 0, 2);

        Label s12 = new Label("   ");
        s12.setFont(font);
        s12.setTextFill(Color.BLACK);
        s12.setPadding(new Insets(25, 30, 25, 30));
        s12.setStyle("-fx-text-fill: black;"
        + "-fx-background-color: white;" + "-fx-border-color:     black;");
        p1.add(s12, 1, 2);

        Label s22 = new Label("   ");
        s22.setFont(font);
        s22.setTextFill(Color.BLACK);
        s22.setPadding(new Insets(25, 30, 25, 30));
        s22.setStyle("-fx-text-fill: black;"
        + "-fx-background-color: white;" + "-fx-border-color:     black;");
        p1.add(s22, 2, 2);

        Label s32 = new Label("   ");
        s32.setFont(font);
        s32.setTextFill(Color.BLACK);
        s32.setPadding(new Insets(25, 30, 25, 30));
        s32.setStyle("-fx-text-fill: black;"
        + "-fx-background-color: white;" + "-fx-border-color:     black;");
        p1.add(s32, 3, 2);

        Label s42 = new Label("   ");
        s42.setFont(font);
        s42.setTextFill(Color.BLACK);
        s42.setPadding(new Insets(25, 30, 25, 30));
        s42.setStyle("-fx-text-fill: black;"
        + "-fx-background-color: white;" + "-fx-border-color:     black;");
        p1.add(s42, 4, 2);

        Label s03 = new Label("   ");
        s03.setFont(font);
        s03.setTextFill(Color.BLACK);
        s03.setPadding(new Insets(25, 30, 25, 30));
        s03.setStyle("-fx-text-fill: black;"
        + "-fx-background-color: white;" + "-fx-border-color:     black;");
        p1.add(s03, 0, 3);

        Label s13 = new Label("   ");
        s13.setFont(font);
        s13.setTextFill(Color.BLACK);
        s13.setPadding(new Insets(25, 30, 25, 30));
        s13.setStyle("-fx-text-fill: black;"
        + "-fx-background-color: white;" + "-fx-border-color:     black;");
        p1.add(s13, 1, 3);

        Label s23 = new Label("   ");
        s23.setFont(font);
        s23.setTextFill(Color.BLACK);
        s23.setPadding(new Insets(25, 30, 25, 30));
        s23.setStyle("-fx-text-fill: black;"
        + "-fx-background-color: white;" + "-fx-border-color:     black;");
        p1.add(s23, 2, 3);

        Label s33 = new Label("   ");
        s33.setFont(font);
        s33.setTextFill(Color.BLACK);
        s33.setPadding(new Insets(25, 30, 25, 30));
        s33.setStyle("-fx-text-fill: black;"
        + "-fx-background-color: white;" + "-fx-border-color:     black;");
        p1.add(s33, 3, 3);

        Label s43 = new Label("   ");
        s43.setFont(font);
        s43.setTextFill(Color.BLACK);
        s43.setPadding(new Insets(25, 30, 25, 30));
        s43.setStyle("-fx-text-fill: black;"
        + "-fx-background-color: white;" + "-fx-border-color:     black;");
        p1.add(s43, 4, 3);

        Label s04 = new Label("   ");
        s04.setFont(font);
        s04.setTextFill(Color.BLACK);
        s04.setPadding(new Insets(25, 30, 25, 30));
        s04.setStyle("-fx-text-fill: black;"
        + "-fx-background-color: white;" + "-fx-border-color:     black;");
        p1.add(s04, 0, 4);

        Label s14 = new Label("   ");
        s14.setFont(font);
        s14.setTextFill(Color.BLACK);
        s14.setPadding(new Insets(25, 30, 25, 30));
        s14.setStyle("-fx-text-fill: black;"
        + "-fx-background-color: white;" + "-fx-border-color:     black;");
        p1.add(s14, 1, 4);

        Label s24 = new Label("   ");
        s24.setFont(font);
        s24.setTextFill(Color.BLACK);
        s24.setPadding(new Insets(25, 30, 25, 30));
        s24.setStyle("-fx-text-fill: black;"
        + "-fx-background-color: white;" + "-fx-border-color:     black;");
        p1.add(s24, 2, 4);

        Label s34 = new Label("   ");
        s34.setFont(font);
        s34.setTextFill(Color.BLACK);
        s34.setPadding(new Insets(25, 30, 25, 30));
        s34.setStyle("-fx-text-fill: black;"
        + "-fx-background-color: white;" + "-fx-border-color:     black;");
        p1.add(s34, 3, 4);

        Label s44 = new Label("   ");
        s44.setFont(font);
        s44.setTextFill(Color.BLACK);
        s44.setPadding(new Insets(25, 30, 25, 30));
        s44.setStyle("-fx-text-fill: black;"
        + "-fx-background-color: white;" + "-fx-border-color:     black;");
        p1.add(s44, 4, 4);

        Label s05 = new Label("   ");
        s05.setFont(font);
        s05.setTextFill(Color.BLACK);
        s05.setPadding(new Insets(25, 30, 25, 30));
        s05.setStyle("-fx-text-fill: black;"
        + "-fx-background-color: white;" + "-fx-border-color:     black;");
        p1.add(s05, 0, 5);

        Label s15 = new Label("   ");
        s15.setFont(font);
        s15.setTextFill(Color.BLACK);
        s15.setPadding(new Insets(25, 30, 25, 30));
        s15.setStyle("-fx-text-fill: black;"
        + "-fx-background-color: white;" + "-fx-border-color:     black;");
        p1.add(s15, 1, 5);

        Label s25 = new Label("   ");
        s25.setFont(font);
        s25.setTextFill(Color.BLACK);
        s25.setPadding(new Insets(25, 30, 25, 30));
        s25.setStyle("-fx-text-fill: black;"
        + "-fx-background-color: white;" + "-fx-border-color:     black;");
        p1.add(s25, 2, 5);

        Label s35 = new Label("   ");
        s35.setFont(font);
        s35.setTextFill(Color.BLACK);
        s35.setPadding(new Insets(25, 30, 25, 30));
        s35.setStyle("-fx-text-fill: black;"
        + "-fx-background-color: white;" + "-fx-border-color:     black;");
        p1.add(s35, 3, 5);

        Label s45 = new Label("   ");
        s45.setFont(font);
        s45.setTextFill(Color.BLACK);
        s45.setPadding(new Insets(25, 30, 25, 30));
        s45.setStyle("-fx-text-fill: black;"
        + "-fx-background-color: white;" + "-fx-border-color:     black;");
        p1.add(s45, 4, 5);

        Label s06 = new Label("   ");
        s06.setFont(font);
        s06.setTextFill(Color.BLACK);
        s06.setPadding(new Insets(25, 30, 25, 30));
        s06.setStyle("-fx-text-fill: black;"
        + "-fx-background-color: white;" + "-fx-border-color:     black;");
        p1.add(s06, 0, 6);

        Label s16 = new Label("   ");
        s16.setFont(font);
        s16.setTextFill(Color.BLACK);
        s16.setPadding(new Insets(25, 30, 25, 30));
        s16.setStyle("-fx-text-fill: black;"
        + "-fx-background-color: white;" + "-fx-border-color:     black;");
        p1.add(s16, 1, 6);

        Label s26 = new Label("   ");
        s26.setFont(font);
        s26.setTextFill(Color.BLACK);
        s26.setPadding(new Insets(25, 30, 25, 30));
        s26.setStyle("-fx-text-fill: black;"
        + "-fx-background-color: white;" + "-fx-border-color:     black;");
        p1.add(s26, 2, 6);

        Label s36 = new Label("   ");
        s36.setFont(font);
        s36.setTextFill(Color.BLACK);
        s36.setPadding(new Insets(25, 30, 25, 30));
        s36.setStyle("-fx-text-fill: black;"
        + "-fx-background-color: white;" + "-fx-border-color:     black;");
        p1.add(s36, 3, 6);

        Label s46 = new Label("   ");
        s46.setFont(font);
        s46.setTextFill(Color.BLACK);
        s46.setPadding(new Insets(25, 30, 25, 30));
        s46.setStyle("-fx-text-fill: black;"
        + "-fx-background-color: white;" + "-fx-border-color:     black;");
        p1.add(s46, 4, 6);


        Label[][] arr = {{s01, s11, s21, s31, s41 },
        {s02, s12, s22, s32, s42 },
        {s03, s13, s23, s33, s43 },
        {s04, s14, s24, s34, s44 },
        {s05, s15, s25, s35, s45 },
        {s06, s16, s26, s36, s46 }};

        //Random word from Words.java.
        int randomIndex = (int) (Math.random() * (Words.list).size());
        String word = Words.list.get(randomIndex);
        String one = word.substring(0, 1);
        String two = word.substring(1, 2);
        String three = word.substring(2, 3);
        String four = word.substring(3, 4);
        String five = word.substring(4, 5);

        String[] l = new String[5];
        l[0] = one.toUpperCase();
        l[1] = two.toUpperCase();
        l[2] = three.toUpperCase();
        l[3] = four.toUpperCase();
        l[4] = five.toUpperCase();

        System.out.println(Arrays.toString(l));
//        System.out.println(word);
//        System.out.println(one);
//        System.out.println(two);
//        System.out.println(three);
//        System.out.println(four);
//        System.out.println(five);

        //Key registration
        int[] i = {0};
        int[] j = {0};
        String[] k = new String[5];
        scene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.A) {
                arr[i[0]][j[0]].setText("A");
                if (j[0] < 5) {
                    k[j[0]] = "A";
                    j[0] += 1;
                }
            }
            if (event.getCode() == KeyCode.B) {
                if (j[0] < 5) {
                    arr[i[0]][j[0]].setText("B");
                    k[j[0]] = "B";
                    j[0] += 1;
                }
            }
            if (event.getCode() == KeyCode.C) {
                if (j[0] < 5) {
                    arr[i[0]][j[0]].setText("C");
                    k[j[0]] = "C";
                    j[0] += 1;
                }
            }
            if (event.getCode() == KeyCode.D) {
                if (j[0] < 5) {
                    arr[i[0]][j[0]].setText("D");
                    k[j[0]] = "D";
                    j[0] += 1;
                }
            }
            if (event.getCode() == KeyCode.E) {
                if (j[0] < 5) {
                    arr[i[0]][j[0]].setText("E");
                    k[j[0]] = "E";
                    j[0] += 1;
                }
            }
            if (event.getCode() == KeyCode.F) {
                if (j[0] < 5) {
                    arr[i[0]][j[0]].setText("F");
                    k[j[0]] = "F";
                    j[0] += 1;
                }
            }
            if (event.getCode() == KeyCode.G) {
                if (j[0] < 5) {
                    arr[i[0]][j[0]].setText("G");
                    k[j[0]] = "G";
                    j[0] += 1;
                }
            }
            if (event.getCode() == KeyCode.H) {
                if (j[0] < 5) {
                    arr[i[0]][j[0]].setText("H");
                    k[j[0]] = "H";
                    j[0] += 1;
                }
            }
            if (event.getCode() == KeyCode.I) {
                if (j[0] < 5) {
                    arr[i[0]][j[0]].setText("I");
                    k[j[0]] = "I";
                    j[0] += 1;
                }
            }
            if (event.getCode() == KeyCode.J) {
                if (j[0] < 5) {
                    arr[i[0]][j[0]].setText("J");
                    k[j[0]] = "J";
                    j[0] += 1;
                }
            }
            if (event.getCode() == KeyCode.K) {
                if (j[0] < 5) {
                    arr[i[0]][j[0]].setText("K");
                    k[j[0]] = "K";
                    j[0] += 1;
                }
            }
            if (event.getCode() == KeyCode.L) {
                if (j[0] < 5) {
                    arr[i[0]][j[0]].setText("L");
                    k[j[0]] = "L";
                    j[0] += 1;
                }
            }
            if (event.getCode() == KeyCode.M) {
                if (j[0] < 5) {
                    arr[i[0]][j[0]].setText("M");
                    k[j[0]] = "M";
                    j[0] += 1;
                }
            }
            if (event.getCode() == KeyCode.N) {
                if (j[0] < 5) {
                    arr[i[0]][j[0]].setText("N");
                    k[j[0]] = "N";
                    j[0] += 1;
                }
            }
            if (event.getCode() == KeyCode.O) {
                if (j[0] < 5) {
                    arr[i[0]][j[0]].setText("O");
                    k[j[0]] = "O";
                    j[0] += 1;
                }
            }
            if (event.getCode() == KeyCode.P) {
                if (j[0] < 5) {
                    arr[i[0]][j[0]].setText("P");
                    k[j[0]] = "P";
                    j[0] += 1;
                }
            }
            if (event.getCode() == KeyCode.Q) {
                if (j[0] < 5) {
                    arr[i[0]][j[0]].setText("Q");
                    k[j[0]] = "Q";
                    j[0] += 1;
                }
            }
            if (event.getCode() == KeyCode.R) {
                if (j[0] < 5) {
                    arr[i[0]][j[0]].setText("R");
                    k[j[0]] = "R";
                    j[0] += 1;
                }
            }
            if (event.getCode() == KeyCode.S) {
                if (j[0] < 5) {
                    arr[i[0]][j[0]].setText("S");
                    k[j[0]] = "S";
                    j[0] += 1;
                }
            }
            if (event.getCode() == KeyCode.T) {
                if (j[0] < 5) {
                    arr[i[0]][j[0]].setText("T");
                    k[j[0]] = "T";
                    j[0] += 1;
                }
            }
            if (event.getCode() == KeyCode.U) {
                if (j[0] < 5) {
                    arr[i[0]][j[0]].setText("U");
                    k[j[0]] = "U";
                    j[0] += 1;
                }
            }
            if (event.getCode() == KeyCode.V) {
                if (j[0] < 5) {
                    arr[i[0]][j[0]].setText("V");
                    k[j[0]] = "V";
                    j[0] += 1;
                }
            }
            if (event.getCode() == KeyCode.W) {
                if (j[0] < 5) {
                    arr[i[0]][j[0]].setText("W");
                    k[j[0]] = "W";
                    j[0] += 1;
                }
            }
            if (event.getCode() == KeyCode.X) {
                if (j[0] < 5) {
                    arr[i[0]][j[0]].setText("X");
                    k[j[0]] = "X";
                    j[0] += 1;
                }
            }
            if (event.getCode() == KeyCode.Y) {
                if (j[0] < 5) {
                    arr[i[0]][j[0]].setText("Y");
                    k[j[0]] = "Y";
                    j[0] += 1;
                }
            }
            if (event.getCode() == KeyCode.Z) {
                if (j[0] < 5) {
                    arr[i[0]][j[0]].setText("Z");
                    k[j[0]] = "Z";
                    j[0] += 1;
                }
            }
            //j is horizontal
            //i is vertical
            //l array is correct word
            //k array is user input
            if (event.getCode() == KeyCode.ENTER) {
                arr[i[0]][0].setStyle("-fx-background-color: grey;");
                arr[i[0]][1].setStyle("-fx-background-color: grey;");
                arr[i[0]][2].setStyle("-fx-background-color: grey;");
                arr[i[0]][3].setStyle("-fx-background-color: grey;");
                arr[i[0]][4].setStyle("-fx-background-color: grey;");
                for (int b = 0; b < 5; b++) {
                    for (int c = 0; c < 5; c++) {
                        if (l[b].equals(k[c])) {
                            arr[i[0]][c].setStyle("-fx-background-color: yellow;");
                        }
                    }
                }
                for (int a = 0; a < 5; a++) {
                    if (l[a].equals(k[a])) {
                        arr[i[0]][a].setStyle("-fx-background-color: green;");
                    }
                }
                i[0] += 1;
                j[0] = 0;
                if (l[0].equals(k[0]) || l[1].equals(k[1])
                || l[2].equals(k[2]) || l[3].equals(k[3]) || l[4].equals(k[4])) {
                    gameState.setText("Congratulations!"
                    + "You’ve guessed the word!");
                }
                if (i[0] > 4) {
                    gameState.setText("Game over. The word was " + l[0] + l[1] + l[2] + l[3] + l[4]);
                }
            }
            if (event.getCode() == KeyCode.BACK_SPACE) {
                j[0] -= 1;
                arr[i[0]][j[0]].setText("   ");
                arr[i[0]][j[0]].setStyle("-fx-text-fill: black;"
                + "-fx-background-color: white;" + "-fx-border-color:     black;");
            }
        });
        restart.setOnAction(event -> {
            i[0] = 0;
            j[0] = 0;
            gameState.setText("Try guessing a word!");

            for (int d = 0; d <= 5; d++) {
                for (int e = 0; e <= 4; e++) {
                    arr[d][e].setStyle("-fx-text-fill: black;"
                    + "-fx-background-color: white;" + "-fx-border-color:     black;");
                    arr[d][e].setText("   ");
                }
            }
            int randomIndex2 = (int) (Math.random() * (Words.list).size());
            String word2 = Words.list.get(randomIndex2);
            String one2 = word2.substring(0, 1);
            String two2 = word2.substring(1, 2);
            String three2 = word2.substring(2, 3);
            String four2 = word2.substring(3, 4);
            String five2 = word2.substring(4, 5);

            String[] ll = new String[5];
            ll[0] = one2.toUpperCase();
            ll[1] = two2.toUpperCase();
            ll[2] = three2.toUpperCase();
            ll[3] = four2.toUpperCase();
            ll[4] = five2.toUpperCase();

            l[0] = ll[0];
            l[1] = ll[1];
            l[2] = ll[2];
            l[3] = ll[3];
            l[4] = ll[4];

            System.out.println(Arrays.toString(ll));
        });
    }
}