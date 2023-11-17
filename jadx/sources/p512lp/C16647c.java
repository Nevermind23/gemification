package p512lp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37599g;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.creditcardwidget.CreditCardWidgetBannerView;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p413eo.C12781y0;
import p526mp.C16885b;
import p683yh.C18917a;

/* renamed from: lp.c */
public final class C16647c extends C1819o {

    /* renamed from: f */
    private final C16648a f46846f;

    /* renamed from: lp.c$a */
    public interface C16648a {
        /* renamed from: a */
        void mo41055a(C16885b bVar);
    }

    /* renamed from: lp.c$b */
    public static final class C16649b extends RecyclerView.C1734f0 {

        /* renamed from: f */
        public static final C16650a f46847f = new C16650a((DefaultConstructorMarker) null);

        /* renamed from: d */
        private final C12781y0 f46848d;

        /* renamed from: e */
        private final C16648a f46849e;

        /* renamed from: lp.c$b$a */
        public static final class C16650a {
            private C16650a() {
            }

            public /* synthetic */ C16650a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16649b(C12781y0 y0Var, C16648a aVar) {
            super(y0Var.mo3946b());
            C41536l.m120489i(y0Var, "binding");
            C41536l.m120489i(aVar, "onCardBannerClick");
            this.f46848d = y0Var;
            this.f46849e = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m58975j(C16649b bVar, C16885b bVar2, View view) {
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(bVar2, "$card");
            bVar.f46849e.mo41055a(bVar2);
        }

        /* renamed from: k */
        private final boolean m58976k(String str) {
            if (str == null || C41536l.m120484d(str, BankApiResponse.SUCCESSFUL_RESPONSE_CODE)) {
                return false;
            }
            return true;
        }

        /* renamed from: i */
        public final void mo43790i(C16885b bVar) {
            String str;
            C16885b bVar2 = bVar;
            C41536l.m120489i(bVar2, "card");
            C12781y0 y0Var = this.f46848d;
            CreditCardWidgetBannerView creditCardWidgetBannerView = y0Var.f37896e;
            String d = bVar.mo44024d();
            if (d == null) {
                d = "";
            }
            String str2 = d;
            Image b = bVar.mo44022b();
            if (m58976k(bVar.mo44021a())) {
                str = C32343x.m95388F("my.package.page.cards.benefit.card", new Object[0]);
            } else {
                str = C32343x.m95388F("my.package.page.cards.free.card", new Object[0]);
            }
            creditCardWidgetBannerView.setInfoData(new C18917a(0, str2, b, "", false, (String) null, false, false, false, C32343x.m95388F("my.package.page.cards.card.type", new Object[0]), str, (Integer) null, 2496, (DefaultConstructorMarker) null));
            y0Var.mo3946b().setOnClickListener(new C16651d(this, bVar2));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16647c(C16648a aVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(aVar, "onCardBannerClick");
        this.f46846f = aVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C16649b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object obj = mo6026f().get(i);
        C41536l.m120488h(obj, "currentList[position]");
        bVar.mo43790i((C16885b) obj);
    }

    /* renamed from: l */
    public C16649b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C12781y0 d = C12781y0.m48524d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C16649b(d, this.f46846f);
    }
}
