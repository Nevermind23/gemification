package od1;

import ed1.C40734b;
import ed1.C40737d;
import ed1.C40739f;
import id1.C41300a;
import java.util.concurrent.Callable;
import kd1.C41499d;
import ld1.C41692b;

/* renamed from: od1.d */
public final class C41820d extends C40734b {

    /* renamed from: d */
    final Callable f98162d;

    public C41820d(Callable callable) {
        this.f98162d = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo94889H(C40737d dVar) {
        try {
            ((C40739f) C41692b.m120934e(this.f98162d.call(), "The completableSupplier returned a null CompletableSource")).mo94894a(dVar);
        } catch (Throwable th) {
            C41300a.m119661b(th);
            C41499d.m120382h(th, dVar);
        }
    }
}
