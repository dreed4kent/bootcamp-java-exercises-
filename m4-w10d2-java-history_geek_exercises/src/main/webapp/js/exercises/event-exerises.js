/// <reference path="../jquery-3.1.1.js" />

$(document).ready(function () {
	var checkBox = $("#SameShipping");					// <---- the type is "checkbox" in inspection, the id (#) is SameShipping
	checkBox.on("click", function (event) {
		var billingAddress1 = $("#BillingAddress1").val();
		$("#ShippingAddress1").val(billingAddress1);
		var billingAddress2 = $("#BillingAddress2").val();
		$("#ShippingAddress2").val(billingAddress2);
		var billingCity = $("#BillingCity").val();
		$("#ShippingCity").val(billingCity);
		var billingState = $("#BillingState").val();
		$("#ShippingState").val(billingState);
		var billingPostalCode = $("#BillingPostalCode").val();
		$("#ShippingPostalCode").val(billingPostalCode);
	});
	
	var shippingPrice = $("#shipping-info input");
	shippingPrice.on("click", function (event) {
	   var price = parseFloat($(this).attr("data-cost"));
	   var subtotal = parseFloat($('#subtotal .price').text().substring(1));
	   var tax = parseFloat($('#tax .price').text().substring(1));
	   var grandTotal = (subtotal + price + tax).toFixed(2);
	   $('#shipping .price').text("$"+price);
	   $('#grandtotal .price').text("$"+grandTotal);
	});
	
});