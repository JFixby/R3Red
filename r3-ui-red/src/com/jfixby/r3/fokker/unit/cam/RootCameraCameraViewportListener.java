
package com.jfixby.r3.fokker.unit.cam;

import com.jfixby.r3.api.ui.unit.camera.Camera;
import com.jfixby.r3.api.ui.unit.camera.ScreenDimentions;
import com.jfixby.r3.api.ui.unit.user.CameraManager;

public class RootCameraCameraViewportListener implements CameraManager {

	@Override
	public void onScreenUpdate (final ScreenDimentions viewport_update, final Camera your_camera) {

		your_camera.setSize(viewport_update.getScreenWidth(), viewport_update.getScreenHeight());
	}

}
