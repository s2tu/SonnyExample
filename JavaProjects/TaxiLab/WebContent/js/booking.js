/**
 * 
 */


function setDate(){
	var today = new Date();
	var year = today.getFullYear();
	var month = today.getMonth() + 1;
	var day = today.getDate();
	var stringDate = "";
	if(month < 10){
		month = "0" + month;
	}
	stringDate =stringDate + year + "-" + month + "-" + day;
	//console.log(stringDate);
	$("#bookdate").val(stringDate);	
}

$(function(){
	setDate();
	$("#bookdate").prop("disabled", true);
	$("#booknow").click(function(){
		if($("#bookdate").is(":enabled")){
			$("#bookdate").prop("disabled", true);
			setDate();
		}
	});
	$("#booklater").click(function(){
		if($("#bookdate").is(":disabled")){
			$("#bookdate").prop("disabled", false);
		}
	});	
	
})