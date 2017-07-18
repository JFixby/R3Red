
package com.jfixby.r3.fokker.unit.shader;

import com.jfixby.r3.api.ui.unit.ComponentsFactory;
import com.jfixby.r3.api.ui.unit.shader.ShaderFactory;
import com.jfixby.r3.fokker.unit.RedComponentsFactory;

public class RedShadersFactory implements ShaderFactory {

	private final RedComponentsFactory parent;

	public RedShadersFactory (final RedComponentsFactory redComponentsFactory) {
		this.parent = redComponentsFactory;
	}

	@Override
	public ComponentsFactory parent () {
		return this.parent;
	}

}
