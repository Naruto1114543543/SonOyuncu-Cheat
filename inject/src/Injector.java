
import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.LoaderClassPath;
import org.apache.commons.io.FileUtils;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.Opcodes;

import java.io.*;
import java.lang.instrument.ClassFileTransformer;
import java.security.ProtectionDomain;

public abstract class Injector implements ClassFileTransformer, Opcodes {

	public static boolean once = true;
@Override
	public byte[] transform(final ClassLoader classLoader, final String s, final Class<?> clazz, final ProtectionDomain protectionDomain, final byte[] array) {
	if (once && s.equals("net/minecraft/client/dR")) {
		once = false;
		File folder = new File(System.getProperty("user.home") + "\\Desktop\\clientfiles");
		File[] listOfFiles = folder.listFiles();
		assert listOfFiles != null;
		for (File file : listOfFiles) {
			if (file.getName().contains("Module.class")) {
				CtClass cc;
				ClassPool pool = ClassPool.getDefault();
				pool.appendClassPath(new LoaderClassPath(classLoader));
				try {
					byte[] array1 = FileUtils.readFileToByteArray(file);
					cc = pool.makeClass(new ByteArrayInputStream(array1));
					cc.setName(file.getName().replace(".class", ""));
					cc.toClass(classLoader, protectionDomain);
				}
				catch (IOException | RuntimeException | CannotCompileException e1) {
					e1.printStackTrace();
				}
			}
		}

		for (File file : listOfFiles) {
			if (file.isFile() && file.getAbsolutePath().endsWith(".class") && !file.getName().contains("Module.class")) {
				CtClass cc = null;
				ClassPool pool = ClassPool.getDefault();
				pool.appendClassPath(new LoaderClassPath(classLoader));
				try {
					byte[] array1 = FileUtils.readFileToByteArray(file);

					try {
						ClassReader classReader = new ClassReader(array1);
						ClassNode classNode = new ClassNode();
						classReader.accept(classNode, 0);
						this.inject(classReader, classNode);
						ClassWriter classWriter = new ClassWriter(0);
						classNode.accept(classWriter);
						array1 = classWriter.toByteArray();
					} catch (Exception e) {
						e.printStackTrace();
					}

					cc = pool.makeClass(new ByteArrayInputStream(array1));
					cc.setName(file.getName().replace(".class", ""));
					cc.toClass(classLoader, protectionDomain);
				}
				catch (IOException | RuntimeException | CannotCompileException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
		if (s.equals("net/minecraft/client/bW") || s.equals("net/minecraft/client/dR") || s.equals("net/minecraft/client/gr") || s.equals("O") || s.equals("et") || s.equals("JSO31") || s.equals("sonoyuncu/net/arikia/dev/drpc/DiscordGroup")) {

			final ClassReader o2 = new ClassReader(array);
			final ClassNode c2 = new ClassNode();
			o2.accept(c2, 0);
			this.inject(o2, c2);
			final ClassWriter q2 = new ClassWriter(1);
			c2.accept(q2);
			return q2.toByteArray();
		}
		if (s.equals("network/sonoyuncu/launcher/soclient/SOClient")) {
			System.out.println("sa");
		}
		return new byte[0];
	}


	public abstract void inject(ClassReader classLoader, ClassNode var2);

}
