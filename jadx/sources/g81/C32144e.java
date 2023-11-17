package g81;

import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArraySet;
import androidx.core.content.C0767a;
import g91.C32289b0;
import java.util.List;
import l81.C37104a;
import l81.C37106c;
import l81.C37107d;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.FlipImageViewContainer;
import p366bk.C10318g;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: g81.e */
public class C32144e extends C37106c {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ArraySet f79165d = new ArraySet();

    /* renamed from: e */
    private List f79166e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C37104a f79167f;

    /* renamed from: g */
    private Client f79168g;

    /* renamed from: g81.e$a */
    public class C32145a extends C37107d implements View.OnClickListener {

        /* renamed from: f */
        public FlipImageViewContainer f79169f = ((FlipImageViewContainer) mo90036h(C10322k.add_payment_item_flipper));

        /* renamed from: g */
        View f79170g;

        /* renamed from: h */
        BogTextView f79171h;

        public C32145a(View view) {
            super(view);
            this.f89288e = mo90036h(C10322k.add_payment_item_divider);
            this.f79170g = mo90036h(C10322k.add_payments_clickable);
            this.f79171h = (BogTextView) mo90036h(C10322k.add_templates_title);
            this.f79170g.setOnClickListener(this);
        }

        public void onClick(View view) {
            if (!C32144e.this.f79165d.contains(Integer.valueOf(getAdapterPosition()))) {
                C32144e.this.f79165d.add(Integer.valueOf(getAdapterPosition()));
                if (!this.f79169f.isFlipped()) {
                    this.f79169f.flipImage();
                }
                this.f89287d.setBackgroundColor(C0767a.m2893c(view.getContext(), C10318g.bog_activity_background_color));
            } else {
                C32144e.this.f79165d.remove(Integer.valueOf(getAdapterPosition()));
                if (this.f79169f.isFlipped()) {
                    this.f79169f.flipImage();
                }
                this.f89287d.setBackgroundColor(C0767a.m2893c(view.getContext(), C10318g.bog_card_view_background_color));
            }
            if (C32144e.this.f79167f != null) {
                C32144e.this.f79167f.mo48298Z0(getAdapterPosition());
            }
        }
    }

    public C32144e(Client client) {
        this.f79168g = client;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo70863g() {
        return true;
    }

    public int getItemCount() {
        List list = this.f79166e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: l */
    public boolean mo72646l() {
        return this.f79165d.size() > 0;
    }

    /* renamed from: m */
    public boolean mo72647m() {
        return getItemCount() == this.f79165d.size();
    }

    /* renamed from: n */
    public ArraySet mo72648n() {
        return this.f79165d;
    }

    /* renamed from: o */
    public void onBindViewHolder(C32145a aVar, int i) {
        String str;
        super.mo65512i(aVar, i);
        if (this.f79165d.contains(Integer.valueOf(i))) {
            aVar.f79169f.setFlipped(true);
            View view = aVar.f89287d;
            view.setBackgroundColor(C0767a.m2893c(view.getContext(), C10318g.bog_activity_background_color));
        } else {
            aVar.f79169f.setFlipped(false);
            View view2 = aVar.f89287d;
            view2.setBackgroundColor(C0767a.m2893c(view2.getContext(), C10318g.bog_card_view_background_color));
        }
        FlipImageViewContainer flipImageViewContainer = aVar.f79169f;
        if (((TemplateBasketItem) this.f79166e.get(i)).getTemplateImage() != null) {
            str = ((TemplateBasketItem) this.f79166e.get(i)).getTemplateImage();
        } else {
            str = ((TemplateBasketItem) this.f79166e.get(i)).getLogo();
        }
        flipImageViewContainer.setFrontImageUrl(C32289b0.m95093e(str));
        aVar.f79169f.setImage();
        aVar.f79171h.setText(((TemplateBasketItem) this.f79166e.get(i)).getTemplateNameOrServiceName(this.f79168g));
    }

    /* renamed from: p */
    public C32145a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C32145a(mo90035h(C10324m.add_template_recycler_item, viewGroup));
    }

    /* renamed from: q */
    public void mo72651q() {
        for (int i = 0; i < getItemCount(); i++) {
            this.f79165d.add(Integer.valueOf(i));
        }
    }

    /* renamed from: r */
    public void mo72652r(C37104a aVar) {
        this.f79167f = aVar;
    }

    /* renamed from: s */
    public void mo72653s(List list) {
        this.f79166e = list;
    }

    /* renamed from: t */
    public void mo72654t() {
        this.f79165d.clear();
    }
}
