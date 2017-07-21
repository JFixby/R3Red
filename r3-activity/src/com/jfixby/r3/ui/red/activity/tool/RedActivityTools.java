
package com.jfixby.r3.ui.red.activity.tool;

import com.jfixby.r3.api.activity.ActivityToolkit;
import com.jfixby.r3.api.activity.ScreenShot;
import com.jfixby.r3.api.activity.ScreenShotSpecs;
import com.jfixby.r3.ui.red.activity.RedActivityExecutor;

public class RedActivityTools implements ActivityToolkit {

	private final RedActivityExecutor master;

	public RedActivityTools (final RedActivityExecutor redActivityExecutor) {
		this.master = redActivityExecutor;
	}

	@Override
	public ScreenShotSpecs newScreenShotSpecs () {
		return new ScreenShotSpecs();
	}

	@Override
	public ScreenShot newScreenShot (final ScreenShotSpecs sh_spec) {
		return new RedScreenShot(sh_spec);
	}

}
