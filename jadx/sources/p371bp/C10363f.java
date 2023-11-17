package p371bp;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import p341ge.bog.mobilebank.categorypackages.presentation.application.terms.SoloApplicationTermsUiModel;
import p356ao.C10112d;
import p413eo.C12743f1;

/* renamed from: bp.f */
public final class C10363f extends C1819o {

    /* renamed from: bp.f$a */
    public static final class C10364a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12743f1 f29541d;

        /* renamed from: bp.f$a$a */
        public /* synthetic */ class C10365a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f29542a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    bp.a[] r0 = p371bp.C10346a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    bp.a r1 = p371bp.C10346a.MONTHLY_INCOME     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    bp.a r1 = p371bp.C10346a.DEPOSIT     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    bp.a r1 = p371bp.C10346a.LOAN     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f29542a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p371bp.C10363f.C10364a.C10365a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10364a(C12743f1 f1Var) {
            super(f1Var.mo3946b());
            C41536l.m120489i(f1Var, "binding");
            this.f29541d = f1Var;
        }

        /* renamed from: h */
        public final void mo26991h(SoloApplicationTermsUiModel soloApplicationTermsUiModel) {
            int i;
            Integer num;
            C41536l.m120489i(soloApplicationTermsUiModel, "term");
            C10346a a = C10346a.f29519e.mo26978a(soloApplicationTermsUiModel.mo40945a());
            if (a == null) {
                i = -1;
            } else {
                i = C10365a.f29542a[a.ordinal()];
            }
            if (i == 1) {
                num = Integer.valueOf(C10112d.icons_24_general_withdraw_outline);
            } else if (i == 2) {
                num = Integer.valueOf(C10112d.icons_24_deposit_childeposit);
            } else if (i != 3) {
                num = null;
            } else {
                num = Integer.valueOf(C10112d.icons_24_loan_loan_outline);
            }
            if (num != null) {
                num.intValue();
                this.f29541d.f37724f.setImageResource(num.intValue());
            }
            this.f29541d.f37723e.setTitle(C32343x.m95388F(soloApplicationTermsUiModel.mo40946b(), new Object[0]));
            this.f29541d.f37723e.setText(C32343x.m95388F(soloApplicationTermsUiModel.mo40947d(), new Object[0]));
        }
    }

    public C10363f() {
        super(C37599g.f90345a.mo90787d());
    }

    /* renamed from: k */
    public void onBindViewHolder(C10364a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo26991h((SoloApplicationTermsUiModel) g);
    }

    /* renamed from: l */
    public C10364a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C12743f1 d = C12743f1.m48366d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C10364a(d);
    }
}
