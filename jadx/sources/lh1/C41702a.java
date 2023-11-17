package lh1;

import ih1.C41374f;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import ph1.C42205b;

/* renamed from: lh1.a */
public final class C41702a {

    /* renamed from: a */
    private final C41806a f97960a = C42205b.f99310e.mo97689a();

    /* renamed from: b */
    private boolean f97961b;

    /* renamed from: c */
    private final ArrayList f97962c = new ArrayList();

    /* renamed from: d */
    private final HashSet f97963d = new HashSet();

    /* renamed from: e */
    private final boolean f97964e;

    /* renamed from: f */
    private final boolean f97965f;

    public C41702a(boolean z, boolean z2) {
        this.f97964e = z;
        this.f97965f = z2;
    }

    /* renamed from: f */
    public static /* synthetic */ C41374f m120951f(C41702a aVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        return aVar.mo96505e(z, z2);
    }

    /* renamed from: a */
    public final HashSet mo96501a() {
        return this.f97963d;
    }

    /* renamed from: b */
    public final C41806a mo96502b() {
        return this.f97960a;
    }

    /* renamed from: c */
    public final ArrayList mo96503c() {
        return this.f97962c;
    }

    /* renamed from: d */
    public final boolean mo96504d() {
        return this.f97961b;
    }

    /* renamed from: e */
    public final C41374f mo96505e(boolean z, boolean z2) {
        boolean z3 = true;
        boolean z4 = this.f97964e || z2;
        if (!this.f97965f && !z) {
            z3 = false;
        }
        return new C41374f(z4, z3, false, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: g */
    public final void mo96506g(boolean z) {
        this.f97961b = z;
    }
}
