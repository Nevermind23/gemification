package a91;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32289b0;
import g91.C32335t0;
import java.util.ArrayList;
import l81.C37104a;
import l81.C37107d;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardSubTemplateObject;
import p366bk.C10316e;
import p366bk.C10319h;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: a91.o */
public class C30907o extends RecyclerView.C1736h {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f77024d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C37104a f77025e;

    /* renamed from: f */
    private ArrayList f77026f;

    /* renamed from: a91.o$a */
    class C30908a extends C37107d implements View.OnClickListener {

        /* renamed from: f */
        ImageView f77027f = ((ImageView) mo90036h(C10322k.wizard_template_image));

        /* renamed from: g */
        BogTextView f77028g = ((BogTextView) mo90036h(C10322k.wizard_template_title));

        /* renamed from: h */
        BogTextView f77029h = ((BogTextView) mo90036h(C10322k.wizard_template_sub_title));

        public C30908a(View view) {
            super(view);
            view.setOnClickListener(this);
        }

        public void onClick(View view) {
            if (C30907o.this.f77024d != getAdapterPosition()) {
                C30907o.this.f77024d = getAdapterPosition();
            } else {
                C30907o.this.f77024d = -1;
            }
            if (C30907o.this.f77025e != null) {
                C30907o.this.f77025e.mo48298Z0(getAdapterPosition());
            }
            C30907o.this.notifyDataSetChanged();
        }
    }

    public C30907o(ArrayList arrayList, int i, C37104a aVar) {
        this.f77026f = arrayList;
        this.f77024d = i;
        this.f77025e = aVar;
    }

    /* renamed from: i */
    private WizardSubTemplateObject m92142i(int i) {
        return (WizardSubTemplateObject) this.f77026f.get(i);
    }

    public int getItemCount() {
        ArrayList arrayList = this.f77026f;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: j */
    public int mo71127j() {
        return this.f77024d;
    }

    /* renamed from: k */
    public void onBindViewHolder(C30908a aVar, int i) {
        if (this.f77024d == i) {
            View view = aVar.f89287d;
            view.setBackgroundResource(C32335t0.m95364i(view.getContext(), C10316e.contact_template_background_fill));
        } else {
            aVar.f89287d.setBackgroundResource(C10320i.wizard_template_background);
        }
        if (i == 0) {
            ((RecyclerView.C1752q) aVar.f89287d.getLayoutParams()).leftMargin = aVar.f89287d.getContext().getResources().getDimensionPixelSize(C10319h.payment_wizard_left_margin);
        } else {
            ((RecyclerView.C1752q) aVar.f89287d.getLayoutParams()).leftMargin = ((RecyclerView.C1752q) aVar.f89287d.getLayoutParams()).rightMargin;
        }
        if (m92142i(i).subTitle != null) {
            aVar.f77029h.setVisibility(0);
            aVar.f77029h.setText(m92142i(i).subTitle);
        } else {
            aVar.f77029h.setVisibility(8);
        }
        C32289b0.m95097i(aVar.f77027f, m92142i(i).imageUrl);
        aVar.f77028g.setText(m92142i(i).title);
    }

    /* renamed from: l */
    public C30908a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C30908a(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.wizard_sub_template_item, viewGroup, false));
    }

    /* renamed from: m */
    public void mo71130m(int i) {
        this.f77024d = i;
        notifyDataSetChanged();
    }
}
