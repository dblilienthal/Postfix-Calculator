import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
//import javafx.Button;

public class Calculator extends Application
{
    TextField inputField;
    TextField outputField;
    
    AudioClip Yay;
    AudioClip byeBye;
    AudioClip Alert;
    AudioClip Boom;
    
    public void start(Stage window)
    {
        //creates the window title and sets a title
        window.show();
        window.setTitle("Calculator");
        
        //adudio files
        Yay = new AudioClip("file:Yay.wav");
        byeBye = new AudioClip("file:ByeBye.wav");
        Alert = new AudioClip("file:Alert.wav");
        Boom = new AudioClip("file:Boom.wav");
        
        //creates a new window and sets the size
        Pane canvas = new Pane();
        Scene myScene = new Scene(canvas, 650, 300);
        window.setScene(myScene);
        
        //insert the image right here.
        Image binary = new Image("BinaryaBackground.jpg", 650, 300, false, false);
        ImageView binaryView = new ImageView(binary);
        canvas.getChildren().add(binaryView);
        
        //creates the input and output labels
        Label inputLabel = new Label("Input");
        Label outputLabel = new Label("Output");
        inputLabel.setFont(Font.font ("Impact", 20));
        inputLabel.setStyle("-fx-background-color: #FF00FF; ");
        outputLabel.setFont(Font.font ("Impact", 20));
        outputLabel.setStyle("-fx-background-color: #FF00FF; ");
        canvas.getChildren().add(inputLabel);
        canvas.getChildren().add(outputLabel);
        inputLabel.relocate(25, 50);
        outputLabel.relocate(20, 100);
        
        //creates the text fields 
        inputField = new TextField();
        outputField = new TextField();
        canvas.getChildren().add(inputField);
        canvas.getChildren().add(outputField);
        inputField.relocate(80,50);
        outputField.relocate(80, 100);
        
        //creates the buttons
        Button calculateButton = new Button("Calculate!");
        Button clearButton = new Button("Clear");
        calculateButton.setFont(Font.font ("Impact", 12));
        clearButton.setFont(Font.font ("Impact", 12));
        clearButton.setPrefWidth(70);
        calculateButton.setPrefWidth(70);
        clearButton.setPrefHeight(40);
        calculateButton.setPrefHeight(40);
        canvas.getChildren().add(calculateButton);
        canvas.getChildren().add(clearButton);
        calculateButton.relocate(80, 150);
        clearButton.relocate(160, 150);
        //creates the action for the buttons
        calculateButton.setOnAction(this::handleCalculateButton);
        clearButton.setOnAction(this::handleClearButton);
        
        //create numberpad
        // #1
        Button oneButton = new Button("1");
        oneButton.setFont(Font.font ("Impact", 20));
        oneButton.setStyle("-fx-background-color: #FF00FF; ");
        oneButton.setPrefWidth(40);
        oneButton.setPrefHeight(40);
        canvas.getChildren().add(oneButton);
        oneButton.relocate(240,150);
        oneButton.setOnAction(this::handleOneButton);
        
        // #2
        Button twoButton = new Button("2");
        twoButton.setFont(Font.font ("Impact", 20));
        twoButton.setStyle("-fx-background-color: #FF00FF; ");
        twoButton.setPrefWidth(40);
        twoButton.setPrefHeight(40);
        canvas.getChildren().add(twoButton);
        twoButton.relocate(292,150);
        twoButton.setOnAction(this::handleTwoButton);
        
        // #3
        Button threeButton = new Button("3");
        threeButton.setFont(Font.font ("Impact", 20));
        threeButton.setStyle("-fx-background-color: #FF00FF; ");
        threeButton.setPrefWidth(40);
        threeButton.setPrefHeight(40);
        canvas.getChildren().add(threeButton);
        threeButton.relocate(344,150);
        threeButton.setOnAction(this::handleThreeButton);
        
        // #4
        Button fourButton = new Button("4");
        fourButton.setFont(Font.font ("Impact", 20));
        fourButton.setStyle("-fx-background-color: #FF00FF; ");
        fourButton.setPrefWidth(40);
        fourButton.setPrefHeight(40);
        canvas.getChildren().add(fourButton);
        fourButton.relocate(240,100);
        fourButton.setOnAction(this::handleFourButton);
        
        // #5
        Button fiveButton = new Button("5");
        fiveButton.setFont(Font.font ("Impact", 20));
        fiveButton.setStyle("-fx-background-color: #FF00FF; ");
        fiveButton.setPrefWidth(40);
        fiveButton.setPrefHeight(40);
        canvas.getChildren().add(fiveButton);
        fiveButton.relocate(292,100);
        fiveButton.setOnAction(this::handleFiveButton);
        
        // #6
        Button sixButton = new Button("6");
        sixButton.setFont(Font.font ("Impact", 20));
        sixButton.setStyle("-fx-background-color: #FF00FF; ");
        sixButton.setPrefWidth(40);
        sixButton.setPrefHeight(40);
        canvas.getChildren().add(sixButton);
        sixButton.relocate(344,100);
        sixButton.setOnAction(this::handleSixButton);
        
        // #7
        Button sevenButton = new Button("7");
        sevenButton.setFont(Font.font ("Impact", 20));
        sevenButton.setStyle("-fx-background-color: #FF00FF; ");
        sevenButton.setPrefWidth(40);
        sevenButton.setPrefHeight(40);
        canvas.getChildren().add(sevenButton);
        sevenButton.relocate(240,50);
        sevenButton.setOnAction(this::handleSevenButton);
        
        // #8
        Button eightButton = new Button("8");
        eightButton.setFont(Font.font ("Impact", 20));
        eightButton.setStyle("-fx-background-color: #FF00FF; ");
        eightButton.setPrefWidth(40);
        eightButton.setPrefHeight(40);
        canvas.getChildren().add(eightButton);
        eightButton.relocate(292,50);
        eightButton.setOnAction(this::handleEightButton);
        
        // #9
        Button nineButton = new Button("9");
        nineButton.setFont(Font.font ("Impact", 20));
        nineButton.setStyle("-fx-background-color: #FF00FF; ");
        nineButton.setPrefWidth(40);
        nineButton.setPrefHeight(40);
        canvas.getChildren().add(nineButton);
        nineButton.relocate(344,50);
        nineButton.setOnAction(this::handleNineButton);
        
        // #0
        Button zeroButton = new Button("0");
        zeroButton.setFont(Font.font ("Impact", 20));
        zeroButton.setStyle("-fx-background-color: #FF00FF; ");
        zeroButton.setPrefWidth(40);
        zeroButton.setPrefHeight(40);
        canvas.getChildren().add(zeroButton);
        zeroButton.relocate(240,200);
        zeroButton.setOnAction(this::handleZeroButton);
        
        // .
        Button dotButton = new Button(".");
        dotButton.setFont(Font.font ("Impact", 20));
        dotButton.setStyle("-fx-background-color: #FF00FF; ");
        dotButton.setPrefWidth(40);
        dotButton.setPrefHeight(40);
        canvas.getChildren().add(dotButton);
        dotButton.relocate(292,200);
        dotButton.setOnAction(this::handleDotButton);
        
        // Space
        Button spaceButton = new Button("SPACE");
        spaceButton.setFont(Font.font ("Impact", 20));
        spaceButton.setStyle("-fx-background-color: #FF00FF; ");
        spaceButton.setPrefWidth(150);
        spaceButton.setPrefHeight(40);
        canvas.getChildren().add(spaceButton);
        spaceButton.relocate(80,200);
        spaceButton.setOnAction(this::handleSpaceButton);
        
        // +
        Button plusButton = new Button("+");
        plusButton.setFont(Font.font ("Impact", 20));
        plusButton.setStyle("-fx-background-color: #FF00FF; ");
        plusButton.setPrefWidth(40);
        plusButton.setPrefHeight(40);
        canvas.getChildren().add(plusButton);
        plusButton.relocate(396, 200);
        plusButton.setOnAction(this::handlePlusButton);
        
        // -
        Button minusButton = new Button("-");
        minusButton.setFont(Font.font ("Impact", 20));
        minusButton.setStyle("-fx-background-color: #FF00FF; ");
        minusButton.setPrefWidth(40);
        minusButton.setPrefHeight(40);
        canvas.getChildren().add(minusButton);
        minusButton.relocate(396,150);
        minusButton.setOnAction(this::handleMinusButton);
        
        // / Divide
        
        Button divideButton = new Button("/");
        divideButton.setFont(Font.font ("Impact", 20));
        divideButton.setStyle("-fx-background-color: #FF00FF; ");
        divideButton.setPrefWidth(40);
        divideButton.setPrefHeight(40);
        canvas.getChildren().add(divideButton);
        divideButton.relocate(396,100);
        divideButton.setOnAction(this::handleDivideButton);
        
        // *
        Button multiplyButton = new Button("X");
        multiplyButton.setFont(Font.font ("Impact", 20));
        multiplyButton.setStyle("-fx-background-color: #FF00FF; ");
        multiplyButton.setPrefWidth(40);
        multiplyButton.setPrefHeight(40);
        canvas.getChildren().add(multiplyButton);
        multiplyButton.relocate(396,50);
        multiplyButton.setOnAction(this::handleMultiplyButton);
        
        // Smoots
        Button smootButton = new Button("Smoot");
        smootButton.setFont(Font.font ("Impact", 20));
        smootButton.setStyle("-fx-background-color: #FF00FF; ");
        smootButton.setPrefWidth(92);
        smootButton.setPrefHeight(40);
        canvas.getChildren().add(smootButton);
        smootButton.relocate(344,250);
        smootButton.setOnAction(this::handleSmootButton);
        
        // Distance
        Button distButton = new Button("Distance");
        distButton.setFont(Font.font ("Impact", 17));
        distButton.setStyle("-fx-background-color: #FF00FF; ");
        distButton.setPrefWidth(92);
        distButton.setPrefHeight(40);
        canvas.getChildren().add(distButton);
        distButton.relocate(448,250);
        distButton.setOnAction(this::handleDistButton);
        
        // Modulo
        Button modButton = new Button("%");
        modButton.setFont(Font.font ("Impact", 19));
        modButton.setStyle("-fx-background-color: #FF00FF; ");
        modButton.setPrefWidth(40);
        modButton.setPrefHeight(40);
        canvas.getChildren().add(modButton);
        modButton.relocate(344,200);
        modButton.setOnAction(this::handleModButton);
        
        //duplicate
        Button dupButton = new Button("Dup");
        dupButton.setFont(Font.font ("Impact", 13));
        dupButton.setStyle("-fx-background-color: #FF00FF; ");
        dupButton.setPrefWidth(40);
        dupButton.setPrefHeight(40);
        canvas.getChildren().add(dupButton);
        dupButton.relocate(448,50);
        dupButton.setOnAction(this::handleDupButton);
        
        // factorial
        Button facButton = new Button("!");
        facButton.setFont(Font.font ("Impact", 20));
        facButton.setStyle("-fx-background-color: #FF00FF; ");
        facButton.setPrefWidth(40);
        facButton.setPrefHeight(40);
        canvas.getChildren().add(facButton);
        facButton.relocate(500,50);
        facButton.setOnAction(this::handleFacButton);
        
        // negative
        Button negButton = new Button("NEGATIVE");
        negButton.setFont(Font.font ("Impact", 15));
        negButton.setStyle("-fx-background-color: #FF00FF; ");
        negButton.setPrefWidth(92);
        negButton.setPrefHeight(40);
        canvas.getChildren().add(negButton);
        negButton.relocate(240,250);
        negButton.setOnAction(this::handleNegButton);
        
        
        //sin
        Button sinButton = new Button("Sin");
        sinButton.setFont(Font.font ("Impact", 15));
        sinButton.setStyle("-fx-background-color: #FF00FF; ");
        sinButton.setPrefWidth(40);
        sinButton.setPrefHeight(40);
        canvas.getChildren().add(sinButton);
        sinButton.relocate(500,100);
        sinButton.setOnAction(this::handleSinButton);
        
        //cos
        Button cosButton = new Button("Cos");
        cosButton.setFont(Font.font ("Impact", 13));
        cosButton.setStyle("-fx-background-color: #FF00FF; ");
        cosButton.setPrefWidth(40);
        cosButton.setPrefHeight(40);
        canvas.getChildren().add(cosButton);
        cosButton.relocate(448,100);
        cosButton.setOnAction(this::handleCosButton);
        
        //tan
        Button tanButton = new Button("Tan");
        tanButton.setFont(Font.font ("Impact", 13));
        tanButton.setStyle("-fx-background-color: #FF00FF; ");
        tanButton.setPrefWidth(40);
        tanButton.setPrefHeight(40);
        canvas.getChildren().add(tanButton);
        tanButton.relocate(448,150);
        tanButton.setOnAction(this::handleTanButton);
        
        //exponent
        Button expButton = new Button("^");
        expButton.setFont(Font.font ("Impact", 20));
        expButton.setStyle("-fx-background-color: #FF00FF; ");
        expButton.setPrefWidth(40);
        expButton.setPrefHeight(40);
        canvas.getChildren().add(expButton);
        expButton.relocate(448,200);
        expButton.setOnAction(this::handleExpButton);
        
        //pi
        Button piButton = new Button("PI");
        piButton.setFont(Font.font ("Impact", 15));
        piButton.setStyle("-fx-background-color: #FF00FF; ");
        piButton.setPrefWidth(40);
        piButton.setPrefHeight(40);
        canvas.getChildren().add(piButton);
        piButton.relocate(500,150);
        piButton.setOnAction(this::handlePiButton);
        
        //square root
        Button sqrtButton = new Button("Sqrt");
        sqrtButton.setFont(Font.font ("Impact", 12));
        sqrtButton.setStyle("-fx-background-color: #FF00FF; ");
        sqrtButton.setPrefWidth(40);
        sqrtButton.setPrefHeight(40);
        canvas.getChildren().add(sqrtButton);
        sqrtButton.relocate(500,200);
        sqrtButton.setOnAction(this::handleSqrtButton);
        
        // to degrees from radians
        Button degButton = new Button("Degrees");
        degButton.setFont(Font.font ("Impact", 15));
        degButton.setStyle("-fx-background-color: #FF00FF; ");
        degButton.setPrefWidth(92);
        degButton.setPrefHeight(40);
        canvas.getChildren().add(degButton);
        degButton.relocate(552,50);
        degButton.setOnAction(this::handleDegButton);
        
        // to radians from degrees
        Button radButton = new Button("Radians");
        radButton.setFont(Font.font ("Impact", 15));
        radButton.setStyle("-fx-background-color: #FF00FF; ");
        radButton.setPrefWidth(92);
        radButton.setPrefHeight(40);
        canvas.getChildren().add(radButton);
        radButton.relocate(552,100);
        radButton.setOnAction(this::handleRadButton);
        
        // natural log e
        Button eButton = new Button("E");
        eButton.setFont(Font.font ("Impact", 20));
        eButton.setStyle("-fx-background-color: #FF00FF; ");
        eButton.setPrefWidth(92);
        eButton.setPrefHeight(40);
        canvas.getChildren().add(eButton);
        eButton.relocate(552,200);
        eButton.setOnAction(this::handleEButton);
        
        // absolute value
        Button absButton = new Button("Abs");
        absButton.setFont(Font.font ("Impact", 20));
        absButton.setStyle("-fx-background-color: #FF00FF; ");
        absButton.setPrefWidth(92);
        absButton.setPrefHeight(40);
        canvas.getChildren().add(absButton);
        absButton.relocate(552,150);
        absButton.setOnAction(this::handleAbsButton);
        
        // answer 
        Button answerButton = new Button("Answer");
        answerButton.setFont(Font.font ("Impact", 15));
        answerButton.setStyle("-fx-background-color: #FF00FF; ");
        answerButton.setPrefWidth(70);
        answerButton.setPrefHeight(40);
        canvas.getChildren().add(answerButton);
        answerButton.relocate(80,250);
        answerButton.setOnAction(this::handleAnswerButton);
        
        // delete
        Button deleteButton = new Button("Delete");
        deleteButton.setFont(Font.font ("Impact", 15));
        deleteButton.setStyle("-fx-background-color: #FF00FF; ");
        deleteButton.setPrefWidth(70);
        deleteButton.setPrefHeight(40);
        canvas.getChildren().add(deleteButton);
        deleteButton.relocate(160,250);
        deleteButton.setOnAction(this::handleDeleteButton);
        
        //rot
        Button rotButton = new Button("Rot");
        rotButton.setFont(Font.font ("Impact", 13));
        rotButton.setStyle("-fx-background-color: #FF00FF; ");
        rotButton.setPrefWidth(40);
        rotButton.setPrefHeight(40);
        canvas.getChildren().add(rotButton);
        rotButton.relocate(552,250);
        rotButton.setOnAction(this::handleRotButton);
        
        //swap
        Button swapButton = new Button("Swap");
        swapButton.setFont(Font.font ("Impact", 10));
        swapButton.setStyle("-fx-background-color: #FF00FF; ");
        swapButton.setPrefWidth(40);
        swapButton.setPrefHeight(40);
        canvas.getChildren().add(swapButton);
        swapButton.relocate(604,250);
        swapButton.setOnAction(this::handleSwapButton);
        
        // binary convertion
        /*Button binaryButton = new Button("Binary");
        binaryButton.setFont(Font.font ("Impact", 15));
        binaryButton.setStyle("-fx-background-color: #FF00FF; ");
        binaryButton.setPrefWidth(70);
        binaryButton.setPrefHeight(40);
        canvas.getChildren().add(binaryButton);
        binaryButton.relocate(4,250);
        binaryButton.setOnAction(this::handleBinaryButton);*/
        
        // decimal convertion
        
        // hexadecimal convertion
    }
    
    public void handleOneButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        String output = "1";
        inputField.setText("" + input + output );
        Alert.play();
    }
    
    public void handleTwoButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        String output = "2";
        inputField.setText("" + input + output ); 
        Alert.play();
    }
    
    public void handleThreeButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        String output = "3";
        inputField.setText("" + input + output );
        Alert.play();
    }
    
    public void handleFourButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        String output = "4";
        inputField.setText("" + input + output );
        Alert.play();
    }
    
    public void handleFiveButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        String output = "5";
        inputField.setText("" + input + output );
        Alert.play();
    }
    
    public void handleSixButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        String output = "6";
        inputField.setText("" + input + output );
        Alert.play();
    }
    
    public void handleSevenButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        String output = "7";
        inputField.setText("" + input + output );
        Alert.play();
    }
    
    public void handleEightButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        String output = "8";
        inputField.setText("" + input + output );
        Alert.play();
    }
    
    public void handleNineButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        String output = "9";
        inputField.setText("" + input + output );
        Alert.play();
    }
    
    public void handleZeroButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        String output = "0";
        inputField.setText("" + input + output );
        Alert.play();
    }
    
    public void handleDotButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        if (input.lastIndexOf('.') == input.length()-1)
        {
            String output = "";
            inputField.setText("" + input + output );
        }
        else
        {
            String output = ".";
            inputField.setText("" + input + output );
        }
        Alert.play();
    }
    
    public void handleSpaceButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        if (input.lastIndexOf(' ') == input.length()-1)
        {
            String output = "";
            inputField.setText("" + input + output );
        }
        else
        {
            String output = " ";
            inputField.setText("" + input + output );
        }
        Alert.play();
    }
    
    public void handlePlusButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        if (input.lastIndexOf(' ') == input.length()-1)
        {
            String output = "+ ";
            inputField.setText("" + input + output );
        }
        else
        {
            String output = " + ";
            inputField.setText("" + input + output );
        }
        Alert.play();
    }
    
    public void handleMinusButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        if (input.lastIndexOf(' ') == input.length()-1)
        {
            String output = "- ";
            inputField.setText("" + input + output );
        }
        else
        {
            String output = " - ";
            inputField.setText("" + input + output );
        }
        Alert.play();
    }
    
    public void handleDivideButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        if (input.lastIndexOf(' ') == input.length()-1)
        {
            String output = "/ ";
            inputField.setText("" + input + output );
        }
        else
        {
            String output = " / ";
            inputField.setText("" + input + output );
        }
        Alert.play();
    }
    
    public void handleMultiplyButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        if (input.lastIndexOf(' ') == input.length()-1)
        {
            String output = "* ";
            inputField.setText("" + input + output );
        }
        else
        {
            String output = " * ";
            inputField.setText("" + input + output );
        }
        Alert.play();
    }
    
    public void handleSmootButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        if (input.lastIndexOf(' ') == input.length()-1)
        {
            String output = "smoot ";
            inputField.setText("" + input + output );
        }
        else
        {
            String output = " smoot ";
            inputField.setText("" + input + output );
        }
        Alert.play();
    }
    
    public void handleDistButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        if (input.lastIndexOf(' ') == input.length()-1)
        {
            String output = "distance ";
            inputField.setText("" + input + output );
        }
        else
        {
            String output = " distance ";
            inputField.setText("" + input + output );
        }
        Alert.play();
    }
    
    public void handleModButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        if (input.lastIndexOf(' ') == input.length()-1)
        {
            String output = "% ";
            inputField.setText("" + input + output );
        }
        else
        {
            String output = " % ";
            inputField.setText("" + input + output );
        }
        Alert.play();
    }
    
    public void handleDupButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        if (input.lastIndexOf(' ') == input.length()-1)
        {
            String output = "dup ";
            inputField.setText("" + input + output );
        }
        else
        {
            String output = " dup ";
            inputField.setText("" + input + output );
        }
        Alert.play();
    }
    
    public void handleFacButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        if (input.lastIndexOf(' ') == input.length()-1)
        {
            String output = "! ";
            inputField.setText("" + input + output );
        }
        else
        {
            String output = " ! ";
            inputField.setText("" + input + output );
        }
        Alert.play();
    }
    
    public void handleSinButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        if (input.lastIndexOf(' ') == input.length()-1)
        {
            String output = "sin ";
            inputField.setText("" + input + output );
        }
        else
        {
            String output = " sin ";
            inputField.setText("" + input + output );
        }
        Alert.play();
    }
    
    public void handleCosButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        if (input.lastIndexOf(' ') == input.length()-1)
        {
            String output = "cos ";
            inputField.setText("" + input + output );
        }
        else
        {
            String output = " cos ";
            inputField.setText("" + input + output );
        }
        Alert.play();
    }
   
    public void handleSwapButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        if (input.lastIndexOf(' ') == input.length()-1)
        {
            String output = "swap ";
            inputField.setText("" + input + output );
        }
        else
        {
            String output = " swap ";
            inputField.setText("" + input + output );
        }
        Alert.play();
    }
    
    public void handleTanButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        if (input.lastIndexOf(' ') == input.length()-1)
        {
            String output = "tan ";
            inputField.setText("" + input + output );
        }
        else
        {
            String output = " tan ";
            inputField.setText("" + input + output );
        }
        Alert.play();
    }
    
    public void handlePiButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        if (input.lastIndexOf(' ') == input.length()-1)
        {
            String output = "pi ";
            inputField.setText("" + input + output );
        }
        else
        {
            String output = " pi ";
            inputField.setText("" + input + output );
        }
        Alert.play();
    }
    
    public void handleExpButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        if (input.lastIndexOf(' ') == input.length()-1)
        {
            String output = "^ ";
            inputField.setText("" + input + output );
        }
        else
        {
            String output = " ^ ";
            inputField.setText("" + input + output );
        }
        Alert.play();
    }
    
     
    public void handleRotButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        if (input.lastIndexOf(' ') == input.length()-1)
        {
            String output = "rot ";
            inputField.setText("" + input + output );
        }
        else
        {
            String output = " rot ";
            inputField.setText("" + input + output );
        }
        Alert.play();
    }
    
    public void handleSqrtButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        if (input.lastIndexOf(' ') == input.length()-1)
        {
            String output = "sqrt ";
            inputField.setText("" + input + output );
        }
        else
        {
            String output = " sqrt ";
            inputField.setText("" + input + output );
        }
        Alert.play();
    }
    
    public void handleDegButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        if (input.lastIndexOf(' ') == input.length()-1)
        {
            String output = "degrees ";
            inputField.setText("" + input + output );
        }
        else
        {
            String output = " degrees ";
            inputField.setText("" + input + output );
        }
        Alert.play();
    }
    
    public void handleRadButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        if (input.lastIndexOf(' ') == input.length()-1)
        {
            String output = "radians ";
            inputField.setText("" + input + output );
        }
        else
        {
            String output = " radians ";
            inputField.setText("" + input + output );
        }
        Alert.play();
    }
    
    public void handleAbsButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        if (input.lastIndexOf(' ') == input.length()-1)
        {
            String output = "abs ";
            inputField.setText("" + input + output );
        }
        else
        {
            String output = " abs ";
            inputField.setText("" + input + output );
        }
        Alert.play();
    }
    
    public void handleEButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        if (input.lastIndexOf(' ') == input.length()-1)
        {
            String output = "e ";
            inputField.setText("" + input + output );
        }
        else
        {
            String output = " e ";
            inputField.setText("" + input + output );
        }
        Alert.play();
    }
    
    public void handleNegButton(ActionEvent ae)
    {
        String input = inputField.getText();
        Postfix p = new Postfix(input);
        String output = "-";
        inputField.setText("" + input + output );
        Alert.play();
    }
    
    public void handleDeleteButton(ActionEvent ae)
    {
        String input = inputField.getText();
        if (input.lastIndexOf(' ') == input.length()-1)
        {
            inputField.setText(input.substring(0, input.length()-2));
        }
        else
        {
            inputField.setText(input.substring(0, input.length()-1));
        }
        Boom.play();
    }
    
    public void handleCalculateButton(ActionEvent ae)
    {
        String input = inputField.getText();
        
        //double dinput = input;
        Postfix p = new Postfix(input);
        
        double output = p.eval();
        
        outputField.setText("" + output);
        
        Yay.play();
        
    }
    
    public void handleAnswerButton(ActionEvent ae)
    {
        String input = outputField.getText();
        String output = input;
        inputField.setText("" + output );
        Alert.play();
    }
    
    /*public void handleBinaryButton(ActionEvent ae)
    {
        String input = outputField.getText();
        int result = Integer.parseInt(input);
        input = Integer.toBinaryString(result);
        //Integer.toString(Integer.toBinaryString(result));
        
        //String output = Integer.toString(result);
        outputField.setText("" + input);
        Alert.play();
    }*/
    
    public void handleClearButton(ActionEvent ae)
    {
        inputField.setText("");
        outputField.setText("");
        
        byeBye.play();
    } 
}