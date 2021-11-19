// 
// Decompiled by Procyon v0.5.36
// 

public class LegitKillAura extends Module
{
    public static boolean statechat;
    public static boolean state;
    
    static {
        LegitKillAura.state = false;
        LegitKillAura.statechat = false;
    }
    
    public static boolean getStat1() {
        return LegitKillAura.statechat;
    }
    
    @Override
    public void onToggled() {
        LegitKillAura.state = !LegitKillAura.state;
        LegitKillAura.statechat = !LegitKillAura.statechat;
    }
    
    public LegitKillAura() {
        super("LegitKillAura", 21);
    }
    
    public static boolean getStat() {
        return LegitKillAura.state;
    }
}
