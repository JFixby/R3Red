
package com.jfixby.r3.ui.red.activity.layers;

import java.util.Comparator;

import com.jfixby.r3.api.activity.ComponentsFactory;
import com.jfixby.r3.api.activity.layer.LayerUtilsComponent;
import com.jfixby.r3.api.activity.layer.TreeLayer;

public class RedLayerUtils implements LayerUtilsComponent {

	@Override
	public <T> TreeLayer<T> newTree (ComponentsFactory factory, Comparator<T> comparator) {
		return new RedBinaryLayerTree<T>(factory, comparator);
	}

}
