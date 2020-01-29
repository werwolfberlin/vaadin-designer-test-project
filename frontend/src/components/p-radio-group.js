import "@vaadin/vaadin-radio-button";
import { RadioGroupElement } from "@vaadin/vaadin-radio-button/src/vaadin-radio-group";
class PRadioGroup extends RadioGroupElement {

    static get is() {
        return 'p-radio-group';
    }

    connectedCallback() {
        super.connectedCallback();
    }

    static get template() {
        return RadioGroupElement.template;
    }

    static get properties() {
        return RadioGroupElement.properties;
    }
}

customElements.define(PRadioGroup.is, PRadioGroup);