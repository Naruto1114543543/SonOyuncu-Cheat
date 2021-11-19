// 
// Decompiled by Procyon v0.5.36
// 

public class Aura extends Module
{
    public static boolean statechat;
    public static boolean state;
    
    public static boolean getStat1() {
        return Aura.statechat;
    }
    
    @Override
    public void onToggled() {
        Aura.state = !Aura.state;
        Aura.statechat = !Aura.statechat;
    }
    
    public Aura() {
        super("KillAura", 19);
    }
    
    static {
        Aura.state = false;
        Aura.statechat = false;
    }
    
    public static boolean getStat() {
        return Aura.state;
    }
}
