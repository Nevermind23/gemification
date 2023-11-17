package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C1493e0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p30.C27185o;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;

/* renamed from: ge.bog.mobilebank.ui.activities.NewPaymentsActivity */
public final class NewPaymentsActivity extends C30772sa {

    /* renamed from: G */
    public static final C35278a f85169G = new C35278a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private C27185o f85170F;

    /* renamed from: ge.bog.mobilebank.ui.activities.NewPaymentsActivity$a */
    public static final class C35278a {
        private C35278a() {
        }

        public /* synthetic */ C35278a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo86288a(Context context, long j) {
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, NewPaymentsActivity.class);
            intent.putExtra("SOURCE_ACCT_KEY", j);
            context.startActivity(intent);
        }
    }

    /* renamed from: E2 */
    public static final void m104352E2(Context context, long j) {
        f85169G.mo86288a(context, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.new_payments_layout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        this.f85170F = C27185o.C27186a.m84224c(C27185o.f68193i, false, getIntent().getLongExtra("SOURCE_ACCT_KEY", -1), 1, (Object) null);
        if (bundle == null) {
            C1493e0 p = getSupportFragmentManager().mo4428p();
            int i = C10322k.f28769Me;
            C27185o oVar = this.f85170F;
            if (oVar == null) {
                C41536l.m120506z("fragment");
                oVar = null;
            }
            p.mo4632c(i, oVar, "fragmentContainer").mo4515i();
        }
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.navigation_payments_header_text);
        C41536l.m120488h(string, "getString(R.string.navig…ion_payments_header_text)");
        return string;
    }
}
