// 
// Decompiled by Procyon v0.5.36
// 

public class AutoArmor extends Module
{
    public static boolean state;
    public static boolean statechat;
    
    public static boolean getStat1() {
        return AutoArmor.statechat;
    }
    
    @Override
    public void onToggled() {
        AutoArmor.state = !AutoArmor.state;
        AutoArmor.statechat = !AutoArmor.statechat;
    }
    
    public static boolean getStat() {
        return AutoArmor.state;
    }
    
    static {
        AutoArmor.state = false;
        AutoArmor.statechat = false;
    }
    
    public AutoArmor() {
        super("AutoArmor", 36);
    }
}
