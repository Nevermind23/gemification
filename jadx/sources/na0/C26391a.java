package na0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import da0.C19949c;
import g91.C32343x;
import h91.C36162a;
import ha0.C24945v;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ob0.C26920a;
import p341ge.bog.designsystem.components.depositcard.DepositCardView;
import p341ge.bog.mobilebank.depositapplication.presentation.deposittypes.model.DepositFeatureUiModel;
import p341ge.bog.mobilebank.depositapplication.presentation.deposittypes.model.DepositTypeDetailsUiModel;
import p642vh.C18338b0;
import p697zh.C19025c;

/* renamed from: na0.a */
public final class C26391a extends RecyclerView.C1736h {

    /* renamed from: d */
    private C18338b0 f66882d = C18338b0.C18346e.f51796d;

    /* renamed from: e */
    private List f66883e = C41341q.m119907j();

    /* renamed from: na0.a$a */
    public static final class C26392a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C24945v f66884d;

        /* renamed from: e */
        private final int f66885e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26392a(C24945v vVar) {
            super(vVar.mo3946b());
            C41536l.m120489i(vVar, "binding");
            this.f66884d = vVar;
            this.f66885e = vVar.mo3946b().getResources().getDimensionPixelSize(C19949c.f54497b);
        }

        /* renamed from: i */
        private final C19025c m82485i(boolean z, String str) {
            C19025c.C19026a aVar;
            ViewGroup.MarginLayoutParams c0;
            Context context = this.f66884d.mo3946b().getContext();
            C41536l.m120488h(context, "binding.root.context");
            C19025c cVar = new C19025c(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            cVar.setText(str);
            if (z) {
                aVar = C19025c.C19026a.POSITIVE;
            } else {
                aVar = C19025c.C19026a.NEGATIVE;
            }
            cVar.setType(aVar);
            if (this.f66884d.f64258f.getChildCount() > 0 && (c0 = C32343x.m95437c0(cVar)) != null) {
                c0.setMargins(0, this.f66885e, 0, 0);
            }
            return cVar;
        }

        /* renamed from: h */
        public final void mo65628h(DepositTypeDetailsUiModel depositTypeDetailsUiModel) {
            String str;
            C41536l.m120489i(depositTypeDetailsUiModel, "deposit");
            DepositCardView depositCardView = this.f66884d.f64257e;
            depositCardView.setIcon(C36162a.m107561b(depositTypeDetailsUiModel.mo57218e().name()));
            String f = depositTypeDetailsUiModel.mo57220f();
            if (f != null) {
                str = C32343x.m95388F(f, new Object[0]);
            } else {
                str = null;
            }
            depositCardView.setTitle(str);
            depositCardView.setMinAmountTitle(C32343x.m95388F("applications.deposits.main.page.deposit.card.min.amount", new Object[0]));
            depositCardView.setMinAmountValue(depositTypeDetailsUiModel.mo57224i());
            C26920a aVar = C26920a.f67675a;
            Context context = this.itemView.getContext();
            C41536l.m120488h(context, "itemView.context");
            depositCardView.setInterestRateMessage(aVar.mo66214b(context, C32343x.m95388F(depositTypeDetailsUiModel.mo57225j(), new Object[0])));
            this.f66884d.f64258f.removeAllViews();
            for (DepositFeatureUiModel a : depositTypeDetailsUiModel.mo57214a()) {
                this.f66884d.f64258f.addView(m82485i(true, C32343x.m95388F(a.mo57204a(), new Object[0])));
            }
            for (DepositFeatureUiModel a2 : depositTypeDetailsUiModel.mo57221g()) {
                this.f66884d.f64258f.addView(m82485i(false, C32343x.m95388F(a2.mo57204a(), new Object[0])));
            }
        }
    }

    /* renamed from: f */
    public void onBindViewHolder(C26392a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        aVar.mo65628h((DepositTypeDetailsUiModel) this.f66883e.get(this.f66882d.mo46117b().mo46119a(this.f66883e.size(), i)));
    }

    /* renamed from: g */
    public C26392a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C24945v d = C24945v.m79761d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C26392a(d);
    }

    public int getItemCount() {
        return this.f66882d.mo46117b().mo46120b(this.f66883e.size());
    }

    /* renamed from: h */
    public final void mo65626h(C18338b0 b0Var) {
        C41536l.m120489i(b0Var, "<set-?>");
        this.f66882d = b0Var;
    }

    /* renamed from: i */
    public final void mo65627i(List list) {
        C41536l.m120489i(list, "deposits");
        this.f66883e = list;
        notifyDataSetChanged();
    }
}
