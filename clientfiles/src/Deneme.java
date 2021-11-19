// 
// Decompiled by Procyon v0.5.36
// 

public class Deneme extends Module
{
    public static boolean state;
    
    @Override
    public void onToggled() {
        Deneme.state = !Deneme.state;
    }
    
    static {
        Deneme.state = false;
    }
    
    public static boolean getStat() {
        return Deneme.state;
    }
    
    public Deneme() {
        super("Deneme", 25);
    }
}
