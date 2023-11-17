package p341ge.bog.mobilebank.galtandtaggart.presentation.transactions.detail;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.activity.ComponentActivity;
import androidx.core.content.C0767a;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import ie0.C25183c;
import ie0.C25190j;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.designsystem.components.pagestate.PageStateType;
import p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTInstrument;
import p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction;
import p341ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity;
import p420fh.C12902d;
import p420fh.C12910e;
import qg0.C27795b;
import qg0.C27796c;
import qg0.C27797d;
import ue0.C28731i0;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.detail.GTTransactionDetailActivity */
public final class GTTransactionDetailActivity extends C23961b {

    /* renamed from: J */
    public static final C23951a f62199J = new C23951a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private C28731i0 f62200G;

    /* renamed from: H */
    private final C41217g f62201H = new C1617p0(C41520a0.m120436b(GTTransactionDetailViewModel$ViewModel.class), new C23956f(this), new C23955e(this), new C23957g((C43064a) null, this));

    /* renamed from: I */
    private GTTransaction f62202I;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.detail.GTTransactionDetailActivity$a */
    public static final class C23951a {
        private C23951a() {
        }

        public /* synthetic */ C23951a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo60918a(Context context, GTTransaction gTTransaction) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(gTTransaction, "transaction");
            Intent intent = new Intent(context, GTTransactionDetailActivity.class);
            intent.putExtra("TRANSACTION", gTTransaction);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.detail.GTTransactionDetailActivity$b */
    public /* synthetic */ class C23952b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f62203a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f62204b;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|35|36|(2:37|38)|39|41) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|35|36|(2:37|38)|39|41) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|41) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0076 */
        static {
            /*
                tg0.e[] r0 = tg0.C28383e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                tg0.e r2 = tg0.C28383e.f71923f     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                tg0.e r3 = tg0.C28383e.PARTIAL_FILL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                tg0.e r4 = tg0.C28383e.f71928k     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                tg0.e r5 = tg0.C28383e.FILL     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                r5 = 5
                tg0.e r6 = tg0.C28383e.CANCELED     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                r6 = 6
                tg0.e r7 = tg0.C28383e.PENDING_CANCELED     // Catch:{ NoSuchFieldError -> 0x003d }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r0[r7] = r6     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f62203a = r0
                tg0.g[] r0 = tg0.C28387g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                tg0.g r7 = tg0.C28387g.DIV     // Catch:{ NoSuchFieldError -> 0x004e }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r0[r7] = r1     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                tg0.g r1 = tg0.C28387g.DIVTAX     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                tg0.g r1 = tg0.C28387g.DIVNRA     // Catch:{ NoSuchFieldError -> 0x005e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                tg0.g r1 = tg0.C28387g.CSR     // Catch:{ NoSuchFieldError -> 0x0066 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0066 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0066 }
            L_0x0066:
                tg0.g r1 = tg0.C28387g.CSD     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                tg0.g r1 = tg0.C28387g.ORDER_1_B     // Catch:{ NoSuchFieldError -> 0x0076 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0076 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0076 }
            L_0x0076:
                tg0.g r1 = tg0.C28387g.ORDER_1_S     // Catch:{ NoSuchFieldError -> 0x007f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007f }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007f }
            L_0x007f:
                f62204b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.transactions.detail.GTTransactionDetailActivity.C23952b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.detail.GTTransactionDetailActivity$c */
    static final class C23953c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTTransactionDetailActivity f62205d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23953c(GTTransactionDetailActivity gTTransactionDetailActivity) {
            super(1);
            this.f62205d = gTTransactionDetailActivity;
        }

        /* renamed from: a */
        public final void mo60919a(C31128a aVar) {
            this.f62205d.m77276L2().f73291e.setLoading(false);
            if (aVar instanceof C31128a.C31131c) {
                Button button = this.f62205d.m77276L2().f73291e;
                C41536l.m120488h(button, "binding.cancelOperationButton");
                C32343x.m95483r1(button, false, false, 2, (Object) null);
                GTTransactionDetailActivity gTTransactionDetailActivity = this.f62205d;
                String string = gTTransactionDetailActivity.getString(C25190j.gt_transaction_cancelled_success);
                C41536l.m120488h(string, "getString(R.string.gt_tr…action_cancelled_success)");
                C12910e.m48797o(gTTransactionDetailActivity, string, (C12902d.C12905b) null, false, 6, (Object) null);
                GTTransactionDetailActivity gTTransactionDetailActivity2 = this.f62205d;
                String string2 = gTTransactionDetailActivity2.getString(C25190j.gt_transaction_cancel_progress);
                C41536l.m120488h(string2, "getString(R.string.gt_transaction_cancel_progress)");
                gTTransactionDetailActivity2.m77283S2(string2, new PageStateType.Warning((Image) null, 0, (Color) null, (Color) null, 15, (DefaultConstructorMarker) null));
            } else if (aVar instanceof C31128a.C31130b) {
                this.f62205d.m77276L2().f73291e.setLoading(true);
            } else if (aVar instanceof C31128a.C31129a) {
                this.f62205d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60919a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.detail.GTTransactionDetailActivity$d */
    static final class C23954d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f62206a;

        C23954d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f62206a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f62206a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f62206a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.detail.GTTransactionDetailActivity$e */
    public static final class C23955e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f62207d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23955e(ComponentActivity componentActivity) {
            super(0);
            this.f62207d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f62207d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.detail.GTTransactionDetailActivity$f */
    public static final class C23956f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f62208d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23956f(ComponentActivity componentActivity) {
            super(0);
            this.f62208d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f62208d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.detail.GTTransactionDetailActivity$g */
    public static final class C23957g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62209d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f62210e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23957g(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f62209d = aVar;
            this.f62210e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f62209d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f62210e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: K2 */
    private final void m77275K2(int i, String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            LinearLayout linearLayout = m77276L2().f73292f;
            C41536l.m120488h(linearLayout, "binding.detailsContainer");
            if (linearLayout.getChildCount() != 0) {
                View view = new View(this);
                view.setBackgroundColor(C0767a.m2893c(this, C25183c.f64643e));
                view.setLayoutParams(new LinearLayout.LayoutParams(-1, C32343x.m95394I(1)));
                linearLayout.addView(view);
            }
            TwoLineTextItem twoLineTextItem = new TwoLineTextItem(this, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            twoLineTextItem.setSemibold(true);
            twoLineTextItem.setTitle(getString(i));
            twoLineTextItem.setText(str);
            twoLineTextItem.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            twoLineTextItem.setTextIsSelectable(true);
            twoLineTextItem.setMultilineText(true);
            linearLayout.addView(twoLineTextItem);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public final C28731i0 m77276L2() {
        C28731i0 i0Var = this.f62200G;
        C41536l.m120486f(i0Var);
        return i0Var;
    }

    /* renamed from: M2 */
    private final GTTransactionDetailViewModel$ViewModel m77277M2() {
        return (GTTransactionDetailViewModel$ViewModel) this.f62201H.getValue();
    }

    /* renamed from: N2 */
    private final void m77278N2() {
        m77277M2().mo60925iw().mo60922H9().mo4819k(this, new C23954d(new C23953c(this)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: O2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m77279O2() {
        /*
            r19 = this;
            r0 = r19
            ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction r1 = r0.f62202I
            java.lang.String r2 = "gtTransaction"
            r3 = 0
            if (r1 != 0) goto L_0x000d
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r1 = r3
        L_0x000d:
            tg0.g r1 = tg0.C28380b.m87049d(r1)
            java.util.Map r4 = qg0.C27804k.m85979a()
            java.lang.Object r4 = r4.get(r1)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x0029
            java.util.Map r4 = qg0.C27804k.m85979a()
            tg0.g r5 = tg0.C28387g.DEFAULT
            java.lang.Object r4 = r4.get(r5)
            java.util.List r4 = (java.util.List) r4
        L_0x0029:
            if (r4 == 0) goto L_0x005f
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = ie1.C41343r.m119925u(r4, r6)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L_0x003a:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x005f
            java.lang.Object r6 = r4.next()
            qg0.l r6 = (qg0.C27805l) r6
            int r7 = r6.mo67332b()
            ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction r8 = r0.f62202I
            if (r8 != 0) goto L_0x0052
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r8 = r3
        L_0x0052:
            java.lang.String r6 = r6.mo67333c(r8)
            r0.m77275K2(r7, r6)
            he1.w r6 = he1.C41238w.f97225a
            r5.add(r6)
            goto L_0x003a
        L_0x005f:
            int[] r4 = p341ge.bog.mobilebank.galtandtaggart.presentation.transactions.detail.GTTransactionDetailActivity.C23952b.f62204b
            int r5 = r1.ordinal()
            r5 = r4[r5]
            r6 = 6
            java.lang.String r7 = "binding.cancelOperationButton"
            java.lang.String r8 = "binding.headerTransactionInfoGroup"
            r9 = 1
            r10 = 2
            r11 = 0
            if (r5 == r6) goto L_0x01b3
            r6 = 7
            if (r5 == r6) goto L_0x01b3
            ue0.i0 r5 = r19.m77276L2()
            androidx.constraintlayout.widget.Group r5 = r5.f73299m
            kotlin.jvm.internal.C41536l.m120488h(r5, r8)
            g91.C32343x.m95483r1(r5, r9, r11, r10, r3)
            ue0.i0 r5 = r19.m77276L2()
            ge.bog.designsystem.components.buttons.Button r5 = r5.f73291e
            kotlin.jvm.internal.C41536l.m120488h(r5, r7)
            g91.C32343x.m95483r1(r5, r11, r11, r10, r3)
            int r1 = r1.ordinal()
            r1 = r4[r1]
            if (r1 == r9) goto L_0x0120
            if (r1 == r10) goto L_0x0120
            r4 = 3
            if (r1 == r4) goto L_0x0120
            r4 = 4
            if (r1 == r4) goto L_0x0114
            r4 = 5
            if (r1 == r4) goto L_0x0108
            ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction r1 = r0.f62202I
            if (r1 != 0) goto L_0x00a7
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r1 = r3
        L_0x00a7:
            ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTInstrument r1 = r1.mo60172t()
            if (r1 == 0) goto L_0x00b2
            java.lang.String r1 = r1.mo60129d()
            goto L_0x00b3
        L_0x00b2:
            r1 = r3
        L_0x00b3:
            if (r1 == 0) goto L_0x00b7
            r1 = r9
            goto L_0x00b8
        L_0x00b7:
            r1 = r11
        L_0x00b8:
            com.bumptech.glide.k r4 = com.bumptech.glide.C2379b.m9213w(r19)
            ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction r5 = r0.f62202I
            if (r5 != 0) goto L_0x00c4
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r5 = r3
        L_0x00c4:
            ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTInstrument r5 = r5.mo60172t()
            if (r5 == 0) goto L_0x00cf
            java.lang.String r5 = r5.mo60127a()
            goto L_0x00d0
        L_0x00cf:
            r5 = r3
        L_0x00d0:
            com.bumptech.glide.j r4 = r4.mo7757y(r5)
            int r5 = ie0.C25185e.icons_16_payment_transfer_transfer_treasury
            android.graphics.drawable.Drawable r5 = androidx.core.content.C0767a.m2895e(r0, r5)
            int r6 = g91.C32335t0.m95357b()
            android.graphics.drawable.Drawable r5 = g91.C32290b1.m95123m(r5, r6)
            c4.a r4 = r4.mo7223d0(r5)
            com.bumptech.glide.j r4 = (com.bumptech.glide.C2394j) r4
            c4.a r4 = r4.mo7222d()
            com.bumptech.glide.j r4 = (com.bumptech.glide.C2394j) r4
            ue0.i0 r5 = r19.m77276L2()
            androidx.appcompat.widget.AppCompatImageView r5 = r5.f73295i
            r4.mo7718L0(r5)
            if (r1 == 0) goto L_0x012b
            ue0.i0 r1 = r19.m77276L2()
            ge.bog.designsystem.components.layersandshadows.LayerView r1 = r1.f73296j
            qg0.a r4 = new qg0.a
            r4.<init>(r0)
            r1.setOnClickListener(r4)
            goto L_0x012b
        L_0x0108:
            ue0.i0 r1 = r19.m77276L2()
            androidx.appcompat.widget.AppCompatImageView r1 = r1.f73295i
            int r4 = ie0.C25185e.ic_gt_withdraw
            r1.setImageResource(r4)
            goto L_0x012b
        L_0x0114:
            ue0.i0 r1 = r19.m77276L2()
            androidx.appcompat.widget.AppCompatImageView r1 = r1.f73295i
            int r4 = ie0.C25185e.ic_gt_deposit
            r1.setImageResource(r4)
            goto L_0x012b
        L_0x0120:
            ue0.i0 r1 = r19.m77276L2()
            androidx.appcompat.widget.AppCompatImageView r1 = r1.f73295i
            int r4 = ie0.C25185e.ic_gt_corporate_action
            r1.setImageResource(r4)
        L_0x012b:
            ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction r1 = r0.f62202I
            if (r1 != 0) goto L_0x0133
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r1 = r3
        L_0x0133:
            java.lang.String r1 = r1.mo60152C()
            if (r1 == 0) goto L_0x0141
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0140
            goto L_0x0141
        L_0x0140:
            r9 = r11
        L_0x0141:
            if (r9 == 0) goto L_0x0152
            ue0.i0 r1 = r19.m77276L2()
            android.widget.TextView r1 = r1.f73297k
            java.lang.String r4 = "binding.headerTransactionAmount"
            kotlin.jvm.internal.C41536l.m120488h(r1, r4)
            g91.C32343x.m95483r1(r1, r11, r11, r10, r3)
            goto L_0x017c
        L_0x0152:
            ue0.i0 r1 = r19.m77276L2()
            android.widget.TextView r1 = r1.f73297k
            ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction r4 = r0.f62202I
            if (r4 != 0) goto L_0x0160
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r4 = r3
        L_0x0160:
            java.lang.String r4 = r4.mo60152C()
            if (r4 == 0) goto L_0x0178
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = " $"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            goto L_0x0179
        L_0x0178:
            r4 = r3
        L_0x0179:
            r1.setText(r4)
        L_0x017c:
            ue0.i0 r1 = r19.m77276L2()
            android.widget.TextView r1 = r1.f73298l
            ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction r4 = r0.f62202I
            if (r4 != 0) goto L_0x018a
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r4 = r3
        L_0x018a:
            java.lang.String r4 = tg0.C28380b.m87047b(r4, r11)
            r1.setText(r4)
            ue0.i0 r1 = r19.m77276L2()
            android.widget.TextView r1 = r1.f73300n
            ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction r4 = r0.f62202I
            if (r4 != 0) goto L_0x019f
            kotlin.jvm.internal.C41536l.m120506z(r2)
            goto L_0x01a0
        L_0x019f:
            r3 = r4
        L_0x01a0:
            tg0.g r2 = tg0.C28380b.m87049d(r3)
            java.lang.String r2 = tg0.C28380b.m87046a(r2)
            java.lang.Object[] r3 = new java.lang.Object[r11]
            java.lang.String r2 = g91.C32343x.m95388F(r2, r3)
            r1.setText(r2)
            goto L_0x02aa
        L_0x01b3:
            ue0.i0 r1 = r19.m77276L2()
            ge.bog.designsystem.components.pagestate.PageState r1 = r1.f73301o
            java.lang.String r4 = "binding.pageState"
            kotlin.jvm.internal.C41536l.m120488h(r1, r4)
            g91.C32343x.m95483r1(r1, r9, r11, r10, r3)
            ue0.i0 r1 = r19.m77276L2()
            androidx.constraintlayout.widget.Group r1 = r1.f73299m
            kotlin.jvm.internal.C41536l.m120488h(r1, r8)
            g91.C32343x.m95483r1(r1, r11, r11, r10, r3)
            ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction r1 = r0.f62202I
            if (r1 != 0) goto L_0x01d5
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r1 = r3
        L_0x01d5:
            tg0.e r1 = tg0.C28380b.m87048c(r1)
            int[] r4 = p341ge.bog.mobilebank.galtandtaggart.presentation.transactions.detail.GTTransactionDetailActivity.C23952b.f62203a
            int r1 = r1.ordinal()
            r1 = r4[r1]
            switch(r1) {
                case 1: goto L_0x0281;
                case 2: goto L_0x0281;
                case 3: goto L_0x023c;
                case 4: goto L_0x0220;
                case 5: goto L_0x0203;
                case 6: goto L_0x01e6;
                default: goto L_0x01e4;
            }
        L_0x01e4:
            goto L_0x02aa
        L_0x01e6:
            int r1 = ie0.C25190j.gt_transaction_cancel_progress
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r2 = "getString(R.string.gt_transaction_cancel_progress)"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            ge.bog.designsystem.components.pagestate.PageStateType$Warning r2 = new ge.bog.designsystem.components.pagestate.PageStateType$Warning
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 15
            r9 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.m77283S2(r1, r2)
            goto L_0x02aa
        L_0x0203:
            int r1 = ie0.C25190j.gt_transaction_cancelled_success
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r2 = "getString(R.string.gt_tr…action_cancelled_success)"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            ge.bog.designsystem.components.pagestate.PageStateType$Success r2 = new ge.bog.designsystem.components.pagestate.PageStateType$Success
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 15
            r9 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.m77283S2(r1, r2)
            goto L_0x02aa
        L_0x0220:
            int r1 = ie0.C25190j.f64734G2
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r2 = "getString(R.string.opera…n_fulfilled_successfully)"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            ge.bog.designsystem.components.pagestate.PageStateType$Success r2 = new ge.bog.designsystem.components.pagestate.PageStateType$Success
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 15
            r9 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.m77283S2(r1, r2)
            goto L_0x02aa
        L_0x023c:
            int r1 = ie0.C25190j.gt_transaction_operation_not_completed
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r4 = "getString(R.string.gt_tr…_operation_not_completed)"
            kotlin.jvm.internal.C41536l.m120488h(r1, r4)
            ge.bog.designsystem.components.pagestate.PageStateType$Error r4 = new ge.bog.designsystem.components.pagestate.PageStateType$Error
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 15
            r18 = 0
            r12 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r0.m77283S2(r1, r4)
            ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction r1 = r0.f62202I
            if (r1 != 0) goto L_0x0261
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r1 = r3
        L_0x0261:
            java.lang.String r1 = r1.mo60176w()
            if (r1 == 0) goto L_0x02aa
            int r1 = ie0.C25190j.gt_transaction_rejection_reason
            ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction r4 = r0.f62202I
            if (r4 != 0) goto L_0x0271
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r4 = r3
        L_0x0271:
            java.lang.String r2 = r4.mo60176w()
            if (r2 == 0) goto L_0x027d
            java.lang.Object[] r3 = new java.lang.Object[r11]
            java.lang.String r3 = g91.C32343x.m95388F(r2, r3)
        L_0x027d:
            r0.m77275K2(r1, r3)
            goto L_0x02aa
        L_0x0281:
            int r1 = ie0.C25190j.gt_transaction_operation_ongoing
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r2 = "getString(R.string.gt_tr…action_operation_ongoing)"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            ge.bog.designsystem.components.pagestate.PageStateType$Warning r2 = new ge.bog.designsystem.components.pagestate.PageStateType$Warning
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 15
            r18 = 0
            r12 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r0.m77283S2(r1, r2)
            ue0.i0 r1 = r19.m77276L2()
            ge.bog.designsystem.components.buttons.Button r1 = r1.f73291e
            kotlin.jvm.internal.C41536l.m120488h(r1, r7)
            g91.C32343x.m95483r1(r1, r9, r11, r10, r3)
        L_0x02aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.transactions.detail.GTTransactionDetailActivity.m77279O2():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public static final void m77280P2(GTTransactionDetailActivity gTTransactionDetailActivity, View view) {
        C41536l.m120489i(gTTransactionDetailActivity, "this$0");
        GTShareDetailsActivity.C23777a aVar = GTShareDetailsActivity.f61877N;
        GTTransaction gTTransaction = gTTransactionDetailActivity.f62202I;
        String str = null;
        if (gTTransaction == null) {
            C41536l.m120506z("gtTransaction");
            gTTransaction = null;
        }
        GTInstrument t = gTTransaction.mo60172t();
        if (t != null) {
            str = t.mo60129d();
        }
        C41536l.m120486f(str);
        aVar.mo60709a(str, gTTransactionDetailActivity);
    }

    /* renamed from: Q2 */
    private final void m77281Q2() {
        m77276L2().f73291e.setOnClickListener(new C27795b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public static final void m77282R2(GTTransactionDetailActivity gTTransactionDetailActivity, View view) {
        C41536l.m120489i(gTTransactionDetailActivity, "this$0");
        GTTransaction gTTransaction = gTTransactionDetailActivity.f62202I;
        if (gTTransaction == null) {
            C41536l.m120506z("gtTransaction");
            gTTransaction = null;
        }
        String y = gTTransaction.mo60179y();
        if (y != null) {
            gTTransactionDetailActivity.m77284T2(y);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public final void m77283S2(String str, PageStateType pageStateType) {
        m77276L2().f73301o.setTitleText(str);
        m77276L2().f73301o.setPageStateType(pageStateType);
    }

    /* renamed from: T2 */
    private final void m77284T2(String str) {
        C13310d dVar = new C13310d();
        dVar.mo35648c2(getString(C25190j.gt_history_cancel_order));
        dVar.mo35647a2(C13310d.C13312b.TITLE_TWO_BUTTON);
        dVar.mo35639Q1(getString(C25190j.gt_history_cancel_order_question));
        dVar.mo35646Z1(getString(C25190j.f64737d));
        dVar.mo35645Y1(new C27796c(this, str, dVar));
        dVar.mo35642U1(getString(C25190j.f64735b));
        dVar.mo35641T1(new C27797d(dVar));
        dVar.mo4576A1(getSupportFragmentManager(), "Alert");
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public static final void m77285U2(GTTransactionDetailActivity gTTransactionDetailActivity, String str, C13310d dVar, Button button) {
        C41536l.m120489i(gTTransactionDetailActivity, "this$0");
        C41536l.m120489i(str, "$orderID");
        C41536l.m120489i(dVar, "$this_with");
        C41536l.m120489i(button, "it");
        gTTransactionDetailActivity.m77277M2().mo60924hw().mo60926s1(str);
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public static final void m77286V2(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$this_with");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        this.f62200G = C28731i0.m88047d(getLayoutInflater());
        setContentView((View) m77276L2().mo3946b());
        super.mo37451O1(bundle);
        GTTransaction gTTransaction = (GTTransaction) getIntent().getParcelableExtra("TRANSACTION");
        if (gTTransaction == null) {
            ScrollView scrollView = m77276L2().f73302p;
            C41536l.m120488h(scrollView, "binding.scrollView");
            C32343x.m95483r1(scrollView, false, false, 2, (Object) null);
            PageState pageState = m77276L2().f73293g;
            C41536l.m120488h(pageState, "binding.error");
            C32343x.m95483r1(pageState, true, false, 2, (Object) null);
            return;
        }
        this.f62202I = gTTransaction;
        m77279O2();
        m77281Q2();
        m77278N2();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C25190j.gt_tab_title_transactions);
        C41536l.m120488h(string, "getString(R.string.gt_tab_title_transactions)");
        return string;
    }
}
