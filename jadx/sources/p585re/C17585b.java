package p585re;

import java.util.Enumeration;

/* renamed from: re.b */
public class C17585b extends ClassLoader {

    /* renamed from: a */
    private final ClassLoader f49160a;

    public C17585b(ClassLoader classLoader) {
        this.f49160a = classLoader;
    }

    public Enumeration getResources(String str) {
        return this.f49160a.getResources(str.replace("META-INF/services", "assets/services"));
    }

    public Class loadClass(String str) {
        return this.f49160a.loadClass(str);
    }
}
