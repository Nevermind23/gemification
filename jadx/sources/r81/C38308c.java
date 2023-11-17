package r81;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import g91.C32300e0;
import g91.C32343x;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.model.bonus.BonusType;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p366bk.C10320i;
import p90.C27473y3;
import r90.C27950a;

/* renamed from: r81.c */
public class C38308c extends C35651n1 {

    /* renamed from: d */
    private C27473y3 f91812d;

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public /* synthetic */ void m112579k1(View view) {
        m112582n1("plus.program.catalog.link");
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public /* synthetic */ void m112580l1(View view) {
        m112582n1("mr.program.catalog.link");
    }

    /* renamed from: m1 */
    public static C38308c m112581m1(BonusType bonusType) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("ARG_BONUS_TYPE", bonusType);
        C38308c cVar = new C38308c();
        cVar.setArguments(bundle);
        return cVar;
    }

    /* renamed from: n1 */
    private void m112582n1(String str) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(C32343x.m95388F(str, new Object[0]))));
        } catch (Exception unused) {
        }
    }

    /* renamed from: o1 */
    private void m112583o1(BonusType bonusType) {
        if (bonusType == BonusType.PLUS) {
            this.f91812d.f70263e.setInfoText(C27950a.m86284a("plus.program.catalog.explnatory"));
            this.f91812d.f70263e.setShowMoreText(C27950a.m86284a("plus.program.catalog.link.text"));
            this.f91812d.f70263e.setShowMoreClickListener(new C38306a(this));
            this.f91812d.f70263e.setBannerImage(C32300e0.m95169g(C10320i.plus));
        } else if (bonusType == BonusType.AMEX) {
            this.f91812d.f70263e.setInfoText(C27950a.m86284a("mr.program.catalog.explnatory"));
            this.f91812d.f70263e.setShowMoreText(C27950a.m86284a("mr.program.catalog.link.text"));
            this.f91812d.f70263e.setShowMoreClickListener(new C38307b(this));
            this.f91812d.f70263e.setBannerImage(C32300e0.m95169g(C10320i.mr));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C27473y3 d = C27473y3.m85201d(layoutInflater, viewGroup, false);
        this.f91812d = d;
        LayerView c = d.mo3946b();
        this.rootView = c;
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f91812d = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m112583o1((BonusType) getArguments().getSerializable("ARG_BONUS_TYPE"));
    }
}
