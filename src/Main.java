// Press S
class A11
{
    static String s = "AAA";

    static
    {
        s = s + "BBB";

    }

    {
        s = "AAABBB";
    }
}

class B11 extends A11
{
    static
    {
        s = s + "BBBAAA";
    }

    {
        System.out.println(s);
    }
}



public class Main {

            public static void main(String[] args)
            {
                B11 b = new B11();
            }
        }


