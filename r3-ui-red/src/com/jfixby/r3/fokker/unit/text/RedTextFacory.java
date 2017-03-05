
package com.jfixby.r3.fokker.unit.text;

import com.jfixby.r3.api.ui.unit.txt.TextBar;
import com.jfixby.r3.api.ui.unit.txt.TextBarSpecs;
import com.jfixby.r3.api.ui.unit.txt.TextFactory;
import com.jfixby.r3.fokker.unit.RedComponentsFactory;

public class RedTextFacory implements TextFactory {

	final RedComponentsFactory componentsFactory;

	public RedTextFacory (final RedComponentsFactory redComponentsFactory) {
		this.componentsFactory = redComponentsFactory;
	}

	@Override
	public TextBarSpecs newTextBarSpecs () {
		return new TextBarSpecs();
	}

	@Override
	public TextBar newTextBar (final TextBarSpecs text_specs) {
		return new RedTextBar(text_specs, this.componentsFactory);
	}

}
