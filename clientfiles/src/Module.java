import java.util.Iterator;
import net.minecraft.client.iN;

// 
// Decompiled by Procyon v0.5.36
// 

public class Module
{
    private boolean isEnabled;
    public String moduleName;
    public int moduleKey;
    public boolean moduleState;
    
    public void onToggled() {
        if (this.moduleState) {
            try {
                this.onEnable();
            }
            catch (Exception ex) {}
        }
        else {
            try {
                this.onDisable();
            }
            catch (Exception ex2) {}
        }
    }
    
    public void onEnable() {
    }
    
    public static iN instance() {
        return null;
    }
    
    public void toggle() {
        this.setModuleState(!this.getModuleState());
        this.onToggled();
    }
    
    public boolean getModuleState() {
        return this.moduleState;
    }
    
    public Module getInstance() {
        for (final Module module : ModuleManager.getModules()) {
            if (module.getClass().equals(this.getClass())) {
                return module;
            }
        }
        return null;
    }
    
    public Module getModByName(final String s) {
        for (final Module module : ModuleManager.getModules()) {
            if (module.moduleName.trim().equalsIgnoreCase(s.trim()) || module.toString().trim().equalsIgnoreCase(s.trim())) {
                return module;
            }
        }
        return null;
    }
    
    public void setModuleState(final boolean b) {
        if (b) {
            this.moduleState = true;
        }
        else {
            this.moduleState = false;
        }
    }
    
    public String getModuleName() {
        return this.moduleName;
    }
    
    public boolean isEnabled() {
        return this.isEnabled;
    }
    
    public void setModuleKey(final int moduleKey) {
        this.moduleKey = moduleKey;
    }
    
    public Module(final String moduleName, final int moduleKey) {
        this.moduleName = moduleName;
        this.moduleKey = moduleKey;
        this.moduleState = false;
    }
    
    public int getModuleKey() {
        return this.moduleKey;
    }
    
    public void onDisable() {
    }
}
