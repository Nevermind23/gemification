package c91;

import a91.C30894i;
import androidx.recyclerview.widget.RecyclerView;
import p341ge.bog.mobilebank.p975ui.wizard.activities.AdvancedWizardActivity;

/* renamed from: c91.o */
public class C31319o<T extends AdvancedWizardActivity> extends C31310i<T> {
    /* renamed from: Z0 */
    public void mo48298Z0(int i) {
        mo71543g2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f2 */
    public RecyclerView.C1736h mo67193f2() {
        if (this.f77729v == -1) {
            this.f77729v = 0;
        }
        return new C30894i(mo71707D1().getSelectorOptionPreviews(), mo71707D1().getSelectorOptionValues(), this.f77729v, this.f77889l, this, mo71707D1().getMaxSelectableItems());
    }

    /* access modifiers changed from: protected */
    /* renamed from: g2 */
    public void mo71543g2() {
        C30894i iVar = (C30894i) this.f77889l.getAdapter();
        mo71707D1().setSelectorOptionPreviews(iVar.mo71096t());
        mo71707D1().setSelectorOptionValues(iVar.mo71097u());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iVar.mo71098v(); i++) {
            sb.append((String) iVar.mo71096t().get(i));
            if (i != iVar.mo71098v() - 1) {
                sb.append("\n");
            }
        }
        mo71707D1().setVisibleInput(sb.toString());
        mo71717U1(iVar.mo71098v() + "");
    }
}
