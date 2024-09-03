import Konkriitit.FactoryA;
import Konkriitit.FactoryB;
import abin_straktit.Button;
import abin_straktit.CheckBox;
import abin_straktit.TextField;
import abin_straktit.UIFactory;

public class main {

	public static void main(String[] args) {
		System.out.println("luodaan tehtaat...");
		
		UIFactory aTehdas = new FactoryA();
		UIFactory bTehdas = new FactoryB();
		
		System.out.println("luodaan komponentit...");
		
		Button aButton = aTehdas.createButton("++A nappi++");
		TextField aTextField = aTehdas.createTextField("++A tekstikenttä++");
		CheckBox aCheckBox = aTehdas.createCheckBox("++A tsekkikenttä++");
		
		Button bButton = bTehdas.createButton("--B nappi--");
		TextField bTextField = bTehdas.createTextField("--B tekstikenttä--");
		CheckBox bCheckBox = bTehdas.createCheckBox("--b tsekkikenttä--");
		
		System.out.println("A Komponentit:");
		aButton.Display();
		aTextField.Display();
		aCheckBox.Display();
		
		System.out.println("B Komponentit:");
		bButton.Display();
		bTextField.Display();
		bCheckBox.Display();
		
		System.out.println("Vaihdetaan textit...");
		aButton.setText("++Uusi A teksti++");
		
		System.out.println("A Komponentit:");
		aButton.Display();
		aTextField.Display();
		aCheckBox.Display();
		
		
	}

}
