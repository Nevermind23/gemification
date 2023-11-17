package p182n6;

/* renamed from: n6.d */
public final class C7252d {

    /* renamed from: a */
    private final String f21452a;

    /* renamed from: b */
    private final String f21453b;

    public C7252d(String str) {
        this(str, (String) null);
    }

    public C7252d(String str, String str2) {
        C7264i.m27903l(str, "log tag cannot be null");
        C7264i.m27894c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f21452a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f21453b = null;
        } else {
            this.f21453b = str2;
        }
    }
}
