import java.util.Stack;




//import java.lang.String;
public class Postfix
{
    String expr;
    Stack<Double> stack;
    
    public Postfix(String e)
    {
        expr = e;
        stack = new Stack<Double>();
    }
    
    public double eval()
    {
        String[] tokens = expr.split(" ");
        for (String token : tokens)
        // this loop is good and we dont need to know
        // how far we are in the array because there is no counter. 
        
        //for (int i = 0; i < tokens.length; i++)
        {
            //String token = tokens[i];
            
            if (token.equals("+"))
            {
                double a = stack.pop();//pop the value off the top and enter it into a
                double b = stack.pop();
                stack.push(a+b);
            }
            else if (token.equals("-"))
            {
                double a = stack.pop();
                double b = stack.pop();
                stack.push(b-a);
            }
            else if (token.equals("*"))
            {
                double a = stack.pop();
                double b = stack.pop();
                stack.push(b*a);
            }
            else if (token.equals("/"))
            {
                double a = stack.pop();
                double b = stack.pop();
                stack.push( b / a );
            }
            else if (token.equals("^"))
            {
                double a = stack.pop();
                double b = stack.pop();
                stack.push(Math.pow(a, b));
            }
            else if (token.equals("sqrt"))
            {
                double a = stack.pop();
                stack.push(Math.sqrt(a));
            }
            else if (token.equals("dup"))
            {
                double a = stack.pop();
                stack.push(a);
                stack.push(a);
            }
            else if (token.equals("swap"))
            {
                double a = stack.pop();
                double b = stack.pop();
                stack.push(a);
                stack.push(b);
            }
            else if (token.equals("rot"))
            {
                double a = stack.pop();
                double b = stack.pop();
                double c = stack.pop();
                stack.push(b);
                stack.push(c);
                stack.push(a);
            }
            else if (token.equals("tan"))
            {
                double a = stack.pop();
                stack.push(Math.tan(a));
            }
            else if (token.equals("sin"))
            {
                double a = stack.pop();
                stack.push(Math.sin(a));
            }
            else if (token.equals("cos"))
            {
                double a = stack.pop();
                stack.push(Math.cos(a));
            }
            else if (token.equals("distance"))
            {
                double a = stack.pop();
                double b = stack.pop();
                stack.push(Math.sqrt((a * a) + (b * b)));
            }
            else if (token.equals("smoot"))
            {
                double a = stack.pop();
                stack.push(a * 5.5833);
            }
            else if (token.equals("%"))
            {
                double a = stack.pop();
                double b = stack.pop();
                stack.push( a % b );
            }
            else if (token.equals("!"))
            {
                double a = stack.pop();
                double n = a;
                double fact = 1;
                
                for(int i = 2; i <= n; i++)
                {
                    fact = fact * i;
                }
                stack.push(fact);
            }
            else if (token.equals("pi"))
            {
                stack.push(Math.PI);
            }
            else if (token.equals("degrees"))
            {
                double a = stack.pop();
                stack.push(Math.toDegrees(a));
            }
            else if (token.equals("radians"))
            {
                double a = stack.pop();
                stack.push(Math.toRadians(a));
            }
            else if (token.equals("abs"))
            {
                double a = stack.pop();
                stack.push(Math.abs(a));
            }
            else if (token.equals("e"))
            {
                stack.push(Math.E);
            }
            /*else if (token.equals("binary"))
            {
                double a = stack.pop();
                int result = Integer.parseInt(a);
                stack.push(Double.parseDouble(Integer.toBinaryString(result)));
            }*/
            else
            {
                // must be a number
                try
                {
                    double n = Double.parseDouble(token);// casting a string into a double
                    stack.push(n);
                }
                catch (java.lang.NumberFormatException nfe)
                {
                    throw new UnknownToken();
                }
            }
        }
        
        return stack.peek();
    }
}