public class StringLab
{
    public static void main(String[] args) 
    {
        String str = "Welcome to the Java String Lab!";
        //length() part
        System.out.println(str.length());
        //charAt() part
        System.out.println(str.charAt(7));
        //substring() part
        System.out.println(str.substring(15,20));
        //toUpperCase() and toLowerCase() part
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        //indexOf() part
        System.out.println(str.indexOf("Java"));
        //contain() part
        System.out.println(str.contains("Lab"));
        //replace() part
        System.out.println(str.replace("Java","Java Programming"));
        //split() part
        String[] parts = str.split(" ");
        for (String part : parts)
        {
            System.out.println(part);
        }
        
        //trim() part
        System.out.println(str.trim());
        //equals() and equalsIgnoreCase()
        System.out.println(str.equals("java string lab!"));
        System.out.println(str.equalsIgnoreCase("java string lab!"));

        //part 2 StringBuilder
        StringBuilder sb = new StringBuilder("StringBuilder Lab ");
        //append()
        sb.append(" - Learning Java");
        System.out.println(sb);
        //insert() part
        sb.insert(18,"is fun");
        System.out.println(sb);
        //delete() part
        sb.delete(26,35);
        System.out.println(sb);
        //reverse() part
        sb.reverse();
        System.out.println(sb);

        //Task 3 StringBuffer
        StringBuffer sbf = new StringBuffer("Multithreading Lab ");
        //append()part
        sbf.append(" - Learning Java");
        System.out.println(sbf);
        //insert() part
        sbf.insert(19,"is fun");
        System.out.println(sbf);
        //delete() part
        sbf.delete(27,36);
        System.out.println(sbf);
        //reverse() part
        sbf.reverse();
        System.out.println(sbf);

    }
}