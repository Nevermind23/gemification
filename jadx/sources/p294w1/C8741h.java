package p294w1;

/* renamed from: w1.h */
public class C8741h {

    /* renamed from: a */
    private final String f24598a;

    /* renamed from: b */
    public final float f24599b;

    /* renamed from: c */
    public final float f24600c;

    public C8741h(String str, float f, float f2) {
        this.f24598a = str;
        this.f24600c = f2;
        this.f24599b = f;
    }

    /* renamed from: a */
    public boolean mo24147a(String str) {
        if (this.f24598a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f24598a.endsWith("\r")) {
            String str2 = this.f24598a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
