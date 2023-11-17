package p294w1;

import java.util.List;

/* renamed from: w1.d */
public class C8737d {

    /* renamed from: a */
    private final List f24587a;

    /* renamed from: b */
    private final char f24588b;

    /* renamed from: c */
    private final double f24589c;

    /* renamed from: d */
    private final double f24590d;

    /* renamed from: e */
    private final String f24591e;

    /* renamed from: f */
    private final String f24592f;

    public C8737d(List list, char c, double d, double d2, String str, String str2) {
        this.f24587a = list;
        this.f24588b = c;
        this.f24589c = d;
        this.f24590d = d2;
        this.f24591e = str;
        this.f24592f = str2;
    }

    /* renamed from: c */
    public static int m32517c(char c, String str, String str2) {
        return (((c * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    /* renamed from: a */
    public List mo24132a() {
        return this.f24587a;
    }

    /* renamed from: b */
    public double mo24133b() {
        return this.f24590d;
    }

    public int hashCode() {
        return m32517c(this.f24588b, this.f24592f, this.f24591e);
    }
}
