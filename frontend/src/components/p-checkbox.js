import "@vaadin/vaadin-checkbox";
import { CheckboxElement } from "@vaadin/vaadin-checkbox/src/vaadin-checkbox";
class PCheckbox extends CheckboxElement {

    static get is() {
        return 'p-checkbox';
    }

    connectedCallback() {
        super.connectedCallback();
    }

    static get template() {
        return CheckboxElement.template;
    }

    static get properties() {
        return CheckboxElement.properties;
    }
}

customElements.define(PCheckbox.is, PCheckbox);