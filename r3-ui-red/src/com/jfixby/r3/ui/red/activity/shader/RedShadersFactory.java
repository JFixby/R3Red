
package com.jfixby.r3.ui.red.activity.shader;

import com.jfixby.r3.ui.api.activity.ComponentsFactory;
import com.jfixby.r3.ui.api.activity.shader.ShaderFactory;
import com.jfixby.r3.ui.red.activity.RedComponentsFactory;

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
