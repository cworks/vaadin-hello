package cworks.vaadin.hello3;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import javax.servlet.annotation.WebServlet;

@Title("Hello from my little Vaadin UI")
@Theme("valo")
public class HelloUI3 extends UI {

    @WebServlet(value = "/helloui3/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = HelloUI3.class)
    public static class HelloUI3Servlet extends VaadinServlet {

    }

    @Override
    protected void init(VaadinRequest request) {
        // create the content root layout for the UI
        VerticalLayout content = new VerticalLayout();
        setContent(content);

        content.addComponent(new Label("Hello Jack this is Servlet 3.0!"));
        content.addComponent(new Button("Press", event -> {
            Notification.show("Pressing my Servlet 3.0 Button...Look Mom no web.xml!");
        }));
    }
}
