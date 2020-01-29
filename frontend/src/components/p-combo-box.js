import "@vaadin/vaadin-combo-box";
import { ComboBoxElement } from "@vaadin/vaadin-combo-box/src/vaadin-combo-box";
class PComboBox extends ComboBoxElement {

    static get is() {
        return 'p-combo-box';
    }

    connectedCallback() {
        super.connectedCallback();
    }

    static get template() {
        return ComboBoxElement.template;
    }

    static get properties() {
        return ComboBoxElement.properties;
    }
}

customElements.define(PComboBox.is, PComboBox);