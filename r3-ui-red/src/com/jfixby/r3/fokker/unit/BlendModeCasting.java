
package com.jfixby.r3.fokker.unit;

import com.jfixby.r3.api.ui.unit.raster.UI_BLEND_MODE;
import com.jfixby.r3.fokker.api.TEXTURE_BLEND_MODE;
import com.jfixby.scarabei.api.err.Err;

public class BlendModeCasting {

	public static TEXTURE_BLEND_MODE toRenderMachineBlendMode (final UI_BLEND_MODE uiMode) {
		if (UI_BLEND_MODE.Normal == uiMode) {
			return TEXTURE_BLEND_MODE.Normal;
		}
		if (UI_BLEND_MODE.Grayscale == uiMode) {
			return TEXTURE_BLEND_MODE.Grayscale;
		}
		if (UI_BLEND_MODE.Multiply == uiMode) {
			return TEXTURE_BLEND_MODE.Multiply;
		}
		if (UI_BLEND_MODE.TEST == uiMode) {
			return TEXTURE_BLEND_MODE.TEST;
		}
		Err.reportError("Unknown UI_BLEND_MODE: " + uiMode);
		return TEXTURE_BLEND_MODE.Normal;
	}

}
