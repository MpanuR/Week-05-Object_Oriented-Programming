class SpacedLogger implements Logger{

    public void Log(String one)
    {   //modified string
        String result = "";

        //loop through every char in the string
        for (int i = 0 ; i < one.length(); i++)
        {
            char letter = one.charAt(i);
            //add a space between each letter
            result += letter + " ";
        }
        
        //print output
        System.out.println("***" + result + "***");
    }

    public void Error(String two)
    {
        String asteriskOutput = "****************";
        String result = "";
        for (int i = 0 ; i < two.length(); i++)
        {
            char letter = two.charAt(i);
            //add a space between each letter
            result += letter + " ";
        }

        //print output
        System.out.println(asteriskOutput);
        System.out.println("***Error: " + result + "***");
        System.out.println(asteriskOutput);
    }
}