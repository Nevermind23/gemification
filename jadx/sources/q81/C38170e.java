package q81;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32303f;
import g91.C32335t0;
import l81.C37104a;
import l81.C37107d;
import p341ge.bog.mobilebank.model.CcyRate;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10316e;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import r90.C27950a;

/* renamed from: q81.e */
public class C38170e extends C38213w {
    /* access modifiers changed from: private */

    /* renamed from: v */
    public CcyRate[] f91610v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public String[] f91611w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C37104a f91612x;

    /* renamed from: q81.e$a */
    private class C38171a extends RecyclerView.C1736h {
        /* renamed from: f */
        public void onBindViewHolder(C38172b bVar, int i) {
            if (C38170e.this.f91611w != null) {
                bVar.f91615g.setVisibility(0);
                C38170e eVar = C38170e.this;
                if (i == eVar.f91684i) {
                    bVar.f91615g.setBackgroundResource(C32335t0.m95364i(eVar.getContext(), C10316e.currency_logo_orange_background));
                } else {
                    bVar.f91615g.setBackgroundResource(C10320i.currency_logo_gray_background);
                }
            } else {
                bVar.f91615g.setVisibility(8);
            }
            bVar.f91615g.setText(C32303f.m95197h(C38170e.this.f91610v[i].getCcy()));
            if (i == getItemCount() - 1) {
                bVar.f91616h.setVisibility(4);
            } else {
                bVar.f91616h.setVisibility(0);
            }
            bVar.f91614f.setText(C38170e.this.f91685j[i]);
        }

        /* renamed from: g */
        public C38172b onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C38172b(LayoutInflater.from(C38170e.this.getContext()).inflate(C10324m.item_currency, viewGroup, false));
        }

        public int getItemCount() {
            return C38170e.this.f91610v.length;
        }

        private C38171a() {
        }
    }

    /* renamed from: q81.e$b */
    private class C38172b extends C37107d implements View.OnClickListener {

        /* renamed from: f */
        BogTextView f91614f = ((BogTextView) mo90036h(C10322k.item_currency_title));

        /* renamed from: g */
        BogTextView f91615g = ((BogTextView) mo90036h(C10322k.item_currency_ccy_logo_tv));

        /* renamed from: h */
        View f91616h = mo90036h(C10322k.item_currency_divider);

        public C38172b(View view) {
            super(view);
            view.setOnClickListener(this);
        }

        public void onClick(View view) {
            C38170e.this.f91612x.mo48298Z0(getAdapterPosition());
            C38170e.this.dismiss();
        }
    }

    public C38170e(Context context, CcyRate[] ccyRateArr, int i, int i2, int i3) {
        super(context, i, i2, i3);
        this.f91610v = ccyRateArr;
        mo91710w(ccyRateArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo91682b() {
        return C10324m.dialog_currency_picker;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public RecyclerView.C1736h mo91707j() {
        return new C38171a();
    }

    /* renamed from: m */
    public void mo91708m(C37104a aVar) {
        this.f91612x = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo91709r() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo91710w(CcyRate[] ccyRateArr) {
        int length = ccyRateArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            String c = C27950a.m86286c(ccyRateArr[i].getDictionaryKey(), false);
            if (ccyRateArr[i].getCcy().equals("GEL")) {
                c = getContext().getString(C10328q.calculator_lari);
            }
            strArr[i] = ccyRateArr[i].getCcy() + " " + c;
        }
        this.f91611w = new String[0];
        mo91746n(strArr);
    }
}
