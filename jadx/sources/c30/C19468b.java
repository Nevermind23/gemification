package c30;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1796h;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import d30.C19892c;
import d30.C19897e;
import d30.C19898f;
import d30.C19899g;
import e30.C20134d;
import e30.C20136f;
import e30.C20138h;
import e30.C20140j;
import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.model.account.AccountLov;
import p90.C27250a6;
import p90.C27260b6;
import p90.C27270c6;
import p90.C27484z5;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: c30.b */
public final class C19468b extends RecyclerView.C1736h {

    /* renamed from: j */
    public static final C19469a f53712j = new C19469a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C43064a f53713d;

    /* renamed from: e */
    private C43075l f53714e;

    /* renamed from: f */
    private C43075l f53715f;

    /* renamed from: g */
    private C43075l f53716g;

    /* renamed from: h */
    private C43075l f53717h;

    /* renamed from: i */
    private List f53718i = C41341q.m119910m(new C19892c.C19895c(new C19899g(C19898f.AMOUNT_INPUT, new BigDecimal(Utils.DOUBLE_EPSILON), (AccountLov) null, "")), new C19892c.C19894b(new C19897e((String) null, 0, new BigDecimal(Utils.DOUBLE_EPSILON), 1, (DefaultConstructorMarker) null)), new C19892c.C19895c(new C19899g(C19898f.ACCOUNT_COMMENT_INPUT, new BigDecimal(Utils.DOUBLE_EPSILON), (AccountLov) null, "")));

    /* renamed from: c30.b$a */
    public static final class C19469a {
        private C19469a() {
        }

        public /* synthetic */ C19469a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c30.b$b */
    public /* synthetic */ class C19470b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53719a;

        static {
            int[] iArr = new int[C19898f.values().length];
            try {
                iArr[C19898f.AMOUNT_INPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f53719a = iArr;
        }
    }

    /* renamed from: f */
    public final void mo47696f(C43075l lVar) {
        C41536l.m120489i(lVar, "onCommentClicked");
        this.f53716g = lVar;
    }

    /* renamed from: g */
    public final void mo47697g(C43064a aVar) {
        C41536l.m120489i(aVar, "onNewTransfereeClicked");
        this.f53713d = aVar;
    }

    public int getItemCount() {
        return this.f53718i.size();
    }

    public int getItemViewType(int i) {
        C19892c cVar = (C19892c) this.f53718i.get(i);
        if (cVar instanceof C19892c.C19895c) {
            if (C19470b.f53719a[((C19892c.C19895c) cVar).mo48251b().mo48266d().ordinal()] == 1) {
                return 0;
            }
            return 3;
        } else if (cVar instanceof C19892c.C19893a) {
            return 2;
        } else {
            if (cVar instanceof C19892c.C19894b) {
                return 1;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: h */
    public final void mo47698h(C43075l lVar) {
        C41536l.m120489i(lVar, "onReceiverAccountClicked");
        this.f53715f = lVar;
    }

    /* renamed from: i */
    public final void mo47699i(C43075l lVar) {
        C41536l.m120489i(lVar, "onRemoveReceiverClicked");
        this.f53717h = lVar;
    }

    /* renamed from: j */
    public final void mo47700j(C43075l lVar) {
        C41536l.m120489i(lVar, "onRequestedAmountClicked");
        this.f53714e = lVar;
    }

    /* renamed from: k */
    public final void mo47701k(List list) {
        C41536l.m120489i(list, "newList");
        C1796h.C1801e b = C1796h.m6928b(new C19471c(this.f53718i, list));
        C41536l.m120488h(b, "calculateDiff(diffCallback)");
        this.f53718i = list;
        b.mo5975c(this);
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        if (f0Var instanceof C20138h) {
            Object obj = this.f53718i.get(i);
            C41536l.m120487g(obj, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.model.MoneyRequestSummary.WizardFields");
            ((C20138h) f0Var).mo48570i((C19892c.C19895c) obj);
        } else if (f0Var instanceof C20140j) {
            Object obj2 = this.f53718i.get(i);
            C41536l.m120487g(obj2, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.model.MoneyRequestSummary.RequestInfoFields");
            ((C20140j) f0Var).mo48573i((C19892c.C19894b) obj2);
        } else if (f0Var instanceof C20136f) {
            Object obj3 = this.f53718i.get(i);
            C41536l.m120487g(obj3, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.model.MoneyRequestSummary.AddresseeDetails");
            ((C20136f) f0Var).mo48567i((C19892c.C19893a) obj3);
        } else if (f0Var instanceof C20134d) {
            Object obj4 = this.f53718i.get(i);
            C41536l.m120487g(obj4, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.model.MoneyRequestSummary.WizardFields");
            ((C20134d) f0Var).mo48563k((C19892c.C19895c) obj4);
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == 0) {
            C27250a6 d = C27250a6.m84300d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …lse\n                    )");
            C20138h hVar = new C20138h(d);
            hVar.mo48571k(this.f53714e);
            return hVar;
        } else if (i == 1) {
            C27484z5 d2 = C27484z5.m85243d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d2, "inflate(\n               …lse\n                    )");
            C20140j jVar = new C20140j(d2);
            jVar.mo48574k(this.f53713d);
            return jVar;
        } else if (i != 3) {
            C27270c6 d3 = C27270c6.m84381d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d3, "inflate(\n               …lse\n                    )");
            C20136f fVar = new C20136f(d3);
            fVar.mo48568k(this.f53717h);
            return fVar;
        } else {
            C27260b6 d4 = C27260b6.m84340d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d4, "inflate(\n               …lse\n                    )");
            C20134d dVar = new C20134d(d4);
            dVar.mo48565p(this.f53715f);
            dVar.mo48564o(this.f53716g);
            return dVar;
        }
    }
}
