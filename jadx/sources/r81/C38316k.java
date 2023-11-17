package r81;

import android.os.Bundle;
import android.view.View;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.C1806i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import h81.C36158a;
import j81.C36760b;
import j81.C36771m;
import java.math.BigDecimal;
import jg1.C41452l;
import p341ge.bog.mobilebank.eventbus.events.BonusPrizeHistoryEvent;
import p341ge.bog.mobilebank.model.bonus.BonusPrize;
import p341ge.bog.mobilebank.model.bonus.BonusType;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: r81.k */
public class C38316k extends C35651n1 implements C36771m, C36760b {

    /* renamed from: d */
    private RecyclerView f91824d;

    /* renamed from: e */
    private BonusPrizeHistoryEvent f91825e;

    /* renamed from: f */
    private boolean f91826f;

    /* renamed from: g */
    private C36158a f91827g;

    /* renamed from: h */
    private BigDecimal f91828h;

    /* renamed from: i */
    private BonusType f91829i;

    /* renamed from: c */
    private void m112595c() {
        this.f91827g.mo72663i();
        this.f91826f = false;
    }

    /* renamed from: e */
    private void m112596e() {
        this.f91827g.mo72666n();
        this.f91826f = true;
    }

    /* renamed from: i1 */
    private void m112597i1() {
        m112596e();
        this.mBankApiManager.getBonusPrizeHistory(this.f91829i);
    }

    /* renamed from: j1 */
    public static C38316k m112598j1(BonusType bonusType) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("ARG_BONUS_TYPE", bonusType);
        C38316k kVar = new C38316k();
        kVar.setArguments(bundle);
        return kVar;
    }

    /* renamed from: G0 */
    public void mo89648G0(BonusPrize bonusPrize) {
    }

    /* renamed from: k0 */
    public void mo89649k0() {
        m112597i1();
    }

    /* renamed from: k1 */
    public void mo91862k1(BigDecimal bigDecimal) {
        this.f91828h = bigDecimal;
        C36158a aVar = this.f91827g;
        if (aVar != null) {
            aVar.mo88916s(bigDecimal);
        }
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_mr_history;
    }

    @C41452l
    public void onAmexPrizeHistoryEvent(BonusPrizeHistoryEvent bonusPrizeHistoryEvent) {
        m112595c();
        int state = bonusPrizeHistoryEvent.getState();
        if (state == 20) {
            this.f91825e = bonusPrizeHistoryEvent;
            this.f91827g.mo88915r(bonusPrizeHistoryEvent.getBonusPrizeList().getPrizeList());
        } else if (state == 30 || state == 40) {
            this.f91827g.mo72667o();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f91829i = (BonusType) getArguments().getSerializable("ARG_BONUS_TYPE");
        this.mEventBus.mo96185q(this);
    }

    public void onDestroy() {
        super.onDestroy();
        this.mEventBus.mo96186s(this);
    }

    public void onResume() {
        super.onResume();
        if (!this.f91826f && this.f91825e == null) {
            m112597i1();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C10322k.mr_history_list);
        this.f91824d = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        C1806i iVar = new C1806i(requireContext(), 1);
        iVar.mo5985l(C0767a.m2895e(requireContext(), C10320i.list_divider_invert_tr_25_1dp));
        this.f91824d.mo5351j(iVar);
        C36158a aVar = new C36158a();
        this.f91827g = aVar;
        aVar.mo88914q(this);
        this.f91827g.mo72665m(this);
        this.f91827g.mo88916s(this.f91828h);
        this.f91824d.setAdapter(this.f91827g);
    }
}
