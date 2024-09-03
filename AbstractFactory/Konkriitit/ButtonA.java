package Konkriitit;

import abin_straktit.Button;
import abin_straktit.TextField;
import abin_straktit.CheckBox;
import abin_straktit.UIFactory;

public class ButtonA extends Button {
	private String text;
	
	public ButtonA(String creText) {
		text = creText;
	}

	@Override
	public void Display() {
		System.out.println(text);
	}
	@Override
	public void setText(String newText) {
		text = newText;
	}
}
