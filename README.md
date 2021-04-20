# Feather Icons

Feather is a collection of simply beautiful open source icons. Each icon is designed on a 24x24 grid with an emphasis on simplicity, consistency, and flexibility. This addon enables Feather Icons to be easily used inside Vaadin apps.

See: https://feathericons.com/

## Usage


```
FeatherIcon layout = Feather.LAYOUT.create();
FeatherIcon search = Feather.SEARCH.create(e -> System.out.println("clicked!"));

FeatherIcon triangle = new FeatherIcon(Feather.ALERT_TRIANGLE);
FeatherIcon activity = new FeatherIcon("activity");

add(layout, search, activity, triangle);
```


For more information, visit https://vaadin.com/directory/component/feather-icons
