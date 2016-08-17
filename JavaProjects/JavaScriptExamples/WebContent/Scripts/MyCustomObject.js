/**
 * 
 */
//custom js object literal
var item ={
	itemNumber:101,
	itemName:"tv",	
	showItem:function(){
		return this.itemName.toUpperCase();
	}
};
//custom object type 2 using the function
function product(){
	this.name = "laptop";
	this.price = 4500;
	this.showDetails= function(){
		return this.name + ":" + this.price;
	};
}
//custom object type 2 using the constructor
function salesman(name1, age2){
	this.name = name1;
	this.age = age2;
	this.showDetails=function(){
		return this.name + ":" + this.age;
	};
}
(function(){
	document.writeln(item.itemNumber);
	document.writeln(item.itemName);
	document.writeln(item.showItem());
	
	
	var prd1 = new product();
	document.writeln(prd1.showDetails());
	var obj = new salesman("Sonny", 24);
	document.writeln(obj.showDetails());
})();