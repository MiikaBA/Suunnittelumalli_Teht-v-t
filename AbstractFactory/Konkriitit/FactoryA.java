package Konkriitit;

import abin_straktit.Button;
import abin_straktit.TextField;
import abin_straktit.CheckBox;
import abin_straktit.UIFactory;

public class FactoryA extends UIFactory{

	@Override
	public Button createButton(String text) {
		Button aButton = new ButtonA(text);
		return aButton;
	}

	@Override
	public TextField createTextField(String text) {
		TextField aTextField = new TextFieldA(text);
		return aTextField;
	}

	@Override
	public CheckBox createCheckBox(String text) {
		CheckBox aCheckBox = new CheckBoxA(text);
		return aCheckBox;
	}
	
}
