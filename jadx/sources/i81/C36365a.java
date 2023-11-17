package i81;

import a91.C30889h;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import p341ge.bog.mobilebank.p975ui.model.C35693b;
import p366bk.C10324m;

/* renamed from: i81.a */
public class C36365a extends C30889h {

    /* renamed from: f */
    private C35693b[] f87740f;

    public C36365a() {
        C35693b[] bVarArr = new C35693b[4];
        this.f87740f = bVarArr;
        bVarArr[0] = C35693b.DEPOSIT;
        bVarArr[1] = C35693b.LOAN;
        bVarArr[2] = C35693b.CREDIT_CARD;
        bVarArr[3] = C35693b.MORTGAGE_LOAN;
    }

    public int getItemCount() {
        return this.f87740f.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo71090l(int i, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo71088j(C36366b bVar, int i) {
        bVar.mo89096i().setText(this.f87740f[i].mo86826e(bVar.mo89096i().getContext()));
    }

    /* renamed from: p */
    public C36366b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C36366b(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.plus_points_selectable_item, viewGroup, false));
    }
}
