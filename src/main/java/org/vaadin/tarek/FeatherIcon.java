package org.vaadin.tarek;

import java.util.Locale;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.ClickNotifier;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.dom.Element;

@Tag("feather-icon")
@JsModule("./feather-icon.js")
@NpmPackage(value = "feather-icons", version = "4.28.0")
public class FeatherIcon extends Component
        implements HasStyle, ClickNotifier<FeatherIcon> {

    private static final String DATA_FEATHER = "data-feather";

    /**
     * Creates an Icon component that displays the given icon from
     * {@link Feather}.
     *
     * @param icon
     *            the icon to display
     */
    public FeatherIcon(Feather icon) {
        Element i = new Element("i");
        i.setAttribute(DATA_FEATHER,
                icon.name().toLowerCase(Locale.ENGLISH).replace('_', '-'));
        getElement().appendChild(i);
    }

    /**
     * Creates an Icon component that displays the given icon from feather-icons
     * collection.
     *
     * See https://feathericons.com/
     *
     * @param icon
     *            the icon name
     */
    public FeatherIcon(String icon) {
        Element i = new Element("i");
        i.setAttribute(DATA_FEATHER, icon);
        getElement().appendChild(i);
    }

    @Override
    protected void onAttach(AttachEvent attachEvent) {
        super.onAttach(attachEvent);
        getElement().executeJs("window.featherReplace();");
    }

}
