package org.vaadin.tarek;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@Route("")
@RouteAlias("DemoOne")
public class DemoOne extends Div {

    public DemoOne() {

        FeatherIcon layout = Feather.LAYOUT.create();
        FeatherIcon search = Feather.SEARCH
                .create(e -> System.out.println("clicked!"));

        FeatherIcon triangle = new FeatherIcon(Feather.ALERT_TRIANGLE);
        FeatherIcon activity = new FeatherIcon("activity");

        add(layout, search, activity, triangle);
    }
}
