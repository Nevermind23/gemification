package p846nz;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32289b0;
import he1.C41238w;
import i10.C25099b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferTypeUiModel;
import p615tg.C17963d;
import p90.C27271c7;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: nz.a */
public final class C26640a extends C1819o {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C43075l f67263f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f67264g;

    /* renamed from: nz.a$a */
    public final class C26641a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C27271c7 f67265d;

        /* renamed from: e */
        final /* synthetic */ C26640a f67266e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26641a(C26640a aVar, C27271c7 c7Var) {
            super(c7Var.mo3946b());
            C41536l.m120489i(c7Var, "binding");
            this.f67266e = aVar;
            this.f67265d = c7Var;
        }

        /* renamed from: h */
        public final void mo65896h(MoneyTransferTypeUiModel moneyTransferTypeUiModel) {
            C41536l.m120489i(moneyTransferTypeUiModel, "transfer");
            C32289b0.m95097i(this.f67265d.f68490e, moneyTransferTypeUiModel.mo53144b());
            this.f67265d.f68492g.setText(moneyTransferTypeUiModel.mo53149f());
            if (!this.f67266e.f67264g || C41536l.m120484d(moneyTransferTypeUiModel.mo53145d(), "ZOLOTAYA_KORONA") || C41536l.m120484d(moneyTransferTypeUiModel.mo53145d(), "WESTERN_UNION")) {
                this.f67265d.f68491f.setAlpha(1.0f);
                this.f67265d.f68492g.setAlpha(1.0f);
                return;
            }
            this.f67265d.f68491f.setAlpha(0.6f);
            this.f67265d.f68492g.setAlpha(0.6f);
        }
    }

    /* renamed from: nz.a$b */
    static final class C26642b extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C26640a f67267d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26642b(C26640a aVar) {
            super(2);
            this.f67267d = aVar;
        }

        /* renamed from: a */
        public final void mo65897a(int i, int i2) {
            C43075l k;
            MoneyTransferTypeUiModel l = C26640a.m83113l(this.f67267d, i);
            if ((!this.f67267d.f67264g || C41536l.m120484d(l.mo53145d(), "ZOLOTAYA_KORONA") || C41536l.m120484d(l.mo53145d(), "WESTERN_UNION")) && (k = this.f67267d.f67263f) != null) {
                MoneyTransferTypeUiModel l2 = C26640a.m83113l(this.f67267d, i);
                C41536l.m120488h(l2, "getItem(position)");
                k.invoke(l2);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo65897a(((Number) obj).intValue(), ((Number) obj2).intValue());
            return C41238w.f97225a;
        }
    }

    public C26640a() {
        super(C17963d.f51158a.mo45633d());
    }

    /* renamed from: l */
    public static final /* synthetic */ MoneyTransferTypeUiModel m83113l(C26640a aVar, int i) {
        return (MoneyTransferTypeUiModel) aVar.mo6027g(i);
    }

    /* renamed from: n */
    public void onBindViewHolder(C26641a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo65896h((MoneyTransferTypeUiModel) g);
    }

    /* renamed from: o */
    public C26641a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C27271c7 d = C27271c7.m84385d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return (C26641a) C25099b.m80060b(new C26641a(this, d), new C26642b(this));
    }

    /* renamed from: p */
    public final void mo65894p(C43075l lVar) {
        C41536l.m120489i(lVar, "listener");
        this.f67263f = lVar;
    }

    /* renamed from: q */
    public final void mo65895q(boolean z) {
        if (this.f67264g != z) {
            this.f67264g = z;
            notifyDataSetChanged();
        }
    }
}
