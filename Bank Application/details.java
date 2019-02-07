import java.util.ArrayList;
import java.util.Iterator;

class ArrayListGlobal {
    public static ArrayList<details> ai = new ArrayList<details>();
}

class ArrayListGlobal1
{
    public static ArrayList<details> at = new ArrayList<>();
}
public class details {
    String name;
    String username;
    String password;
    double amt;

    details() {
        amt = 0;
    }

    public static void make(String x, String y, String m, double z) {
        details A = new details();
       if(z>0) A.amt = z;
       else A.amt=0;
        A.name = x;
        A.username = y;
        A.password = m;
        ArrayListGlobal.ai.add(A);

    }

    public static String balance(details a)
    {
        String bal = Double.toString(a.amt);
        return bal;
    }

    public static details verify(String x, String y) {
        Iterator itr = ArrayListGlobal.ai.iterator();
        while (itr.hasNext()) {
            details a = (details) itr.next();
            System.out.println(a.username+""+a.password);
            if (a.username.equals(x) && a.password.equals(y)) {
                return a;
            }


        }
        details a = new details();
        a.amt = -1;
        return a;
    }

    public static details verify1(String x) {
        Iterator itr = ArrayListGlobal.ai.iterator();
        while (itr.hasNext()) {
            details a = (details) itr.next();
            if (a.username.equals(x))
            {
                return a;
            }


        }
        details a = new details();
        a.amt = -1;
        return a;
    }
    public static void deposit(details a, double total) {
        if (total > 0)
            a.amt += total;
    }

    public static void withdraw(details a, double total) {
        if (total > 0 && total<=a.amt)
            a.amt -= total;
    }

    public static void loan(details a, double loan) {
        a.amt += loan;
    }

    public static boolean transfer(details a, details b, double amt1) {
        if (a.amt > amt1 && amt1 > 0) {
            a.amt -= amt1;
            b.amt += amt1;
            return true;
        }
        return false;
    }

    public static details delete(details a) {
        a.amt=-1;
        return a;
    }

}
 class Login
        {
             public static void main(String arg[])
             {
                 loginbox A=new loginbox();

                 details.make("rahul","rb98dps","rabh",400.0);
                 details.make("manju","mrt","mabh",400.0);
                 details.make("ashu","ab3403","asbh",400.0);

             }
        }




