
package com.jfixby.r3.ui.red.activity.shader;

import com.jfixby.r3.api.activity.ComponentsFactory;
import com.jfixby.r3.api.activity.shader.Shader;
import com.jfixby.r3.api.activity.shader.ShaderFactory;
import com.jfixby.r3.api.activity.shader.ShaderSpecs;
import com.jfixby.r3.ui.red.activity.RedComponentsFactory;
import com.jfixby.scarabei.api.err.Err;

public class RedShadersFactory implements ShaderFactory {

	private final RedComponentsFactory parent;

	public RedShadersFactory (final RedComponentsFactory redComponentsFactory) {
		this.parent = redComponentsFactory;
	}

	@Override
	public ComponentsFactory parent () {
		return this.parent;
	}

	@Override
	public ShaderSpecs newShaderSpecs () {
		return new ShaderSpecs();
	}

	@Override
	public Shader newShader (final ShaderSpecs specs) {
		Err.throwNotImplementedYet();
		return null;
	}

}
