package a91;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.res.C0808h;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32289b0;
import g91.C32299e;
import i91.C36373d;
import iu0.C36546y;
import java.util.ArrayList;
import l81.C37107d;
import p341ge.bog.mobilebank.model.Beneficiary;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.util.font.CustomTypefaceSpan;
import p366bk.C10320i;
import p366bk.C10321j;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: a91.g */
public class C30886g extends RecyclerView.C1736h {

    /* renamed from: d */
    private ArrayList f76939d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ArrayList f76940e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public View.OnClickListener f76941f;

    /* renamed from: g */
    private String f76942g;

    /* renamed from: h */
    private Typeface f76943h;

    /* renamed from: i */
    private Typeface f76944i;

    /* renamed from: a91.g$a */
    class C30887a extends C37107d implements View.OnClickListener {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public View f76945f = mo90036h(C10322k.key_value_item_divider);
        /* access modifiers changed from: private */

        /* renamed from: g */
        public BogTextView f76946g = ((BogTextView) mo90036h(C10322k.key_value_item_key));
        /* access modifiers changed from: private */

        /* renamed from: h */
        public BogTextView f76947h = ((BogTextView) mo90036h(C10322k.key_value_item_value));
        /* access modifiers changed from: private */

        /* renamed from: i */
        public ImageView f76948i = ((ImageView) mo90036h(C10322k.bog_input_layout_et_right_drawable));

        C30887a(View view) {
            super(view);
            view.setOnClickListener(this);
        }

        public void onClick(View view) {
            if (C30886g.this.f76941f != null) {
                view.setTag(new KeyValue(((Beneficiary) C30886g.this.f76940e.get(getAdapterPosition())).benefAcctNo, ((Beneficiary) C30886g.this.f76940e.get(getAdapterPosition())).getName()));
                C30886g.this.f76941f.onClick(view);
            }
        }
    }

    /* renamed from: a91.g$b */
    class C30888b extends C37107d {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public View f76950f = mo90036h(C10322k.key_value_item_divider);
        /* access modifiers changed from: private */

        /* renamed from: g */
        public BogTextView f76951g = ((BogTextView) mo90036h(C10322k.key_value_item_value));

        C30888b(View view) {
            super(view);
        }
    }

    public C30886g(ArrayList arrayList) {
        this.f76939d = arrayList;
        C36546y N = C36546y.m108285N();
        this.f76943h = C0808h.m3033h(N, C10321j.f28708f);
        this.f76944i = C0808h.m3033h(N, C10321j.f28707e);
    }

    public int getItemCount() {
        ArrayList arrayList = this.f76940e;
        if (arrayList != null) {
            return arrayList.size();
        }
        return this.f76939d.size();
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        if (this.f76940e != null) {
            C30887a aVar = (C30887a) f0Var;
            BogTextView k = aVar.f76946g;
            BogTextView l = aVar.f76947h;
            ImageView j = aVar.f76948i;
            View i2 = aVar.f76945f;
            if (i == getItemCount() - 1) {
                i2.setVisibility(8);
            } else {
                i2.setVisibility(0);
            }
            Beneficiary beneficiary = (Beneficiary) this.f76940e.get(i);
            k.setText(((Beneficiary) this.f76940e.get(i)).getName());
            l.setText(((Beneficiary) this.f76940e.get(i)).benefAcctNo);
            C36373d.m107946d(l, beneficiary.benefAcctNo, this.f76942g);
            k.setText(C36373d.m107945c(k.getContext(), beneficiary.getName(), this.f76942g));
            Integer valueOf = Integer.valueOf(C32299e.m95163a(beneficiary.benefBic));
            int i3 = C10320i.f28688dc;
            C32289b0.m95100l(j, valueOf, Integer.valueOf(i3), Integer.valueOf(i3), true);
            return;
        }
        C30888b bVar = (C30888b) f0Var;
        BogTextView j2 = bVar.f76951g;
        View i4 = bVar.f76950f;
        if (i == getItemCount() - 1) {
            i4.setVisibility(8);
        } else {
            i4.setVisibility(0);
        }
        String format = String.format("%s:", new Object[]{((KeyValue) this.f76939d.get(i)).getKey()});
        String value = ((KeyValue) this.f76939d.get(i)).getValue();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format("%s  %s", new Object[]{format, value}));
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("", this.f76943h), 0, format.length(), 34);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("", this.f76944i), format.length(), format.length() + value.length(), 34);
        j2.setText(spannableStringBuilder);
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (this.f76940e != null) {
            return new C30887a(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.key_value_image_recycler_item, viewGroup, false));
        }
        return new C30888b(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.key_value_recycler_item, viewGroup, false));
    }

    public C30886g(ArrayList arrayList, String str, View.OnClickListener onClickListener) {
        this.f76940e = arrayList;
        this.f76941f = onClickListener;
        this.f76942g = str;
    }
}
