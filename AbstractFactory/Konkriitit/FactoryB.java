package Konkriitit;

import abin_straktit.Button;
import abin_straktit.TextField;
import abin_straktit.CheckBox;
import abin_straktit.UIFactory;

public class FactoryB extends UIFactory {

	@Override
	public Button createButton(String text) {
		Button bButton = new ButtonB(text);
		return bButton;
	}

	@Override
	public TextField createTextField(String text) {
		TextField bTextField = new TextFieldB(text);
		return bTextField;
	}

	@Override
	public CheckBox createCheckBox(String text) {
		CheckBox bCheckBox = new CheckBoxB(text);
		return bCheckBox;
	}

}
