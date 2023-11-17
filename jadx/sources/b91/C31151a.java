package b91;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.C2379b;
import g91.C32289b0;
import g91.C32307h;
import g91.C32335t0;
import java.util.List;
import l81.C37104a;
import l81.C37106c;
import l81.C37107d;
import p341ge.bog.mobilebank.p975ui.wizard.model.offers.CardSelectorWizardCardUIModel;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import r90.C27950a;

/* renamed from: b91.a */
public class C31151a extends C37106c {

    /* renamed from: d */
    private List f77392d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f77393e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C37104a f77394f;

    /* renamed from: b91.a$a */
    class C31152a extends C37107d implements View.OnClickListener {

        /* renamed from: f */
        TextView f77395f;

        /* renamed from: g */
        TextView f77396g;

        /* renamed from: h */
        ImageView f77397h;

        /* renamed from: i */
        ImageView f77398i;

        C31152a(View view) {
            super(view);
            this.f89288e = view.findViewById(C10322k.payment_wizard_selector_divider);
            this.f77395f = (TextView) view.findViewById(C10322k.f28740H);
            this.f77396g = (TextView) view.findViewById(C10322k.card_number);
            this.f77397h = (ImageView) view.findViewById(C10322k.f28801W5);
            this.f77398i = (ImageView) view.findViewById(C10322k.tick_img);
            view.setOnClickListener(this);
        }

        public void onClick(View view) {
            C31151a.this.f77393e = getAdapterPosition();
            C31151a.this.notifyDataSetChanged();
            C31151a.this.f77394f.mo48298Z0(C31151a.this.f77393e);
        }
    }

    public C31151a(List list, int i) {
        this.f77392d = list;
        this.f77393e = i;
    }

    public int getItemCount() {
        return this.f77392d.size();
    }

    /* renamed from: m */
    public void onBindViewHolder(C31152a aVar, int i) {
        String str;
        CardSelectorWizardCardUIModel cardSelectorWizardCardUIModel = (CardSelectorWizardCardUIModel) this.f77392d.get(i);
        if (cardSelectorWizardCardUIModel.mo88143a().getFileUrl() != null) {
            C2379b.m9211u(aVar.f77397h).mo7757y(C32289b0.m95091c(cardSelectorWizardCardUIModel.mo88143a().getFileUrl())).mo7718L0(aVar.f77397h);
        } else {
            aVar.f77397h.setImageResource(C32307h.m95224a(cardSelectorWizardCardUIModel.mo88149f()));
        }
        TextView textView = aVar.f77395f;
        if (cardSelectorWizardCardUIModel.mo88144b() != null) {
            str = cardSelectorWizardCardUIModel.mo88144b();
        } else {
            str = C27950a.m86284a(cardSelectorWizardCardUIModel.mo88145d());
        }
        textView.setText(str);
        aVar.f77396g.setText(C32307h.m95232i(cardSelectorWizardCardUIModel.mo88147e()));
        if (this.f77393e == i) {
            aVar.f77398i.setImageResource(C10320i.ic_tick);
            aVar.f77398i.setColorFilter(C32335t0.m95357b());
            return;
        }
        aVar.f77398i.setImageResource(0);
    }

    /* renamed from: n */
    public C31152a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C31152a(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.loan_offer_card_selector_item, viewGroup, false));
    }

    /* renamed from: o */
    public void mo71362o(C37104a aVar) {
        this.f77394f = aVar;
    }
}
