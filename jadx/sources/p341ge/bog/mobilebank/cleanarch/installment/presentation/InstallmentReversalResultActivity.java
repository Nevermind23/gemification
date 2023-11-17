package p341ge.bog.mobilebank.cleanarch.installment.presentation;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10322k;
import p366bk.C10324m;
import p90.C27334j0;

/* renamed from: ge.bog.mobilebank.cleanarch.installment.presentation.InstallmentReversalResultActivity */
public final class InstallmentReversalResultActivity extends C30772sa {

    /* renamed from: G */
    public static final C21090a f56625G = new C21090a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private C27334j0 f56626F;

    /* renamed from: ge.bog.mobilebank.cleanarch.installment.presentation.InstallmentReversalResultActivity$a */
    public static final class C21090a {
        private C21090a() {
        }

        public /* synthetic */ C21090a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo52320a(Context context) {
            C41536l.m120489i(context, "context");
            context.startActivity(new Intent(context, InstallmentReversalResultActivity.class));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_installment_reversal_result;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        C27334j0 a = C27334j0.m84645a(findViewById(C10322k.f28864lt));
        C41536l.m120488h(a, "bind(findViewById(R.id.root))");
        this.f56626F = a;
        if (a == null) {
            C41536l.m120506z("binding");
            a = null;
        }
        a.f69013f.setText(C32343x.m95388F("online.inst.reversal.application.registered.successfully", new Object[0]));
    }
}
