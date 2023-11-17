package p341ge.bog.mobilebank.cleanarch.leadapplication.presentation.activity;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import g91.C32343x;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.p975ui.activities.MainActivity;
import p366bk.C10322k;
import p366bk.C10324m;
import p795iy.C25266a;
import p90.C27353l0;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.cleanarch.leadapplication.presentation.activity.LeadApplicationResultActivity */
public final class LeadApplicationResultActivity extends C30772sa {

    /* renamed from: G */
    public static final C21113a f56673G = new C21113a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f56674F = C41219i.m119470b(new C21114b(this));

    /* renamed from: ge.bog.mobilebank.cleanarch.leadapplication.presentation.activity.LeadApplicationResultActivity$a */
    public static final class C21113a {
        private C21113a() {
        }

        public /* synthetic */ C21113a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo52368a(Context context) {
            C41536l.m120489i(context, "context");
            context.startActivity(new Intent(context, LeadApplicationResultActivity.class));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.leadapplication.presentation.activity.LeadApplicationResultActivity$b */
    static final class C21114b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LeadApplicationResultActivity f56675d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21114b(LeadApplicationResultActivity leadApplicationResultActivity) {
            super(0);
            this.f56675d = leadApplicationResultActivity;
        }

        /* renamed from: b */
        public final C27353l0 invoke() {
            C27353l0 a = C27353l0.m84720a(this.f56675d.findViewById(C10322k.f28864lt));
            C41536l.m120488h(a, "bind(findViewById(R.id.root))");
            return a;
        }
    }

    /* renamed from: F2 */
    private final C27353l0 m68317F2() {
        return (C27353l0) this.f56674F.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public static final void m68318G2(LeadApplicationResultActivity leadApplicationResultActivity, View view) {
        C41536l.m120489i(leadApplicationResultActivity, "this$0");
        leadApplicationResultActivity.m68319H2();
    }

    /* renamed from: H2 */
    private final void m68319H2() {
        Intent flags = new Intent(this, MainActivity.class).setFlags(872415232);
        C41536l.m120488h(flags, "Intent(this, MainActivit…_SINGLE_TOP\n            )");
        startActivity(flags);
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_lead_application_result;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        m68317F2().f69197h.setText(C32343x.m95388F("offers.ML.SL.lead.application.added.successfully", new Object[0]));
        m68317F2().f69195f.setButtonText(C32343x.m95388F("credit.application.CL.result.screen.home.page.redirect.button", new Object[0]));
        m68317F2().f69195f.setOnClickListener(new C25266a(this));
    }
}
