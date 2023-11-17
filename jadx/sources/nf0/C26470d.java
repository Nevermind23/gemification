package nf0;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1775d;
import androidx.recyclerview.widget.C1796h;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Currency;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.accountselector.AccountSelectorItemView;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferExternalFile;
import p668xg.C18761c;
import p668xg.C18762d;
import ue0.C28709a;
import ue1.C43075l;

/* renamed from: nf0.d */
public final class C26470d extends RecyclerView.C1736h {

    /* renamed from: f */
    public static final C26473c f67048f = new C26473c((DefaultConstructorMarker) null);

    /* renamed from: g */
    private static final C26472b f67049g = new C26472b();

    /* renamed from: d */
    private C43075l f67050d;

    /* renamed from: e */
    private final C1775d f67051e = new C1775d((RecyclerView.C1736h) this, (C1796h.C1802f) f67049g);

    /* renamed from: nf0.d$a */
    public final class C26471a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C28709a f67052d;

        /* renamed from: e */
        final /* synthetic */ C26470d f67053e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26471a(C26470d dVar, C28709a aVar) {
            super(aVar.mo3946b());
            C41536l.m120489i(aVar, "binding");
            this.f67053e = dVar;
            this.f67052d = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m82770j(C26470d dVar, TransferAccountItem transferAccountItem, int i, C18761c cVar) {
            C41536l.m120489i(dVar, "this$0");
            C41536l.m120489i(transferAccountItem, "$transferAccount");
            C41536l.m120489i(cVar, "<anonymous parameter 1>");
            C43075l f = dVar.mo65760f();
            if (f != null) {
                f.invoke(transferAccountItem);
            }
        }

        /* renamed from: i */
        public final void mo65763i(TransferAccountItem transferAccountItem, TransferExternalFile transferExternalFile, int i) {
            String str;
            String str2;
            boolean z;
            String a;
            TransferAccountItem transferAccountItem2 = transferAccountItem;
            C41536l.m120489i(transferAccountItem2, "transferAccount");
            this.f67052d.f73107e.setOnCurrencyItemSelectedListener(new C26469c(this.f67053e, transferAccountItem2));
            AccountSelectorItemView accountSelectorItemView = this.f67052d.f73107e;
            String q = transferAccountItem.mo52148q();
            if (q == null && (q = transferAccountItem.mo52134d()) == null) {
                str = "";
            } else {
                str = q;
            }
            Currency instance = Currency.getInstance(transferAccountItem.mo52142i());
            C41536l.m120488h(instance, "getInstance(transferAccount.ccy)");
            C18762d dVar = new C18762d(instance, transferAccountItem.mo52139g(), false, 4, (DefaultConstructorMarker) null);
            Currency instance2 = Currency.getInstance(transferAccountItem.mo52142i());
            C41536l.m120488h(instance2, "getInstance(transferAccount.ccy)");
            List e = C41339p.m119900e(new C18762d(instance2, transferAccountItem.mo52139g(), false, 4, (DefaultConstructorMarker) null));
            boolean v = transferAccountItem.mo52154v();
            if (transferExternalFile == null || (a = transferExternalFile.mo52204a()) == null) {
                str2 = "";
            } else {
                str2 = a;
            }
            Image.Url url = new Image.Url(str2, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null);
            if (transferExternalFile != null) {
                z = transferExternalFile.mo52205b();
            } else {
                z = false;
            }
            accountSelectorItemView.setData(new AccountSelectorItemView.C13140a(str, dVar, e, v, (Image) null, url, Boolean.valueOf(z), 16, (DefaultConstructorMarker) null));
        }
    }

    /* renamed from: nf0.d$b */
    public static final class C26472b extends C1796h.C1802f {
        C26472b() {
        }

        /* renamed from: d */
        public boolean mo5976a(TransferAccountItem transferAccountItem, TransferAccountItem transferAccountItem2) {
            C41536l.m120489i(transferAccountItem, "oldItem");
            C41536l.m120489i(transferAccountItem2, "newItem");
            if (transferAccountItem.mo52146m() == transferAccountItem2.mo52146m()) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public boolean mo5977b(TransferAccountItem transferAccountItem, TransferAccountItem transferAccountItem2) {
            C41536l.m120489i(transferAccountItem, "oldItem");
            C41536l.m120489i(transferAccountItem2, "newItem");
            return true;
        }
    }

    /* renamed from: nf0.d$c */
    public static final class C26473c {
        private C26473c() {
        }

        public /* synthetic */ C26473c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: f */
    public final C43075l mo65760f() {
        return this.f67050d;
    }

    /* renamed from: g */
    public final void mo65761g(C43075l lVar) {
        this.f67050d = lVar;
    }

    public int getItemCount() {
        return this.f67051e.mo5902b().size();
    }

    /* renamed from: h */
    public final void mo65762h(List list) {
        this.f67051e.mo5904e(list);
        notifyDataSetChanged();
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        if (f0Var instanceof C26471a) {
            ((C26471a) f0Var).mo65763i((TransferAccountItem) ((TransferAccountItem) this.f67051e.mo5902b().get(i)).mo52151t().get(0), ((TransferAccountItem) this.f67051e.mo5902b().get(i)).mo52143j(), i);
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C28709a d = C28709a.m87953d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C26471a(this, d);
    }
}
