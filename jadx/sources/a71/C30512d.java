package a71;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0767a;
import g91.C32290b1;
import g91.C32335t0;
import java.util.ArrayList;
import java.util.List;
import l81.C37106c;
import l81.C37107d;
import p341ge.bog.mobilebank.model.BogCountry;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: a71.d */
public class C30512d extends C37106c {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List f76519d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f76520e;

    /* renamed from: f */
    private Drawable f76521f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C30513a f76522g;

    /* renamed from: a71.d$a */
    public interface C30513a {
        /* renamed from: L */
        void mo70868L(BogCountry bogCountry);
    }

    /* renamed from: a71.d$b */
    class C30514b extends C37107d implements View.OnClickListener {

        /* renamed from: f */
        TextView f76523f = ((TextView) mo90036h(C10322k.multiple_select_tv));

        public C30514b(View view) {
            super(view);
            this.f89288e = mo90036h(C10322k.payment_wizard_selector_divider);
            view.setOnClickListener(this);
        }

        public void onClick(View view) {
            BogCountry bogCountry = (BogCountry) C30512d.this.f76519d.get(getAdapterPosition());
            C30512d.this.f76520e = bogCountry.getCountryCode();
            C30512d.this.notifyDataSetChanged();
            if (C30512d.this.f76522g != null) {
                C30512d.this.f76522g.mo70868L(bogCountry);
            }
        }
    }

    public C30512d(C30513a aVar) {
        this.f76522g = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo70863g() {
        return true;
    }

    public int getItemCount() {
        return this.f76519d.size();
    }

    /* renamed from: m */
    public void onBindViewHolder(C30514b bVar, int i) {
        boolean z;
        BogCountry bogCountry = (BogCountry) this.f76519d.get(i);
        bVar.f76523f.setText(bogCountry.getCountryNameInt());
        if (bogCountry.getCountryCode() != null) {
            z = bogCountry.getCountryCode().equals(this.f76520e);
        } else {
            z = false;
        }
        if (z) {
            bVar.f76523f.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f76521f, (Drawable) null);
        } else {
            bVar.f76523f.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    /* renamed from: n */
    public C30514b onCreateViewHolder(ViewGroup viewGroup, int i) {
        View h = mo90035h(C10324m.item_payment_wizard_selector, viewGroup);
        if (this.f76521f == null) {
            this.f76521f = C0767a.m2895e(viewGroup.getContext(), C10320i.ic_tick);
            if (C32335t0.m95361f() != 0) {
                this.f76521f = C32290b1.m95122l(viewGroup.getContext(), this.f76521f, C32335t0.m95359d(viewGroup.getContext(), true));
            }
        }
        return new C30514b(h);
    }

    /* renamed from: o */
    public void mo70866o(List list) {
        this.f76519d.clear();
        this.f76519d.addAll(list);
    }

    /* renamed from: p */
    public void mo70867p(String str) {
        this.f76520e = str;
        notifyDataSetChanged();
    }
}
