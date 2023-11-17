package c91;

import a91.C30886g;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import p341ge.bog.mobilebank.p975ui.wizard.activities.AdvancedWizardActivity;

/* renamed from: c91.q */
public class C31329q<T extends AdvancedWizardActivity> extends C31330r<T> {

    /* renamed from: E */
    private ArrayList f77800E;

    /* renamed from: F */
    private boolean f77801F;

    /* renamed from: s2 */
    private void m93069s2() {
        C30886g gVar = new C30886g(this.f77800E);
        this.f77804C.setVisibility(8);
        this.f77803B.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f77803B.setAdapter(gVar);
        mo71619r2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f2 */
    public void mo71551f2() {
        super.mo71551f2();
        if (this.f77801F) {
            m93069s2();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f77801F) {
            m93069s2();
        }
    }

    /* renamed from: t2 */
    public void mo71618t2(ArrayList arrayList) {
        this.f77800E = arrayList;
        if (this.f77802A != null) {
            m93069s2();
        } else {
            this.f77801F = true;
        }
    }
}
