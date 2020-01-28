import "@vaadin/vaadin-button";
import { ButtonElement } from "@vaadin/vaadin-button/src/vaadin-button";
class PButton extends ButtonElement {

    static get is() {
        return 'p-button';
    }

    connectedCallback() {
        super.connectedCallback();
    }

    static get template() {
        return ButtonElement.template;
    }

    static get properties() {
        return ButtonElement.properties;
    }
}

customElements.define(PButton.is, PButton);