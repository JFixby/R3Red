
package com.jfixby.r3.fokker.unit.text;

import com.jfixby.r3.api.ui.unit.layer.VisibleComponent;
import com.jfixby.r3.api.ui.unit.raster.UI_BLEND_MODE;
import com.jfixby.r3.fokker.api.Drawable;
import com.jfixby.r3.fokker.api.RenderMachine;
import com.jfixby.r3.fokker.api.StringHandler;
import com.jfixby.r3.fokker.assets.red.font.gdx.GdxR3FontCache;
import com.jfixby.r3.fokker.assets.red.font.gdx.GdxR3FontGenerator;
import com.jfixby.r3.fokker.assets.red.font.gdx.GdxR3FontParameters;
import com.jfixby.r3.fokker.unit.BlendModeCasting;
import com.jfixby.scarabei.api.collections.Collection;
import com.jfixby.scarabei.api.collections.Collections;
import com.jfixby.scarabei.api.collections.Set;
import com.jfixby.scarabei.api.debug.Debug;
import com.jfixby.scarabei.api.err.Err;
import com.jfixby.scarabei.api.geometry.CanvasPosition;
import com.jfixby.scarabei.api.geometry.Geometry;
import com.jfixby.scarabei.api.math.FloatMath;
import com.jfixby.scarabei.api.util.JUtils;

public class RedStringHolder implements VisibleComponent, Drawable {

	private final boolean render_strings;
	private final boolean gdx_render = true;
	private final double opacity = 1;

	private final RedRasterizedString master;
	String string_value;
	private final CanvasPosition canvas_position;
	private StringHandler stringHolder;
	private final UI_BLEND_MODE mode = UI_BLEND_MODE.Normal;

	public RedStringHolder (final RedRasterizedString redRasterizedString) {
		this.master = redRasterizedString;
		this.canvas_position = Geometry.newCanvasPosition();
		this.string_value = null;
		this.render_strings = true;
		this.setChars("");
	}

	@Override
	public void setName (final String name) {
		this.master.setName(name);
	}

	@Override
	public String getName () {
		return this.master.getName();
	}

	@Override
	public void hide () {
		this.master.hide();
	}

	@Override
	public void show () {
		this.master.show();
	}

	@Override
	public void setVisible (final boolean b) {
		this.master.setVisible(b);
	}

	@Override
	public boolean isVisible () {
		return this.master.isVisible();
	}

	public String getChars () {
		return this.string_value;
	}

	public void setChars (final String string) {
		if (JUtils.equalObjects(string, this.string_value)) {
			return;
		}
		this.string_value = string;
		this.updateString();
	}

	@Override
	public void doDraw () {
		if (!this.render_strings) {
			return;

		}
		RenderMachine.component().beginDrawComponent(this);
		RenderMachine.component().beginRasterMode(BlendModeCasting.toRenderMachineBlendMode(this.mode), this.opacity);

		if (this.gdx_render) {
			RenderMachine.component().drawString(this.stringHolder, this.canvas_position);
		} else {
			Err.reportError("Unsupported mode");
		}

		RenderMachine.component().endRasterMode(BlendModeCasting.toRenderMachineBlendMode(this.mode));

		if (this.master.getDebugRenderFlag()) {
			RenderMachine.component().beginShapesMode();
			RenderMachine.endShapesMode();
		}

		RenderMachine.endDrawComponent(this);
	}

	private String charset () {
		this.chars.clear();
		for (int i = 0; i < this.string_value.length(); i++) {
			this.chars.add(this.string_value.charAt(i));
		}

		return this.charset(this.chars);
	}

	final Set<Character> chars = Collections.newSet();

	@Override
	public String toString () {
		return this.string_value;
	}

	static private String charset (final Collection<Character> set) {
		final StringBuilder tmp = new StringBuilder();
		for (int i = 0; i < set.size(); i++) {
			final Character c = set.getElementAt(i);
			tmp.append(c);
		}
		tmp.reverse();// check for instability
		return tmp.toString();
	}

	private void updateString () {
		FokkerFonts.



		if (this.font != null) {
			this.font.dispose();
		}

		final GdxR3FontGenerator generator = new GdxR3FontGenerator(this.gdx_font_file);
		final GdxR3FontParameters params = generator.newFontParameters();
		params.setSize((int)FloatMath.round(this.master.size / this.master.rescale));
		params.setBorderSize((int)FloatMath.round(this.master.borderSize / this.master.rescale));
		params.setColor(this.master.color);
		params.setBorderColor(this.master.border_color);
		params.setCharacters(this.charset());
		this.font = generator.generateFont(params);
		Debug.checkNull("font", this.font);
		generator.dispose();

		final GdxR3FontCache cache = this.font.getCache();
		cache.setText(this.string_value);
		final int n = this.getRegions().size;
		this.verticesCache.updateNumberOfRegions(n);

	}

}
