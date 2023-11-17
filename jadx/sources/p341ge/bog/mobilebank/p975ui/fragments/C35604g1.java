package p341ge.bog.mobilebank.p975ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.github.mikephil.charting.utils.Utils;
import g91.C32303f;
import g91.C32319m;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusPlusUiModel;
import p90.C27268c4;

/* renamed from: ge.bog.mobilebank.ui.fragments.g1 */
public final class C35604g1 extends C35651n1 {

    /* renamed from: d */
    private C27268c4 f86088d;

    /* renamed from: e */
    private BonusPlusUiModel f86089e;

    /* renamed from: j1 */
    private final C27268c4 m105747j1() {
        C27268c4 c4Var = this.f86088d;
        C41536l.m120486f(c4Var);
        return c4Var;
    }

    /* renamed from: k1 */
    private final void m105748k1() {
        boolean z;
        long j;
        BonusPlusUiModel bonusPlusUiModel = this.f86089e;
        if (bonusPlusUiModel != null && getView() != null) {
            TwoLineTextItem twoLineTextItem = m105747j1().f68473h;
            String g = bonusPlusUiModel.mo52766g();
            if (g == null) {
                g = bonusPlusUiModel.mo52765f();
            }
            twoLineTextItem.setText(g);
            if (bonusPlusUiModel.mo52769i() != null) {
                m105747j1().f68476k.setText(C32319m.m95297d(bonusPlusUiModel.mo52769i().longValue(), "dd.MM.yyyy"));
            }
            if (bonusPlusUiModel.mo52760b() != null) {
                m105747j1().f68477l.setText(C32303f.m95206q(bonusPlusUiModel.mo52760b().doubleValue()));
            }
            if (bonusPlusUiModel.mo52770j() != null) {
                m105747j1().f68474i.setText(C32303f.m95206q(bonusPlusUiModel.mo52770j().doubleValue()));
            }
            m105747j1().f68472g.setText(String.valueOf(bonusPlusUiModel.mo52767h()));
            ListItem listItem = m105747j1().f68471f;
            C41536l.m120488h(listItem, "binding.dueDateLayout");
            if (bonusPlusUiModel.mo52763e() == null || C41536l.m120482b(bonusPlusUiModel.mo52763e(), Utils.DOUBLE_EPSILON)) {
                z = false;
            } else {
                z = true;
            }
            C32343x.m95483r1(listItem, z, false, 2, (Object) null);
            if (bonusPlusUiModel.mo52763e() != null) {
                m105747j1().f68475j.setText(C32303f.m95206q(bonusPlusUiModel.mo52763e().doubleValue()));
            }
            Long d = bonusPlusUiModel.mo52761d();
            long j2 = 0;
            if (d != null) {
                j = d.longValue();
            } else {
                j = 0;
            }
            if (j > 0) {
                TwoLineTextItem twoLineTextItem2 = m105747j1().f68470e;
                Long d2 = bonusPlusUiModel.mo52761d();
                if (d2 != null) {
                    j2 = d2.longValue();
                }
                twoLineTextItem2.setText(C32319m.m95296c(j2, getContext()));
            }
        }
    }

    /* renamed from: i1 */
    public final void mo86678i1(BonusPlusUiModel bonusPlusUiModel) {
        this.f86089e = bonusPlusUiModel;
        m105748k1();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f86088d = C27268c4.m84373d(getLayoutInflater(), viewGroup, false);
        return m105747j1().mo3946b();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f86088d = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m105748k1();
    }
}
