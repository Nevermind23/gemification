package e21;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import b31.C31125n;
import f21.C31921a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorUiModel;
import p615tg.C17963d;
import p668xg.C18761c;

/* renamed from: e21.b */
public final class C31650b extends C1819o {

    /* renamed from: f */
    private final C31921a f78240f;

    /* renamed from: g */
    private long f78241g = -1;

    /* renamed from: e21.b$a */
    public static final class C31651a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C31125n f78242d;

        /* renamed from: e */
        private final C31921a f78243e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31651a(C31125n nVar, C31921a aVar) {
            super(nVar.mo3946b());
            C41536l.m120489i(nVar, "binding");
            C41536l.m120489i(aVar, "onCardClicked");
            this.f78242d = nVar;
            this.f78243e = aVar;
        }

        /* renamed from: i */
        private final Image m93783i(int i) {
            if (i == -1) {
                return null;
            }
            return new Image.Resource(i, (Boolean) null, 2, (DefaultConstructorMarker) null);
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m93784k(C31651a aVar, CardAccountSelectorUiModel cardAccountSelectorUiModel, int i, C18761c cVar) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(cardAccountSelectorUiModel, "$item");
            C41536l.m120489i(cVar, "<anonymous parameter 1>");
            aVar.f78243e.mo71928a(cardAccountSelectorUiModel);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: ge.bog.designsystem.components.common.Image} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: ge.bog.designsystem.components.common.Image$Url} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: ge.bog.designsystem.components.common.Image$Url} */
        /* JADX WARNING: type inference failed for: r0v2 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final p341ge.bog.designsystem.components.accountselector.AccountSelectorItemView.C13140a m93785l(p341ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorUiModel r20) {
            /*
                r19 = this;
                java.lang.String r1 = r20.mo84204b()
                xg.d r8 = new xg.d
                java.lang.String r0 = r20.mo84210g()
                java.util.Currency r3 = java.util.Currency.getInstance(r0)
                java.lang.String r0 = "getInstance(ccy)"
                kotlin.jvm.internal.C41536l.m120488h(r3, r0)
                double r4 = r20.mo84209f()
                java.math.BigDecimal r4 = g91.C32343x.m95463l(r4)
                r5 = 0
                r6 = 4
                r7 = 0
                r2 = r8
                r2.<init>(r3, r4, r5, r6, r7)
                xg.d r2 = new xg.d
                java.lang.String r3 = r20.mo84210g()
                java.util.Currency r10 = java.util.Currency.getInstance(r3)
                kotlin.jvm.internal.C41536l.m120488h(r10, r0)
                double r3 = r20.mo84209f()
                java.math.BigDecimal r11 = g91.C32343x.m95463l(r3)
                r12 = 0
                r13 = 4
                r14 = 0
                r9 = r2
                r9.<init>(r10, r11, r12, r13, r14)
                java.util.List r3 = ie1.C41339p.m119900e(r2)
                java.lang.String r10 = r20.mo84214j()
                if (r10 == 0) goto L_0x005c
                ge.bog.designsystem.components.common.Image$Url r0 = new ge.bog.designsystem.components.common.Image$Url
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 126(0x7e, float:1.77E-43)
                r18 = 0
                r9 = r0
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
                r10 = r19
                goto L_0x0066
            L_0x005c:
                int r0 = r20.mo84207e()
                r10 = r19
                ge.bog.designsystem.components.common.Image r0 = r10.m93783i(r0)
            L_0x0066:
                r6 = r0
                java.lang.String r0 = r20.mo84214j()
                if (r0 == 0) goto L_0x0072
                boolean r0 = r20.mo84213i()
                goto L_0x0076
            L_0x0072:
                boolean r0 = r20.mo84211h()
            L_0x0076:
                boolean r4 = r20.mo84215k()
                ge.bog.designsystem.components.accountselector.AccountSelectorItemView$a r11 = new ge.bog.designsystem.components.accountselector.AccountSelectorItemView$a
                r5 = 0
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
                r9 = 16
                r12 = 0
                r0 = r11
                r2 = r8
                r8 = r9
                r9 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: e21.C31650b.C31651a.m93785l(ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorUiModel):ge.bog.designsystem.components.accountselector.AccountSelectorItemView$a");
        }

        /* renamed from: j */
        public final void mo72079j(CardAccountSelectorUiModel cardAccountSelectorUiModel, boolean z) {
            C41536l.m120489i(cardAccountSelectorUiModel, "item");
            this.f78242d.mo3946b().setActivated(z);
            this.f78242d.mo3946b().setData(m93785l(cardAccountSelectorUiModel));
            this.f78242d.mo3946b().setOnCurrencyItemSelectedListener(new C31649a(this, cardAccountSelectorUiModel));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31650b(C31921a aVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(aVar, "onCardClicked");
        this.f78240f = aVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C31651a aVar, int i) {
        boolean z;
        C41536l.m120489i(aVar, "holder");
        CardAccountSelectorUiModel cardAccountSelectorUiModel = (CardAccountSelectorUiModel) mo6027g(i);
        C41536l.m120488h(cardAccountSelectorUiModel, "this");
        if (cardAccountSelectorUiModel.mo84203a() == this.f78241g) {
            z = true;
        } else {
            z = false;
        }
        aVar.mo72079j(cardAccountSelectorUiModel, z);
    }

    /* renamed from: l */
    public C31651a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C31125n d = C31125n.m92620d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…          false\n        )");
        return new C31651a(d, this.f78240f);
    }

    /* renamed from: m */
    public final void mo72078m(long j) {
        this.f78241g = j;
    }
}
