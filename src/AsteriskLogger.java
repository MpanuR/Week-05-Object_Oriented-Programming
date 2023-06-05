class AsteriskLogger implements Logger{


    public void Log(String one)
    {
        String result;
        result = "***" + one + "***";

        System.out.println(result);
    }

    public void Error(String two)
    {
        String asteriskOutput = "****************";
        String result;
        result ="***" + "Error: " + two + "***";

        System.out.println(asteriskOutput);
        System.out.println(result);
        System.out.println(asteriskOutput);
    }
}