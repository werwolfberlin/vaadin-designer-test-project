import { ButtonElement } from "@vaadin/vaadin-button/src/vaadin-button";
class PButton extends ButtonElement {

    connectedCallback() {
        super.connectedCallback();
    }

    static get template() {
        return ButtonElement.template;
    }
}

customElements.define("p-button", PButton);