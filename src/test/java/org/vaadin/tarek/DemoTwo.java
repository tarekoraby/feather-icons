package org.vaadin.tarek;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("DemoTwo")
public class DemoTwo extends Div {

    public DemoTwo() {

        for (Feather icon : Feather.values()) {
            FeatherIcon featherIcon = icon.create();
            featherIcon.getStyle().set("padding", "5px");
            add(featherIcon);
        }

        getStyle().set("padding", "25px");
    }
}
