// 
// Decompiled by Procyon v0.5.36
// 

public final class MSTimer
{
    private long time;
    
    public boolean hasTimePassed(final long n) {
        return System.currentTimeMillis() >= this.time + n;
    }
    
    public void reset() {
        this.time = System.currentTimeMillis();
    }
    
    public long hasTimeLeft(final long n) {
        return n + this.time - System.currentTimeMillis();
    }
    
    public MSTimer() {
        this.time = -1L;
    }
}
