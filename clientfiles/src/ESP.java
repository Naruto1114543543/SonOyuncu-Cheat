// 
// Decompiled by Procyon v0.5.36
// 

public class ESP extends Module
{
    public static boolean state;
    
    @Override
    public void onToggled() {
        ESP.state = !ESP.state;
    }
    
    public static boolean getStat() {
        return ESP.state;
    }
    
    static {
        ESP.state = false;
    }
    
    public ESP() {
        super("ESP", 46);
    }
}
