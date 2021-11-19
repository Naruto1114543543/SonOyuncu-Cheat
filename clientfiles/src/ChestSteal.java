// 
// Decompiled by Procyon v0.5.36
// 

public class ChestSteal extends Module
{
    public static boolean state;
    public static boolean statechat;
    
    static {
        ChestSteal.state = false;
        ChestSteal.statechat = false;
    }
    
    public static boolean getStat() {
        return ChestSteal.state;
    }
    
    public static boolean getStat1() {
        return ChestSteal.statechat;
    }
    
    public ChestSteal() {
        super("ChestStealer", 47);
    }
    
    @Override
    public void onToggled() {
        ChestSteal.state = !ChestSteal.state;
        ChestSteal.statechat = !ChestSteal.statechat;
    }
}
