package p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10324m;
import p366bk.C10328q;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.BudgetActivity */
public final class BudgetActivity extends C30772sa {

    /* renamed from: F */
    public static final C22069a f58716F = new C22069a((DefaultConstructorMarker) null);

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.BudgetActivity$a */
    public static final class C22069a {
        private C22069a() {
        }

        public /* synthetic */ C22069a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo54847a(Context context) {
            C41536l.m120489i(context, "context");
            context.startActivity(new Intent(context, BudgetActivity.class));
        }
    }

    /* renamed from: E2 */
    private final void m71511E2() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_budget;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        m71511E2();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.my_budget);
        C41536l.m120488h(string, "getString(R.string.my_budget)");
        return string;
    }
}
