// 
// Decompiled by Procyon v0.5.36
// 

public class Nuker extends Module
{
    public static boolean state;
    public static boolean statechat;
    
    public Nuker() {
        super("Nuker", 33);
    }
    
    public static boolean getStat() {
        return Nuker.state;
    }
    
    @Override
    public void onToggled() {
        Nuker.state = !Nuker.state;
        Nuker.statechat = !Nuker.statechat;
    }
    
    static {
        Nuker.state = false;
        Nuker.statechat = false;
    }
    
    public static boolean getStat1() {
        return Nuker.statechat;
    }
}
