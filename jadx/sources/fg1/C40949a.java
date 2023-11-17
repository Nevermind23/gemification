package fg1;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* renamed from: fg1.a */
public abstract class C40949a {

    /* renamed from: a */
    private static String f96722a;

    /* renamed from: fg1.a$a */
    static class C40950a implements PrivilegedAction {
        C40950a() {
        }

        /* renamed from: a */
        public String run() {
            return System.getProperty("line.separator");
        }
    }

    static {
        try {
            f96722a = (String) AccessController.doPrivileged(new C40950a());
        } catch (Exception unused) {
            try {
                f96722a = String.format("%n", new Object[0]);
            } catch (Exception unused2) {
                f96722a = "\n";
            }
        }
    }

    /* renamed from: a */
    public static String m118735a() {
        return f96722a;
    }
}
