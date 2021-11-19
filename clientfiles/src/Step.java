// 
// Decompiled by Procyon v0.5.36
// 

public class Step extends Module
{
    public static boolean state;
    public static boolean statechat;
    
    public Step() {
        super("Step", 22);
    }
    
    @Override
    public void onToggled() {
        Step.state = !Step.state;
        Step.statechat = !Step.statechat;
    }
    
    static {
        Step.state = false;
        Step.statechat = false;
    }
    
    public static boolean getStat1() {
        return Step.statechat;
    }
    
    public static boolean getStat() {
        return Step.state;
    }
}
