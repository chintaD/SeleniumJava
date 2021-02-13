package javaselfrmart01;

class Typecasting
{
    static float methodOnewidening(int i)
    {
        long j = i;     //int is auto widened to long
        return j;       //long is auto widened to float
    }
 
    public static void main(String[] args)
    {
        byte b = 10;
        short s = b;      //byte is auto widened to short
        double d = methodOnewidening(s);    //short is auto widened to int and float to double
        System.out.println(d);
        
        double m = 200.00;
        float f =(float)m;
        long l = (long)f;    
        System.out.println(methodOnnarrowing(l));
        
    }
    
    static short methodOnnarrowing(long l)
    {
        int i = (int) l;     //int is auto widened to long
        short j = (short) i;
        return j;       //long is auto widened to float
    }
}