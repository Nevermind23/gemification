package c91;

import a91.C30889h;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import l81.C37113i;
import p366bk.C10320i;
import p366bk.C10324m;

/* renamed from: c91.n */
public class C31317n extends C31355y {
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C30889h f77760v;

    /* renamed from: c91.n$a */
    class C31318a implements C30889h.C30893d {
        C31318a() {
        }

        /* renamed from: a */
        public void mo71095a(boolean z) {
            if (z) {
                C31317n.this.f77883f.mo87965p3(true);
            } else if (!C31317n.this.f77760v.mo71087i()) {
                C31317n.this.f77883f.mo87965p3(false);
            }
        }
    }

    /* renamed from: i2 */
    private void m92996i2() {
        this.f77889l.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f77889l.mo5351j(new C37113i(C0767a.m2895e(getContext(), C10320i.divider)));
        this.f77891n.setText(mo71737x1());
        this.f77889l.setAdapter(this.f77760v);
    }

    /* renamed from: G1 */
    public boolean mo71549G1() {
        return true;
    }

    /* renamed from: J1 */
    public boolean mo67196J1() {
        return false;
    }

    /* renamed from: g2 */
    public C30889h mo71583g2() {
        return this.f77760v;
    }

    /* renamed from: h2 */
    public void mo71584h2(C30889h hVar) {
        this.f77760v = hVar;
        hVar.mo71091m(new C31318a());
        RecyclerView recyclerView = this.f77889l;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.f77760v);
        }
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_cas_select_accounts;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f77760v.mo71087i()) {
            this.f77883f.mo87965p3(true);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m92996i2();
        mo71730n1();
    }
}
