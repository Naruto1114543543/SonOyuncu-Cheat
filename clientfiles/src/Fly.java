// 
// Decompiled by Procyon v0.5.36
// 

public class Fly extends Module
{
    public static boolean state;
    public static boolean statechat;
    
    public static boolean getStat1() {
        return Fly.statechat;
    }
    
    static {
        Fly.state = false;
        Fly.statechat = false;
    }
    
    public static boolean getStat() {
        return Fly.state;
    }
    
    @Override
    public void onToggled() {
        Fly.state = !Fly.state;
        Fly.statechat = !Fly.statechat;
    }
    
    public Fly() {
        super("Fly", 33);
    }
}
