package a91;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0767a;
import g91.C32290b1;
import g91.C32335t0;
import java.util.List;
import l81.C37104a;
import l81.C37106c;
import l81.C37107d;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: a91.l */
public class C30901l extends C37106c {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List f76997d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f76998e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f76999f;

    /* renamed from: g */
    private Drawable f77000g;

    /* renamed from: h */
    private boolean f77001h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C37104a f77002i;

    /* renamed from: a91.l$a */
    class C30902a extends C37107d implements View.OnClickListener {

        /* renamed from: f */
        TextView f77003f = ((TextView) mo90036h(C10322k.multiple_select_tv));

        public C30902a(View view) {
            super(view);
            this.f89288e = mo90036h(C10322k.payment_wizard_selector_divider);
            view.setOnClickListener(this);
        }

        public void onClick(View view) {
            C30901l.this.f76998e = getAdapterPosition();
            C30901l lVar = C30901l.this;
            lVar.f76999f = (String) lVar.f76997d.get(getAdapterPosition());
            C30901l.this.notifyDataSetChanged();
            C30901l.this.f77002i.mo48298Z0(C30901l.this.f76998e);
        }
    }

    public C30901l(List list, int i, C37104a aVar) {
        this.f76997d = list;
        this.f76998e = i;
        if (i >= 0) {
            this.f76999f = (String) list.get(i);
        }
        this.f77002i = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo70863g() {
        return true;
    }

    public int getItemCount() {
        return this.f76997d.size();
    }

    /* renamed from: o */
    public void onBindViewHolder(C30902a aVar, int i) {
        boolean z;
        aVar.f77003f.setText((CharSequence) this.f76997d.get(i));
        if (i == this.f76998e) {
            z = true;
        } else {
            z = false;
        }
        if (this.f77001h) {
            z = ((String) this.f76997d.get(i)).equals(this.f76999f);
        }
        if (z) {
            aVar.f77003f.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f77000g, (Drawable) null);
        } else {
            aVar.f77003f.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    /* renamed from: p */
    public C30902a onCreateViewHolder(ViewGroup viewGroup, int i) {
        View h = mo90035h(C10324m.item_payment_wizard_selector, viewGroup);
        if (this.f77000g == null) {
            this.f77000g = C0767a.m2895e(viewGroup.getContext(), C10320i.ic_tick);
            if (C32335t0.m95361f() != 0) {
                this.f77000g = C32290b1.m95122l(viewGroup.getContext(), this.f77000g, C32335t0.m95359d(viewGroup.getContext(), true));
            }
        }
        return new C30902a(h);
    }

    /* renamed from: q */
    public void mo71117q(List list) {
        this.f76997d = list;
    }

    /* renamed from: r */
    public void mo71118r(boolean z) {
        this.f77001h = z;
    }
}
