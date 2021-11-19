// 
// Decompiled by Procyon v0.5.36
// 

public class Scaffold extends Module
{
    public static boolean state;
    
    public Scaffold() {
        super("Scaffold", 48);
    }
    
    @Override
    public void onToggled() {
        Scaffold.state = !Scaffold.state;
    }
    
    public static boolean getStat() {
        return Scaffold.state;
    }
    
    static {
        Scaffold.state = false;
    }
}
