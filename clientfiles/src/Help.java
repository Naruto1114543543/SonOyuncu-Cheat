// 
// Decompiled by Procyon v0.5.36
// 

public class Help extends Module
{
    public static boolean statechat;
    public static boolean state;
    
    @Override
    public void onToggled() {
        Help.state = !Help.state;
        Help.statechat = !Help.statechat;
    }
    
    public static boolean getStat() {
        return Help.state;
    }
    
    public Help() {
        super("Help", 79);
    }
    
    static {
        Help.state = false;
        Help.statechat = false;
    }
    
    public static boolean getStat1() {
        return Help.statechat;
    }
}
