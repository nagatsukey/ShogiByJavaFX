package application;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class ShogiController {
	@FXML private ImageView cell_00;


	@FXML
	private void clickCell_00(){
		Image ou = new Image(getClass().getResourceAsStream("sgl01.png"));

		cell_00.setImage(ou);
	}
}
