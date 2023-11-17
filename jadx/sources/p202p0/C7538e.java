package p202p0;

import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: p0.e */
public final class C7538e {

    /* renamed from: a */
    private final int f21983a;

    /* renamed from: b */
    private C7602w f21984b;

    /* renamed from: c */
    private Bundle f21985c;

    public C7538e(int i, C7602w wVar, Bundle bundle) {
        this.f21983a = i;
        this.f21984b = wVar;
        this.f21985c = bundle;
    }

    /* renamed from: a */
    public final Bundle mo22065a() {
        return this.f21985c;
    }

    /* renamed from: b */
    public final int mo22066b() {
        return this.f21983a;
    }

    /* renamed from: c */
    public final C7602w mo22067c() {
        return this.f21984b;
    }

    /* renamed from: d */
    public final void mo22068d(Bundle bundle) {
        this.f21985c = bundle;
    }

    /* renamed from: e */
    public final void mo22069e(C7602w wVar) {
        this.f21984b = wVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7538e(int i, C7602w wVar, Bundle bundle, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : wVar, (i2 & 4) != 0 ? null : bundle);
    }
}
