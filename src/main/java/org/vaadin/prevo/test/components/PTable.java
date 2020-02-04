package org.vaadin.prevo.test.components;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.grid.Grid;

import java.time.LocalDate;

@Tag("p-table")
public class PTable extends Grid<PTable.TableBean> {

    public PTable() {
        super(TableBean.class);
        addColumn(tableBean -> tableBean.name).setHeader("Name");
        addColumn(tableBean -> tableBean.lastName).setHeader("Lastname");
        addColumn(tableBean -> tableBean.adress).setHeader("Address");
        addColumn(tableBean -> tableBean.age).setHeader("Agr");
        addColumn(tableBean -> tableBean.birthdate).setHeader("Date");
    }

    public static class TableBean{

        String    name;

        String    lastName;
        String    adress;
        int       age;
        LocalDate birthdate;

        public TableBean() {
        }

        public TableBean(String name, String lastName, String adress, int age, LocalDate birthdate) {
            this.name = name;
            this.lastName = lastName;
            this.adress = adress;
            this.age = age;
            this.birthdate = birthdate;
        }
    }
}
