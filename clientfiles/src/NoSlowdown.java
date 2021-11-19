// 
// Decompiled by Procyon v0.5.36
// 

public class NoSlowdown extends Module
{
    public static boolean state;
    
    public static boolean getStat() {
        return NoSlowdown.state;
    }
    
    public NoSlowdown() {
        super("NoSlowdown", 21);
    }
    
    static {
        NoSlowdown.state = false;
    }
    
    @Override
    public void onToggled() {
        NoSlowdown.state = !NoSlowdown.state;
    }
}
