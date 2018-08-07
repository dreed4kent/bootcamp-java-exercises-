/// <reference path="../jquery-3.1.1.js" />
$(document).ready(function () {
	 $("#BillingPostalCode").on("change", function (event) {
		 var billingZipCode = $("#BillingPostalCode").val();
		 var subtotal = $("#subtotal .price").text().substring(1);
	        $.ajax({
	            url: "http://localhost:8080/m4-java-historygeek-exercises/api/getTax?billingZipCode=" + billingZipCode + "&subtotal=" + subtotal,
	            type: "GET",
	            dataType: "json"
	        }).done(function (data) {
	        	console.log(data);
	            $("#tax .price").html("$"+data);
	        }).fail(function (xhr, status, error) {
	            console.log(error);
	        });
	    });
	 
});