// 
// Decompiled by Procyon v0.5.36
// 

public class AntiBan extends Module
{
    public static boolean bos;
    public static boolean state;
    
    static {
        AntiBan.state = true;
        AntiBan.bos = false;
    }
    
    public AntiBan() {
        super("AntiBan", 38);
    }
    
    @Override
    public void onToggled() {
    }
}
