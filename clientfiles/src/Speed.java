// 
// Decompiled by Procyon v0.5.36
// 

public class Speed extends Module
{
    public static boolean statechat;
    public static boolean state;
    
    public static boolean getStat1() {
        return Speed.statechat;
    }
    
    @Override
    public void onToggled() {
        Speed.state = !Speed.state;
        Speed.statechat = !Speed.statechat;
    }
    
    public static boolean getStat() {
        return Speed.state;
    }
    
    public Speed() {
        super("Speed", 34);
    }
    
    static {
        Speed.state = false;
        Speed.statechat = false;
    }
}
