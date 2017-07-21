
package com.jfixby.r3.ui.red.activity;

import com.jfixby.r3.api.activity.spawn.Intent;

public class IntentContainer {

	private final Intent intent;

	public IntentContainer (final Intent intent) {
		this.intent = intent;
	}

	public Intent intent () {
		return this.intent;
	}

}
