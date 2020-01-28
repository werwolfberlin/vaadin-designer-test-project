package org.vaadin.prevo.test.components;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the test-design-1 template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("test-design-1")
@JsModule("./src/designs/test-design-1.js")
public class TestDesign1 extends PolymerTemplate<TestDesign1.TestDesign1Model> {

    @Id("pTextField")
    private PTextField pTextField;

    @Id("pButton")
    private PButton pButton;

    /**
     * Creates a new TestDesign1.
     */
    public TestDesign1() {
        // You can initialise any data required for the connected UI components here.
//        pButton.addClickListener(buttonClickEvent -> Notification.show(pTextField.getValue()));
    }

    /**
     * This model binds properties between TestDesign1 and test-design-1
     */
    public interface TestDesign1Model extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
