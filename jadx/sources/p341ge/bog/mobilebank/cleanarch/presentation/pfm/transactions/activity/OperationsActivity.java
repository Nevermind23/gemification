package p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactions.activity;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p90.C27275d1;
import q31.C38125h;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactions.activity.OperationsActivity */
public final class OperationsActivity extends C30772sa {

    /* renamed from: G */
    public static final C22259a f59076G = new C22259a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private C27275d1 f59077F;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactions.activity.OperationsActivity$a */
    public static final class C22259a {
        private C22259a() {
        }

        public /* synthetic */ C22259a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m72122b(C22259a aVar, Context context, Long l, int i, Object obj) {
            if ((i & 2) != 0) {
                l = null;
            }
            aVar.mo55129a(context, l);
        }

        /* renamed from: a */
        public final void mo55129a(Context context, Long l) {
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, OperationsActivity.class);
            if (l != null) {
                intent.putExtra("ACCT_KEY", l.longValue());
            }
            context.startActivity(intent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_operations;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        C27275d1 a = C27275d1.m84400a(findViewById(C10322k.f28887r9));
        C41536l.m120488h(a, "bind(findViewById(R.id.content_layout))");
        this.f59077F = a;
        getSupportFragmentManager().mo4428p().mo4631b(C10322k.fragment_content_view, C38125h.m112238c(this).mo91557J0(Long.valueOf(getIntent().getLongExtra("ACCT_KEY", -1)))).mo4515i();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.header_text_statement);
        C41536l.m120488h(string, "getString(R.string.header_text_statement)");
        return string;
    }
}
