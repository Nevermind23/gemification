package p621tm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import g91.C32303f;
import g91.C32343x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardFeeUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.OrderCardFeesAdapterUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.PackageCommissionUiModel;
import p481jm.C16244w;
import p481jm.C16247z;
import p615tg.C17963d;

/* renamed from: tm.j */
public final class C18008j extends C1819o {

    /* renamed from: tm.j$a */
    public static final class C18009a extends C18011c {

        /* renamed from: d */
        private final C16244w f51228d;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C18009a(p481jm.C16244w r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                androidx.constraintlayout.widget.ConstraintLayout r0 = r3.mo3946b()
                java.lang.String r1 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                r1 = 0
                r2.<init>(r0, r1)
                r2.f51228d = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p621tm.C18008j.C18009a.<init>(jm.w):void");
        }

        /* renamed from: i */
        public void mo45700h(CardFeeUiModel cardFeeUiModel) {
            boolean z;
            String str;
            C41536l.m120489i(cardFeeUiModel, "fee");
            this.f51228d.f46001f.setText(cardFeeUiModel.mo39404d());
            AppCompatTextView appCompatTextView = this.f51228d.f46000e;
            if (cardFeeUiModel.mo39402a() == Utils.DOUBLE_EPSILON) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = C32343x.m95388F("text.card.applications.fee.free", new Object[0]);
            } else {
                str = C32343x.m95410Q(cardFeeUiModel.mo39402a(), cardFeeUiModel.mo39403b(), false, 2, (Object) null);
            }
            appCompatTextView.setText(str);
        }
    }

    /* renamed from: tm.j$b */
    public static final class C18010b extends C18011c {

        /* renamed from: d */
        private final C16247z f51229d;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C18010b(p481jm.C16247z r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                android.widget.FrameLayout r0 = r3.mo3946b()
                java.lang.String r1 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                r1 = 0
                r2.<init>(r0, r1)
                r2.f51229d = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p621tm.C18008j.C18010b.<init>(jm.z):void");
        }

        /* renamed from: i */
        public void mo45700h(PackageCommissionUiModel packageCommissionUiModel) {
            String str;
            C41536l.m120489i(packageCommissionUiModel, "fee");
            this.f51229d.f46016e.setTitleText(C32343x.m95388F("text.applications.debitcard.virtual.card.fee.label", new Object[0]));
            InlineFeedback inlineFeedback = this.f51229d.f46016e;
            if (packageCommissionUiModel.mo39799a()) {
                str = "text.applications.debitcard.virtual.card.fee";
            } else {
                str = "text.applications.debitcard.package.registration.notification";
            }
            String o = C32303f.m95204o(packageCommissionUiModel.mo39800b());
            C41536l.m120488h(o, "getFormattedNumber(fee.packageFeeAmount)");
            String h = C32303f.m95197h(packageCommissionUiModel.mo39801d());
            C41536l.m120488h(h, "getCcyLogo(fee.packageFeeCcy)");
            inlineFeedback.setCaptionText(C32343x.m95388F(str, o, h));
        }
    }

    /* renamed from: tm.j$c */
    public static abstract class C18011c extends RecyclerView.C1734f0 {
        public /* synthetic */ C18011c(View view, DefaultConstructorMarker defaultConstructorMarker) {
            this(view);
        }

        /* renamed from: h */
        public abstract void mo45700h(OrderCardFeesAdapterUiModel orderCardFeesAdapterUiModel);

        private C18011c(View view) {
            super(view);
        }
    }

    /* renamed from: tm.j$d */
    private enum C18012d {
        PACKAGE_FEE_WARNING,
        CARD_FEE
    }

    public C18008j() {
        super(C17963d.f51158a.mo45633d());
    }

    public int getItemViewType(int i) {
        OrderCardFeesAdapterUiModel orderCardFeesAdapterUiModel = (OrderCardFeesAdapterUiModel) mo6027g(i);
        if (orderCardFeesAdapterUiModel instanceof PackageCommissionUiModel) {
            return C18012d.PACKAGE_FEE_WARNING.ordinal();
        }
        if (orderCardFeesAdapterUiModel instanceof CardFeeUiModel) {
            return C18012d.CARD_FEE.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: k */
    public void onBindViewHolder(C18011c cVar, int i) {
        C41536l.m120489i(cVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        cVar.mo45700h((OrderCardFeesAdapterUiModel) g);
    }

    /* renamed from: l */
    public C18011c onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == C18012d.PACKAGE_FEE_WARNING.ordinal()) {
            C16247z d = C16247z.m57923d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …lse\n                    )");
            return new C18010b(d);
        } else if (i == C18012d.CARD_FEE.ordinal()) {
            C16244w d2 = C16244w.m57912d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d2, "inflate(\n               …lse\n                    )");
            return new C18009a(d2);
        } else {
            throw new IllegalStateException("Unknown ViewType");
        }
    }
}
