// 
// Decompiled by Procyon v0.5.36
// 

public class Timer
{
    private long prevMS;
    
    public Timer() {
        this.prevMS = 0L;
    }
    
    public void reset() {
        this.prevMS = this.getTime();
    }
    
    public long getDifference() {
        return this.getTime() - this.prevMS;
    }
    
    public long getTime() {
        return System.nanoTime() / 1000000L;
    }
    
    public boolean delay(final double n) {
        return this.getTime() - this.prevMS >= n;
    }
}
