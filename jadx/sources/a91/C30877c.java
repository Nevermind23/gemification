package a91;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import g91.C32289b0;
import g91.C32303f;
import g91.C32335t0;
import java.util.ArrayList;
import l81.C37104a;
import l81.C37107d;
import p341ge.bog.mobilebank.p975ui.model.C35692a;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10316e;
import p366bk.C10319h;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: a91.c */
public class C30877c extends RecyclerView.C1736h {

    /* renamed from: d */
    private ArrayList f76914d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C37104a f76915e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f76916f;

    /* renamed from: a91.c$a */
    class C30878a extends C37107d implements View.OnClickListener {

        /* renamed from: f */
        ImageView f76917f = ((ImageView) mo90036h(C10322k.contact_template_image));

        /* renamed from: g */
        BogTextView f76918g = ((BogTextView) mo90036h(C10322k.contact_template_title));

        /* renamed from: h */
        BogTextView f76919h = ((BogTextView) mo90036h(C10322k.contact_template_sub_title));

        public C30878a(View view) {
            super(view);
            view.setOnClickListener(this);
        }

        public void onClick(View view) {
            C30877c.this.f76916f = getAdapterPosition();
            if (C30877c.this.f76915e != null) {
                C30877c.this.f76915e.mo48298Z0(getAdapterPosition());
            }
            C30877c.this.notifyDataSetChanged();
        }
    }

    public C30877c(ArrayList arrayList, int i, C37104a aVar) {
        this.f76914d = arrayList;
        this.f76916f = i;
        this.f76915e = aVar;
    }

    public int getItemCount() {
        return this.f76914d.size();
    }

    /* renamed from: h */
    public C35692a mo71065h(int i) {
        return (C35692a) this.f76914d.get(i);
    }

    /* renamed from: i */
    public void onBindViewHolder(C30878a aVar, int i) {
        if (this.f76916f == i) {
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
        if (mo71065h(i).mo86821a() > Utils.DOUBLE_EPSILON) {
            aVar.f76919h.setVisibility(0);
            BogTextView bogTextView = aVar.f76919h;
            bogTextView.setText(C32303f.m95204o(mo71065h(i).mo86821a() / 100.0d) + " ₾");
        } else {
            aVar.f76919h.setVisibility(8);
        }
        C32289b0.m95097i(aVar.f76917f, ((C35692a) this.f76914d.get(i)).mo86822b());
        aVar.f76918g.setText(mo71065h(i).mo86823c());
    }

    /* renamed from: j */
    public C30878a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C30878a(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.contact_template_recycler_item, viewGroup, false));
    }

    /* renamed from: k */
    public void mo71068k(int i) {
        this.f76916f = i;
    }
}
