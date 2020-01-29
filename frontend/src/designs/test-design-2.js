import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class TestDesign2 extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-text-field id="vaadinTextField" label="Test" clear-button-visible></vaadin-text-field>
 <vaadin-button id="vaadinButton">
  button
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'test-design-2';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(TestDesign2.is, TestDesign2);
