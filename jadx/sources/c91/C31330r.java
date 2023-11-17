package c91;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.wizard.activities.AdvancedWizardActivity;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: c91.r */
public class C31330r<T extends AdvancedWizardActivity> extends C31303f {

    /* renamed from: A */
    protected View f77802A;

    /* renamed from: B */
    protected RecyclerView f77803B;

    /* renamed from: C */
    protected BogTextView f77804C;

    /* renamed from: D */
    protected AdvancedWizardActivity f77805D;

    /* access modifiers changed from: protected */
    /* renamed from: f2 */
    public void mo71551f2() {
        View inflate = LayoutInflater.from(getContext()).inflate(C10324m.wizard_text_sub_recycler, (ViewGroup) null);
        this.f77802A = inflate;
        inflate.setAlpha(Utils.FLOAT_EPSILON);
        this.f77804C = (BogTextView) this.f77802A.findViewById(C10322k.simple_wizard_list_title);
        this.f77803B = (RecyclerView) this.f77802A.findViewById(C10322k.simple_wizard_recycler_view);
        this.f77730v.addView(this.f77802A, new ViewGroup.LayoutParams(-1, -1));
        if (this.f77897t) {
            this.f77802A.setAlpha(1.0f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j2 */
    public void mo71554j2(CharSequence charSequence, int i, int i2, int i3) {
        super.mo71554j2(charSequence, i, i2, i3);
        this.f77805D.mo87834K3(mo71734s1());
    }

    /* access modifiers changed from: protected */
    /* renamed from: o1 */
    public void mo71558o1() {
        super.mo71558o1();
        mo71619r2();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.f77805D = (AdvancedWizardActivity) context;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r2 */
    public void mo71619r2() {
        this.f77802A.animate().alpha(1.0f);
    }
}
