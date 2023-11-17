package gt0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import he1.C41224m;
import it0.C36521a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import jt0.C36788a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.accountselector.AccountSelectorItemView;
import p341ge.bog.designsystem.components.common.Image;
import p615tg.C17963d;
import p668xg.C18761c;
import p668xg.C18762d;
import vs0.C39456o;

/* renamed from: gt0.b */
public final class C36073b extends C1819o {

    /* renamed from: f */
    private final C36521a f87203f;

    /* renamed from: gt0.b$a */
    public static final class C36074a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C39456o f87204d;

        /* renamed from: e */
        private final C36521a f87205e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36074a(C39456o oVar, C36521a aVar) {
            super(oVar.mo3946b());
            C41536l.m120489i(oVar, "binding");
            this.f87204d = oVar;
            this.f87205e = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m107320j(C36074a aVar, C36788a aVar2, int i, AccountSelectorItemView accountSelectorItemView, int i2, C18761c cVar) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(aVar2, "$item");
            C41536l.m120489i(accountSelectorItemView, "$selector");
            C41536l.m120489i(cVar, "<anonymous parameter 1>");
            C36521a aVar3 = aVar.f87205e;
            if (aVar3 != null) {
                aVar3.mo71785a(aVar2.mo89680a(), i, !aVar2.mo89682c());
            }
            accountSelectorItemView.setActivated(!accountSelectorItemView.isActivated());
        }

        /* renamed from: k */
        private final AccountSelectorItemView.C13140a m107321k(String str, C18762d dVar, Image image, boolean z, C41224m... mVarArr) {
            C41224m[] mVarArr2 = mVarArr;
            ArrayList arrayList = new ArrayList(mVarArr2.length);
            for (C41224m mVar : mVarArr2) {
                Currency instance = Currency.getInstance((String) mVar.mo95678e());
                C41536l.m120488h(instance, "getInstance(it.first)");
                arrayList.add(new C18762d(instance, new BigDecimal(String.valueOf(((Number) mVar.mo95680f()).doubleValue())), false, 4, (DefaultConstructorMarker) null));
            }
            return new AccountSelectorItemView.C13140a(str, dVar, arrayList, false, (Image) null, image, Boolean.valueOf(z), 16, (DefaultConstructorMarker) null);
        }

        /* JADX WARNING: type inference failed for: r0v35, types: [ge.bog.designsystem.components.common.Image$Resource] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00ba  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00bc  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00ca  */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo88793i(jt0.C36788a r20, int r21) {
            /*
                r19 = this;
                r6 = r19
                r7 = r20
                java.lang.String r0 = "item"
                kotlin.jvm.internal.C41536l.m120489i(r7, r0)
                vs0.o r0 = r6.f87204d
                ge.bog.designsystem.components.accountselector.AccountSelectorItemView r8 = r0.mo3946b()
                java.lang.String r0 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r8, r0)
                ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel r0 = r20.mo89680a()
                java.lang.String r1 = r0.mo75003b()
                xg.d r2 = new xg.d
                ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel r0 = r20.mo89680a()
                java.lang.String r0 = r0.mo75008g()
                java.lang.String r3 = "GEL"
                if (r0 != 0) goto L_0x002b
                r0 = r3
            L_0x002b:
                java.util.Currency r10 = java.util.Currency.getInstance(r0)
                java.lang.String r0 = "getInstance(item.account.ccy ?: Consts.GEL)"
                kotlin.jvm.internal.C41536l.m120488h(r10, r0)
                java.math.BigDecimal r11 = new java.math.BigDecimal
                ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel r0 = r20.mo89680a()
                double r4 = r0.mo75007f()
                java.lang.String r0 = java.lang.String.valueOf(r4)
                r11.<init>(r0)
                r12 = 0
                r13 = 4
                r14 = 0
                r9 = r2
                r9.<init>(r10, r11, r12, r13, r14)
                ge.bog.mobilebank.shared.helper.ImageSource r0 = r20.mo89681b()
                boolean r4 = r0 instanceof p341ge.bog.mobilebank.shared.helper.ImageSource.Resource
                if (r4 == 0) goto L_0x0074
                ge.bog.mobilebank.shared.helper.ImageSource r0 = r20.mo89681b()
                ge.bog.mobilebank.shared.helper.ImageSource$Resource r0 = (p341ge.bog.mobilebank.shared.helper.ImageSource.Resource) r0
                int r0 = r0.mo84372a()
                r4 = -1
                r5 = 0
                if (r0 != r4) goto L_0x0063
                goto L_0x0094
            L_0x0063:
                ge.bog.designsystem.components.common.Image$Resource r0 = new ge.bog.designsystem.components.common.Image$Resource
                ge.bog.mobilebank.shared.helper.ImageSource r4 = r20.mo89681b()
                ge.bog.mobilebank.shared.helper.ImageSource$Resource r4 = (p341ge.bog.mobilebank.shared.helper.ImageSource.Resource) r4
                int r4 = r4.mo84372a()
                r9 = 2
                r0.<init>(r4, r5, r9, r5)
                goto L_0x0093
            L_0x0074:
                boolean r0 = r0 instanceof p341ge.bog.mobilebank.shared.helper.ImageSource.Url
                if (r0 == 0) goto L_0x00fb
                ge.bog.designsystem.components.common.Image$Url r0 = new ge.bog.designsystem.components.common.Image$Url
                ge.bog.mobilebank.shared.helper.ImageSource r4 = r20.mo89681b()
                ge.bog.mobilebank.shared.helper.ImageSource$Url r4 = (p341ge.bog.mobilebank.shared.helper.ImageSource.Url) r4
                java.lang.String r10 = r4.mo84384d()
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
            L_0x0093:
                r5 = r0
            L_0x0094:
                ge.bog.mobilebank.shared.helper.ImageSource r0 = r20.mo89681b()
                boolean r0 = r0 instanceof p341ge.bog.mobilebank.shared.helper.ImageSource.Url
                r4 = 1
                r9 = 0
                if (r0 == 0) goto L_0x00a8
                ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel r0 = r20.mo89680a()
                boolean r0 = r0.mo75010i()
                if (r0 != 0) goto L_0x00ba
            L_0x00a8:
                ge.bog.mobilebank.shared.helper.ImageSource r0 = r20.mo89681b()
                boolean r0 = r0 instanceof p341ge.bog.mobilebank.shared.helper.ImageSource.Resource
                if (r0 == 0) goto L_0x00bc
                ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel r0 = r20.mo89680a()
                boolean r0 = r0.mo75009h()
                if (r0 == 0) goto L_0x00bc
            L_0x00ba:
                r10 = r4
                goto L_0x00bd
            L_0x00bc:
                r10 = r9
            L_0x00bd:
                he1.m[] r11 = new he1.C41224m[r4]
                ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel r0 = r20.mo89680a()
                java.lang.String r0 = r0.mo75008g()
                if (r0 != 0) goto L_0x00ca
                goto L_0x00cb
            L_0x00ca:
                r3 = r0
            L_0x00cb:
                ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel r0 = r20.mo89680a()
                double r12 = r0.mo75007f()
                java.lang.Double r0 = java.lang.Double.valueOf(r12)
                he1.m r0 = he1.C41233s.m119492a(r3, r0)
                r11[r9] = r0
                r0 = r19
                r3 = r5
                r4 = r10
                r5 = r11
                ge.bog.designsystem.components.accountselector.AccountSelectorItemView$a r0 = r0.m107321k(r1, r2, r3, r4, r5)
                r8.setData(r0)
                boolean r0 = r20.mo89682c()
                r8.setActivated(r0)
                gt0.a r0 = new gt0.a
                r1 = r21
                r0.<init>(r6, r7, r1, r8)
                r8.setOnCurrencyItemSelectedListener(r0)
                return
            L_0x00fb:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: gt0.C36073b.C36074a.mo88793i(jt0.a, int):void");
        }
    }

    public C36073b(C36521a aVar) {
        super(C17963d.f51158a.mo45633d());
        this.f87203f = aVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C36074a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo88793i((C36788a) g, i);
    }

    /* renamed from: l */
    public C36074a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C39456o d = C39456o.m114680d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        return new C36074a(d, this.f87203f);
    }
}
