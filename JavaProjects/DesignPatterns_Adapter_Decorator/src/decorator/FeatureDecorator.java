package decorator;

//the Feature Decorator is what all of the decorators extend
//note how the FeatureDecorator IS A BankAccount through extention
//as such, the member var in the decorator can be another decorator
public class FeatureDecorator extends BankAccount{
	
	//member is of type BankAccount so it can be anything extending BankAccount
	//this includes FeatureDecorator and all things that extend it
	protected BankAccount member;
	

}
