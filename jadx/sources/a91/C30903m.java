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
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardTitleDescriptionObject;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: a91.m */
public class C30903m extends C37106c {

    /* renamed from: d */
    private List f77005d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f77006e;

    /* renamed from: f */
    private Drawable f77007f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C37104a f77008g;

    /* renamed from: a91.m$a */
    class C30904a extends C37107d implements View.OnClickListener {

        /* renamed from: f */
        TextView f77009f = ((TextView) mo90036h(C10322k.multiple_select_tv));

        /* renamed from: g */
        TextView f77010g = ((TextView) mo90036h(C10322k.wizard_selector_description_textview));

        public C30904a(View view) {
            super(view);
            this.f89288e = mo90036h(C10322k.payment_wizard_selector_divider);
            view.setOnClickListener(this);
        }

        public void onClick(View view) {
            C30903m.this.f77006e = getAdapterPosition();
            C30903m.this.notifyDataSetChanged();
            C30903m.this.f77008g.mo48298Z0(C30903m.this.f77006e);
        }
    }

    public C30903m(List list, int i, C37104a aVar) {
        this.f77005d = list;
        this.f77006e = i;
        this.f77008g = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo70863g() {
        return true;
    }

    public int getItemCount() {
        return this.f77005d.size();
    }

    /* renamed from: m */
    public void onBindViewHolder(C30904a aVar, int i) {
        boolean z;
        aVar.f77009f.setText(((WizardTitleDescriptionObject) this.f77005d.get(i)).mo88124b());
        aVar.f77010g.setText(((WizardTitleDescriptionObject) this.f77005d.get(i)).mo88123a());
        if (i == this.f77006e) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            aVar.f77009f.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f77007f, (Drawable) null);
        } else {
            aVar.f77009f.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    /* renamed from: n */
    public C30904a onCreateViewHolder(ViewGroup viewGroup, int i) {
        View h = mo90035h(C10324m.item_wizard_selector_title_description, viewGroup);
        if (this.f77007f == null) {
            this.f77007f = C0767a.m2895e(viewGroup.getContext(), C10320i.ic_tick);
            if (C32335t0.m95361f() != 0) {
                this.f77007f = C32290b1.m95122l(viewGroup.getContext(), this.f77007f, C32335t0.m95359d(viewGroup.getContext(), true));
            }
        }
        return new C30904a(h);
    }
}
