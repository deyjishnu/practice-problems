sap.ui.define([
	"sap/ui/core/mvc/Controller"
], function(Controller) {
	"use strict";

	return Controller.extend("DemoProjectDemoProject.controller.Page1", {
		onInit: function() {
			alert("onInit() Function started");
		},
		
		onClick: function() {
			alert("Thanks for clicking!!");
		}
	});
});