package p341ge.bog.mobilebank.p975ui.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g81.C32125b;
import g91.C32290b1;
import g91.C32355x0;
import iu0.C36546y;
import j81.C36759a;
import java.util.ArrayList;
import java.util.List;
import l50.C25838r;
import p341ge.bog.mobilebank.p975ui.activities.ProductDetailedActivity;
import p341ge.bog.mobilebank.p975ui.views.widgets.AccountCardItemView;
import p366bk.C10322k;
import p366bk.C10324m;
import p920vq.C29133c;

/* renamed from: ge.bog.mobilebank.ui.fragments.a */
public class C35572a extends C35651n1 implements C36759a {

    /* renamed from: d */
    private List f86014d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public RecyclerView f86015e;

    /* renamed from: f */
    private View f86016f;

    /* renamed from: g */
    private C32125b f86017g;

    /* renamed from: h */
    private long f86018h;

    /* renamed from: i */
    private String f86019i;

    /* renamed from: j */
    private ArrayList f86020j = new ArrayList();

    /* renamed from: ge.bog.mobilebank.ui.fragments.a$a */
    class C35573a implements ViewTreeObserver.OnGlobalLayoutListener {
        C35573a() {
        }

        public void onGlobalLayout() {
            if (C35572a.this.f86015e != null) {
                C32290b1.m95124n(C35572a.this.f86015e, C35572a.this.f86015e.getHeight() + 10);
                C32355x0.m95523n(C35572a.this.f86015e, this);
            }
        }
    }

    /* renamed from: F0 */
    public void mo86627F0(C25838r rVar) {
        if (rVar.mo64599w().mo63390c()) {
            C29133c.m89057p2(rVar.mo64585j(), rVar.mo64582h()).mo4576A1(getChildFragmentManager(), (String) null);
        }
    }

    /* renamed from: Z0 */
    public void mo48298Z0(int i) {
        if (!((C25838r) this.f86014d.get(i)).mo64599w().mo63390c()) {
            C36546y.m108282F().mo27152s(this.f86019i, "payment_card", "click");
            Intent intent = new Intent(getContext(), ProductDetailedActivity.class);
            intent.putExtra("PRODUCT_TYPE_KEY", 6);
            intent.putExtra("PRODUCT_KEY", this.f86018h);
            intent.putExtra("PRODUCT_INDEX", i);
            startActivity(intent);
        }
    }

    /* renamed from: j1 */
    public void mo86628j1(List list, long j, String str) {
        this.f86014d = list;
        this.f86018h = j;
        this.f86019i = str;
        C32125b bVar = this.f86017g;
        if (bVar != null) {
            bVar.mo72605g(list);
        }
    }

    /* renamed from: k1 */
    public List mo86629k1() {
        List list = this.f86014d;
        return list == null ? new ArrayList() : list;
    }

    /* renamed from: l1 */
    public void mo86630l1() {
        if (this.f86017g != null && this.f86015e != null) {
            for (int i = 0; i < this.f86015e.getLayoutManager().mo5660V(); i++) {
                ((AccountCardItemView) this.f86015e.getLayoutManager().mo5658U(i)).resetFavorite();
            }
        }
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_account_cards;
    }

    /* renamed from: m1 */
    public void mo86631m1(boolean z) {
        RecyclerView recyclerView = this.f86015e;
        if (recyclerView != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int q2 = linearLayoutManager.mo5223q2();
            for (int n2 = linearLayoutManager.mo5219n2(); n2 <= q2; n2++) {
                ((C32125b.C32126a) this.f86015e.mo5320e0(n2)).mo72607k(z);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f86015e = (RecyclerView) view.findViewById(C10322k.f28712Br);
        this.f86016f = view.findViewById(C10322k.f28719Dq);
        C32125b bVar = new C32125b(getContext(), this.f86014d);
        this.f86017g = bVar;
        bVar.mo72606h(this);
        this.f86015e.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f86015e.setAdapter(this.f86017g);
        this.f86015e.getViewTreeObserver().addOnGlobalLayoutListener(new C35573a());
    }
}
