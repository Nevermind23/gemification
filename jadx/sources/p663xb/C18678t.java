package p663xb;

import com.google.zxing.C5751a;
import com.google.zxing.C5753c;
import com.google.zxing.C5764m;
import com.google.zxing.FormatException;
import java.util.Map;
import p200ob.C7507a;

/* renamed from: xb.t */
public final class C18678t extends C18683y {

    /* renamed from: i */
    private final C18683y f52305i = new C18667i();

    /* renamed from: t */
    private static C5764m m63297t(C5764m mVar) {
        String f = mVar.mo18897f();
        if (f.charAt(0) == '0') {
            C5764m mVar2 = new C5764m(f.substring(1), (byte[]) null, mVar.mo18896e(), C5751a.UPC_A);
            if (mVar.mo18895d() != null) {
                mVar2.mo18898g(mVar.mo18895d());
            }
            return mVar2;
        }
        throw FormatException.m23153a();
    }

    /* renamed from: b */
    public C5764m mo18887b(C5753c cVar, Map map) {
        return m63297t(this.f52305i.mo18887b(cVar, map));
    }

    /* renamed from: c */
    public C5764m mo18888c(C5753c cVar) {
        return m63297t(this.f52305i.mo18888c(cVar));
    }

    /* renamed from: d */
    public C5764m mo46487d(int i, C7507a aVar, Map map) {
        return m63297t(this.f52305i.mo46487d(i, aVar, map));
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public int mo46490m(C7507a aVar, int[] iArr, StringBuilder sb) {
        return this.f52305i.mo46490m(aVar, iArr, sb);
    }

    /* renamed from: n */
    public C5764m mo46496n(int i, C7507a aVar, int[] iArr, Map map) {
        return m63297t(this.f52305i.mo46496n(i, aVar, iArr, map));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C5751a mo46491r() {
        return C5751a.UPC_A;
    }
}
