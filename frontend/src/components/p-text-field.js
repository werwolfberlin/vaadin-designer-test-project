import { TextFieldElement } from "@vaadin/vaadin-text-field/src/vaadin-text-field";
class PTextField extends TextFieldElement {

    connectedCallback() {
        super.connectedCallback();
    }

    static get template() {
        return TextFieldElement.template;
    }
}

customElements.define("p-text-field", PTextField);