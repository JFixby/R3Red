
package com.jfixby.r3.ui.red.activity.cam;

import com.jfixby.r3.ui.api.activity.camera.CameraFactory;
import com.jfixby.r3.ui.api.activity.camera.CameraSpecs;
import com.jfixby.r3.ui.api.activity.camera.Shadow;
import com.jfixby.r3.ui.api.activity.camera.ShadowSpecs;
import com.jfixby.r3.ui.red.activity.RedComponentsFactory;

public class RedCameraFactory implements CameraFactory {

	private final RedComponentsFactory master;

	public RedCameraFactory (final RedComponentsFactory redComponentsFactory) {
		this.master = redComponentsFactory;
	}

	@Override
	public ShadowSpecs newShadowSpecs () {
		return new RedShadowSpecs();
	}

	@Override
	public Shadow newShadow (final ShadowSpecs shadow_specs) {
		return new RedShadow(shadow_specs, this.master);
	}

	@Override
	public CameraSpecs newCameraSpecs () {
		return new RedCameraSpecs();
	}

	@Override
	public RedCamera newCamera (final CameraSpecs cam_properties) {
		return new RedCamera(cam_properties, this.master);
	}

}
