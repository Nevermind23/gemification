package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.C1846a;
import he1.C41217g;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

/* renamed from: androidx.lifecycle.h0 */
public final class C1589h0 implements C1846a.C1849c {

    /* renamed from: a */
    private final C1846a f4593a;

    /* renamed from: b */
    private boolean f4594b;

    /* renamed from: c */
    private Bundle f4595c;

    /* renamed from: d */
    private final C41217g f4596d;

    /* renamed from: androidx.lifecycle.h0$a */
    static final class C1590a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C1638u0 f4597d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1590a(C1638u0 u0Var) {
            super(0);
            this.f4597d = u0Var;
        }

        /* renamed from: b */
        public final C1592i0 invoke() {
            return C1583g0.m5616e(this.f4597d);
        }
    }

    public C1589h0(C1846a aVar, C1638u0 u0Var) {
        C41536l.m120489i(aVar, "savedStateRegistry");
        C41536l.m120489i(u0Var, "viewModelStoreOwner");
        this.f4593a = aVar;
        this.f4596d = C41219i.m119470b(new C1590a(u0Var));
    }

    /* renamed from: c */
    private final C1592i0 m5618c() {
        return (C1592i0) this.f4596d.getValue();
    }

    /* renamed from: a */
    public Bundle mo350a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4595c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : m5618c().mo4905dw().entrySet()) {
            String str = (String) entry.getKey();
            Bundle a = ((C1580f0) entry.getValue()).mo4893c().mo350a();
            if (!C41536l.m120484d(a, Bundle.EMPTY)) {
                bundle.putBundle(str, a);
            }
        }
        this.f4594b = false;
        return bundle;
    }

    /* renamed from: b */
    public final Bundle mo4902b(String str) {
        Bundle bundle;
        C41536l.m120489i(str, "key");
        mo4903d();
        Bundle bundle2 = this.f4595c;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(str);
        } else {
            bundle = null;
        }
        Bundle bundle3 = this.f4595c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f4595c;
        boolean z = false;
        if (bundle4 != null && bundle4.isEmpty()) {
            z = true;
        }
        if (z) {
            this.f4595c = null;
        }
        return bundle;
    }

    /* renamed from: d */
    public final void mo4903d() {
        if (!this.f4594b) {
            this.f4595c = this.f4593a.mo6111b("androidx.lifecycle.internal.SavedStateHandlesProvider");
            this.f4594b = true;
            m5618c();
        }
    }
}
