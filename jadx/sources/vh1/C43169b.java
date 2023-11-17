package vh1;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.helpers.C42044c;
import org.slf4j.helpers.C42046e;
import org.slf4j.helpers.C42047f;
import org.slf4j.helpers.C42048g;
import org.slf4j.impl.StaticLoggerBinder;
import wh1.C43245d;

/* renamed from: vh1.b */
public abstract class C43169b {

    /* renamed from: a */
    static volatile int f100701a;

    /* renamed from: b */
    static final C42047f f100702b = new C42047f();

    /* renamed from: c */
    static final C42044c f100703c = new C42044c();

    /* renamed from: d */
    static boolean f100704d = C42048g.m122162f("slf4j.detectLoggerNameMismatch");

    /* renamed from: e */
    private static final String[] f100705e = {"1.6", "1.7"};

    /* renamed from: f */
    private static String f100706f = "org/slf4j/impl/StaticLoggerBinder.class";

    /* renamed from: a */
    private static final void m123824a() {
        Set set;
        try {
            if (!m123835l()) {
                set = m123829f();
                m123842s(set);
            } else {
                set = null;
            }
            StaticLoggerBinder.getSingleton();
            f100701a = 3;
            m123841r(set);
            m123830g();
            m123839p();
            f100702b.mo97529b();
        } catch (NoClassDefFoundError e) {
            if (m123836m(e.getMessage())) {
                f100701a = 4;
                C42048g.m122159c("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                C42048g.m122159c("Defaulting to no-operation (NOP) logger implementation");
                C42048g.m122159c("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                return;
            }
            m123828e(e);
            throw e;
        } catch (NoSuchMethodError e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                f100701a = 2;
                C42048g.m122159c("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                C42048g.m122159c("Your binding is version 1.5.5 or earlier.");
                C42048g.m122159c("Upgrade your binding to version 1.6.x.");
            }
            throw e2;
        } catch (Exception e3) {
            m123828e(e3);
            throw new IllegalStateException("Unexpected initialization failure", e3);
        }
    }

    /* renamed from: b */
    private static void m123825b(C43245d dVar, int i) {
        if (dVar.mo101927a().mo97524j()) {
            m123826c(i);
        } else if (!dVar.mo101927a().mo97525k()) {
            m123827d();
        }
    }

    /* renamed from: c */
    private static void m123826c(int i) {
        C42048g.m122159c("A number (" + i + ") of logging calls during the initialization phase have been intercepted and are");
        C42048g.m122159c("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        C42048g.m122159c("See also http://www.slf4j.org/codes.html#replay");
    }

    /* renamed from: d */
    private static void m123827d() {
        C42048g.m122159c("The following set of substitute loggers may have been accessed");
        C42048g.m122159c("during the initialization phase. Logging calls during this");
        C42048g.m122159c("phase were not honored. However, subsequent logging calls to these");
        C42048g.m122159c("loggers will work as normally expected.");
        C42048g.m122159c("See also http://www.slf4j.org/codes.html#substituteLogger");
    }

    /* renamed from: e */
    static void m123828e(Throwable th) {
        f100701a = 2;
        C42048g.m122160d("Failed to instantiate SLF4J LoggerFactory", th);
    }

    /* renamed from: f */
    static Set m123829f() {
        Enumeration<URL> enumeration;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = C43169b.class.getClassLoader();
            if (classLoader == null) {
                enumeration = ClassLoader.getSystemResources(f100706f);
            } else {
                enumeration = classLoader.getResources(f100706f);
            }
            while (enumeration.hasMoreElements()) {
                linkedHashSet.add(enumeration.nextElement());
            }
        } catch (IOException e) {
            C42048g.m122160d("Error getting resources from path", e);
        }
        return linkedHashSet;
    }

    /* renamed from: g */
    private static void m123830g() {
        C42047f fVar = f100702b;
        synchronized (fVar) {
            fVar.mo97532e();
            for (C42046e eVar : fVar.mo97531d()) {
                eVar.mo97528n(m123833j(eVar.getName()));
            }
        }
    }

    /* renamed from: h */
    public static ILoggerFactory m123831h() {
        if (f100701a == 0) {
            synchronized (C43169b.class) {
                if (f100701a == 0) {
                    f100701a = 1;
                    m123838o();
                }
            }
        }
        int i = f100701a;
        if (i == 1) {
            return f100702b;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        } else if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        } else {
            if (i == 4) {
                return f100703c;
            }
            throw new IllegalStateException("Unreachable code");
        }
    }

    /* renamed from: i */
    public static C43168a m123832i(Class cls) {
        Class a;
        C43168a j = m123833j(cls.getName());
        if (f100704d && (a = C42048g.m122157a()) != null && m123837n(cls, a)) {
            C42048g.m122159c(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", new Object[]{j.getName(), a.getName()}));
            C42048g.m122159c("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return j;
    }

    /* renamed from: j */
    public static C43168a m123833j(String str) {
        return m123831h().mo97519a(str);
    }

    /* renamed from: k */
    private static boolean m123834k(Set set) {
        return set.size() > 1;
    }

    /* renamed from: l */
    private static boolean m123835l() {
        String g = C42048g.m122163g("java.vendor.url");
        if (g == null) {
            return false;
        }
        return g.toLowerCase().contains("android");
    }

    /* renamed from: m */
    private static boolean m123836m(String str) {
        if (str == null) {
            return false;
        }
        if (!str.contains("org/slf4j/impl/StaticLoggerBinder") && !str.contains("org.slf4j.impl.StaticLoggerBinder")) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private static boolean m123837n(Class cls, Class cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    /* renamed from: o */
    private static final void m123838o() {
        m123824a();
        if (f100701a == 3) {
            m123843t();
        }
    }

    /* renamed from: p */
    private static void m123839p() {
        LinkedBlockingQueue c = f100702b.mo97530c();
        int size = c.size();
        ArrayList<C43245d> arrayList = new ArrayList<>(128);
        int i = 0;
        while (c.drainTo(arrayList, 128) != 0) {
            for (C43245d dVar : arrayList) {
                m123840q(dVar);
                int i2 = i + 1;
                if (i == 0) {
                    m123825b(dVar, size);
                }
                i = i2;
            }
            arrayList.clear();
        }
    }

    /* renamed from: q */
    private static void m123840q(C43245d dVar) {
        if (dVar != null) {
            C42046e a = dVar.mo101927a();
            String name = a.getName();
            if (a.mo97526l()) {
                throw new IllegalStateException("Delegate logger cannot be null at this state.");
            } else if (!a.mo97525k()) {
                if (a.mo97524j()) {
                    a.mo97527m(dVar);
                } else {
                    C42048g.m122159c(name);
                }
            }
        }
    }

    /* renamed from: r */
    private static void m123841r(Set set) {
        if (set != null && m123834k(set)) {
            C42048g.m122159c("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
        }
    }

    /* renamed from: s */
    private static void m123842s(Set set) {
        if (m123834k(set)) {
            C42048g.m122159c("Class path contains multiple SLF4J bindings.");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C42048g.m122159c("Found binding in [" + ((URL) it.next()) + "]");
            }
            C42048g.m122159c("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    /* renamed from: t */
    private static final void m123843t() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String startsWith : f100705e) {
                if (str.startsWith(startsWith)) {
                    z = true;
                }
            }
            if (!z) {
                C42048g.m122159c("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f100705e).toString());
                C42048g.m122159c("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            }
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            C42048g.m122160d("Unexpected problem occured during version sanity check", th);
        }
    }
}
