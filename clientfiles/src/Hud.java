// 
// Decompiled by Procyon v0.5.36
// 

public class Hud extends Module
{
    public static boolean state;
    public static boolean statechat;
    
    public Hud() {
        super("Hud", 80);
    }
    
    @Override
    public void onToggled() {
        Hud.state = !Hud.state;
        Hud.statechat = !Hud.statechat;
    }
    
    public static boolean getStat1() {
        return Hud.statechat;
    }
    
    public static boolean getStat() {
        return Hud.state;
    }
    
    static {
        Hud.state = false;
        Hud.statechat = false;
    }
}
