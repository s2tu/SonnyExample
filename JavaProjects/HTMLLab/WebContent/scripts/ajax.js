/**
 * 
 */

//document ready


$(function(){
		var test = { tes2:"test"};
		console.log(test["tes2"]);
		console.log(test.tes2);
		
		//fill in the innerHTML of the select with options with the state	
		var options  = {
				type:"GET",
				dataType:"json",
				url:"http://services.groupkt.com/state/get/ind/all",
				error:function(xhr, textStatus, errorThrown){
					alert("Error");
				},
				success:function(data, textStatus){
					var selectOptions = "";
			
					for(var index in data.RestResponse.result){
						//get the state 
						selectOptions =selectOptions +  "<option value=" + escape(data.RestResponse.result[index].name)  + " data-capital="+  escape(data.RestResponse.result[index].capital) +">" + data.RestResponse.result[index].name +"</option>"; 
						
					}
					$("#selectSate").html(selectOptions);
				}				
		};
		
		$.ajax(options);
		
		
		$("#selectSate").change(function(){
			var capital = $('#selectSate').find(":selected").attr("data-capital");
			console.log(capital);
			$("#capitalcity").val(unescape(capital));
			
		});

});

