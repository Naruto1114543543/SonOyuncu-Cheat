
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;


public class SoiTransformer extends Injector {
    @Override
	public void inject(final ClassReader classReader, final ClassNode classNode) {
		if (classNode.name.equals("net/minecraft/uK")) {
			for (final org.objectweb.asm.tree.MethodNode MethodNode : classNode.methods) {
				if (MethodNode.name.equals("a") && MethodNode.desc.equals("(Lnet/minecraft/aj;Lnet/minecraft/BlockPos;Lnet/minecraft/l0;)Z")) {
					final InsnList InsnList = new InsnList();
					InsnList.add(new MethodInsnNode(184, "net/minecraft/client/dR", "a", "()Lnet/minecraft/client/dR;", false));
					InsnList.add(new FieldInsnNode(180, "net/minecraft/client/dR", "g", "Lnet/minecraft/client/lb;"));
					InsnList.add(new InsnNode(3));
					InsnList.add(new FieldInsnNode(181, "net/minecraft/client/lb", "bV", "I"));
					InsnList.add(new InsnNode(4));
					InsnList.add(new InsnNode(172));
					InsnList.add(new MethodInsnNode(184, "net/minecraft/client/dR", "a", "()Lnet/minecraft/client/dR;", false));
					InsnList.add(new FieldInsnNode(180, "net/minecraft/client/dR", "g", "Lnet/minecraft/client/lb;"));
					InsnList.add(new InsnNode(3));
					InsnList.add(new FieldInsnNode(181, "net/minecraft/client/lb", "bV", "I"));
					InsnList.add(new InsnNode(4));
					InsnList.add(new InsnNode(172));
					InsnList.add(new MethodInsnNode(184, "net/minecraft/client/dR", "a", "()Lnet/minecraft/client/dR;", false));
					InsnList.add(new FieldInsnNode(180, "net/minecraft/client/dR", "g", "Lnet/minecraft/client/lb;"));
					InsnList.add(new InsnNode(3));
					InsnList.add(new FieldInsnNode(181, "net/minecraft/client/lb", "bV", "I"));
					InsnList.add(new InsnNode(4));
					InsnList.add(new InsnNode(172));
					InsnList.add(new MethodInsnNode(184, "net/minecraft/client/dR", "a", "()Lnet/minecraft/client/dR;", false));
					InsnList.add(new FieldInsnNode(180, "net/minecraft/client/dR", "g", "Lnet/minecraft/client/lb;"));
					InsnList.add(new InsnNode(3));
					InsnList.add(new FieldInsnNode(181, "net/minecraft/client/lb", "bV", "I"));
					InsnList.add(new InsnNode(4));
					InsnList.add(new InsnNode(172));
					InsnList.add(new MethodInsnNode(184, "net/minecraft/client/dR", "a", "()Lnet/minecraft/client/dR;", false));
					InsnList.add(new FieldInsnNode(180, "net/minecraft/client/dR", "g", "Lnet/minecraft/client/lb;"));
					InsnList.add(new InsnNode(3));
					InsnList.add(new FieldInsnNode(181, "net/minecraft/client/lb", "bV", "I"));
					InsnList.add(new InsnNode(4));
					InsnList.add(new InsnNode(172));
					InsnList.add(new MethodInsnNode(184, "net/minecraft/client/dR", "a", "()Lnet/minecraft/client/dR;", false));
					InsnList.add(new FieldInsnNode(180, "net/minecraft/client/dR", "g", "Lnet/minecraft/client/lb;"));
					InsnList.add(new InsnNode(3));
					InsnList.add(new FieldInsnNode(181, "net/minecraft/client/lb", "bV", "I"));
					InsnList.add(new InsnNode(4));
					InsnList.add(new InsnNode(172));
					MethodNode.instructions.insert(InsnList);
					AbstractInsnNode a = null;
					AbstractInsnNode next = null;
					AbstractInsnNode next2 = null;
					AbstractInsnNode next3 = null;
					AbstractInsnNode next4 = null;
					for (final AbstractInsnNode a2 : MethodNode.instructions.toArray()) {
						if (a2.getOpcode() == 184 && a2.getNext().getOpcode() == 180 && a2.getNext().getNext().getOpcode() == 3) {
							a = a2;
							next = a2.getNext().getNext().getNext().getNext().getNext().getNext();
							next2 = next.getNext().getNext().getNext().getNext().getNext().getNext();
							next3 = next2.getNext().getNext().getNext().getNext().getNext().getNext();
							next4 = next3.getNext().getNext().getNext().getNext().getNext().getNext();
							break;
						}
					}
					AbstractInsnNode next5 = a;
					for (int InsnNode = 0; InsnNode < 5; ++InsnNode) {
						next5 = next5.getNext();
					}
					AbstractInsnNode next6 = next;
					for (int l = 0; l < 5; ++l) {
						next6 = next6.getNext();
					}
					AbstractInsnNode next7 = next2;
					for (int n = 0; n < 5; ++n) {
						next7 = next7.getNext();
					}
					AbstractInsnNode next8 = next3;
					for (int n2 = 0; n2 < 5; ++n2) {
						next8 = next8.getNext();
					}
					AbstractInsnNode next9 = next4;
					for (int n3 = 0; n3 < 5; ++n3) {
						next9 = next9.getNext();
					}
					final LabelNode o2 = new LabelNode();
					final InsnList m = new InsnList();
					m.add(new IntInsnNode(16, 15));
					m.add(new MethodInsnNode(184, "net/minecraft/uK", "a", "(I)Lnet/minecraft/uK;", false));
					m.add(new VarInsnNode(25, 0));
					m.add(new JumpInsnNode(166, o2));
					MethodNode.instructions.insertBefore(next, m);
					MethodNode.instructions.insert(next6, o2);
					final LabelNode o3 = new LabelNode();
					final InsnList i2 = new InsnList();
					i2.add(new IntInsnNode(16, 56));
					m.add(new MethodInsnNode(184, "net/minecraft/uK", "a", "(I)Lnet/minecraft/uK;", false));
					i2.add(new VarInsnNode(25, 0));
					i2.add(new JumpInsnNode(166, o3));
					MethodNode.instructions.insertBefore(a, i2);
					MethodNode.instructions.insert(next5, o3);
					final LabelNode o4 = new LabelNode();
					final InsnList i3 = new InsnList();
					i3.add(new IntInsnNode(17, 129));
					m.add(new MethodInsnNode(184, "net/minecraft/uK", "a", "(I)Lnet/minecraft/uK;", false));
					i3.add(new VarInsnNode(25, 0));
					i3.add(new JumpInsnNode(166, o4));
					MethodNode.instructions.insertBefore(next2, i3);
					MethodNode.instructions.insert(next7, o4);
					final LabelNode o5 = new LabelNode();
					final InsnList i4 = new InsnList();
					i4.add(new IntInsnNode(16, 14));
					m.add(new MethodInsnNode(184, "net/minecraft/uK", "a", "(I)Lnet/minecraft/uK;", false));
					i4.add(new VarInsnNode(25, 0));
					i4.add(new JumpInsnNode(166, o5));
					MethodNode.instructions.insertBefore(next3, i4);
					MethodNode.instructions.insert(next8, o5);
					final LabelNode o6 = new LabelNode();
					final InsnList i5 = new InsnList();
					i5.add(new IntInsnNode(16, 21));
					m.add(new MethodInsnNode(184, "net/minecraft/uK", "a", "(I)Lnet/minecraft/uK;", false));
					i5.add(new VarInsnNode(25, 0));
					i5.add(new JumpInsnNode(166, o6));
					MethodNode.instructions.insertBefore(next4, i5);
					MethodNode.instructions.insert(next9, o6);
					AbstractInsnNode a3 = null;
					for (final AbstractInsnNode a4 : MethodNode.instructions.toArray()) {
						if (a4.getOpcode() == 184 && a4.getNext().getOpcode() == 180 && a4.getNext().getNext().getOpcode() == 4) {
							a3 = a4;
						}
					}
					AbstractInsnNode next10 = a3;
					for (int n5 = 0; n5 < 5; ++n5) {
						next10 = next10.getNext();
					}
					final LabelNode o7 = new LabelNode();
					final InsnList i6 = new InsnList();
					i6.add(new MethodInsnNode(184, "Xray", "getStat", "()Z", false));
					i6.add(new JumpInsnNode(153, o7));
					MethodNode.instructions.insertBefore(a3, i6);
					MethodNode.instructions.insert(next10, o7);
				}
			}
		}
		if (classNode.name.equals("sonoyuncu/net/arikia/dev/drpc/DiscordGroup")) {
			for (final MethodNode v2 : classNode.methods) {
				if (v2.name.equals("g") && v2.desc.equals("()Ljava/io/File;")) {
					final InsnList i7 = new InsnList();
					i7.add(new LdcInsnNode("\u00c2 "));
					i7.add(new InsnNode(177));
					v2.instructions.insert(i7);
				}
			}
		}
		if (classNode.name.equals("sonoyuncu/net/arikia/dev/drpc/DiscordGroup")) {
			for (final MethodNode v3 : classNode.methods) {
				if (v3.name.equals("a") && v3.desc.equals("()I")) {
					final InsnList i8 = new InsnList();
					i8.add(new LdcInsnNode("\u00c2 "));
					i8.add(new InsnNode(177));
					v3.instructions.insert(i8);
				}
			}
		}
		if (classNode.name.equals("net/minecraft/client/gr")) {
			for (final MethodNode v4 : classNode.methods) {
				if (v4.name.equals("Z") && v4.desc.equals("()V")) {
					AbstractInsnNode a5 = null;
					for (final AbstractInsnNode a6 : v4.instructions.toArray()) {
						if (a6.getOpcode() == 184) {
							a5 = a6;
							break;
						}
					}
					final InsnList i9 = new InsnList();
					i9.add(new MethodInsnNode(184, "JSO31", "onMotionUpdate", "()V", false));
					v4.instructions.insert(a5, i9);
				}
			}
		}
		if (classNode.name.equals("O")) {
			for (final MethodNode v5 : classNode.methods) {
				if (v5.name.equals("run") && v5.desc.equals("()V")) {
					final InsnList i10 = new InsnList();
					i10.add(new LdcInsnNode("\u00c2 "));
					i10.add(new InsnNode(177));
					v5.instructions.insert(i10);
				}
			}
		}
		if (classNode.name.equals("O")) {
			for (final MethodNode v6 : classNode.methods) {
				if (v6.name.equals("a") && v6.desc.equals("()V")) {
					final InsnList i11 = new InsnList();
					i11.add(new LdcInsnNode("\u00c2 "));
					i11.add(new InsnNode(177));
					v6.instructions.insert(i11);
				}
			}
		}
		if (classNode.name.equals("O")) {
			for (final MethodNode v7 : classNode.methods) {
				if (v7.name.equals("a") && v7.desc.equals("()V") && v7.access == 2) {
					final InsnList i12 = new InsnList();
					i12.add(new LdcInsnNode("\u00c2 "));
					i12.add(new InsnNode(177));
					v7.instructions.insert(i12);
				}
			}
		}
		if (classNode.name.equals("O")) {
			for (final MethodNode v8 : classNode.methods) {
				if (v8.name.equals("b") && v8.desc.equals("()V")) {
					final InsnList i13 = new InsnList();
					i13.add(new LdcInsnNode("\u00c2 "));
					i13.add(new InsnNode(177));
					v8.instructions.insert(i13);
				}
			}
		}
		if (classNode.name.equals("O")) {
			for (final MethodNode v9 : classNode.methods) {
				if (v9.name.equals("a") && v9.desc.equals("(Ljava/lang/Runnable;Z)V")) {
					final InsnList i14 = new InsnList();
					i14.add(new LdcInsnNode("\u00c2 "));
					i14.add(new InsnNode(177));
					v9.instructions.insert(i14);
				}
			}
		}
		if (classNode.name.equals("O")) {
			for (final MethodNode v10 : classNode.methods) {
				if (v10.name.equals("a") && v10.desc.equals("(Ljava/lang/String;)Ljava/lang/String;")) {
					final InsnList i15 = new InsnList();
					i15.add(new LdcInsnNode("\u00c2 "));
					i15.add(new InsnNode(176));
					v10.instructions.insert(i15);
				}
			}
		}
		if (classNode.name.equals("et")) {
			for (final MethodNode v11 : classNode.methods) {
				if (v11.name.equals("e") && v11.desc.equals("()Ljava/lang/String;")) {
					final InsnList i16 = new InsnList();
					i16.add(new LdcInsnNode("\u00c2 "));
					i16.add(new InsnNode(176));
					v11.instructions.insert(i16);
				}
			}
		}
		if (classNode.name.equals("et")) {
			for (final MethodNode v12 : classNode.methods) {
				if (v12.name.equals("a") && v12.desc.equals("()(Ljava/lang/String;)Ljava/lang/String;")) {
					final InsnList i17 = new InsnList();
					i17.add(new LdcInsnNode("\u00c2 "));
					i17.add(new InsnNode(176));
					v12.instructions.insert(i17);
				}
			}
		}
		if (classNode.name.equals("et")) {
			for (final MethodNode v13 : classNode.methods) {
				if (v13.name.equals("FieldInsnNode") && v13.desc.equals("()Ljava/lang/String;")) {
					final InsnList i18 = new InsnList();
					i18.add(new LdcInsnNode("\u00c2 "));
					i18.add(new InsnNode(176));
					v13.instructions.insert(i18);
				}
			}
		}
		if (classNode.name.equals("et")) {
			for (final MethodNode v14 : classNode.methods) {
				if (v14.name.equals("c") && v14.desc.equals("()Ljava/lang/String;")) {
					final InsnList i19 = new InsnList();
					i19.add(new LdcInsnNode("\u00c2 "));
					i19.add(new InsnNode(176));
					v14.instructions.insert(i19);
				}
			}
		}
		if (classNode.name.equals("JSO31")) {
			for (final MethodNode v15 : classNode.methods) {
				if (v15.name.equals("instance") && v15.desc.equals("()Lnet/minecraft/client/dR;")) {
					AbstractInsnNode next11 = null;
					for (final AbstractInsnNode a7 : v15.instructions.toArray()) {
						if (a7.getOpcode() == 1) {
							next11 = a7.getNext();
							break;
						}
					}
					v15.instructions.remove(next11.getPrevious());
					final InsnList i20 = new InsnList();
					i20.add(new MethodInsnNode(184, "net/minecraft/client/dR", "a", "()Lnet/minecraft/client/dR;", false));
					v15.instructions.insertBefore(next11, i20);
				}
			}
		}
		if (classNode.name.equals("net/minecraft/client/bW")) {
			for (final MethodNode v16 : classNode.methods) {
				if (v16.name.equals("a") && v16.desc.equals("(F)V")) {
					AbstractInsnNode next12 = null;
					for (final AbstractInsnNode a8 : v16.instructions.toArray()) {
						if (a8 instanceof FieldInsnNode && ((FieldInsnNode)a8).name.equals("q") && ((FieldInsnNode)a8).owner.equals("net/minecraft/client/bW")) {
							next12 = a8.getNext().getNext().getNext();
							break;
						}
					}
					final InsnList i21 = new InsnList();
					i21.add(new VarInsnNode(21, 5));
					i21.add(new VarInsnNode(21, 6));
					i21.add(new MethodInsnNode(184, "JSO31", "onRender2D", "(II)V", false));
					v16.instructions.insert(next12, i21);
				}
			}
		}
		if (classNode.name.equals("net/minecraft/client/dR")) {
			for (final MethodNode v17 : classNode.methods) {
				if (v17.name.equals("x") && v17.desc.equals("()V")) {
					AbstractInsnNode next13 = null;
					int n9 = 0;
					for (final AbstractInsnNode a9 : v17.instructions.toArray()) {
						if (a9 instanceof MethodInsnNode && ((MethodInsnNode)a9).name.equals("getEventKeyState") && ++n9 == 2) {
							next13 = a9.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext();
						}
					}
					final InsnList i22 = new InsnList();
					i22.add(new VarInsnNode(21, 2));
					i22.add(new MethodInsnNode(184, "ModuleManager", "listenKey", "(I)V", false));
					v17.instructions.insert(next13, i22);
				}
			}
		}
	}
}

