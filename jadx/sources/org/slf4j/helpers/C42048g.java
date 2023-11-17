package org.slf4j.helpers;

import java.io.PrintStream;

/* renamed from: org.slf4j.helpers.g */
public abstract class C42048g {

    /* renamed from: a */
    private static C42050b f98803a = null;

    /* renamed from: b */
    private static boolean f98804b = false;

    /* renamed from: org.slf4j.helpers.g$b */
    private static final class C42050b extends SecurityManager {
        private C42050b() {
        }

        /* access modifiers changed from: protected */
        public Class[] getClassContext() {
            return super.getClassContext();
        }
    }

    /* renamed from: a */
    public static Class m122157a() {
        int i;
        C42050b b = m122158b();
        if (b == null) {
            return null;
        }
        Class[] classContext = b.getClassContext();
        String name = C42048g.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 < classContext.length && (i = i2 + 2) < classContext.length) {
            return classContext[i];
        }
        throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
    }

    /* renamed from: b */
    private static C42050b m122158b() {
        C42050b bVar = f98803a;
        if (bVar != null) {
            return bVar;
        }
        if (f98804b) {
            return null;
        }
        C42050b e = m122161e();
        f98803a = e;
        f98804b = true;
        return e;
    }

    /* renamed from: c */
    public static final void m122159c(String str) {
        PrintStream printStream = System.err;
        printStream.println("SLF4J: " + str);
    }

    /* renamed from: d */
    public static final void m122160d(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }

    /* renamed from: e */
    private static C42050b m122161e() {
        try {
            return new C42050b();
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static boolean m122162f(String str) {
        String g = m122163g(str);
        if (g == null) {
            return false;
        }
        return g.equalsIgnoreCase("true");
    }

    /* renamed from: g */
    public static String m122163g(String str) {
        if (str != null) {
            try {
                return System.getProperty(str);
            } catch (SecurityException unused) {
                return null;
            }
        } else {
            throw new IllegalArgumentException("null input");
        }
    }
}
