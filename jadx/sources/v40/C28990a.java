package v40;

import android.app.Activity;
import android.view.ViewGroup;
import f50.C20427a;
import f50.C20432f;
import f50.C20437g;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l81.C37106c;
import ue1.C43075l;

/* renamed from: v40.a */
public final class C28990a extends C37106c {

    /* renamed from: f */
    public static final C28991a f73931f = new C28991a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final Activity f73932d;

    /* renamed from: e */
    private List f73933e = new ArrayList();

    /* renamed from: v40.a$a */
    public static final class C28991a {
        private C28991a() {
        }

        public /* synthetic */ C28991a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C28990a(Activity activity) {
        C41536l.m120489i(activity, "activity");
        this.f73932d = activity;
    }

    public int getItemCount() {
        return this.f73933e.size();
    }

    public int getItemViewType(int i) {
        C20432f.C20434b bVar = (C20432f.C20434b) this.f73933e.get(i);
        if (bVar instanceof C20432f.C20434b.C20436b) {
            return 1;
        }
        if (bVar instanceof C20432f.C20434b.C20435a) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: j */
    public void onBindViewHolder(C20427a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        if (aVar instanceof C20432f) {
            Object obj = this.f73933e.get(i);
            C41536l.m120487g(obj, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.presentation.pfm.transactions.TransactionViewHolder.OperationUiModel.OperationDetailsUiModel");
            C20432f.m66575q((C20432f) aVar, (C20432f.C20434b.C20436b) obj, (C43075l) null, (Boolean) null, (C43075l) null, 14, (Object) null);
        } else if (aVar instanceof C20437g) {
            Object obj2 = this.f73933e.get(i);
            C41536l.m120487g(obj2, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.presentation.pfm.transactions.TransactionViewHolder.OperationUiModel.OperationDateHeaderUiModel");
            ((C20437g) aVar).mo48941i((C20432f.C20434b.C20435a) obj2);
        }
    }

    /* renamed from: k */
    public C20427a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i != 1) {
            return C20437g.f55416h.mo48942a(viewGroup);
        }
        return C20432f.C20433a.m66586b(C20432f.f55387t, viewGroup, this.f73932d, "pfm_calendar", false, 8, (Object) null);
    }

    /* renamed from: l */
    public final void mo68830l(List list) {
        C41536l.m120489i(list, "operations");
        this.f73933e.clear();
        this.f73933e.addAll(list);
        notifyDataSetChanged();
    }
}
