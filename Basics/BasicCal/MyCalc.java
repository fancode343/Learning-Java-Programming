import java.util.*;
import javax.swing.*;
public class MyCalc {
    double result = 0.0;
   public void var(){
        this.result = result;
    }
    public double fop(String a, int x){
        String op = "";
        double op1 = 0;
        for(int i = 0; i < x;i++){
            op += a.charAt(i);
        }
        op1 = Double.parseDouble(op);
        return op1;
    }
    public double secop(String a, int x){
        String op = "";
        double op2 = 0;
        for(int i = x+1; i < a.length();i++){
            op += a.charAt(i);
        }
        op2 = Double.parseDouble(op);
        return op2;
    }
    public double add(String a, int x){
        double res = 0;
        res = fop(a,x)+secop(a,x);
        return res;
    }
    public double subtract(String a, int x){
        double res = 0;
        res = fop(a,x)-secop(a,x);
        return res;
    }
    public double multiply(String a, int x){
        double res = 0;
        res = fop(a,x)*secop(a,x);
        return res;
    }
    public double divide(String a, int x){
        double res = 0;
        res = fop(a,x)/secop(a,x);
        return res;
    }
    public int modulo(String a, int x){
        int res = 0;
        res = (int)fop(a,x)%(int)secop(a,x);
        return res;
    }
    public int power(String a, int x){
        int res = 1;
        int y = (int)fop(a,x);
        if(y >= 0){
            for(int i = 0; i < (int)secop(a,x);i++){
              res *= y;  
            }
        }else{
            for(int i = 0; i > (int)secop(a,x);i--){
              res /= y;  
            }
        }
        return res;
    }
    public static void main(String[] args){
        MyCalc obj = new MyCalc();
        Scanner input = new Scanner(System.in);
         String esc = "";
        String ms = "";
         String rev = "";
         int x = 0;
        do{
            try{
                 if(x==0){
                      ms = "";
                      x++;
                 }else{
                      ms = ""+obj.result;
                      obj.result = 0;
                 }
                 rev = ms;
                 if(x>1){
                esc = JOptionPane.showInputDialog("'#' Reset\n'\\' Escape\nCurrent expression: ");
                 }else{
                    esc = JOptionPane.showInputDialog("'#' Reset\n'\\' Escape\nCurrent expression: "+ms);
                 }
                 ms += esc;
                calculate:
                for(int i = 1; true; i++){
                    if(!(Character.isLetterOrDigit(ms.charAt(i)))){
                        switch (ms.charAt(i)){
                            case '+' : 
                            obj.result += obj.add(ms,i);
                            break calculate;
                            case '-' : 
                            obj.result += obj.subtract(ms,i);
                            break calculate;
                            case '*' : 
                            obj.result += obj.multiply(ms,i);
                            break calculate;
                            case '/' : 
                            obj.result += obj.divide(ms,i);
                            break calculate;
                            case '%' : 
                            obj.result += obj.modulo(ms,i);
                            break calculate;
                            case '^' : 
                            obj.result += obj.power(ms,i);
                            break calculate;
                            default:
                            continue;
                        }
                    }
                }
            }catch(Exception e){
                if (esc.equals("\\")){
                    JOptionPane.showMessageDialog(null, "Program Terminated");
                    return;
                }else if(esc.equals("#")){
                    JOptionPane.showMessageDialog(null, "Reset success");
                          ms = "";
                          obj.result = 0;
                          rev = "";
                          if(x!=0)
                          x--;
                }else{
                     try{
                         obj.result = Double.parseDouble(rev);
                         JOptionPane.showMessageDialog(null, "Syntax Error");
                          ms = "";
                     }catch(Exception f){
                          JOptionPane.showMessageDialog(null, "Syntax Error");
                          ms = "";
                          obj.result = 0;
                          rev = "";
                          if(x!=0)
                          x--;
                     }
                 }
            }
             esc = "";
        }while (!ms.equals("\\"));
    }
}