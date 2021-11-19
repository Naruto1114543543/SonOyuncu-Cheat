// 
// Decompiled by Procyon v0.5.36
// 

public class Aimbot extends Module
{
    public static boolean statechat;
    public static boolean state;
    
    @Override
    public void onToggled() {
        Aimbot.state = !Aimbot.state;
        Aimbot.statechat = !Aimbot.statechat;
    }
    
    public static boolean getStat1() {
        return Aimbot.statechat;
    }
    
    public Aimbot() {
        super("Aimbot", 35);
    }
    
    static {
        Aimbot.state = false;
        Aimbot.statechat = false;
    }
    
    public static boolean getStat() {
        return Aimbot.state;
    }
}
