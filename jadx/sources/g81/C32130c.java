package g81;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import b50.C19333a;
import f50.C20432f;
import g91.C32303f;
import java.math.BigDecimal;
import l81.C37107d;
import o81.C37693a;
import o81.C37694b;
import p341ge.bog.mobilebank.model.account.AccountOperation;
import p341ge.bog.mobilebank.model.account.OperationBalance;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10313b;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import ue1.C43075l;

/* renamed from: g81.c */
public class C32130c extends C37694b {

    /* renamed from: l */
    private Activity f79091l;

    /* renamed from: m */
    private Animation f79092m;

    /* renamed from: n */
    private boolean f79093n;

    /* renamed from: o */
    private String f79094o;

    /* renamed from: p */
    private AccountOperation f79095p;

    /* renamed from: q */
    private BigDecimal f79096q = new BigDecimal(0);

    /* renamed from: r */
    private BigDecimal f79097r = new BigDecimal(0);

    /* renamed from: s */
    private OperationBalance f79098s;

    /* renamed from: t */
    private OperationBalance f79099t;

    /* renamed from: u */
    private boolean f79100u;

    /* renamed from: g81.c$a */
    private class C32131a extends C37107d {
        public C32131a(View view) {
            super(view);
        }
    }

    /* renamed from: g81.c$b */
    public class C32132b extends C37107d {

        /* renamed from: f */
        private View f79102f = mo90036h(C10322k.top_container);
        /* access modifiers changed from: private */

        /* renamed from: g */
        public View f79103g = mo90036h(C10322k.f28886r4);
        /* access modifiers changed from: private */

        /* renamed from: h */
        public BogTextView f79104h = ((BogTextView) mo90036h(C10322k.income_amount));
        /* access modifiers changed from: private */

        /* renamed from: i */
        public BogTextView f79105i = ((BogTextView) mo90036h(C10322k.outcome_amount));
        /* access modifiers changed from: private */

        /* renamed from: j */
        public BogTextView f79106j = ((BogTextView) mo90036h(C10322k.balance_start_amount));
        /* access modifiers changed from: private */

        /* renamed from: k */
        public BogTextView f79107k = ((BogTextView) mo90036h(C10322k.balance_end_amount));

        public C32132b(View view) {
            super(view);
        }
    }

    private C32130c(C37693a aVar) {
        super(aVar);
    }

    /* renamed from: F */
    public static C32130c m94643F(Activity activity, boolean z, boolean z2, String str) {
        C37693a aVar = new C37693a();
        aVar.mo90874e(C10324m.operation_error_item);
        aVar.mo90875f(C10324m.operaion_loading_item);
        C32130c cVar = new C32130c(aVar);
        cVar.mo72618I(activity);
        cVar.f79093n = z;
        cVar.f79100u = z2;
        cVar.f79094o = str;
        return cVar;
    }

    /* renamed from: G */
    private int m94644G(int i) {
        return this.f79093n ? i - 1 : i;
    }

    /* renamed from: H */
    public void mo72617H() {
        AccountOperation accountOperation = this.f79095p;
        if (accountOperation != null) {
            String b = C32303f.m95191b(accountOperation.getDocKey(), this.f79095p.getEssId(), this.f79095p.getPrintFormType());
            Activity activity = this.f79091l;
            C32303f.m95195f(b, activity, this.f79091l.getString(C10328q.f28968x1) + ".pdf", "application/pdf");
            this.f79095p = null;
        }
    }

    /* renamed from: I */
    public void mo72618I(Activity activity) {
        this.f79091l = activity;
        this.f79092m = AnimationUtils.loadAnimation(activity, C10313b.infinite_alpha);
    }

    public int getItemCount() {
        int itemCount = super.getItemCount() + (this.f79093n ? 1 : 0);
        if (!this.f79100u || mo90885q()) {
            return itemCount;
        }
        if (mo90884p() == null || mo90884p().size() == 0) {
            return itemCount + 1;
        }
        return itemCount;
    }

    public int getItemViewType(int i) {
        int itemViewType = super.getItemViewType(i);
        if (itemViewType != -1) {
            return itemViewType;
        }
        if (this.f79093n && i == 0) {
            return 30;
        }
        if (i != 1 || !this.f79100u || mo90885q()) {
            return 2222;
        }
        if (mo90884p() == null || mo90884p().size() == 0) {
            return 50;
        }
        return 2222;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo72619v(C37107d dVar, int i) {
        super.mo72619v(dVar, i);
        if (dVar.getItemViewType() == -2) {
            dVar.f89287d.findViewById(C10322k.animation_container).startAnimation(this.f79092m);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo72620w(C37107d dVar, int i) {
        int itemViewType = dVar.getItemViewType();
        if (itemViewType == 30) {
            C32132b bVar = (C32132b) dVar;
            BogTextView k = bVar.f79104h;
            k.setText(C32303f.m95204o(this.f79096q.doubleValue()) + C32303f.m95198i("GEL", true));
            BogTextView l = bVar.f79105i;
            l.setText(C32303f.m95204o(this.f79097r.doubleValue()) + C32303f.m95198i("GEL", true));
            if (this.f79098s == null || this.f79099t == null) {
                bVar.f79103g.setVisibility(8);
                return;
            }
            bVar.f79103g.setVisibility(0);
            BogTextView m = bVar.f79106j;
            m.setText(C32303f.m95204o(this.f79098s.getBalance().doubleValue() * -1.0d) + C32303f.m95198i(this.f79098s.getCcy(), true));
            BogTextView j = bVar.f79107k;
            j.setText(C32303f.m95204o(this.f79099t.getBalance().doubleValue() * -1.0d) + C32303f.m95198i(this.f79099t.getCcy(), true));
        } else if (itemViewType == 2222) {
            ((C20432f) dVar).mo48919p(C19333a.m64785d((AccountOperation) mo90883o(m94644G(i))), (C43075l) null, (Boolean) null, (C43075l) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public C37107d mo72621y(ViewGroup viewGroup, int i) {
        if (i == 2222) {
            return C20432f.m66577t(viewGroup, this.f79091l, this.f79094o, false);
        }
        if (i == 50) {
            return new C32131a(mo90035h(C10324m.operations_no_data_view, viewGroup));
        }
        return new C32132b(mo90035h(C10324m.fragment_operations_top_container, viewGroup));
    }
}
