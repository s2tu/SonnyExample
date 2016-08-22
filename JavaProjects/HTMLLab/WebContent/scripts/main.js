/**
 * Remove redundant code instead use functions
 */

//On Document Ready
$(function(){
	$(".radioTerms").click(function(){
		$(".radioTerms").prop('checked', false);;
		$(this).prop('checked', true);;
	});
	
	//<tr><td><button id="readText">Read Text</button></td></tr>
	//<tr><td><button id="readSelect">Read Select</button></td></tr>
	//<tr><td><button id="readRadio">Read Radio</button></td></tr>
	//<tr><td><button id="readCheckBox">Read Check Box</button></td></tr>
	//<tr><td><button id="readUnchecked">Read Unchecked Radio</button></td></tr>

	$("#readText").click(function(){
		$("#selectedValue").val($("#username").val() + " " + $("#password").val() );
		
	});
	
	$("#readSelect").click(function(){
		$("#selectedValue").val($("#cities").val() );
		
	});	
	
	
	$("#readRadio").click(function(){
		var selected = "";
		$(".radioTerms").each(function(){
			if( $(this).prop('checked') == true){
				selected = selected +$("label[for='"+$(this).attr('id')+"']").text() ;
			}
		});
		$("#selectedValue").val(selected);
		
	});	
	
	$("#readUnchecked").click(function(){
		var selected = "";
		$(".radioTerms").each(function(){
			if( $(this).prop('checked') == false){
				selected = selected +$("label[for='"+$(this).attr('id')+"']").text()  +" ";
			}
		});
		$("#selectedValue").val(selected);
		
	});
	
	
	$("#readCheckBox").click(function(){
		var selected = "";
		$(".skillsckb").each(function(){
			if( $(this).prop('checked') == true){
				selected = selected +$("label[for='"+$(this).attr('id')+"']").text() +" ";
			}
		});
		$("#selectedValue").val(selected);
		
	});	
	
	
});
