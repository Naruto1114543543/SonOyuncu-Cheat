// 
// Decompiled by Procyon v0.5.36
// 

public class Glide extends Module
{
    public static boolean state;
    
    public static boolean getStat() {
        return Glide.state;
    }
    
    public Glide() {
        super("Glide", 44);
    }
    
    static {
        Glide.state = false;
    }
    
    @Override
    public void onToggled() {
        Glide.state = !Glide.state;
    }
}
