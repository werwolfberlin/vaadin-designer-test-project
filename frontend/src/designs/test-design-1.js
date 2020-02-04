import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '../components/p-text-field.js';
import '../components/p-button.js';
import '../components/p-table.js';
import '@vaadin/vaadin-grid/src/vaadin-grid-column.js';
import '../components/p-combo-box.js';
import '../components/p-checkbox.js';

class TestDesign1 extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <p-text-field id="pTextField" label="Test" clear-button-visible></p-text-field>
 <p-button id="pButton" tabindex="">
   Button 
 </p-button>
 <p-combo-box id="pComboBox" label="ComboBox"></p-combo-box>
 <p-checkbox id="pCheckbox">
  checkbox
 </p-checkbox>
 <p-table id="pTable">
  <vaadin-grid-column header="Name"></vaadin-grid-column>
  <vaadin-grid-column header="Last Name"></vaadin-grid-column>
 </p-table>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'test-design-1';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(TestDesign1.is, TestDesign1);
