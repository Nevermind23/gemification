package p402ed;

import android.graphics.Color;

/* renamed from: ed.d */
public final class C12426d {

    /* renamed from: a */
    private final String f37093a;

    public C12426d(String str) {
        this.f37093a = str;
    }

    /* renamed from: a */
    public final int mo33033a() {
        return Color.parseColor(this.f37093a);
    }

    /* renamed from: b */
    public final Integer mo33034b() {
        try {
            return Integer.valueOf(Color.parseColor(this.f37093a));
        } catch (Exception unused) {
            return null;
        }
    }
}
