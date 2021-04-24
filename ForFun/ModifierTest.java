class ModifierTest
{
    
    static int Test()
    {
        int counter = 0;
        return counter = counter + 1;
    }
    public static void main(String[] args) 
    {
        ModifierTest obj = new ModifierTest();
        System.out.println(obj.Test());
    }
}