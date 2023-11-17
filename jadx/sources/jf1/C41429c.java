package jf1;

import ed1.C40736c;
import ef1.C40777a;
import he1.C41238w;
import me1.C41752f;

/* renamed from: jf1.c */
final class C41429c extends C40777a {

    /* renamed from: f */
    private final C40736c f97495f;

    public C41429c(C41752f fVar, C40736c cVar) {
        super(fVar, false, true);
        this.f97495f = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L0 */
    public void mo95126L0(Throwable th, boolean z) {
        try {
            if (this.f97495f.mo94908b(th)) {
                return;
            }
        } catch (Throwable th2) {
            C41211b.m119461a(th, th2);
        }
        C41428b.m120214a(th, mo94380b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: O0 */
    public void mo95128M0(C41238w wVar) {
        try {
            this.f97495f.onComplete();
        } catch (Throwable th) {
            C41428b.m120214a(th, mo94380b());
        }
    }
}
