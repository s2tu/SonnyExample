/**
 * 
 */



$(function(){
	
	$("#submitform").submit(function(e){
		e.preventDefault();
		var options = {
				data:$("#submitform").serialize(),
				dataType:"html",
				type:"GET",
				url:"FindDueServlet",
				error:function(xhr, textStatus, errorThrown){
					alert("Error");
				},
				success:function(data, textStatus){
					console.log(data);
					$("#output").val(parseInt(data));
				}				
		};
		
		$.ajax(options);
	});
	
});