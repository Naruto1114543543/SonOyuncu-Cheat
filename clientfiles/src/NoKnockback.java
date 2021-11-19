// 
// Decompiled by Procyon v0.5.36
// 

public class NoKnockback extends Module
{
    public static boolean state;
    public static boolean statechat;
    
    @Override
    public void onToggled() {
        NoKnockback.state = !NoKnockback.state;
        NoKnockback.statechat = !NoKnockback.statechat;
    }
    
    public static boolean getStat() {
        return NoKnockback.state;
    }
    
    public static boolean getStat1() {
        return NoKnockback.statechat;
    }
    
    static {
        NoKnockback.state = false;
        NoKnockback.statechat = false;
    }
    
    public NoKnockback() {
        super("NoKnockback", 49);
    }
}
