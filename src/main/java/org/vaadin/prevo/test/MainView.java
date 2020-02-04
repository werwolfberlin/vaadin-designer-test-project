package org.vaadin.prevo.test;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.provider.DataProvider;
import com.vaadin.flow.data.provider.ListDataProvider;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;
import org.springframework.beans.factory.annotation.Autowired;
import org.vaadin.prevo.test.components.PTable;
import org.vaadin.prevo.test.components.TestDesign1;
import org.vaadin.prevo.test.components.TestDesign2;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and
 * use @Route annotation to announce it in a URL as a Spring managed
 * bean.
 * Use the @PWA annotation make the application installable on phones,
 * tablets and some desktop browsers.
 * <p>
 * A new instance of this class is created for every new user and every
 * browser tab/window.
 */
@Route
@PWA(name = "Vaadin Application",
        shortName = "Vaadin App",
        description = "This is an example Vaadin application.",
        enableInstallPrompt = true)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class MainView extends VerticalLayout {

    /**
     * Construct a new Vaadin view.
     * <p>
     * Build the initial UI state for the user accessing the application.
     *
     * @param service The message service. Automatically injected Spring managed bean.
     */
    public MainView(@Autowired GreetService service) {

        add(new Label("Custom View below"));
        final TestDesign1 testDesign1 = new TestDesign1();
        testDesign1.getpButton().setText("Button Text");
        testDesign1.getpCheckbox().setValue(true);
        testDesign1.getpComboBox().setDataProvider(new ListDataProvider<>(Arrays.asList("Dog", "Cat", "Mouse", "Snake")));
        testDesign1.getpTextField().setPlaceholder("Something");
        testDesign1.getpTable().setDataProvider(DataProvider.ofItems(new PTable.TableBean("Anakin", "Skywalker", "Outer Rim", 22, LocalDate.of(2000, 10, 10)),
                                                                     new PTable.TableBean("Lea", "Organa", "Alderan", 33, LocalDate.of(1999, 9, 11)),
                                                                     new PTable.TableBean("Luke", "Skywalker", "Outer Rim", 44, LocalDate.of(1998, 8, 12)),
                                                                     new PTable.TableBean("Obi Wan", "Kenobi", "Corouscant", 55, LocalDate.of(1997, 7, 13)),
                                                                     new PTable.TableBean("Han", "Solo", "Falcon", 66, LocalDate.of(1996, 6, 14))));
        add(testDesign1);

        add(new Label("Vaadin View Below"));
        final TestDesign2 testDesign2 = new TestDesign2();
        add(testDesign2);
    }

}
