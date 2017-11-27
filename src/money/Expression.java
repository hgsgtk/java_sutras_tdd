package money;

public interface Expression {
	Expression times(int mulitiplier);
	Expression plus(Expression addend);
	Money reduce(Bank bank, String to);
}
