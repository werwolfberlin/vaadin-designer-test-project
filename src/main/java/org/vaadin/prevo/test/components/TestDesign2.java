package org.vaadin.prevo.test.components;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the test-design-2 template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("test-design-2")
@JsModule("./src/designs/test-design-2.js")
public class TestDesign2 extends PolymerTemplate<TestDesign2.TestDesign2Model> {

    @Id("vaadinTextField")
    private TextField vaadinTextField;

    @Id("vaadinButton")
    private Button vaadinButton;

    /**
     * Creates a new TestDesign2.
     */
    public TestDesign2() {
        // You can initialise any data required for the connected UI components here.
        vaadinButton.addClickListener(buttonClickEvent -> Notification.show(vaadinTextField.getValue()));
    }

    /**
     * This model binds properties between TestDesign2 and test-design-2
     */
    public interface TestDesign2Model extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
