package agent;

import java.lang.instrument.*;
import java.security.ProtectionDomain;

public class MethodLoggerAgent {
    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("🔧 Agent started. Attaching transformer...");

        inst.addTransformer(new ClassFileTransformer() {
            public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined,
                                    ProtectionDomain protectionDomain, byte[] classfileBuffer) {
                if (className.startsWith("java") || className.startsWith("sun")) {
                    return null; // Skip core classes
                }

                System.out.println("📦 Loaded class: " + className.replace('/', '.'));
                return null;
            }
        });
    }
}