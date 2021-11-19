import java.io.IOException;
import java.lang.instrument.Instrumentation;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class Agent {
    public static void premain(final String args, final Instrumentation instrumentation) throws NoSuchAlgorithmException, InterruptedException, IOException {
        instrumentation.addTransformer(new SoiTransformer(), true);
        Arrays.stream(instrumentation.getAllLoadedClasses()).forEach(aClass -> {
            if (aClass.getName().equals("net.minecraft.client.dR")){
                try {
                    instrumentation.retransformClasses(aClass);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


}
