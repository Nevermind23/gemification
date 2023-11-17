package eq0;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Currency;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37599g;
import p341ge.bog.designsystem.components.accountselector.AccountSelectorItemView;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferExternalFile;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.account.LoanAccountListItem;
import p668xg.C18761c;
import p668xg.C18762d;
import sp0.C38483b0;

/* renamed from: eq0.a */
public final class C31738a extends C1819o {

    /* renamed from: f */
    private final C31739a f78317f;

    /* renamed from: eq0.a$a */
    public interface C31739a {
        /* renamed from: a */
        void mo72177a(LoanAccountListItem loanAccountListItem);
    }

    /* renamed from: eq0.a$b */
    public static final class C31740b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C38483b0 f78318d;

        /* renamed from: e */
        private final C31739a f78319e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31740b(C38483b0 b0Var, C31739a aVar) {
            super(b0Var.mo3946b());
            C41536l.m120489i(b0Var, "binding");
            C41536l.m120489i(aVar, "listener");
            this.f78318d = b0Var;
            this.f78319e = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m93920j(C31740b bVar, LoanAccountListItem loanAccountListItem, int i, C18761c cVar) {
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(loanAccountListItem, "$account");
            C41536l.m120489i(cVar, "<anonymous parameter 1>");
            bVar.f78319e.mo72177a(loanAccountListItem);
        }

        /* renamed from: i */
        public final void mo72178i(LoanAccountListItem loanAccountListItem) {
            String str;
            String str2;
            String a;
            LoanAccountListItem loanAccountListItem2 = loanAccountListItem;
            C41536l.m120489i(loanAccountListItem2, "account");
            Currency instance = Currency.getInstance(loanAccountListItem.mo73345h());
            C41536l.m120488h(instance, "getInstance(account.ccy)");
            C18762d dVar = new C18762d(instance, loanAccountListItem.mo73339d(), false, 4, (DefaultConstructorMarker) null);
            AccountSelectorItemView c = this.f78318d.mo3946b();
            String i = loanAccountListItem.mo73347i();
            if (i == null) {
                str = "";
            } else {
                str = i;
            }
            List e = C41339p.m119900e(dVar);
            TransferExternalFile e2 = loanAccountListItem.mo73341e();
            if (e2 == null || (a = e2.mo52204a()) == null) {
                str2 = "";
            } else {
                str2 = a;
            }
            Image.Url url = new Image.Url(str2, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null);
            TransferExternalFile e3 = loanAccountListItem.mo73341e();
            boolean z = false;
            if (e3 != null && !e3.mo52205b()) {
                z = true;
            }
            c.setData(new AccountSelectorItemView.C13140a(str, dVar, e, false, (Image) null, url, Boolean.valueOf(z), 24, (DefaultConstructorMarker) null));
            c.setActivated(loanAccountListItem.mo73348j());
            c.setOnCurrencyItemSelectedListener(new C31741b(this, loanAccountListItem2));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31738a(C31739a aVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(aVar, "listener");
        this.f78317f = aVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C31740b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        bVar.mo72178i((LoanAccountListItem) g);
    }

    /* renamed from: l */
    public C31740b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C38483b0 d = C38483b0.m112945d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C31740b(d, this.f78317f);
    }
}
