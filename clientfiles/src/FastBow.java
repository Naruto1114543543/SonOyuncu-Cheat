// 
// Decompiled by Procyon v0.5.36
// 

public class FastBow extends Module
{
    public static boolean statechat;
    public static boolean state;
    
    public FastBow() {
        super("FastBow", 48);
    }
    
    static {
        FastBow.state = false;
        FastBow.statechat = false;
    }
    
    public static boolean getStat() {
        return FastBow.state;
    }
    
    @Override
    public void onToggled() {
        FastBow.state = !FastBow.state;
        FastBow.statechat = !FastBow.statechat;
    }
    
    public static boolean getStat1() {
        return FastBow.statechat;
    }
}
