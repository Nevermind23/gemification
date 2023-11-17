package p663xb;

import com.google.zxing.C5764m;
import com.google.zxing.ReaderException;
import p200ob.C7507a;

/* renamed from: xb.x */
final class C18682x {

    /* renamed from: c */
    private static final int[] f52312c = {1, 1, 2};

    /* renamed from: a */
    private final C18680v f52313a = new C18680v();

    /* renamed from: b */
    private final C18681w f52314b = new C18681w();

    C18682x() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5764m mo46499a(int i, C7507a aVar, int i2) {
        int[] o = C18683y.m63317o(aVar, i2, false, f52312c);
        try {
            return this.f52314b.mo46498b(i, aVar, o);
        } catch (ReaderException unused) {
            return this.f52313a.mo46497b(i, aVar, o);
        }
    }
}
