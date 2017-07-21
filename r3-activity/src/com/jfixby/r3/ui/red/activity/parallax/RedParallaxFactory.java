
package com.jfixby.r3.ui.red.activity.parallax;

import com.jfixby.r3.api.activity.parallax.Parallax;
import com.jfixby.r3.api.activity.parallax.ParallaxFactory;
import com.jfixby.r3.api.activity.parallax.ParallaxSpecs;
import com.jfixby.r3.ui.red.activity.RedComponentsFactory;

public class RedParallaxFactory implements ParallaxFactory {

	public final RedComponentsFactory redComponentsFactory;

	public RedParallaxFactory (final RedComponentsFactory redComponentsFactory) {
		this.redComponentsFactory = redComponentsFactory;
	}

	@Override
	public ParallaxSpecs newParallaxSpecs () {
		return new RedParallaxSpecs();
	}

	@Override
	public Parallax newParallax (final ParallaxSpecs specs) {
		return new RedParallax(this, specs);
	}

}
