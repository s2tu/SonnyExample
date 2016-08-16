/**
 * 
 */

var myfunction = function(){
	alert("Hi i am a function");
};

function greet(){
	return "Hello world";
}

function showGreet(funref){
	var msg = funref();
	return msg;
}
(function(){
			myfunction();
			alert("i am the best");
			console.log(showGreet(greet));
			var test= [];
			test[0] = 1;
			for(i in test){
				console.log(i)
			}
			
			document.writeln("<p><br> This page is located at" +document.location+ "<br>This page was last modified on" +document.lastModified);

})();