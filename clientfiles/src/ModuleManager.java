import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class ModuleManager
{
    public static List<Module> modules;
    public Xray xrayModule;
    
    public static void listenKey(final int n) {
        for (final Module module : getModules()) {
            if (module.getModuleKey() == n) {
                module.toggle();
            }
        }
    }
    
    static {
        ModuleManager.modules = new ArrayList<Module>();
    }
    
    public static Module getModule(final Class<?> clazz) {
        if (clazz != null) {
            for (final Module module : getModules()) {
                if (module.getClass() == clazz) {
                    return module;
                }
            }
        }
        return null;
    }
    
    public static List<Module> getModules() {
        return ModuleManager.modules;
    }
    
    public static Module getModule(final String s) {
        if (s != null) {
            for (final Module module : getModules()) {
                if (module.moduleName.toString().contains(s)) {
                    return module;
                }
            }
        }
        return null;
    }
    
    public ModuleManager() {
        ModuleManager.modules.add(new Step());
        ModuleManager.modules.add(new ChestSteal());
        ModuleManager.modules.add(new Speed());
        ModuleManager.modules.add(new Aura());
        ModuleManager.modules.add(new Aimbot());
        ModuleManager.modules.add(new LegitKillAura());
        ModuleManager.modules.add(new NoFall());
        ModuleManager.modules.add(new Xray());
        ModuleManager.modules.add(new NoKnockback());
        ModuleManager.modules.add(new AntiBan());
        ModuleManager.modules.add(new AutoArmor());
        ModuleManager.modules.add(new Fly());
        ModuleManager.modules.add(new Help());
        ModuleManager.modules.add(new SpeedMine());
        ModuleManager.modules.add(new Hud());
    }
}
