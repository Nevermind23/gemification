package rv0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import bv0.C31203c;
import bv0.C31206f;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import ev0.C31820c0;
import ev0.C31833n;
import ev0.C31834o;
import ev0.C31845z;
import g91.C32343x;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.listsection.ListSectionView;
import p341ge.bog.mobilebank.openbanking.presentation.products.BankProductUiModel;
import p341ge.bog.mobilebank.openbanking.presentation.products.BankWithProductsUiModel;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: rv0.p */
public final class C38365p extends RecyclerView.C1736h {

    /* renamed from: i */
    public static final C38366a f91948i = new C38366a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private List f91949d = C41341q.m119907j();

    /* renamed from: e */
    private C43079p f91950e;

    /* renamed from: f */
    private View.OnClickListener f91951f;

    /* renamed from: g */
    private C43075l f91952g;

    /* renamed from: h */
    private C43075l f91953h;

    /* renamed from: rv0.p$a */
    public static final class C38366a {
        private C38366a() {
        }

        public /* synthetic */ C38366a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: rv0.p$b */
    public final class C38367b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C31834o f91954d;

        /* renamed from: e */
        final /* synthetic */ C38365p f91955e;

        /* renamed from: rv0.p$b$a */
        public static final class C38368a extends ListSectionView.C13370a {

            /* renamed from: b */
            final /* synthetic */ BankWithProductsUiModel f91956b;

            /* renamed from: c */
            final /* synthetic */ C38365p f91957c;

            C38368a(BankWithProductsUiModel bankWithProductsUiModel, C38365p pVar) {
                this.f91956b = bankWithProductsUiModel;
                this.f91957c = pVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: g */
            public static final void m112675g(C38365p pVar, BankWithProductsUiModel bankWithProductsUiModel, View view) {
                C41536l.m120489i(pVar, "this$0");
                C41536l.m120489i(bankWithProductsUiModel, "$item");
                C43075l h = pVar.mo91889h();
                if (h != null) {
                    h.invoke(bankWithProductsUiModel);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: h */
            public static final void m112676h(C38365p pVar, BankWithProductsUiModel bankWithProductsUiModel, BankProductUiModel bankProductUiModel, View view) {
                C41536l.m120489i(pVar, "this$0");
                C41536l.m120489i(bankWithProductsUiModel, "$item");
                C41536l.m120489i(bankProductUiModel, "$product");
                C43079p f = pVar.mo91887f();
                if (f != null) {
                    f.invoke(bankWithProductsUiModel, bankProductUiModel);
                }
            }

            /* renamed from: b */
            public int mo36127b() {
                if (this.f91956b.mo79295h()) {
                    return 1;
                }
                return this.f91956b.mo79294g().size();
            }

            /* renamed from: c */
            public View mo36128c(int i, ViewGroup viewGroup) {
                C41536l.m120489i(viewGroup, "parent");
                LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
                if (this.f91956b.mo79295h()) {
                    C31820c0 d = C31820c0.m94067d(from, viewGroup, false);
                    C38365p pVar = this.f91957c;
                    BankWithProductsUiModel bankWithProductsUiModel = this.f91956b;
                    d.f78471f.setTitleText(C32343x.m95388F("open.bank.expired.desc", new Object[0]));
                    d.f78470e.setOnClickListener(new C38371r(pVar, bankWithProductsUiModel));
                    LinearLayout c = d.mo3946b();
                    C41536l.m120488h(c, "{\n                      …oot\n                    }");
                    return c;
                }
                BankProductUiModel bankProductUiModel = (BankProductUiModel) this.f91956b.mo79294g().get(i);
                C31845z d2 = C31845z.m94170d(from, viewGroup, false);
                C38365p pVar2 = this.f91957c;
                BankWithProductsUiModel bankWithProductsUiModel2 = this.f91956b;
                d2.f78553e.setTitle(viewGroup.getContext().getString(bankProductUiModel.mo79274a()));
                d2.f78553e.setText(bankProductUiModel.mo79278e());
                d2.mo3946b().setOnClickListener(new C38372s(pVar2, bankWithProductsUiModel2, bankProductUiModel));
                ListItem c2 = d2.mo3946b();
                C41536l.m120488h(c2, "{\n                      …oot\n                    }");
                return c2;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38367b(C38365p pVar, C31834o oVar) {
            super(oVar.mo3946b());
            C41536l.m120489i(oVar, "binding");
            this.f91955e = pVar;
            this.f91954d = oVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m112671j(C38365p pVar, BankWithProductsUiModel bankWithProductsUiModel, View view) {
            C41536l.m120489i(pVar, "this$0");
            C41536l.m120489i(bankWithProductsUiModel, "$item");
            C43075l g = pVar.mo91888g();
            if (g != null) {
                g.invoke(bankWithProductsUiModel);
            }
        }

        /* renamed from: i */
        public final void mo91896i(BankWithProductsUiModel bankWithProductsUiModel) {
            int i;
            int i2;
            int i3;
            C41536l.m120489i(bankWithProductsUiModel, "item");
            ListSectionView c = this.f91954d.mo3946b();
            C38365p pVar = this.f91955e;
            c.setTitle(bankWithProductsUiModel.mo79291e());
            Integer d = bankWithProductsUiModel.mo79289d();
            if (d != null) {
                i = d.intValue();
            } else {
                i = 0;
            }
            c.setListSectionImage(i);
            Context context = this.itemView.getContext();
            if (bankWithProductsUiModel.mo79295h()) {
                i2 = C31206f.open_bank_product_label_expired;
            } else {
                i2 = C31206f.open_bank_product_label_info_updated;
            }
            String string = context.getString(i2);
            String i4 = bankWithProductsUiModel.mo79297i();
            c.setSubTitle(string + " " + i4);
            if (bankWithProductsUiModel.mo79295h()) {
                i3 = C31203c.f77503b;
            } else {
                i3 = C31203c.f77505d;
            }
            c.setButtonIcon(i3);
            c.setOnButtonClickListener(new C38370q(pVar, bankWithProductsUiModel));
            c.setAdapter(new C38368a(bankWithProductsUiModel, pVar));
        }
    }

    /* renamed from: rv0.p$c */
    public static final class C38369c extends RecyclerView.C1734f0 {
        C38369c(Button button) {
            super(button);
        }
    }

    /* renamed from: f */
    public final C43079p mo91887f() {
        return this.f91950e;
    }

    /* renamed from: g */
    public final C43075l mo91888g() {
        return this.f91952g;
    }

    public int getItemCount() {
        return this.f91949d.size() + 1;
    }

    public int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    /* renamed from: h */
    public final C43075l mo91889h() {
        return this.f91953h;
    }

    /* renamed from: i */
    public final List mo91890i() {
        return this.f91949d;
    }

    /* renamed from: j */
    public final void mo91891j(View.OnClickListener onClickListener) {
        this.f91951f = onClickListener;
    }

    /* renamed from: k */
    public final void mo91892k(C43079p pVar) {
        this.f91950e = pVar;
    }

    /* renamed from: l */
    public final void mo91893l(C43075l lVar) {
        this.f91952g = lVar;
    }

    /* renamed from: m */
    public final void mo91894m(C43075l lVar) {
        this.f91953h = lVar;
    }

    /* renamed from: n */
    public final void mo91895n(List list) {
        C41536l.m120489i(list, C11755a.C11756a.f34100b);
        this.f91949d = list;
        notifyDataSetChanged();
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        if (f0Var instanceof C38367b) {
            ((C38367b) f0Var).mo91896i((BankWithProductsUiModel) this.f91949d.get(i - 1));
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            C31833n d = C31833n.m94122d(from, viewGroup, false);
            d.mo3946b().setOnClickListener(this.f91951f);
            C41536l.m120488h(d, "inflate(\n               …ck)\n                    }");
            return new C38369c(d.mo3946b());
        }
        C31834o d2 = C31834o.m94126d(from, viewGroup, false);
        C41536l.m120488h(d2, "inflate(\n               …lse\n                    )");
        return new C38367b(this, d2);
    }
}
