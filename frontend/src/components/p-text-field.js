import "@vaadin/vaadin-text-field";
import { TextFieldElement } from "@vaadin/vaadin-text-field/src/vaadin-text-field";
class PTextField extends TextFieldElement {

    static get is() {
        return 'p-text-field';
    }

    connectedCallback() {
        super.connectedCallback();
    }

    static get template() {
        return TextFieldElement.template;
    }

    static get properties() {
        return TextFieldElement.properties;
    }
}

customElements.define(PTextField.is, PTextField);