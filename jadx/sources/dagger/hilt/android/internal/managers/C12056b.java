package dagger.hilt.android.internal.managers;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1613n0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1630r0;
import androidx.lifecycle.C1638u0;
import p163m0.C7047a;
import p516mf.C16681a;
import p530nf.C16918a;
import p530nf.C16919b;
import p544of.C17184b;
import p586rf.C17606b;
import p600sf.C17775e;
import p627uf.C18154b;

/* renamed from: dagger.hilt.android.internal.managers.b */
final class C12056b implements C18154b {

    /* renamed from: d */
    private final C1620q0 f35458d;

    /* renamed from: e */
    private volatile C17184b f35459e;

    /* renamed from: f */
    private final Object f35460f = new Object();

    /* renamed from: dagger.hilt.android.internal.managers.b$a */
    class C12057a implements C1620q0.C1624b {

        /* renamed from: a */
        final /* synthetic */ Context f35461a;

        C12057a(Context context) {
            this.f35461a = context;
        }

        /* renamed from: a */
        public /* synthetic */ C1613n0 mo4803a(Class cls, C7047a aVar) {
            return C1630r0.m5685b(this, cls, aVar);
        }

        /* renamed from: b */
        public C1613n0 mo4804b(Class cls) {
            return new C12059c(((C12058b) C16919b.m59518a(this.f35461a, C12058b.class)).mo32187m().mo32575a());
        }
    }

    /* renamed from: dagger.hilt.android.internal.managers.b$b */
    public interface C12058b {
        /* renamed from: m */
        C17606b mo32187m();
    }

    /* renamed from: dagger.hilt.android.internal.managers.b$c */
    static final class C12059c extends C1613n0 {

        /* renamed from: d */
        private final C17184b f35463d;

        C12059c(C17184b bVar) {
            this.f35463d = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: dw */
        public C17184b mo32188dw() {
            return this.f35463d;
        }

        /* access modifiers changed from: protected */
        public void onCleared() {
            super.onCleared();
            ((C17775e) ((C12060d) C16681a.m59022a(this.f35463d, C12060d.class)).mo32189b()).mo45359a();
        }
    }

    /* renamed from: dagger.hilt.android.internal.managers.b$d */
    public interface C12060d {
        /* renamed from: b */
        C16918a mo32189b();
    }

    /* renamed from: dagger.hilt.android.internal.managers.b$e */
    static abstract class C12061e {
        /* renamed from: a */
        static C16918a m44262a() {
            return new C17775e();
        }
    }

    C12056b(ComponentActivity componentActivity) {
        this.f35458d = m44255c(componentActivity, componentActivity);
    }

    /* renamed from: a */
    private C17184b m44254a() {
        return ((C12059c) this.f35458d.mo4936a(C12059c.class)).mo32188dw();
    }

    /* renamed from: c */
    private C1620q0 m44255c(C1638u0 u0Var, Context context) {
        return new C1620q0(u0Var, (C1620q0.C1624b) new C12057a(context));
    }

    /* renamed from: b */
    public C17184b generatedComponent() {
        if (this.f35459e == null) {
            synchronized (this.f35460f) {
                if (this.f35459e == null) {
                    this.f35459e = m44254a();
                }
            }
        }
        return this.f35459e;
    }
}
