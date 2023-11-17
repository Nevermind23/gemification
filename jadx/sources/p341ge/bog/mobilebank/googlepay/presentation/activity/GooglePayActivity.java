package p341ge.bog.mobilebank.googlepay.presentation.activity;

import android.os.Bundle;
import android.view.View;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yj0.C30079a;

/* renamed from: ge.bog.mobilebank.googlepay.presentation.activity.GooglePayActivity */
public final class GooglePayActivity extends C24433a {

    /* renamed from: r */
    public static final C24432a f63019r = new C24432a((DefaultConstructorMarker) null);

    /* renamed from: q */
    public C30079a f63020q;

    /* renamed from: ge.bog.mobilebank.googlepay.presentation.activity.GooglePayActivity$a */
    public static final class C24432a {
        private C24432a() {
        }

        public /* synthetic */ C24432a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: S0 */
    public final C30079a mo62189S0() {
        C30079a aVar = this.f63020q;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("binding");
        return null;
    }

    /* renamed from: T0 */
    public final void mo62190T0(C30079a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f63020q = aVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C30079a d = C30079a.m91042d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        mo62190T0(d);
        setContentView((View) mo62189S0().mo3946b());
    }
}
