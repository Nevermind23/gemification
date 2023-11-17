package p341ge.bog.mobilebank.hubmenu.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import bl0.C19395a;
import com.salesforce.marketingcloud.UrlHandler;
import he1.C41217g;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ok0.C27027c;
import p341ge.bog.mobilebank.hubmenu.presentation.view.BankingGroupView$actionHubGridManager$2;
import pk0.C27551a;
import ue1.C43064a;
import ue1.C43075l;
import zk0.C30320b;

/* renamed from: ge.bog.mobilebank.hubmenu.presentation.view.BankingGroupView */
public final class BankingGroupView extends RecyclerView implements C30320b.C30321a {

    /* renamed from: U0 */
    public static final C24437a f63041U0 = new C24437a((DefaultConstructorMarker) null);

    /* renamed from: P0 */
    private final C41217g f63042P0;

    /* renamed from: Q0 */
    private final C41217g f63043Q0;

    /* renamed from: R0 */
    private final C41217g f63044R0;

    /* renamed from: S0 */
    private final C41217g f63045S0;

    /* renamed from: T0 */
    private C43075l f63046T0;

    /* renamed from: ge.bog.mobilebank.hubmenu.presentation.view.BankingGroupView$a */
    public static final class C24437a {
        private C24437a() {
        }

        public /* synthetic */ C24437a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.hubmenu.presentation.view.BankingGroupView$b */
    static final class C24438b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BankingGroupView f63047d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24438b(BankingGroupView bankingGroupView) {
            super(0);
            this.f63047d = bankingGroupView;
        }

        /* renamed from: b */
        public final C19395a invoke() {
            return new C19395a(this.f63047d.getActionHubsSpacing());
        }
    }

    /* renamed from: ge.bog.mobilebank.hubmenu.presentation.view.BankingGroupView$c */
    static final class C24439c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BankingGroupView f63048d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24439c(BankingGroupView bankingGroupView) {
            super(0);
            this.f63048d = bankingGroupView;
        }

        /* renamed from: b */
        public final Integer invoke() {
            return Integer.valueOf(this.f63048d.getResources().getDimensionPixelSize(C27027c.f67858b));
        }
    }

    /* renamed from: ge.bog.mobilebank.hubmenu.presentation.view.BankingGroupView$d */
    static final class C24440d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BankingGroupView f63049d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24440d(BankingGroupView bankingGroupView) {
            super(0);
            this.f63049d = bankingGroupView;
        }

        /* renamed from: b */
        public final C30320b invoke() {
            C30320b bVar = new C30320b();
            bVar.mo70644o(this.f63049d);
            return bVar;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BankingGroupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: R1 */
    private final void m78487R1() {
        setLayoutManager(getActionHubGridManager());
        setItemAnimator((RecyclerView.C1742m) null);
        mo5351j(getActionHubsSpaceDecoration());
        setAdapter(getBankGroupingAdapter());
    }

    private final BankingGroupView$actionHubGridManager$2.C244411 getActionHubGridManager() {
        return (BankingGroupView$actionHubGridManager$2.C244411) this.f63045S0.getValue();
    }

    private final C19395a getActionHubsSpaceDecoration() {
        return (C19395a) this.f63044R0.getValue();
    }

    /* access modifiers changed from: private */
    public final int getActionHubsSpacing() {
        return ((Number) this.f63043Q0.getValue()).intValue();
    }

    private final C30320b getBankGroupingAdapter() {
        return (C30320b) this.f63042P0.getValue();
    }

    /* renamed from: Q1 */
    public final void mo62207Q1(List list) {
        C41536l.m120489i(list, "bankingProducts");
        getBankGroupingAdapter().mo6029i(list);
    }

    /* renamed from: S1 */
    public final void mo62208S1(C43075l lVar) {
        C41536l.m120489i(lVar, UrlHandler.ACTION);
        this.f63046T0 = lVar;
    }

    /* renamed from: c */
    public void mo62209c(C27551a aVar) {
        C41536l.m120489i(aVar, "hubItem");
        C43075l lVar = this.f63046T0;
        if (lVar != null) {
            lVar.invoke(aVar);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BankingGroupView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BankingGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        this.f63042P0 = C41219i.m119470b(new C24440d(this));
        this.f63043Q0 = C41219i.m119470b(new C24439c(this));
        this.f63044R0 = C41219i.m119470b(new C24438b(this));
        this.f63045S0 = C41219i.m119470b(new BankingGroupView$actionHubGridManager$2(context));
        m78487R1();
    }
}
