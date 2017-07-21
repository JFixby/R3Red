
package com.jfixby.r3.ui.red.activity.cam;

import com.jfixby.r3.api.activity.camera.CanvasCamera;
import com.jfixby.r3.api.activity.camera.ScreenDimentions;
import com.jfixby.r3.api.activity.user.CanvasCameraManager;

public class RootCameraCameraViewportListener implements CanvasCameraManager {

	@Override
	public void onScreenUpdate (final ScreenDimentions viewport_update, final CanvasCamera your_camera) {

		your_camera.setSize(viewport_update.getScreenWidth(), viewport_update.getScreenHeight());
	}

}
