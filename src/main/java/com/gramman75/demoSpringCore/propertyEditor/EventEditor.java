/**
 * Property Editor는 Thread Safety하지 않기 때문에
 * Bean으로 등록해서 사용하지 말 것.
 */
package com.gramman75.demoSpringCore.propertyEditor;

import java.beans.PropertyEditorSupport;

public class EventEditor extends PropertyEditorSupport {

	@Override
	public String getAsText() {
		Event event = (Event)getValue();
		return event.getId().toString();
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		setValue(new Event(Integer.parseInt(text)));
	}
}
