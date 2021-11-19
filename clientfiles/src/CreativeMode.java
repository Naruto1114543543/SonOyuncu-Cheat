// 
// Decompiled by Procyon v0.5.36
// 

public class CreativeMode extends Module
{
    public static boolean state;
    
    static {
        CreativeMode.state = false;
    }
    
    @Override
    public void onToggled() {
        CreativeMode.state = !CreativeMode.state;
    }
    
    public static boolean getStat() {
        return CreativeMode.state;
    }
    
    public CreativeMode() {
        super("CreativeMode", 21);
    }
}
