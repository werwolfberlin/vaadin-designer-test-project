import "@vaadin/vaadin-grid";
import { GridElement } from "@vaadin/vaadin-grid/src/vaadin-grid";
class PTable extends GridElement {

    static get is() {
        return 'p-table';
    }

    connectedCallback() {
        super.connectedCallback();
    }

    static get template() {
        return GridElement.template;
    }

    static get properties() {
        return GridElement.properties;
    }
}

customElements.define(PTable.is, PTable);