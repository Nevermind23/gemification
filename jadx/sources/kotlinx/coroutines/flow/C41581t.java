package kotlinx.coroutines.flow;

import gf1.C41097e;
import hf1.C41258k;
import kotlinx.coroutines.internal.C41584a0;
import me1.C41752f;
import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;

/* renamed from: kotlinx.coroutines.flow.t */
public abstract class C41581t {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C41584a0 f97767a = new C41584a0("NONE");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C41584a0 f97768b = new C41584a0(ProductType.PRODUCT_STATUS_PENDING);

    /* renamed from: a */
    public static final C41568k m120610a(Object obj) {
        if (obj == null) {
            obj = C41258k.f97266a;
        }
        return new C41579s(obj);
    }

    /* renamed from: d */
    public static final C41556a m120613d(C41578r rVar, C41752f fVar, int i, C41097e eVar) {
        boolean z = false;
        if (i >= 0 && i < 2) {
            z = true;
        }
        if ((z || i == -2) && eVar == C41097e.DROP_OLDEST) {
            return rVar;
        }
        return C41576p.m120593e(rVar, fVar, i, eVar);
    }
}
