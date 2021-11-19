// 
// Decompiled by Procyon v0.5.36
// 

public final class TimerUtils
{
    private long lastMS;
    
    public void reset() {
        this.lastMS = this.getCurrentMS();
    }
    
    public boolean delay(final float n) {
        return this.getCurrentMS() - this.lastMS >= n;
    }
    
    public long getCurrentMS() {
        return System.nanoTime() / 1000000L;
    }
    
    public int convertToMS(final int n) {
        return 1000 / n;
    }
    
    public long getLastMS() {
        return this.lastMS;
    }
    
    public boolean hasReached(final float n) {
        return this.getCurrentMS() - this.lastMS >= n;
    }
    
    public void setLastMS() {
        this.lastMS = System.currentTimeMillis();
    }
    
    public void setLastMS(final long lastMS) {
        this.lastMS = lastMS;
    }
    
    public boolean isDelayComplete(final float n) {
        return System.currentTimeMillis() - this.lastMS >= n;
    }
}
