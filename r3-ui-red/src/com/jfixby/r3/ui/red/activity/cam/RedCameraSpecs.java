
package com.jfixby.r3.ui.red.activity.cam;

import com.jfixby.r3.ui.api.activity.camera.CameraSpecs;
import com.jfixby.r3.ui.api.activity.camera.SIMPLE_CAMERA_POLICY;
import com.jfixby.r3.ui.api.activity.user.CameraManager;

public class RedCameraSpecs implements CameraSpecs {

	private CameraManager cameraManager;

	@Override
	public void setCameraManager (final CameraManager cameraManager) {
		this.cameraManager = cameraManager;
	}

	@Override
	public CameraManager getCameraManager () {
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
