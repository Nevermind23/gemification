package n20;

import android.app.Activity;
import android.content.Intent;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.BillSplitSelectOperationsActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.SelectContactActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.BillSplitSummaryActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.MoneyRequestSummaryActivity;
import p341ge.bog.mobilebank.p975ui.activities.OperationDetailsActivity;

/* renamed from: n20.b */
public final class C26360b {

    /* renamed from: a */
    public static final C26360b f66777a = new C26360b();

    private C26360b() {
    }

    /* renamed from: e */
    private final void m82389e(Activity activity) {
        activity.startActivityForResult(new Intent(activity, BillSplitSummaryActivity.class), 50005);
    }

    /* renamed from: a */
    public final void mo65550a(Activity activity) {
        C41536l.m120489i(activity, "activity");
        activity.startActivity(new Intent(activity, BillSplitSelectOperationsActivity.class).putExtra("EXTRA_IS_EDIT_MODE", true));
    }

    /* renamed from: b */
    public final void mo65551b(Activity activity) {
        C41536l.m120489i(activity, "activity");
        activity.startActivity(new Intent(activity, SelectContactActivity.class).putExtra("EXTRA_IS_EDIT_MODE", true));
    }

    /* renamed from: c */
    public final void mo65552c(BillSplitSelectOperationsActivity billSplitSelectOperationsActivity) {
        C41536l.m120489i(billSplitSelectOperationsActivity, "current");
        boolean booleanExtra = billSplitSelectOperationsActivity.getIntent().getBooleanExtra("SKIP_PARTICIPANTS_SELECTION", false);
        if (billSplitSelectOperationsActivity.mo54360S2()) {
            billSplitSelectOperationsActivity.finish();
        } else if (booleanExtra) {
            m82389e(billSplitSelectOperationsActivity);
        } else {
            billSplitSelectOperationsActivity.startActivityForResult(new Intent(billSplitSelectOperationsActivity, SelectContactActivity.class).putExtra("EXTRA_IS_BILL_SPLIT_PROCESS", true), 50005);
        }
    }

    /* renamed from: d */
    public final void mo65553d(SelectContactActivity selectContactActivity) {
        C41536l.m120489i(selectContactActivity, "current");
        boolean booleanExtra = selectContactActivity.getIntent().getBooleanExtra("EXTRA_IS_BILL_SPLIT_PROCESS", false);
        if (selectContactActivity.mo54376R2()) {
            selectContactActivity.finish();
        } else if (booleanExtra) {
            m82389e(selectContactActivity);
        } else {
            selectContactActivity.startActivityForResult(new Intent(selectContactActivity, MoneyRequestSummaryActivity.class), 50005);
        }
    }

    /* renamed from: f */
    public final void mo65554f(Activity activity) {
        C41536l.m120489i(activity, "from");
        if (activity instanceof OperationDetailsActivity) {
            activity.startActivity(new Intent(activity, SelectContactActivity.class).putExtra("EXTRA_IS_BILL_SPLIT_PROCESS", true).putExtra("EXTRA_IS_BILL_SPLIT_ENTRY_POINT", true));
        } else if (activity instanceof ContactDetailsActivity) {
            activity.startActivity(new Intent(activity, BillSplitSelectOperationsActivity.class).putExtra("SKIP_PARTICIPANTS_SELECTION", true));
        } else {
            mo65555g(activity);
        }
    }

    /* renamed from: g */
    public final void mo65555g(Activity activity) {
        C41536l.m120489i(activity, "from");
        activity.startActivity(new Intent(activity, BillSplitSelectOperationsActivity.class));
    }

    /* renamed from: h */
    public final void mo65556h(Activity activity) {
        C41536l.m120489i(activity, "from");
        if (activity instanceof ContactDetailsActivity) {
            activity.startActivity(new Intent(activity, MoneyRequestSummaryActivity.class).putExtra("EXTRA_IS_MONEY_REQUEST_ENTRY_POINT", true));
        } else {
            mo65557i(activity);
        }
    }

    /* renamed from: i */
    public final void mo65557i(Activity activity) {
        C41536l.m120489i(activity, "from");
        activity.startActivity(new Intent(activity, SelectContactActivity.class));
    }
}
