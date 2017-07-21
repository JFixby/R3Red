
package com.jfixby.r3.ui.red.activity.cam;

import com.jfixby.r3.api.activity.camera.CanvasCameraSpecs;
import com.jfixby.r3.api.activity.camera.SIMPLE_CAMERA_POLICY;
import com.jfixby.r3.api.activity.user.CanvasCameraManager;

public class RedCameraSpecs implements CanvasCameraSpecs {

	private CanvasCameraManager cameraManager;

	@Override
	public void setCameraManager (final CanvasCameraManager cameraManager) {
		this.cameraManager = cameraManager;
	}

	@Override
	public CanvasCameraManager getCameraManager () {
		return this.cameraManager;
	}

	SIMPLE_CAMERA_POLICY policy;

	@Override
	public void setSimpleCameraPolicy (final SIMPLE_CAMERA_POLICY policy) {
		this.policy = policy;
	}

	@Override
	public SIMPLE_CAMERA_POLICY getSimpleCameraPolicy () {
		return this.policy;
	}

}
