package r81;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import g91.C32303f;
import g91.C32319m;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusAmexUiModel;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10328q;
import p90.C27482z3;

/* renamed from: r81.j */
public class C38315j extends C35651n1 {

    /* renamed from: d */
    private C27482z3 f91822d;

    /* renamed from: e */
    private BonusAmexUiModel f91823e;

    /* renamed from: j1 */
    private void m112593j1() {
        this.f91822d.f70344e.setText(C32319m.m95297d(this.f91823e.mo52701f().longValue(), "dd.MM.yyyy"));
        BogTextView bogTextView = this.f91822d.f70346g;
        StringBuilder sb = new StringBuilder();
        sb.append(C32303f.m95206q(this.f91823e.mo52697d().doubleValue()));
        sb.append(" ");
        int i = C10328q.f28958hb;
        sb.append(getString(i));
        bogTextView.setText(sb.toString());
        BogTextView bogTextView2 = this.f91822d.f70348i;
        bogTextView2.setText(C32303f.m95206q(this.f91823e.mo52702g().doubleValue()) + " " + getString(i));
        BogTextView bogTextView3 = this.f91822d.f70345f;
        bogTextView3.setText(C32303f.m95206q(this.f91823e.mo52696b().doubleValue()) + " " + getString(i));
        this.f91822d.f70347h.setText(String.valueOf(this.f91823e.mo52699e()));
    }

    /* renamed from: i1 */
    public void mo91861i1(BonusAmexUiModel bonusAmexUiModel) {
        this.f91823e = bonusAmexUiModel;
        if (getView() != null) {
            m112593j1();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C27482z3 d = C27482z3.m85235d(getLayoutInflater(), viewGroup, false);
        this.f91822d = d;
        return d.mo3946b();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f91822d = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f91823e != null) {
            m112593j1();
        }
    }
}
