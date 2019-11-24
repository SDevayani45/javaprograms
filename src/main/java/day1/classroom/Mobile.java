package day1.classroom;

public class Mobile {
public long makeCall()
{
	return 9944040599l;
}
public String sendSMS()
{
	return "Sharanya";
}
public static void shallWeGo(String s)
{


}
public static void main(String[] args)
{
	Mobile m = new Mobile();
	long makeCall = m.makeCall();
	System.out.println(makeCall);
	String sendSMS = m.sendSMS();
	System.out.println(sendSMS);
}
}