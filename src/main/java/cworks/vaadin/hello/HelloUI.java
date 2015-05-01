package cworks.vaadin.hello;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;

@Title("Hello from my little Vaadin UI")
@Theme("valo")
public class HelloUI extends UI {


    @Override
    protected void init(VaadinRequest request) {
        // create the content root layout for the UI
        VerticalLayout content = new VerticalLayout();
        setContent(content);

        content.addComponent(new Label("Hello Jack!"));
        content.addComponent(new Button("Press", event -> {
            Notification.show("Pressing my Button!");
        }));
    }
}
