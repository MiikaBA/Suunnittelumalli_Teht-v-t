package Konkriitit;

import abin_straktit.Button;
import abin_straktit.TextField;
import abin_straktit.CheckBox;
import abin_straktit.UIFactory;

public class CheckBoxB extends CheckBox {
	private String text;
	
	public CheckBoxB(String creText) {
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