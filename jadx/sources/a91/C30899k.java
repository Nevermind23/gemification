package a91;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32290b1;
import g91.C32335t0;
import l81.C37104a;
import l81.C37107d;
import p341ge.bog.mobilebank.model.payment.PaymentsServiceConfigInputOption;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import r90.C27950a;

/* renamed from: a91.k */
public class C30899k extends RecyclerView.C1736h {

    /* renamed from: d */
    private PaymentsServiceConfigInputOption[] f76989d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f76990e;

    /* renamed from: f */
    private boolean f76991f;

    /* renamed from: g */
    private Drawable f76992g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C37104a f76993h;

    /* renamed from: a91.k$a */
    class C30900a extends C37107d implements View.OnClickListener {

        /* renamed from: f */
        TextView f76994f = ((TextView) mo90036h(C10322k.multiple_select_tv));

        /* renamed from: g */
        View f76995g = mo90036h(C10322k.payment_wizard_selector_divider);

        public C30900a(View view) {
            super(view);
            view.setOnClickListener(this);
        }

        public void onClick(View view) {
            C30899k.this.f76990e = getAdapterPosition();
            C30899k.this.notifyDataSetChanged();
            C30899k.this.f76993h.mo48298Z0(getAdapterPosition());
        }
    }

    public C30899k(boolean z, PaymentsServiceConfigInputOption[] paymentsServiceConfigInputOptionArr, int i, C37104a aVar) {
        this.f76989d = paymentsServiceConfigInputOptionArr;
        this.f76990e = i;
        this.f76991f = z;
        this.f76993h = aVar;
    }

    public int getItemCount() {
        return this.f76989d.length;
    }

    /* renamed from: h */
    public PaymentsServiceConfigInputOption mo71111h() {
        int i = this.f76990e;
        if (i == -1) {
            return null;
        }
        return this.f76989d[i];
    }

    /* renamed from: i */
    public void onBindViewHolder(C30900a aVar, int i) {
        String str;
        if (this.f76991f) {
            str = C27950a.m86286c(this.f76989d[i].getValue(), true);
        } else {
            str = this.f76989d[i].getValue();
        }
        aVar.f76994f.setText(str);
        if (i == this.f76990e) {
            aVar.f76994f.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f76992g, (Drawable) null);
        } else {
            aVar.f76994f.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        if (i == getItemCount() - 1) {
            aVar.f76995g.setVisibility(4);
        } else {
            aVar.f76995g.setVisibility(0);
        }
    }

    /* renamed from: j */
    public C30900a onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.item_payment_wizard_selector, viewGroup, false);
        if (this.f76992g == null) {
            this.f76992g = C0767a.m2895e(viewGroup.getContext(), C10320i.ic_tick);
            if (C32335t0.m95361f() != 0) {
                this.f76992g = C32290b1.m95122l(viewGroup.getContext(), this.f76992g, C32335t0.m95359d(viewGroup.getContext(), true));
            }
        }
        return new C30900a(inflate);
    }
}
