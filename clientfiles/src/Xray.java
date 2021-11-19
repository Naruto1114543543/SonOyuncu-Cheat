// 
// Decompiled by Procyon v0.5.36
// 

public class Xray extends Module
{
    protected double minX;
    protected double minZ;
    protected double maxY;
    protected double maxX;
    protected double maxZ;
    public static boolean statechat;
    public static boolean state;
    protected double minY;
    
    @Override
    public void onToggled() {
        Xray.state = !Xray.state;
        Xray.statechat = !Xray.statechat;
    }
    
    public Xray() {
        super("Xray", 45);
    }
    
    public static boolean getStat1() {
        return Xray.statechat;
    }
    
    public static boolean getStat() {
        return Xray.state;
    }
    
    static {
        Xray.state = false;
        Xray.statechat = false;
    }
}
