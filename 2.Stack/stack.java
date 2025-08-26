package uebung7;

import java.util.Stack;

public class Aufgabe3 {

	public static void main(String[] args) {
		String eingabe=" bddbbddbbbdd";
		String eingabe2 = " bddbdbbbd";
		System.out.println(checkDB(eingabe));
		System.out.println(checkDB(eingabe2));
		String eingabe3="()()()()";
		String eingabe4="{}{}{{}{}}(){}{{}{}}{}{}";
		String eingabe5="{}{}{{}{}}{}{(({})){})}{}{}";
		System.out.println(checkParenthesis(eingabe3));
		System.out.println(checkParenthesis(eingabe4));
		System.out.println(checkParenthesis(eingabe5));
		
		

	}
	
	public static boolean checkDB(String s) {
		Stack<String> myStack = new Stack<String>();
		int counterD = 0;
		int counterB = 0;
		for(int i=0;i<s.length();i++) {
			myStack.push(s.substring(i, i+1));	
		}
		while(!myStack.isEmpty()) {
			String popped = myStack.pop();
			
			if(popped.equals("d")) {
				counterD++;
			}
			else if(popped.equals("b")) {
				counterB++;
			}
			
		}
		System.out.println("counter b: "+counterB);
		System.out.println("Counter d: "+counterD);
		if(counterB==counterD) {
			return true;
		}
		else {
			return false;
		}
		
	}
	/*public static boolean checkParenthesis(String s) {
		Stack<String>myStack = new Stack<String>();
		int counterOffen = 0;
		int counterZu = 0;
		for(int i = 0;i<s.length();i++) {
			myStack.push(s.substring(i, i+1));
		}
		while(!myStack.isEmpty()) {
			String popped = myStack.pop();
			if(popped.equals("(")||popped.equals("{")) {
				counterOffen++;
			}
			else if(popped.equals(")")||popped.equals("}")) {
				counterZu++;
			}
		}
		System.out.println("Counter auf :"+counterOffen);
		System.out.println("Counter geschlossen : "+counterZu);
		if(counterOffen==counterZu) {
			return true;
		}
		else {
			return false;
		}
		
	}*/
	public static boolean checkParenthesis(String s) {
		Stack<String>myStack = new Stack<String>();
		for(int i=0;i<s.length();i++) {
			String current = s.substring(i, i+1);
			if(current.equals("(")||current.equals("{")) {
				myStack.push(current);
			}
			else if(current.equals(")")||current.equals("}")) {
				if(myStack.isEmpty()) {
					return false;
				}
				String peeked =myStack.peek();
				if((current.equals(")")&&peeked.equals("("))||(current.equals("}")&&peeked.equals("{"))) {
					myStack.pop();
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
			
		}
		return myStack.isEmpty();
		
		
	
		
	}

}
