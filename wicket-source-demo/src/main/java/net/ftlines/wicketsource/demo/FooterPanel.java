package net.ftlines.wicketsource.demo;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;

/**
 * A displayed web page footer
 * 
 * @author Jenny Brown
 * 
 */
public class FooterPanel extends Panel {

	public FooterPanel(String id) {
		super(id);

		add(new Label("footerText", "This is some footer text."));

	}

}
