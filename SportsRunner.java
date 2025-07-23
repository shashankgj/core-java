public class SportsRunner 
{
   static 
    {
        System.out.println("static block in SportsRunner");
    }

    public static void main(String[] args) {
        Sports s1 = new Sports();
        s1.setname("Cricket");
        s1.settype("Outdoor");
        s1.setplayers(11);
        System.out.println(s1.getname());
        System.out.println(s1.gettype());
        System.out.println(s1.getplayers());
        System.out.println(Sports.popularity);

        Sports s2 = new Sports();
        s2.setname("Football");
        s2.settype("Outdoor");
        s2.setplayers(11);
        System.out.println(s2.getname());
        System.out.println(s2.gettype());
        System.out.println(s2.getplayers());
        System.out.println(Sports.popularity);

        Sports s3 = new Sports();
        s3.setname("Basketball");
        s3.settype("Indoor/Outdoor");
        s3.setplayers(5);
        System.out.println(s3.getname());
        System.out.println(s3.gettype());
        System.out.println(s3.getplayers());
        System.out.println(Sports.popularity);

        Sports s4 = new Sports();
        s4.setname("Tennis");
        s4.settype("Outdoor");
        s4.setplayers(2);
        System.out.println(s4.getname());
        System.out.println(s4.gettype());
        System.out.println(s4.getplayers());
        System.out.println(Sports.popularity);

        Sports s5 = new Sports();
        s5.setname("Table Tennis");
        s5.settype("Indoor");
        s5.setplayers(2);
        System.out.println(s5.getname());
        System.out.println(s5.gettype());
        System.out.println(s5.getplayers());
        System.out.println(Sports.popularity);

        Sports s6 = new Sports();
        s6.setname("Hockey");
        s6.settype("Outdoor");
        s6.setplayers(11);
        System.out.println(s6.getname());
        System.out.println(s6.gettype());
        System.out.println(s6.getplayers());
        System.out.println(Sports.popularity);

        Sports s7 = new Sports();
        s7.setname("Badminton");
        s7.settype("Indoor");
        s7.setplayers(2);
        System.out.println(s7.getname());
        System.out.println(s7.gettype());
        System.out.println(s7.getplayers());
        System.out.println(Sports.popularity);

        Sports s8 = new Sports();
        s8.setname("Volleyball");
        s8.settype("Outdoor");
        s8.setplayers(6);
        System.out.println(s8.getname());
        System.out.println(s8.gettype());
        System.out.println(s8.getplayers());
        System.out.println(Sports.popularity);

        Sports s9 = new Sports();
        s9.setname("Kabaddi");
        s9.settype("Outdoor");
        s9.setplayers(7);
        System.out.println(s9.getname());
        System.out.println(s9.gettype());
        System.out.println(s9.getplayers());
        System.out.println(Sports.popularity);

        Sports s10 = new Sports();
        s10.setname("Chess");
        s10.settype("Indoor");
        s10.setplayers(2);
        System.out.println(s10.getname());
        System.out.println(s10.gettype());
        System.out.println(s10.getplayers());
        System.out.println(s10.popularity);
    }
}
