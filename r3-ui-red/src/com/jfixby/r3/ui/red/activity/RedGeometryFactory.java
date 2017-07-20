
package com.jfixby.r3.ui.red.activity;

import com.jfixby.r3.ui.api.activity.geometry.EllipseComponent;
import com.jfixby.r3.ui.api.activity.geometry.GeometryComponentsFactory;
import com.jfixby.r3.ui.api.activity.geometry.PolyComponent;
import com.jfixby.r3.ui.api.activity.geometry.RectangleComponent;
import com.jfixby.r3.ui.red.activity.geo.RedRectangleComponent;
import com.jfixby.scarabei.api.err.Err;
import com.jfixby.scarabei.api.geometry.Geometry;
import com.jfixby.scarabei.api.geometry.Rectangle;

public class RedGeometryFactory implements GeometryComponentsFactory {

	private final RedComponentsFactory master;

	public RedGeometryFactory (final RedComponentsFactory redComponentsFactory) {
		this.master = redComponentsFactory;
	}

	@Override
	public RectangleComponent newRectangle () {
		final Rectangle rectangle = Geometry.newRectangle();
		return new RedRectangleComponent(this.master, rectangle);
	}

	@Override
	public EllipseComponent newEllipse () {
		Err.throwNotImplementedYet();
		return null;
	}

	@Override
	public RectangleComponent newRectangle (final Rectangle shape) {
		return new RedRectangleComponent(this.master, shape);
	}

	@Override
	public PolyComponent newPoly () {
		Err.throwNotImplementedYet();
		return null;
	}
}
