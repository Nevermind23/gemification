package kotlinx.coroutines.internal;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.jvm.internal.C41536l;

/* renamed from: kotlinx.coroutines.internal.h */
public final class C41600h {

    /* renamed from: a */
    public static final C41600h f97798a = new C41600h();

    private C41600h() {
    }

    /* renamed from: a */
    private final Object m120675a(String str, ClassLoader classLoader, Class cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    /* renamed from: b */
    private final List m120676b(Class cls, ClassLoader classLoader) {
        try {
            return mo96376d(cls, classLoader);
        } catch (Throwable unused) {
            return C41358y.m120036z0(ServiceLoader.load(cls, classLoader));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        se1.C42550b.m123187a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0055, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0057, code lost:
        he1.C41211b.m119461a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0075, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0076, code lost:
        se1.C42550b.m123187a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0079, code lost:
        throw r1;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List m120677e(java.net.URL r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "jar"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r1 = cf1.C40439w.m117109H(r0, r1, r2, r3, r4)
            if (r1 == 0) goto L_0x005b
            java.lang.String r6 = "jar:file:"
            java.lang.String r6 = cf1.C40440x.m117132I0(r0, r6, r4, r3, r4)
            r1 = 33
            java.lang.String r6 = cf1.C40440x.m117142N0(r6, r1, r4, r3, r4)
            java.lang.String r1 = "!/"
            java.lang.String r0 = cf1.C40440x.m117132I0(r0, r1, r4, r3, r4)
            java.util.jar.JarFile r1 = new java.util.jar.JarFile
            r1.<init>(r6, r2)
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ all -> 0x004f }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x004f }
            java.util.zip.ZipEntry r3 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x004f }
            r3.<init>(r0)     // Catch:{ all -> 0x004f }
            java.io.InputStream r0 = r1.getInputStream(r3)     // Catch:{ all -> 0x004f }
            java.lang.String r3 = "UTF-8"
            r2.<init>(r0, r3)     // Catch:{ all -> 0x004f }
            r6.<init>(r2)     // Catch:{ all -> 0x004f }
            kotlinx.coroutines.internal.h r0 = f97798a     // Catch:{ all -> 0x0048 }
            java.util.List r0 = r0.m120678f(r6)     // Catch:{ all -> 0x0048 }
            se1.C42550b.m123187a(r6, r4)     // Catch:{ all -> 0x004f }
            r1.close()
            return r0
        L_0x0048:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004a }
        L_0x004a:
            r2 = move-exception
            se1.C42550b.m123187a(r6, r0)     // Catch:{ all -> 0x004f }
            throw r2     // Catch:{ all -> 0x004f }
        L_0x004f:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0056 }
            throw r0
        L_0x0056:
            r0 = move-exception
            he1.C41211b.m119461a(r6, r0)
            throw r6
        L_0x005b:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.InputStream r6 = com.google.firebase.perf.network.FirebasePerfUrlConnection.openStream(r6)
            r1.<init>(r6)
            r0.<init>(r1)
            kotlinx.coroutines.internal.h r6 = f97798a     // Catch:{ all -> 0x0073 }
            java.util.List r6 = r6.m120678f(r0)     // Catch:{ all -> 0x0073 }
            se1.C42550b.m123187a(r0, r4)
            return r6
        L_0x0073:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r1 = move-exception
            se1.C42550b.m123187a(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C41600h.m120677e(java.net.URL):java.util.List");
    }

    /* renamed from: f */
    private final List m120678f(BufferedReader bufferedReader) {
        boolean z;
        boolean z2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return C41358y.m120036z0(linkedHashSet);
            }
            String obj = C40440x.m117146P0(C40440x.m117144O0(readLine, "#", (String) null, 2, (Object) null)).toString();
            boolean z3 = false;
            int i = 0;
            while (true) {
                if (i >= obj.length()) {
                    z = true;
                    break;
                }
                char charAt = obj.charAt(i);
                if (charAt == '.' || Character.isJavaIdentifierPart(charAt)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z) {
                if (obj.length() > 0) {
                    z3 = true;
                }
                if (z3) {
                    linkedHashSet.add(obj);
                }
            } else {
                throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
            }
        }
    }

    /* renamed from: c */
    public final List mo96375c() {
        C41618r rVar;
        Class<C41618r> cls = C41618r.class;
        if (!C41602i.m120694a()) {
            return m120676b(cls, cls.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            C41618r rVar2 = null;
            try {
                rVar = cls.cast(Class.forName("ff1.a", true, cls.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                rVar = null;
            }
            if (rVar != null) {
                arrayList.add(rVar);
            }
            try {
                rVar2 = cls.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, cls.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (rVar2 == null) {
                return arrayList;
            }
            arrayList.add(rVar2);
            return arrayList;
        } catch (Throwable unused3) {
            return m120676b(cls, cls.getClassLoader());
        }
    }

    /* renamed from: d */
    public final List mo96376d(Class cls, ClassLoader classLoader) {
        ArrayList<T> list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        C41536l.m120488h(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (T e : list) {
            boolean unused = C41352v.m119965z(arrayList, f97798a.m120677e(e));
        }
        Set<String> D0 = C41358y.m119993D0(arrayList);
        if (!D0.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(D0, 10));
            for (String a : D0) {
                arrayList2.add(f97798a.m120675a(a, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }
}
