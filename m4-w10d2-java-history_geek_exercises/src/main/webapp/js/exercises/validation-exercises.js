/// <reference path="../jquery-3.1.1.js" />
/// <reference path="../jquery.validate.js" />

$(document).ready(function () {

    // Email address - required
    // Email address - .gov only (BONUS)
    // Password - required, length 8 or more
    // ConfirmPassword
	 $("#form0").validate({

	        debug: true,
	        rules: {
	            email: {
	                required: true,
	            email: true,
	            },
	            password: {
	                required: true,
	                minlength: 8,
	                strongpassword: true,
	            },
	            confirmPassword: {
	            	required: true,
	                equalTo: "#password",
	            }
	        },
	        errorClass: "error",
	        validClass: "valid",
	        submitHandler: function(form) {
	            form.submit();
	        }
	 });
	 
	 $("#checkout").validate({
		 debug: true,
		 rules: {
			 BillingAddress1: {
				 required: true,
			 },
			 ShippingAddress1: {
				 required: true,
			 },
			 BillingAddress2: {
				 required: true,
			 },
			 ShippingAddress2: {
				 required: true,
			 },
			 BillingCity: {
				 required: true,
			 },
			 ShippingCity: {
				 required: true,
			 },
			 BillingState: {
				 required: true,
				 minlength: 2,
			 },
			 ShippingState: {
				 required: true,
				 minlength: 2,
			 },
			 BillingPostalCode: {
				 required: true,
				 actualZipCode: true,
				 maxlength: 5,
			 },
			 ShippingPostalCode: {
				 required: true,
				 actualZipCode: true,
				 maxlength: 5,
			 },
			 NameOnCard: {
				 required: true,
			 },
			 CreditCardNumber: {
				 required: true,
				 maxLength: 16,
			 },
			 ExpirationDate: {
				 required: true,
				 maxlength: 4,
			 }
		 }
	 });
});

$.validator.addMethod("strongpassword", function (value, index) {
    return value.match(/[A-Z]/) && value.match(/[a-z]/) && value.match(/\d/);  //check for one capital letter, one lower case letter, one num
}, "Please enter a strong password (one capital, one lower case, and one number");

