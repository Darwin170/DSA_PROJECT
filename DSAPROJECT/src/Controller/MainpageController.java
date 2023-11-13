package Controller;
import models.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.AmbientLight;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
public class MainpageController implements Initializable {

    @FXML
    Label label1,label2,label3,label4,label5,label6,label7,label8,label9;

    @FXML
    ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9;

    @FXML
   Button  ad1,ad2,ad3,ad4,ad5,ad6,ad7,ad8,ad9;
    @FXML
 Button del1,del2,del3,del4,del5,del6,del7,del8,del9;

    static FleetingLullaby FL=new FleetingLullaby();
    static FuturePerfect FP=new FuturePerfect();
    static Lihim LM =new Lihim();
    static Mercy MC=new Mercy();
    static Pasilyo PY=new Pasilyo();
    static RainingInManila RIM=new RainingInManila();
    static SNTY TY=new SNTY();
    static UnangSayaw US= new UnangSayaw();
    static Who WH=new Who();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
       //LIHIM
        LM.setProductName("LIHIM");
        label1.setText(LM.getProductName());

        LM.setProductImage("images/lihim.jpg");
        Image Lihim = new Image(LM.getProductImage());
        img1.setImage(Lihim);

        // STANDING NEXT TO YOU
         TY.setProductName("STANDING NEXT TO YOU");
        label2.setText(TY.getProductName());

        TY.setProductImage("images/SNTY.jpg");
        Image StandingNextToYou = new Image(TY.getProductImage());
        img2.setImage(StandingNextToYou);

        //UNANG SAYAW
         US.setProductName("UNANG SAYAW");
        label3.setText(US.getProductName());

        US.setProductImage("images/UnangSayaw.jpg");
        Image UnangSayaw = new Image(US.getProductImage());
        img3.setImage(UnangSayaw);

        // MERCY
         MC.setProductName("MERCY");
        label4.setText(MC.getProductName());

        MC.setProductImage("images/Mercy.jpg");
        Image Mercy = new Image(MC.getProductImage());
        img4.setImage(Mercy);

        //FLEETING LULLABY
         FL.setProductName("FLEETING LULLABY");
        label5.setText(FL.getProductName());

        FL.setProductImage("images/FleetingLullaby.jpg");
        Image FleetingLullaby = new Image(FL.getProductImage());
        img5.setImage(FleetingLullaby);

        //WHO
         WH.setProductName("WHO");
        label6.setText(WH.getProductName());

        WH.setProductImage("images/Who.jpg");
        Image who = new Image(WH.getProductImage());
        img6.setImage(who);
        
        //FUTURE PERFECT
         FP.setProductName("FUTURE PERFECT");
        label7.setText(FP.getProductName());

        FP.setProductImage("images/FuturePerfect.jpg");
        Image FuturePerfect = new Image(FP.getProductImage());
        img7.setImage(FuturePerfect);

        //PASILYO
         PY.setProductName("PASILYO");
        label8.setText(PY.getProductName());

        PY.setProductImage("images/Pasilyo.jpg");
        Image Pasilyo = new Image(PY.getProductImage());
        
        // RAINING IN MANILA
        RIM.setProductName("RAINING IN MANILA");;
        label9.setText(RIM.getProductName());
        
        RIM.setProductImage("images/RainingInManila.jpg");
        Image RainingInManila= new Image(RIM.getProductImage());
        img9.setImage(RainingInManila);
        System.out.println("NAGAnA");
    }

    public void set(ActionEvent event)throws IOException{
        Button sourceButton =(Button) event.getSource();

        if (sourceButton.equals(ad1)){
                LM.setProductStatus(true);
                ProductStore.addSelectedProduct(LM);
        }
        if (sourceButton.equals(ad2)){
                TY.setProductStatus(true);
                ProductStore.addSelectedProduct(TY);
        }
        if (sourceButton.equals(ad3)){
                US.setProductStatus(true);
                ProductStore.addSelectedProduct(US);
        }
        if (sourceButton.equals(ad4)){
                MC.setProductStatus(true);
                ProductStore.addSelectedProduct(MC);
        }
        if (sourceButton.equals(ad5)){
                FL.setProductStatus(true);
                ProductStore.addSelectedProduct(FL);
        }
        if (sourceButton.equals(ad6)){
                WH.setProductStatus(true);
                ProductStore.addSelectedProduct(WH);
        }
        if (sourceButton.equals(ad7)){
                FP.setProductStatus(true);
                ProductStore.addSelectedProduct(FP);
        }
        if (sourceButton.equals(ad8)){
                PY.setProductStatus(true);
                ProductStore.addSelectedProduct(PY);
        }
        if (sourceButton.equals(ad9)){
                RIM.setProductStatus(true);
                ProductStore.addSelectedProduct(RIM);
        }
        System.out.println(ProductStore.getSelectedProducts());
    }

    public void del(ActionEvent event) throws IOException{
        Button sourcButton = (Button) event.getSource();

        if (sourcButton.equals(del1)) {
                LM.setProductStatus(true);
                ProductStore.removeSelectedProduct(LM);
        }
        if (sourcButton.equals(del2)) {
                TY.setProductStatus(true);
                ProductStore.removeSelectedProduct(TY);
        }
        if (sourcButton.equals(del3)) {
                US.setProductStatus(true);
                ProductStore.removeSelectedProduct(US);
        }
        if (sourcButton.equals(del4)){
                MC.setProductStatus(true);
                ProductStore.removeSelectedProduct(MC);
        }
        if (sourcButton.equals(del5)){
                FL.setProductStatus(true);
                ProductStore.removeSelectedProduct(FL);
        }
        if (sourcButton.equals(del6)) {
                WH.setProductStatus(true);
                ProductStore.removeSelectedProduct(WH);
        }
        if (sourcButton.equals(del7)) {
                FP.setProductStatus(true);
                ProductStore.removeSelectedProduct(FP);
        }
        if (sourcButton.equals(del8)){
                PY.setProductStatus(true);
                ProductStore.removeSelectedProduct(PY);
        }
        if (sourcButton.equals(del9)) {
                RIM.setProductStatus(true);
                ProductStore.removeSelectedProduct(RIM);
        }
         System.out.println(ProductStore.getSelectedProducts());
    } 

}