/**
 * this javascript will add a click handler to hide or display the form on click
 */


$(function(){
	$("#formswitch").click(function(){
		if($("#loginForm").is(":hidden")){
			$("#registerForm").hide(0,function(){$("#loginForm").show()});
			$("#formswitch").text("Register Now!");
		}else{
			$("#loginForm").hide(0,function(){$("#registerForm").show()});
			$("#formswitch").text("Login");
		}
	});
	
})