package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30772sa;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.p975ui.model.OperationResultData;
import p341ge.bog.mobilebank.p975ui.views.widgets.SuccessScreenView;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;

/* renamed from: ge.bog.mobilebank.ui.activities.OperationResultActivity */
public class OperationResultActivity extends C30772sa {

    /* renamed from: F */
    SuccessScreenView f85239F;

    /* renamed from: E2 */
    public static void m104475E2(Activity activity, OperationResultData operationResultData) {
        Intent intent = new Intent(activity, OperationResultActivity.class);
        intent.putExtra("OPERATION_RESULT_DATA", C42035e.m122121c(operationResultData));
        activity.startActivity(intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_operation_result;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        int i;
        int i2;
        super.mo37451O1(bundle);
        this.f85239F = (SuccessScreenView) findViewById(C10322k.successScreen);
        OperationResultData operationResultData = (OperationResultData) C42035e.m122119a(getIntent().getParcelableExtra("OPERATION_RESULT_DATA"));
        if (operationResultData.isSuccess()) {
            i = C10318g.success_screen_positive_title_color;
        } else {
            i = C10318g.success_screen_negative_title_color;
        }
        if (operationResultData.isSuccess()) {
            i2 = C10320i.ic_result_success;
        } else {
            i2 = C10320i.ic_result_denied;
        }
        this.f85239F.setTitle(operationResultData.getTitle(), i);
        this.f85239F.setIcon(i2);
        if (operationResultData.getDetailsList() != null && !operationResultData.getDetailsList().isEmpty()) {
            this.f85239F.addHeader(getString(C10328q.f28936Q1));
            for (OperationResultData.OperationDetailsItem next : operationResultData.getDetailsList()) {
                if (next instanceof OperationResultData.OperationDetailsItemWithSymbol) {
                    this.f85239F.addDetailsItemWithSymbol(next.getTitle(), next.getValue());
                } else {
                    this.f85239F.addDetailsItem(next.getTitle(), next.getValue());
                }
            }
        }
    }
}
