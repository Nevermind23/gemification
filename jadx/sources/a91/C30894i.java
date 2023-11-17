package a91;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32335t0;
import java.util.List;
import l81.C37104a;
import l81.C37106c;
import l81.C37107d;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10316e;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: a91.i */
public class C30894i extends C37106c {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List f76960d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List f76961e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C37104a f76962f;

    /* renamed from: g */
    private Drawable f76963g;

    /* renamed from: h */
    private Drawable f76964h;

    /* renamed from: i */
    private Drawable f76965i;

    /* renamed from: j */
    private Drawable f76966j;

    /* renamed from: k */
    private int f76967k = C32335t0.m95357b();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public RecyclerView f76968l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f76969m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f76970n;

    /* renamed from: a91.i$a */
    class C30895a extends C37107d implements View.OnClickListener {

        /* renamed from: f */
        BogTextView f76971f = ((BogTextView) mo90036h(C10322k.multiple_select_tv));

        /* renamed from: g */
        BogTextView f76972g = ((BogTextView) mo90036h(C10322k.multiple_select_number_tv));

        /* renamed from: h */
        BogImageView f76973h = ((BogImageView) mo90036h(C10322k.multiple_selector_select_iv));

        public C30895a(View view) {
            super(view);
            this.f89288e = mo90036h(C10322k.multiple_select_divider);
            view.setOnClickListener(this);
        }

        public void onClick(View view) {
            int adapterPosition = getAdapterPosition();
            if (adapterPosition < C30894i.this.f76970n) {
                C30894i iVar = C30894i.this;
                iVar.f76970n = iVar.f76970n - 1;
                if (adapterPosition == C30894i.this.f76970n) {
                    C30894i.this.notifyItemChanged(adapterPosition);
                } else {
                    C30894i.this.m92093z(adapterPosition);
                    C30894i.this.notifyItemRemoved(adapterPosition);
                    C30894i iVar2 = C30894i.this;
                    iVar2.m92092s(iVar2.f76970n, (String) C30894i.this.f76961e.get(adapterPosition), (String) C30894i.this.f76960d.get(adapterPosition));
                    C30894i iVar3 = C30894i.this;
                    iVar3.notifyItemInserted(iVar3.f76970n);
                    C30894i iVar4 = C30894i.this;
                    iVar4.notifyItemRangeChanged(adapterPosition, iVar4.f76970n);
                }
            } else if (C30894i.this.f76970n < C30894i.this.f76969m || C30894i.this.f76969m == -1) {
                int o = C30894i.this.f76970n;
                C30894i iVar5 = C30894i.this;
                iVar5.f76970n = iVar5.f76970n + 1;
                if (o == adapterPosition) {
                    C30894i.this.notifyItemChanged(adapterPosition);
                } else {
                    C30894i.this.m92093z(adapterPosition);
                    C30894i.this.notifyItemRemoved(adapterPosition);
                    C30894i.this.m92092s(o, (String) C30894i.this.f76961e.get(adapterPosition), (String) C30894i.this.f76960d.get(adapterPosition));
                    C30894i iVar6 = C30894i.this;
                    iVar6.notifyItemInserted(iVar6.f76970n - 1);
                    C30894i iVar7 = C30894i.this;
                    iVar7.notifyItemRangeChanged(o, iVar7.f76970n - 1);
                }
            }
            C30894i.this.f76968l.getLayoutManager().mo5197J1(0);
            if (C30894i.this.f76962f != null) {
                C30894i.this.f76962f.mo48298Z0(adapterPosition);
            }
        }
    }

    public C30894i(List list, List list2, int i, RecyclerView recyclerView, C37104a aVar, int i2) {
        this.f76960d = list;
        this.f76961e = list2;
        this.f76970n = i;
        this.f76968l = recyclerView;
        this.f76962f = aVar;
        this.f76969m = i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m92092s(int i, String str, String str2) {
        this.f76960d.add(i, str2);
        this.f76961e.add(i, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m92093z(int i) {
        this.f76960d.remove(i);
        this.f76961e.remove(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo70863g() {
        return true;
    }

    public int getItemCount() {
        return this.f76960d.size();
    }

    /* renamed from: t */
    public List mo71096t() {
        return this.f76960d;
    }

    /* renamed from: u */
    public List mo71097u() {
        return this.f76961e;
    }

    /* renamed from: v */
    public int mo71098v() {
        return this.f76970n;
    }

    /* renamed from: w */
    public List mo71099w() {
        return this.f76961e;
    }

    /* renamed from: x */
    public void onBindViewHolder(C30895a aVar, int i) {
        aVar.f76971f.setText((CharSequence) this.f76960d.get(i));
        if (i < this.f76970n) {
            if (i == 0) {
                aVar.f76971f.setTextColor(this.f76967k);
            } else {
                BogTextView bogTextView = aVar.f76971f;
                bogTextView.setTextColor(C0767a.m2893c(bogTextView.getContext(), C10318g.color_invert_component_tr_300));
            }
            BogTextView bogTextView2 = aVar.f76972g;
            bogTextView2.setText((i + 1) + "");
            aVar.f76973h.setImageDrawable(this.f76963g);
            aVar.f76973h.setBackground(this.f76964h);
            return;
        }
        aVar.f76972g.setText("");
        BogTextView bogTextView3 = aVar.f76971f;
        bogTextView3.setTextColor(C0767a.m2893c(bogTextView3.getContext(), C10318g.color_invert_component_tr_300));
        aVar.f76973h.setImageDrawable(this.f76965i);
        aVar.f76973h.setBackground(this.f76966j);
    }

    /* renamed from: y */
    public C30895a onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.item_multiple_wizard_selector, viewGroup, false);
        if (this.f76963g == null) {
            this.f76963g = C0767a.m2895e(viewGroup.getContext(), C10320i.ic_tick_white);
            this.f76964h = C32335t0.m95362g(viewGroup.getContext(), C10316e.orange_circle);
            this.f76965i = C0767a.m2895e(viewGroup.getContext(), C10320i.ic_plus_sign_gray);
            this.f76966j = C0767a.m2895e(viewGroup.getContext(), C10320i.gray_circle);
        }
        return new C30895a(inflate);
    }
}
