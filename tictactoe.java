package tic.tac.toe;

import com.sun.prism.paint.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Keertan.bhatt
 */
public class TicTacToe extends Application {
    
    @Override
   public void start(Stage primaryStage) throws FileNotFoundException{
         InputStream stream1 = new FileInputStream("D:\\JAvafx_codes\\gif\\x.gif");
      InputStream stream2 = new FileInputStream("D:\\JAvafx_codes\\gif\\o.gif");
      Image image1 = new Image(stream1);
      Image image2 = new Image(stream2);
           GridPane gridPane = new GridPane();
           gridPane.setPadding(new Insets(10, 10, 10, 10));
            gridPane.setVgap(5); 
      gridPane.setHgap(5);       
      
      //Setting the Grid alignment 
      gridPane.setAlignment(Pos.CENTER); 
        ImageView imageView[][] = new ImageView[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                 imageView[i][j]=new ImageView();
                 imageView[i][j].setX(10);
                 imageView[i][j].setY(10);
                 imageView[i][j].setFitWidth(100);
                 int c = 0 + (int)(Math.random() * 2);
                 
                 if(c==0)
                    imageView[i][j].setImage(image1);
                 else if (c==1)
                     imageView[i][j].setImage(image2);
                imageView[i][j].setPreserveRatio(true);
                gridPane.add(imageView[i][j], i, j);
            }
        }
      //Setting image to the image view
      //imageView.setImage(image);
      //Setting the image view parameters
        Scene scene = new Scene(gridPane, 400, 350);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
