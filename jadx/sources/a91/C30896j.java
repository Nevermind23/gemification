package a91;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.C0767a;
import g91.C32303f;
import g91.C32307h;
import g91.C32335t0;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import l81.C37104a;
import l81.C37106c;
import l81.C37107d;
import p341ge.bog.mobilebank.model.cards.PaymentsCard;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10318g;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;

/* renamed from: a91.j */
public class C30896j extends C37106c {

    /* renamed from: d */
    private ArrayList f76975d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f76976e = -1;

    /* renamed from: f */
    private int f76977f = -1;

    /* renamed from: g */
    private boolean f76978g;

    /* renamed from: h */
    private boolean f76979h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C37104a f76980i;

    /* renamed from: a91.j$a */
    class C30897a extends C37107d implements View.OnClickListener {

        /* renamed from: f */
        ImageView f76981f = ((ImageView) mo90036h(C10322k.cards_item_card_logo));

        /* renamed from: g */
        ImageView f76982g = ((ImageView) mo90036h(C10322k.cards_item_tick_icon));

        /* renamed from: h */
        BogTextView f76983h = ((BogTextView) mo90036h(C10322k.cards_item_name_tv));

        /* renamed from: i */
        BogTextView f76984i = ((BogTextView) mo90036h(C10322k.cards_item_date_tv));

        /* renamed from: j */
        BogTextView f76985j = ((BogTextView) mo90036h(C10322k.cards_item_amount_tv));

        public C30897a(View view) {
            super(view);
            this.f89288e = mo90036h(C10322k.cards_item_divider);
            view.setOnClickListener(this);
        }

        public void onClick(View view) {
            C30896j.this.f76976e = getAdapterPosition();
            if (C30896j.this.f76980i != null) {
                C30896j.this.f76980i.mo48298Z0(C30896j.this.f76976e);
            }
            C30896j.this.notifyDataSetChanged();
        }
    }

    /* renamed from: a91.j$b */
    class C30898b extends C37107d {

        /* renamed from: f */
        BogTextView f76987f = ((BogTextView) mo90036h(C10322k.cards_item_title_tv));

        public C30898b(View view) {
            super(view);
        }
    }

    /* renamed from: m */
    private PaymentsCard m92104m(int i) {
        if (this.f76979h) {
            return (PaymentsCard) this.f76975d.get(i);
        }
        try {
            if (this.f76975d.size() == 0) {
                return null;
            }
            if (this.f76978g) {
                return (PaymentsCard) this.f76975d.get(i - 1);
            }
            int i2 = this.f76977f;
            if (i2 == -1) {
                return (PaymentsCard) this.f76975d.get(i - 1);
            }
            if (i2 < i) {
                return (PaymentsCard) this.f76975d.get(i - 2);
            }
            return (PaymentsCard) this.f76975d.get(i - 1);
        } catch (Exception unused) {
            return null;
        }
    }

    public int getItemCount() {
        if (this.f76979h) {
            return this.f76975d.size();
        }
        ArrayList arrayList = this.f76975d;
        if (arrayList == null) {
            return 0;
        }
        int size = arrayList.size() + 1;
        if (this.f76977f <= 0 || this.f76978g) {
            return size;
        }
        return size + 1;
    }

    public int getItemViewType(int i) {
        if (this.f76979h) {
            return 2;
        }
        if (this.f76978g) {
            if (i == 0) {
                return 1;
            }
            return 2;
        } else if (i == 0 || i == this.f76977f) {
            return 1;
        } else {
            return 2;
        }
    }

    /* renamed from: i */
    public void onBindViewHolder(C37107d dVar, int i) {
        boolean z;
        int i2;
        int i3;
        super.mo65512i(dVar, i);
        if (getItemViewType(i) == 2) {
            C30897a aVar = (C30897a) dVar;
            PaymentsCard m = m92104m(i);
            String cardName = m.getCardName();
            if (TextUtils.isEmpty(cardName)) {
                cardName = C32307h.m95232i(m.getLastFour());
                z = true;
            } else {
                z = false;
            }
            aVar.f76983h.setText(cardName);
            if (z) {
                new GregorianCalendar().setTimeInMillis(m.getExpDate());
                if (this.f76979h) {
                    aVar.f76984i.setText(m.getExpDateStr(true));
                } else if (!m.isExternalCard()) {
                    aVar.f76984i.setText(m.getExpDateStr(true));
                } else if (m.isNewCard()) {
                    String[] split = m.getTempCleanDate().split(C11110u2.f31950c);
                    aVar.f76984i.setText(split[0] + " / " + split[1]);
                } else {
                    aVar.f76984i.setText(m.getExpDateStr(true));
                }
            } else {
                aVar.f76984i.setVisibility(8);
            }
            if (m.isExternalCard() || m.getAvailableAmount() == null) {
                aVar.f76985j.setText("***");
            } else {
                aVar.f76985j.setText(C32303f.m95204o(m.getAvailableAmount().doubleValue()) + C32303f.m95198i(m.getCcy(), true));
            }
            aVar.f76983h.setText(cardName);
            if (this.f76976e == i) {
                i2 = C32335t0.m95358c(aVar.f76982g.getContext());
                aVar.f76982g.setVisibility(0);
                i3 = i2;
            } else {
                i2 = C0767a.m2893c(aVar.f89287d.getContext(), C10318g.color_invert_component_tr_300);
                i3 = C0767a.m2893c(aVar.f89288e.getContext(), C10318g.f28629P0);
                aVar.f76982g.setVisibility(4);
            }
            aVar.f76984i.setTextColor(i2);
            aVar.f76983h.setTextColor(i2);
            aVar.f76985j.setTextColor(i2);
            aVar.f89288e.setBackgroundColor(i3);
            aVar.f76981f.setImageResource(C32307h.m95229f(C32307h.m95227d(m.getCardClass())));
            return;
        }
        C30898b bVar = (C30898b) dVar;
        Context context = bVar.f76987f.getContext();
        if (i != 0 || this.f76978g) {
            bVar.f76987f.setText(context.getString(C10328q.payment_option_wizard_other_cards));
        } else {
            bVar.f76987f.setText(context.getString(C10328q.payment_option_wizard_my_cards));
        }
    }

    /* renamed from: n */
    public PaymentsCard mo71103n() {
        int i = this.f76976e;
        if (i > 0) {
            return m92104m(i);
        }
        return null;
    }

    /* renamed from: o */
    public C37107d onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 2) {
            return new C30897a(mo90035h(C10324m.saved_cards_item, viewGroup));
        }
        return new C30898b(mo90035h(C10324m.layout_cards_item_title, viewGroup));
    }

    /* renamed from: p */
    public void mo71105p(C37104a aVar) {
        this.f76980i = aVar;
    }

    /* renamed from: q */
    public void mo71106q(boolean z) {
        this.f76978g = z;
    }

    /* renamed from: r */
    public void mo71107r(ArrayList arrayList) {
        this.f76975d = arrayList;
        for (int i = 0; i < getItemCount(); i++) {
            PaymentsCard m = m92104m(i);
            if (this.f76976e == -1 && m != null && m.isDefault()) {
                this.f76976e = i;
            }
        }
        if (this.f76976e == -1) {
            this.f76976e = 1;
        }
        notifyDataSetChanged();
    }

    /* renamed from: s */
    public void mo71108s(int i) {
        this.f76977f = i;
    }

    /* renamed from: t */
    public void mo71109t(int i) {
        this.f76976e = i;
    }
}
