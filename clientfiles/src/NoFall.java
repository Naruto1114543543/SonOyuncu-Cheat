// 
// Decompiled by Procyon v0.5.36
// 

public class NoFall extends Module
{
    public static boolean state;
    public static boolean statechat;
    
    public static boolean getStat1() {
        return NoFall.statechat;
    }
    
    @Override
    public void onToggled() {
        NoFall.state = !NoFall.state;
        NoFall.statechat = !NoFall.statechat;
    }
    
    public NoFall() {
        super("NoFall", 50);
    }
    
    public static boolean getStat() {
        return NoFall.state;
    }
    
    static {
        NoFall.state = false;
        NoFall.statechat = false;
    }
}
