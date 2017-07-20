
package com.jfixby.r3.ui.red.activity.cam;

import com.jfixby.r3.ui.api.activity.camera.Camera;
import com.jfixby.r3.ui.api.activity.camera.ScreenDimentions;
import com.jfixby.r3.ui.api.activity.user.CameraManager;

public class RootCameraCameraViewportListener implements CameraManager {

	@Override
	public void onScreenUpdate (final ScreenDimentions viewport_update, final Camera your_camera) {

		your_camera.setSize(viewport_update.getScreenWidth(), viewport_update.getScreenHeight());
	}

}
