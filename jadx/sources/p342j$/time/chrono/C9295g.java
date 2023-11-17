package p342j$.time.chrono;

import java.io.Serializable;

/* renamed from: j$.time.chrono.g */
public final class C9295g extends C9289a implements Serializable {

    /* renamed from: a */
    public static final C9295g f25767a = new C9295g();

    private C9295g() {
    }

    /* renamed from: a */
    public static boolean m34328a(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }
}
