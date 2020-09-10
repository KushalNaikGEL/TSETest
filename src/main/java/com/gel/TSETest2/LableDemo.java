package com.gel.TSETest2;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class LableDemo extends WebPage {
	
	public LableDemo() {
		Label nameLable = new Label("name");
		add(nameLable);
	}

}
