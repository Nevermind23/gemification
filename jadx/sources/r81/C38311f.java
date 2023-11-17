package r81;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import g91.C32319m;
import gd1.C40992a;
import l50.C25832l;
import l50.C25836p;
import m50.C26144b;
import n50.C26371b;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCashBackUiModel;
import p843nw.C26628j;
import p863pw.C27633k;
import p90.C27365m3;

/* renamed from: r81.f */
public class C38311f extends C38314i {

    /* renamed from: g */
    private C27365m3 f91814g;

    /* renamed from: h */
    protected C26628j f91815h;

    /* renamed from: i */
    protected C26144b f91816i;

    /* renamed from: j */
    private BonusCashBackUiModel f91817j;

    /* renamed from: k */
    private C25836p f91818k;

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public /* synthetic */ void m112586l1(C27633k kVar) {
        this.f91818k = this.f91816i.mo65068i(kVar);
        m112588n1();
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public static /* synthetic */ void m112587m1(Throwable th) {
    }

    /* renamed from: n1 */
    private void m112588n1() {
        BonusCashBackUiModel bonusCashBackUiModel;
        C25832l a;
        if (getView() != null && (bonusCashBackUiModel = this.f91817j) != null) {
            if (bonusCashBackUiModel.mo52735g() != null) {
                this.f91814g.f69295n.setText(C32319m.m95297d(this.f91817j.mo52735g().longValue(), "dd.MM.yyyy"));
                this.f91814g.f69297p.setVisibility(0);
            } else {
                this.f91814g.f69297p.setVisibility(8);
            }
            if (this.f91817j.mo52732e() != null) {
                this.f91814g.f69292k.setText(C32319m.m95297d(this.f91817j.mo52732e().longValue(), "dd.MM.yyyy"));
                this.f91814g.f69294m.setVisibility(0);
            } else {
                this.f91814g.f69294m.setVisibility(8);
            }
            if (this.f91817j.mo52738i() != null) {
                this.f91814g.f69298q.setText(C32319m.m95297d(this.f91817j.mo52738i().longValue(), "dd.MM.yyyy"));
                this.f91814g.f69300s.setVisibility(0);
            } else {
                this.f91814g.f69300s.setVisibility(8);
            }
            if (this.f91817j.mo52729b() != null) {
                this.f91814g.f69291j.setVisibility(0);
                this.f91814g.f69289h.setText(this.f91817j.mo52729b());
            } else {
                this.f91814g.f69291j.setVisibility(8);
            }
            this.f91814g.f69288g.setVisibility(8);
            C25836p pVar = this.f91818k;
            if (pVar != null && (a = C26371b.m82431a(pVar, this.f91817j.mo52728a().longValue())) != null) {
                this.f91814g.f69288g.setVisibility(0);
                this.f91814g.f69286e.setText(a.mo64524c());
            }
        }
    }

    /* renamed from: k1 */
    public void mo91860k1(BonusCashBackUiModel bonusCashBackUiModel) {
        this.f91817j = bonusCashBackUiModel;
        m112588n1();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        C27365m3 d = C27365m3.m84770d(layoutInflater, viewGroup, false);
        this.f91814g = d;
        return d.mo3946b();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f91814g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m112588n1();
        if (this.mClient.hasProduct("ACCOUNT")) {
            addDisposable(this.f91815h.mo65881b().mo95027o0(C40992a.m118827a()).mo94983G0(new C38309d(this), new C38310e()));
        }
    }
}
