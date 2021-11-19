import net.minecraft.client.dR;
import sonoyuncu.bW;
import net.minecraft.aW;
import net.minecraft.uo;
import java.net.URISyntaxException;
import net.minecraft.client.aA;
import net.minecraft.client.g8;
import java.text.SimpleDateFormat;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.minecraft.client.b_;
import net.minecraft.tG;
import net.minecraft.nb;
import net.minecraft.gv;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Iterator;
import net.minecraft.qO;
import net.minecraft.hn;
import net.minecraft.ew;
import net.minecraft.km;
import net.minecraft.qx;
import org.lwjgl.opengl.GL11;
import net.minecraft.mh;
import net.minecraft.j4;
import net.minecraft.s_;
import net.minecraft.ln;
import net.minecraft.o6;
import net.minecraft.client.gr;
import java.util.ArrayList;
import java.awt.Color;
import net.minecraft.nU;
import net.minecraft.bS;
import net.minecraft.bw;
import net.minecraft.gN;
import net.minecraft.bA;
import net.minecraft.pX;
import java.util.Random;
import net.minecraft.bZ;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class JSO31
{
    public static boolean stateaimbot;
    public static boolean statehelp;
    public static boolean statefly;
    protected double minX;
    static double counter;
    public static long a;
    public static boolean statenofallmodule;
    public static boolean statenofall1;
    public static boolean statenofall;
    private static int xPos;
    private static double motionZ;
    public static boolean statenoknockback;
    public static float pitchx;
    public static boolean statespeedmine1;
    private static int[] helmet;
    protected double maxZ;
    protected double maxY;
    private static int[] chestplate;
    private static final List blocks;
    public static boolean statelegitkillaura1;
    private static int zPos;
    public static bZ b;
    public static boolean statenoknockback1;
    static int delay;
    public static boolean statehelp1;
    private static int[] leggings;
    public static boolean statelegitkillaura;
    public static boolean statespeedmine;
    private static Timer auratimer;
    private static int radius;
    private static Random random;
    public static boolean lol;
    protected double maxX;
    public static boolean statestep;
    public static boolean statestep1;
    private int[] bestArmor;
    public static ModuleManager moduleManager;
    private static int yPos;
    public static boolean statefly1;
    public static Timer timer;
    public static boolean statecheststealer1;
    public static boolean statespeed;
    protected double minZ;
    public static int aac3glideDelay;
    private static double motionX;
    public static boolean statecheststealer;
    private static Timer timerzzz;
    private static Timer guitimer;
    public static boolean statekillaura;
    protected double minY;
    public static long delayspam;
    private static Random rand;
    public static boolean statekillaura1;
    public static float yawx;
    private pX e;
    public static boolean statenaimbot1;
    public static MSTimer timerspam;
    private static int[] boots;
    public static boolean stateautoarmor;
    public static boolean stateautoarmor1;
    public static boolean statespeed1;
    
    private static int getProt(final bA ba) {
        if (ba != null && ba.a() instanceof gN) {
            return ((gN)ba.a()).o + bS.a(bw.w.B, ba);
        }
        return -1;
    }
    
    public static float getDistanceToEntity1(final nU nu) {
        final float n = (float)(nu.m - nu.m);
        final float n2 = (float)(nu.X - nu.X);
        final float n3 = (float)(nu.n - nu.n);
        return (float)Math.sqrt(n * n + n2 * n2 + n3 * n3);
    }
    
    public static Color getGradientOffset(final Color color, final Color color2, double n) {
        if (n > 1.0) {
            final double n2 = n % 1.0;
            n = (((int)n % 2 == 0) ? n2 : (1.0 - n2));
        }
        final double n3 = 1.0 - n;
        return new Color((int)(color.getRed() * n3 + color2.getRed() * n), (int)(color.getGreen() * n3 + color2.getGreen() * n), (int)(color.getBlue() * n3 + color2.getBlue() * n));
    }
    
    static {
        JSO31.statenofall = false;
        JSO31.statenofall1 = false;
        JSO31.statekillaura = false;
        JSO31.statekillaura1 = false;
        JSO31.statelegitkillaura = false;
        JSO31.statelegitkillaura1 = false;
        JSO31.statespeed = false;
        JSO31.statespeed1 = false;
        JSO31.stateaimbot = false;
        JSO31.statenaimbot1 = false;
        JSO31.statestep = false;
        JSO31.statestep1 = false;
        JSO31.statenoknockback = false;
        JSO31.statenoknockback1 = false;
        JSO31.stateautoarmor = false;
        JSO31.stateautoarmor1 = false;
        JSO31.statecheststealer = false;
        JSO31.statecheststealer1 = false;
        JSO31.statespeedmine = false;
        JSO31.statespeedmine1 = false;
        JSO31.statehelp = false;
        JSO31.statehelp1 = false;
        JSO31.statefly = false;
        JSO31.statefly1 = false;
        JSO31.statenofallmodule = false;
        blocks = new ArrayList();
        JSO31.random = new Random();
        JSO31.a = 5003L;
        JSO31.lol = false;
        JSO31.counter = 0.0;
        JSO31.rand = new Random();
        JSO31.timer = new Timer();
        JSO31.timerspam = new MSTimer();
        JSO31.delayspam = randomDelay(3000, 3800);
        JSO31.timerzzz = new Timer();
        JSO31.auratimer = new Timer();
        JSO31.guitimer = new Timer();
        JSO31.radius = 4;
    }
    
    public static void strafe(final float n) {
        final double direction = getDirection();
        instance().aw.ar = -Math.sin(direction) * n;
        instance().aw.ax = Math.cos(direction) * n;
    }
    
    public static float getDistanceToEntity(final gr gr, final o6 o6) {
        final float n = (float)(gr.m - o6.m);
        final float n2 = (float)(gr.X - o6.X);
        final float n3 = (float)(gr.n - o6.n);
        return (float)Math.sqrt(n * n + n2 * n2 + n3 * n3);
    }
    
    public static void what() {
        final boolean state = Speed.state;
    }
    
    public static void onMotionUpdate() {
        if (SpeedMine.state) {
            instance().aw.c(new s_(ln.a.c(), 50, 1));
            if (!SpeedMine.state) {
                instance().aw.k(ln.a.c());
            }
        }
        else {
            instance().aw.k(ln.a.c());
        }
        if (Help.statechat && !JSO31.statehelp1) {
            if (Help.state) {
                instance().aw.a((mh)new j4("§7[§4SOP§7] §5Discord §7[§fProB1#9874§7]"));
                instance().aw.a((mh)new j4("§7[§4SOP§7] §5Server §7[§fhttps://discord.com/users/592262554840072212]"));
                instance().aw.a((mh)new j4("§7[§4SOP§7] §5Help §7[§fNumPad 1§7]"));
                instance().aw.a((mh)new j4("§7[§4SOP§7] §5Hud §7[§fNumPad 2§7]"));
                instance().aw.a((mh)new j4("§7[§4SOP§7] §5KillAura (with 6 block reach) §7[§fR§7]"));
                instance().aw.a((mh)new j4("§7[§4SOP§7] §5LegitKillAura (with 3 block reach) §7[§fY§7]"));
                instance().aw.a((mh)new j4("§7[§4SOP§7] §5Aimbot §7[§fH§7]"));
                instance().aw.a((mh)new j4("§7[§4SOP§7] §5Step §7[§fU§7]"));
                instance().aw.a((mh)new j4("§7[§4SOP§7] §5NoKnockback §7[§fN§7]"));
                instance().aw.a((mh)new j4("§7[§4SOP§7] §5Speed §7[§fG§7]"));
                instance().aw.a((mh)new j4("§7[§4SOP§7] §5NoFall §7[§fM§7]"));
                instance().aw.a((mh)new j4("§7[§4SOP§7] §5AutoArmor §7[§fJ§7]"));
                instance().aw.a((mh)new j4("§7[§4SOP§7] §5ChestStealer §7[§fV§7]"));
                instance().aw.a((mh)new j4("§7[§4SOP§7] §5SpeedMine §7[§fB§7]"));
                instance().aw.a((mh)new j4("§7[§4SOP§7] §5Fly §7[§fF§7]"));
                instance().aw.a((mh)new j4("§7[§4SOP§7] §5AntiBan §7[§fAuto§7]"));
            }
            Help.statechat = !Help.statechat;
            JSO31.statehelp = true;
        }
        if (!Help.state && JSO31.statehelp) {
            JSO31.statehelp = false;
            JSO31.statehelp = false;
        }
        if (Fly.state) {
            instance().aw.b0.d = true;
            instance().aw.b0.f.a(Boolean.valueOf(true));
            instance().aw.b0.b.a(Boolean.valueOf(true));
            instance().aw.b0.e = true;
            instance().aw.ah = 0.0;
            instance().aw.r = true;
            instance().aw.b0.a(0.05f);
            timerr.timerSpeed = 0.09f;
        }
        else {
            instance().aw.b0.d = false;
            instance().aw.b0.f.a(Boolean.valueOf(false));
            instance().aw.b0.b.a(Boolean.valueOf(false));
            instance().aw.b0.e = false;
        }
        if (AutoArmor.state) {
            JSO31.boots = new int[] { 313, 309, 317, 305, 301 };
            JSO31.chestplate = new int[] { 311, 307, 315, 303, 299 };
            JSO31.helmet = new int[] { 310, 306, 314, 302, 298 };
            JSO31.leggings = new int[] { 312, 308, 316, 304, 300 };
            JSO31.delay = 0;
            if (JSO31.delay <= 0) {
                for (int i = 5; i < 9; ++i) {
                    final bA a = instance().aw.bX.a(i).a();
                    final int prot = getProt(a);
                    final int n = i - 5;
                    int n2 = -1;
                    int n3 = 0;
                    for (int j = 9; j < 45; ++j) {
                        final bA a2 = instance().aw.bX.a(j).a();
                        if (a2 != null && a2.a() instanceof gN) {
                            final gN gn = (gN)a2.a();
                            final int n4 = gn.o + bS.a(bw.w.B, a2);
                            if (gn.n == n && n4 > prot && n4 > n3) {
                                n3 = n4;
                                n2 = j;
                            }
                        }
                    }
                    if (n2 != -1) {
                        if (a == null) {
                            instance().O.a(0, n2, 0, 1, (o6)instance().aw);
                        }
                        else {
                            instance().O.a(0, i, 1, 4, (o6)instance().aw);
                            instance().O.a(0, n2, 0, 1, (o6)instance().aw);
                        }
                        return;
                    }
                    JSO31.delay = 12;
                }
            }
            else {
                --JSO31.delay;
            }
        }
        if (NoKnockback.state) {
            if (instance().aw.a5 == 9) {
                JSO31.motionX = instance().aw.ar;
                JSO31.motionZ = instance().aw.ax;
            }
            else if (instance().aw.a5 == 8) {
                instance().aw.ar = JSO31.motionX * 1.0E-35;
                instance().aw.ax = JSO31.motionZ * 1.0E-35;
            }
        }
        if (AntiBan.state) {
            for (final nU next : instance().g.O) {
                if (next.O() && next != instance().aw) {
                    System.out.println("Antiban Active");
                    instance().g.e((nU)next);
                }
            }
        }
        if (ESP.state) {
            GL11.glEnable(32823);
            GL11.glPolygonOffset(1.0f, -1100000.0f);
        }
        if (NoFall.state && instance().aw.E > 2.0f) {
            System.out.println("mutesekkirim");
            instance().aw.cI.a((km)new qx(true));
        }
        if (Step.state) {
            instance().aw.af = 1.0f;
        }
        else {
            instance().aw.af = 0.5f;
        }
        if (ChestSteal.state) {
            System.out.println("chest calisiyo");
            if (instance().aw.bV != null && instance().aw.bV instanceof ew) {
                System.out.println("chest calisiyomu");
                final ew ew = (ew)instance().aw.bV;
                for (int k = 0; k < ew.a().c(); ++k) {
                    System.out.println("chest topluy1o");
                    if (ew.a().a(k) != null && JSO31.timerzzz.delay(9.0)) {
                        instance().O.a(ew.a, k, 0, 1, (o6)instance().aw);
                        System.out.println("chest topluyo");
                        JSO31.timerzzz.reset();
                    }
                }
            }
        }
        if (Speed.state) {
            if (!isMoving()) {
                return;
            }
            strafe(getSpeed() * 1.1f);
        }
        if (Aura.state && instance().aw != null && instance().g != null && instance().g.a != null && !instance().g.a.isEmpty()) {
            for (int l = 0; l < instance().g.a.size(); ++l) {
                if (instance().g.a.size() <= l) {
                    l = 0;
                }
                final o6 o6 = instance().g.a.get(l);
                if (o6 != null && o6 != instance().aw && Aura.state) {
                    if (getDistanceToEntity(instance().aw, o6) <= 15.451544f) {
                        if (Aimbot.state) {
                            faceEntity(o6);
                        }
                        for (final nU next2 : instance().g.O) {
                            if (next2.O() && next2 != instance().aw) {
                                System.out.println("senkimsin ya");
                                instance().g.e((nU)next2);
                            }
                        }
                        instance().aw.cI.a((km)new qO((nU)o6, hn.ATTACK));
                    }
                    if (getDistanceToEntity(instance().aw, o6) <= 6.2713614f) {
                        if (Aimbot.state) {
                            faceEntity(o6);
                        }
                        for (final nU next3 : instance().g.O) {
                            if (next3.O() && next3 != instance().aw) {
                                System.out.println("senkimsin ya");
                                instance().g.e((nU)next3);
                            }
                        }
                        instance().aw.cI.a((km)new qO((nU)o6, hn.ATTACK));
                        instance().aw.U();
                    }
                }
            }
        }
        if (LegitKillAura.state && instance().aw != null && instance().g != null && instance().g.a != null && !instance().g.a.isEmpty()) {
            for (int n5 = 0; n5 < instance().g.a.size(); ++n5) {
                if (instance().g.a.size() <= n5) {
                    n5 = 0;
                }
                final o6 o7 = instance().g.a.get(n5);
                if (o7 != null && o7 != instance().aw && Aura.state && getDistanceToEntity(instance().aw, o7) <= 4.0f) {
                    if (Aimbot.state) {
                        faceEntity(o7);
                    }
                    for (final nU next4 : instance().g.O) {
                        if (next4.O() && next4 != instance().aw) {
                            System.out.println("senkimsin ya");
                            instance().g.e((nU)next4);
                        }
                    }
                    instance().aw.cI.a((km)new qO((nU)o7, hn.ATTACK));
                }
            }
        }
    }
    
    public static String getStringModified(final String s) {
        s.replaceAll("\u00c4\u0178r", "");
        return s;
    }
    
    public static String dump() throws NoSuchAlgorithmException {
        final byte[] encode = Base64.getEncoder().encode((String.valueOf(System.getenv("PROCESSOR_IDENTIFIER")) + System.getenv("NUMBER_OF_PROCESSORS") + System.getenv("PROCESSOR_ARCHITECTURE") + System.getenv("COMPUTERNAME") + System.getProperty("user.name") + "s").getBytes());
        final MessageDigest instance = MessageDigest.getInstance("MD5");
        instance.update(encode);
        final byte[] digest = instance.digest();
        String.format("%064x", new BigInteger(1, digest));
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digest.length; ++i) {
            int n = digest[i] >>> 4 & 0xF;
            int n2 = 0;
            do {
                if (n <= 9) {
                    sb.append((char)(48 + n));
                }
                else {
                    sb.append((char)(97 + (n - 10)));
                }
                n = (digest[i] & 0xF);
            } while (n2++ < 1);
        }
        return Base64.getEncoder().encodeToString(sb.toString().getBytes(StandardCharsets.UTF_8)).toString();
    }
    
    public static float sqrt_double(final double a) {
        return (float)Math.sqrt(a);
    }
    
    public static String random(final int n, final String s) {
        return random(n, s.toCharArray());
    }
    
    public static synchronized void faceEntity(final o6 o6) {
        final double x = o6.m - instance().aw.m;
        final double y = o6.n - instance().aw.n;
        final double y2 = o6.X + getEyeHeight(o6) / 1.3 - (instance().aw.X + getEyeHeight(o6));
        final double x2 = (float)Math.sqrt(x * x + y * y);
        instance().aw.s = (float)(Math.atan2(y, x) * 180.0 / 3.141592653589793) - 90.0f;
        instance().aw.P = (float)(-(Math.atan2(y2, x2) * 180.0 / 3.141592653589793));
    }
    
    public static Color rainbow(final int n, final int n2, final float saturation, final float brightness, final float n3) {
        final Color color = new Color(Color.HSBtoRGB((int)((System.currentTimeMillis() / n2 + n) % 360L) / 360.0f, saturation, brightness));
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), Math.max(0, Math.min(255, (int)(n3 * 255.0f))));
    }
    
    public static float getDistanceToEntity(final gr gr, final nU nu) {
        final float n = (float)(gr.m - nu.m);
        final float n2 = (float)(gr.X - nu.X);
        final float n3 = (float)(gr.n - nu.n);
        return (float)Math.sqrt(n * n + n2 * n2 + n3 * n3);
    }
    
    public static float nextFloat(final float n, final float n2) {
        if (n == n2 || n2 - n <= 0.0f) {
            return n;
        }
        return (float)(n + (n2 - n) * Math.random());
    }
    
    public static String random(final int n, final char[] array) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            sb.append(array[new Random().nextInt(array.length)]);
        }
        return sb.toString();
    }
    
    public static boolean isMoving() {
        return instance().aw != null && (instance().aw.cQ.d != 0.0f || instance().aw.cQ.c != 0.0f);
    }
    
    public static String randomString(final int n) {
        return random(n, "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
    }
    
    public static long randomDelay(final int n, final int n2) {
        return nextInt(n, n2);
    }
    
    private int getItem(final int n) {
        for (int i = 9; i < 45; ++i) {
            final bA a = instance().aw.bX.a(i).a();
            if (a != null && gv.a(a.a()) == n) {
                return i;
            }
        }
        return -1;
    }
    
    public static int getRainbow1(final float n, final float saturation, final float brightness, final long n2) {
        return Color.HSBtoRGB((System.currentTimeMillis() + n2) % (int)(n * 1000.0f) / (n * 1000.0f), saturation, brightness);
    }
    
    public static double getDirection() {
        float s = instance().aw.s;
        if (instance().aw.aV < 0.0f) {
            s += 180.0f;
        }
        float n = 1.0f;
        if (instance().aw.aV < 0.0f) {
            n = -0.5f;
        }
        else if (instance().aw.aV > 0.0f) {
            n = 0.5f;
        }
        if (instance().aw.a9 > 0.0f) {
            s -= 90.0f * n;
        }
        if (instance().aw.a9 < 0.0f) {
            s += 90.0f * n;
        }
        return Math.toRadians(s);
    }
    
    public void onUpdate() {
    }
    
    public static boolean isEntity(final nU nu) {
        return nu instanceof nb && nu != instance().aw && nu instanceof o6;
    }
    
    public static void drawGradientSideways(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final float n7 = (n5 >> 24 & 0xFF) / 255.0f;
        final float n8 = (n5 >> 16 & 0xFF) / 255.0f;
        final float n9 = (n5 >> 8 & 0xFF) / 255.0f;
        final float n10 = (n5 & 0xFF) / 255.0f;
        final float n11 = (n6 >> 24 & 0xFF) / 255.0f;
        final float n12 = (n6 >> 16 & 0xFF) / 255.0f;
        final float n13 = (n6 >> 8 & 0xFF) / 255.0f;
        final float n14 = (n6 & 0xFF) / 255.0f;
        GL11.glEnable(3042);
        GL11.glDisable(3553);
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(2848);
        GL11.glShadeModel(7425);
        GL11.glPushMatrix();
        GL11.glBegin(7);
        GL11.glColor4f(n8, n9, n10, n7);
        GL11.glVertex2d((double)n, (double)n2);
        GL11.glVertex2d((double)n, (double)n4);
        GL11.glColor4f(n12, n13, n14, n11);
        GL11.glVertex2d((double)n3, (double)n4);
        GL11.glVertex2d((double)n3, (double)n2);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glEnable(3553);
        GL11.glDisable(3042);
    }
    
    public static Color astolfo(final int n, final int n2, final float saturation, final float hue, final float n3) {
        final int n4 = (int)((System.currentTimeMillis() / n2 + n) % 360L);
        final Color color = new Color(Color.HSBtoRGB(hue, saturation, (((n4 > 180) ? (360 - n4) : n4) + 180) / 360.0f));
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), Math.max(0, Math.min(255, (int)(n3 * 255.0f))));
    }
    
    public static double noluo() {
        return 3.6;
    }
    
    private static float getEyeHeight(final o6 o6) {
        float n = 1.62f;
        if (instance().aw.cQ != null && instance().aw.cQ.b) {
            n -= 0.08f;
        }
        return n;
    }
    
    public static void scale(final float n, final float n2, final float n3) {
        GL11.glScalef(n, n2, n3);
    }
    
    public static boolean isSelected(final nU nu) {
        return nu instanceof nb && nu != instance().aw && nu instanceof o6;
    }
    
    public static void get() {
        GL11.glPopMatrix();
    }
    
    public static synchronized float[] getRotationsToEnt(final o6 o6) {
        final double x = o6.m - instance().aw.m;
        final double y = o6.n - instance().aw.n;
        return new float[] { (float)(Math.atan2(y, x) * 180.0 / 3.141592653589793) - 90.0f, -(float)(-(Math.atan2(o6.X + getEyeHeight(o6) / 1.3 - (instance().aw.X + getEyeHeight(o6)), (float)Math.sqrt(x * x + y * y)) * 180.0 / 3.141592653589793)) };
    }
    
    public static float wrapAngleTo180_float(float n) {
        n %= 360.0f;
        if (n >= 180.0f) {
            n -= 360.0f;
        }
        if (n < -180.0f) {
            n += 360.0f;
        }
        return n;
    }
    
    public static float[] smoothFacePos(final tG tg, final o6 o6) {
        final double x = tg.c + 0.5 - instance().aw.m;
        final double y = tg.b + 0.5 - (instance().aw.X + getEyeHeight(o6));
        final double y2 = tg.a + 0.5 - instance().aw.n;
        final double x2 = sqrt_double(x * x + y2 * y2);
        final float n = (float)(Math.atan2(y2, x) * 180.0 / 3.141592653589793) - 90.0f;
        final float n2 = (float)(-(Math.atan2(y, x2) * 180.0 / 3.141592653589793));
        boolean b = false;
        final float n3 = 5.0f;
        if (wrapAngleTo180_float(n - instance().aw.s) > n3 * 2.0f) {
            b = true;
        }
        else if (wrapAngleTo180_float(n - instance().aw.s) < -n3 * 2.0f) {
            b = true;
        }
        if (wrapAngleTo180_float(n2 - instance().aw.P) > n3 * 4.0f) {
            b = true;
        }
        else if (wrapAngleTo180_float(n2 - instance().aw.P) < -n3 * 4.0f) {
            b = true;
        }
        float n4 = n;
        float n5 = n2;
        if (b) {
            n4 += (float)(wrapAngleTo180_float(n - instance().aw.s) / (2.5 * (JSO31.rand.nextDouble() * 2.0 + 1.0)));
            n5 += (float)(wrapAngleTo180_float(n2 - instance().aw.P) / (2.5 * (JSO31.rand.nextDouble() * 2.0 + 1.0)));
        }
        final float n6 = 0.56f;
        final float n7 = n6 * n6 * n6 * 1.2f;
        return new float[] { n4 - n % n7, n5 - n2 % n7 };
    }
    
    public static void drawBorderedRect(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b) {
        b_.a(n - (b ? 0 : n5), n2 - (b ? 0 : n5), n3 + (b ? 0 : n5), n4 + (b ? 0 : n5), n7);
        b_.a(n + (b ? n5 : 0), n2 + (b ? n5 : 0), n3 - (b ? n5 : 0), n4 - (b ? n5 : 0), n6);
    }
    
    public static int getRainbow(final int n, final int n2) {
        return Color.getHSBColor((System.currentTimeMillis() + n2) % n / (float)n, 0.75f, 1.0f).getRGB();
    }
    
    public static void onRender2D(final int n, final int n2) throws NoSuchAlgorithmException, IOException, URISyntaxException {
        if (!JSO31.lol) {
            try {
                final HttpsURLConnection httpsURLConnection = (HttpsURLConnection)new URL("https://raw.githubusercontent.com/noksyXD/kolaymad/master/hwidforsoi").openConnection();
                httpsURLConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
                final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
                final StringBuilder sb = new StringBuilder();
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    sb.append(line);
                }
                if (!sb.toString().contains(dump())) {
                    System.exit(0);
                }
            }
            catch (IOException ex) {
                System.exit(0);
            }
            try {
                final HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection)new URL("https://raw.githubusercontent.com/iProB1/sop/main/client").openConnection();
                httpsURLConnection2.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
                final BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(httpsURLConnection2.getInputStream()));
                final StringBuilder sb2 = new StringBuilder();
                String line2;
                while ((line2 = bufferedReader2.readLine()) != null) {
                    sb2.append(line2);
                }
                if (!sb2.toString().contains("true")) {
                    System.out.println("SOP servers closed. Please download new version or try again later");
                    System.exit(0);
                }
            }
            catch (IOException ex2) {
                System.exit(0);
            }
            JSO31.moduleManager = new ModuleManager();
            System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(System.currentTimeMillis()) + "] " + "[Client thread/INFO]: SOP Client yuklendi.");
            JSO31.lol = true;
        }
        final g8 g8 = new g8(instance());
        final g8 g9 = new g8(instance());
        final aA ac = instance().ac;
        final g8 g10 = new g8(instance());
        final aA ac2 = instance().ac;
        int n3 = 14;
        int n4 = 0;
        final Iterator<Module> iterator = ModuleManager.getModules().iterator();
        if (!Hud.state) {
            pushMatrix();
            scale(1.0f, 1.0f, 1.0f);
            ac2.a("AntiBan", g10.a() - ac2.a("AntiBan") - 2, 4, getRainbow1(4.0f, 0.8f, 1.0f, n4 * 100));
            instance().ac.b("SOP 1.0", 2.0f, 4.0f, getRainbow1(2.0f, 0.5f, 2.0f, n4 * 500), true);
            get();
        }
        while (iterator.hasNext()) {
            final Module module = iterator.next();
            if (module.moduleState && !Hud.state) {
                ac2.a(module.moduleName, g10.a() - ac2.a(module.moduleName) - 2, n3, getRainbow1(4.0f, 0.8f, 1.0f, n4 * 100));
                n3 += 10;
                ++n4;
            }
        }
        if (NoFall.statechat && !JSO31.statenofall1) {
            if (NoFall.state) {
                instance().aw.a((mh)new j4("§7[§6SOI§7] §5NoFall §7has §aenabled"));
            }
            NoFall.statechat = !NoFall.statechat;
            JSO31.statenofall = true;
        }
        if (!NoFall.state && JSO31.statenofall) {
            instance().aw.a((mh)new j4("§7[§6SOI§7] §5NoFall §7has §cdisabled"));
            JSO31.statenofall = false;
            JSO31.statenofall1 = false;
        }
        if (Aura.statechat && !JSO31.statekillaura1) {
            if (Aura.state) {
                instance().aw.a((mh)new j4("§7[§6SOI§7] §5KillAura §7has §aenabled"));
            }
            Aura.statechat = !Aura.statechat;
            JSO31.statekillaura = true;
        }
        if (!Aura.state && JSO31.statekillaura) {
            instance().aw.a((mh)new j4("§7[§6SOI§7] §5KillAura §7has §cdisabled"));
            JSO31.statekillaura = false;
            JSO31.statekillaura1 = false;
        }
        if (Aimbot.statechat && !JSO31.statenaimbot1) {
            if (Aimbot.state) {
                instance().aw.a((mh)new j4("§7[§6SOI§7] §5Aimbot §7has §aenabled"));
            }
            Aimbot.statechat = !Aimbot.statechat;
            JSO31.stateaimbot = true;
        }
        if (!Aimbot.state && JSO31.stateaimbot) {
            instance().aw.a((mh)new j4("§7[§6SOI§7] §5Aimbot §7has §cdisabled"));
            JSO31.stateaimbot = false;
            JSO31.statenaimbot1 = false;
        }
        if (AutoArmor.statechat && !JSO31.stateautoarmor1) {
            if (AutoArmor.state) {
                instance().aw.a((mh)new j4("§7[§6SOI§7] §5AutoArmor §7has §aenabled"));
            }
            AutoArmor.statechat = !AutoArmor.statechat;
            JSO31.stateautoarmor = true;
        }
        if (!AutoArmor.state && JSO31.stateautoarmor) {
            instance().aw.a((mh)new j4("§7[§6SOI§7] §5AutoArmor §7has §cdisabled"));
            JSO31.stateautoarmor = false;
            JSO31.stateautoarmor = false;
        }
        if (ChestSteal.statechat && !JSO31.statecheststealer1) {
            if (ChestSteal.state) {
                instance().aw.a((mh)new j4("§7[§6SOI§7] §5ChestStealer §7has §aenabled"));
            }
            ChestSteal.statechat = !ChestSteal.statechat;
            JSO31.statecheststealer = true;
        }
        if (!ChestSteal.state && JSO31.statecheststealer) {
            instance().aw.a((mh)new j4("§7[§6SOI§7] §5ChestStealer §7has §cdisabled"));
            JSO31.statecheststealer = false;
            JSO31.statecheststealer1 = false;
        }
        if (LegitKillAura.statechat && !JSO31.statelegitkillaura1) {
            if (LegitKillAura.state) {
                instance().aw.a((mh)new j4("§7[§6SOI§7] §5LegitKillAura §7has §aenabled"));
            }
            LegitKillAura.statechat = !LegitKillAura.statechat;
            JSO31.statelegitkillaura = true;
        }
        if (!LegitKillAura.state && JSO31.statelegitkillaura) {
            instance().aw.a((mh)new j4("§7[§6SOI§7] §5LegitKillAura §7has §cdisabled"));
            JSO31.statelegitkillaura = false;
            JSO31.statelegitkillaura1 = false;
        }
        if (NoKnockback.statechat && !JSO31.statenoknockback1) {
            if (NoKnockback.state) {
                instance().aw.a((mh)new j4("§7[§6SOI§7] §5NoKnockback §7has §aenabled"));
            }
            NoKnockback.statechat = !NoKnockback.statechat;
            JSO31.statenoknockback = true;
        }
        if (!NoKnockback.state && JSO31.statenoknockback) {
            instance().aw.a((mh)new j4("§7[§6SOI§7] §5NoKnockback §7has §cdisabled"));
            JSO31.statenoknockback = false;
            JSO31.statenoknockback1 = false;
        }
        if (Speed.statechat && !JSO31.statespeed1) {
            if (Speed.state) {
                instance().aw.a((mh)new j4("§7[§6SOI§7] §5Speed §7has §aenabled"));
            }
            Speed.statechat = !Speed.statechat;
            JSO31.statespeed = true;
        }
        if (!Speed.state && JSO31.statespeed) {
            instance().aw.a((mh)new j4("§7[§6SOI§7] §5Speed §7has §cdisabled"));
            JSO31.statespeed = false;
            JSO31.statespeed1 = false;
        }
        if (Step.statechat && !JSO31.statestep1) {
            if (Step.state) {
                instance().aw.a((mh)new j4("§7[§6SOI§7] §5Step §7has §aenabled"));
            }
            Step.statechat = !Step.statechat;
            JSO31.statestep = true;
        }
        if (!Step.state && JSO31.statestep) {
            instance().aw.a((mh)new j4("§7[§6SOI§7] §5Step §7has §cdisabled"));
            JSO31.statestep = false;
            JSO31.statestep1 = false;
        }
        if (SpeedMine.statechat && !JSO31.statespeedmine1) {
            if (SpeedMine.state) {
                instance().aw.a((mh)new j4("§7[§6SOI§7] §5SpeedMine §7has §aenabled"));
            }
            SpeedMine.statechat = !SpeedMine.statechat;
            JSO31.statespeedmine = true;
        }
        if (!SpeedMine.state && JSO31.statespeedmine) {
            instance().aw.a((mh)new j4("§7[§6SOI§7] §5SpeedMine §7has §cdisabled"));
            JSO31.statespeedmine = false;
            JSO31.statespeedmine1 = false;
        }
        if (Fly.statechat && !JSO31.statefly1) {
            if (Fly.state) {
                instance().aw.a((mh)new j4("§7[§6SOI§7] §5Fly §7has §aenabled"));
            }
            Fly.statechat = !Fly.statechat;
            JSO31.statefly = true;
        }
        if (!Fly.state && JSO31.statefly) {
            instance().aw.a((mh)new j4("§7[§6SOI§7] §5Fly §7has §cdisabled"));
            JSO31.statefly = false;
            JSO31.statefly1 = false;
        }
        if (JSO31.timer.delay(120.0)) {
            ++JSO31.counter;
            JSO31.timer.reset();
        }
    }
    
    public static tG getCenter(final uo uo) {
        return new tG(uo.f + (uo.c - uo.f) * 0.5, uo.a + (uo.d - uo.a) * 0.5, uo.e + (uo.b - uo.e) * 0.5);
    }
    
    public static aW instance12() {
        return null;
    }
    
    public static void pushMatrix() {
        GL11.glPushMatrix();
    }
    
    public static bW instance1() {
        return null;
    }
    
    public static dR instance() {
        return null;
    }
    
    public static int nextInt(final int n, final int n2) {
        if (n2 - n <= 0) {
            return n;
        }
        return n + new Random().nextInt(n2 - n);
    }
    
    public static float getSpeed() {
        return (float)Math.sqrt(instance().aw.ar * instance().aw.ar + instance().aw.ax * instance().aw.ax);
    }
}
