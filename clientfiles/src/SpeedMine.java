// 
// Decompiled by Procyon v0.5.36
// 

public class SpeedMine extends Module
{
    public static boolean state;
    public static boolean statechat;
    
    public static boolean getStat() {
        return SpeedMine.state;
    }
    
    public SpeedMine() {
        super("SpeedMine", 48);
    }
    
    @Override
    public void onToggled() {
        SpeedMine.state = !SpeedMine.state;
        SpeedMine.statechat = !SpeedMine.statechat;
    }
    
    public static boolean getStat1() {
        return SpeedMine.statechat;
    }
    
    static {
        SpeedMine.state = false;
        SpeedMine.statechat = false;
    }
}
