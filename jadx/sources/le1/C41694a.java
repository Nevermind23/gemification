package le1;

import java.util.Timer;

/* renamed from: le1.a */
public abstract class C41694a {
    /* renamed from: a */
    public static final Timer m120937a(String str, boolean z) {
        return str == null ? new Timer(z) : new Timer(str, z);
    }
}
