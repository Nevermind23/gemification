package p600sf;

import android.os.Bundle;
import androidx.lifecycle.C1557a;
import androidx.lifecycle.C1580f0;
import androidx.lifecycle.C1613n0;
import androidx.lifecycle.C1620q0;
import ge1.C41084a;
import java.util.Map;
import java.util.Set;
import p163m0.C7047a;
import p306x0.C8933d;
import p516mf.C16681a;
import p586rf.C17610f;

/* renamed from: sf.d */
public final class C17772d implements C1620q0.C1624b {

    /* renamed from: a */
    private final Set f49583a;

    /* renamed from: b */
    private final C1620q0.C1624b f49584b;

    /* renamed from: c */
    private final C1557a f49585c;

    /* renamed from: sf.d$a */
    class C17773a extends C1557a {

        /* renamed from: e */
        final /* synthetic */ C17610f f49586e;

        C17773a(C17610f fVar) {
            this.f49586e = fVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public C1613n0 mo4842e(String str, Class cls, C1580f0 f0Var) {
            C17775e eVar = new C17775e();
            C41084a aVar = (C41084a) ((C17774b) C16681a.m59022a(this.f49586e.mo32888b(f0Var).mo32889c(eVar).mo32887a(), C17774b.class)).mo32893a().get(cls.getName());
            if (aVar != null) {
                C1613n0 n0Var = (C1613n0) aVar.get();
                n0Var.addCloseable(new C17771c(eVar));
                return n0Var;
            }
            throw new IllegalStateException("Expected the @HiltViewModel-annotated class '" + cls.getName() + "' to be available in the multi-binding of @HiltViewModelMap but none was found.");
        }
    }

    /* renamed from: sf.d$b */
    public interface C17774b {
        /* renamed from: a */
        Map mo32893a();
    }

    public C17772d(C8933d dVar, Bundle bundle, Set set, C1620q0.C1624b bVar, C17610f fVar) {
        this.f49583a = set;
        this.f49584b = bVar;
        this.f49585c = new C17773a(fVar);
    }

    /* renamed from: a */
    public C1613n0 mo4803a(Class cls, C7047a aVar) {
        if (this.f49583a.contains(cls.getName())) {
            return this.f49585c.mo4803a(cls, aVar);
        }
        return this.f49584b.mo4803a(cls, aVar);
    }

    /* renamed from: b */
    public C1613n0 mo4804b(Class cls) {
        if (this.f49583a.contains(cls.getName())) {
            return this.f49585c.mo4804b(cls);
        }
        return this.f49584b.mo4804b(cls);
    }
}
