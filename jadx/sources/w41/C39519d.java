package w41;

import kotlin.jvm.internal.C41536l;

/* renamed from: w41.d */
public abstract class C39519d {
    /* renamed from: a */
    public static final C39515a m114854a(String str, boolean z) {
        C41536l.m120489i(str, "prefKey");
        return new C39515a(str, z);
    }

    /* renamed from: b */
    public static final Enum m114855b(String str, Class cls) {
        C41536l.m120489i(cls, "class");
        try {
            return Enum.valueOf(cls, str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static final C39522g m114856c(String str, String str2) {
        C41536l.m120489i(str, "prefKey");
        return new C39522g(str, str2);
    }

    /* renamed from: d */
    public static /* synthetic */ C39522g m114857d(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return m114856c(str, str2);
    }
}
