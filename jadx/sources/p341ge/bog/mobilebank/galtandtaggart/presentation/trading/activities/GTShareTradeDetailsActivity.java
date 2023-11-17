package p341ge.bog.mobilebank.galtandtaggart.presentation.trading.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.core.widget.C1314o;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import com.github.mikephil.charting.utils.Utils;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import ie0.C25187g;
import ie0.C25188h;
import ie0.C25190j;
import ie0.C25191k;
import if0.C25192a;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kg0.C25725b;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng0.C26482a;
import ng0.C26483b;
import ng0.C26484c;
import ng0.C26485d;
import ng0.C26486e;
import ng0.C26487f;
import ng0.C26488g;
import ng0.C26489h;
import ng0.C26490i;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.biginput.BigInputView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.designsystem.components.digitalkeyboard.NumericKeyboardView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeDetailsViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeReviewActivity;
import p420fh.C12902d;
import p420fh.C12910e;
import ue0.C28725f0;
import ue1.C43064a;
import ue1.C43075l;
import ug0.C28786c;
import xe0.C29744b;
import xe0.C29745c;
import xe0.C29747e;
import xe0.C29750h;
import xe0.C29751i;
import xe0.C29756n;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity */
public final class GTShareTradeDetailsActivity extends C23927a {

    /* renamed from: W */
    public static final C23867a f62063W = new C23867a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private final C41217g f62064G = new C1617p0(C41520a0.m120436b(GTShareTradeDetailsViewModel$ViewModel.class), new C23897n(this), new C23896m(this), new C23898o((C43064a) null, this));
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C28725f0 f62065H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C29756n f62066I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public C29750h f62067J;

    /* renamed from: K */
    private String f62068K = "$";

    /* renamed from: L */
    private String f62069L = "$";

    /* renamed from: M */
    private String f62070M = "0.00$";
    /* access modifiers changed from: private */

    /* renamed from: N */
    public boolean f62071N = true;

    /* renamed from: O */
    private int f62072O = 2;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public int f62073P = -1;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public double f62074Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public boolean f62075R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public BigDecimal f62076S;

    /* renamed from: T */
    private final C41217g f62077T = C41219i.m119470b(new C23899p(this));

    /* renamed from: U */
    private final C41217g f62078U = C41219i.m119470b(new C23895l(this));

    /* renamed from: V */
    private final C41217g f62079V = C41219i.m119470b(new C23870c(this));

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$a */
    public static final class C23867a {

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$a$a */
        private enum C23868a {
            BUY_INSUFFICIENT_FUNDS,
            SELL_INSUFFICIENT_SHARES,
            SELL_RECOMMEND_FULL_SALE,
            REGULAR,
            BELOW_MINIMUM
        }

        private C23867a() {
        }

        public /* synthetic */ C23867a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo60857a(C25192a aVar, Context context, String str, String str2) {
            C41536l.m120489i(aVar, "actionType");
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, GTShareTradeDetailsActivity.class);
            intent.putExtra("KEY_ACTION_TYPE", aVar);
            intent.putExtra("KEY_SYMBOL", str);
            intent.putExtra("KEY_NAME", str2);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$b */
    public /* synthetic */ class C23869b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f62086a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f62087b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|21) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0044 */
        static {
            /*
                if0.a[] r0 = if0.C25192a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                if0.a r2 = if0.C25192a.BUY_SHARE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                if0.a r3 = if0.C25192a.SELL_SHARE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f62086a = r0
                ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$a$a[] r0 = p341ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity.C23867a.C23868a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$a$a r3 = p341ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity.C23867a.C23868a.REGULAR     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$a$a r1 = p341ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity.C23867a.C23868a.BELOW_MINIMUM     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$a$a r1 = p341ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity.C23867a.C23868a.BUY_INSUFFICIENT_FUNDS     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$a$a r1 = p341ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity.C23867a.C23868a.SELL_RECOMMEND_FULL_SALE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$a$a r1 = p341ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity.C23867a.C23868a.SELL_INSUFFICIENT_SHARES     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                f62087b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity.C23869b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$c */
    static final class C23870c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeDetailsActivity f62088d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23870c(GTShareTradeDetailsActivity gTShareTradeDetailsActivity) {
            super(0);
            this.f62088d = gTShareTradeDetailsActivity;
        }

        /* renamed from: b */
        public final C25192a invoke() {
            Intent intent = this.f62088d.getIntent();
            Serializable serializableExtra = intent != null ? intent.getSerializableExtra("KEY_ACTION_TYPE") : null;
            C41536l.m120487g(serializableExtra, "null cannot be cast to non-null type ge.bog.mobilebank.galtandtaggart.domain.shared.GTActionType");
            return (C25192a) serializableExtra;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$d */
    static final class C23871d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeDetailsActivity f62089d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$d$a */
        static final class C23872a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTShareTradeDetailsActivity f62090d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23872a(GTShareTradeDetailsActivity gTShareTradeDetailsActivity) {
                super(1);
                this.f62090d = gTShareTradeDetailsActivity;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "error");
                this.f62090d.mo74709H1(th);
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$d$b */
        static final class C23873b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTShareTradeDetailsActivity f62091d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23873b(GTShareTradeDetailsActivity gTShareTradeDetailsActivity) {
                super(1);
                this.f62091d = gTShareTradeDetailsActivity;
            }

            /* renamed from: a */
            public final void mo60861a(boolean z) {
                C28725f0 P2 = this.f62091d.f62065H;
                C28725f0 f0Var = null;
                if (P2 == null) {
                    C41536l.m120506z("binding");
                    P2 = null;
                }
                Button button = P2.f73226f;
                C41536l.m120488h(button, "binding.buttonChangeInput");
                C32343x.m95483r1(button, z, false, 2, (Object) null);
                C28725f0 P22 = this.f62091d.f62065H;
                if (P22 == null) {
                    C41536l.m120506z("binding");
                } else {
                    f0Var = P22;
                }
                Button button2 = f0Var.f73231k;
                C41536l.m120488h(button2, "binding.fakeButton");
                C32343x.m95480q1(button2, false, z);
                this.f62091d.f62075R = z;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60861a(((Boolean) obj).booleanValue());
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23871d(GTShareTradeDetailsActivity gTShareTradeDetailsActivity) {
            super(1);
            this.f62089d = gTShareTradeDetailsActivity;
        }

        /* renamed from: a */
        public final void mo60859a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92643e(aVar, (int[]) null, new C23872a(this.f62089d), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C23873b(this.f62089d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60859a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$e */
    static final class C23874e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeDetailsActivity f62092d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$e$a */
        static final class C23875a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTShareTradeDetailsActivity f62093d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23875a(GTShareTradeDetailsActivity gTShareTradeDetailsActivity) {
                super(1);
                this.f62093d = gTShareTradeDetailsActivity;
            }

            /* renamed from: a */
            public final void mo60863a(C29751i iVar) {
                C41536l.m120489i(iVar, "overView");
                this.f62093d.f62076S = iVar.mo69801a();
                C28725f0 f0Var = null;
                if (this.f62093d.m77129e3() == C25192a.BUY_SHARE) {
                    C28725f0 P2 = this.f62093d.f62065H;
                    if (P2 == null) {
                        C41536l.m120506z("binding");
                        P2 = null;
                    }
                    PageDescriptionView pageDescriptionView = P2.f73227g;
                    String F = C32343x.m95388F("text.gt.buying.power", new Object[0]);
                    BigDecimal Q2 = this.f62093d.f62076S;
                    if (Q2 == null) {
                        C41536l.m120506z("buyPower");
                        Q2 = null;
                    }
                    pageDescriptionView.setText(F + ": " + C32343x.m95408P(Q2, "USD"));
                }
                C28725f0 P22 = this.f62093d.f62065H;
                if (P22 == null) {
                    C41536l.m120506z("binding");
                } else {
                    f0Var = P22;
                }
                f0Var.f73228h.mo53595c();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60863a((C29751i) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$e$b */
        static final class C23876b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTShareTradeDetailsActivity f62094d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23876b(GTShareTradeDetailsActivity gTShareTradeDetailsActivity) {
                super(1);
                this.f62094d = gTShareTradeDetailsActivity;
            }

            /* renamed from: a */
            public final void mo60864a(C29751i iVar) {
                C28725f0 P2 = this.f62094d.f62065H;
                if (P2 == null) {
                    C41536l.m120506z("binding");
                    P2 = null;
                }
                P2.f73228h.mo53597e();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60864a((C29751i) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$e$c */
        static final class C23877c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTShareTradeDetailsActivity f62095d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23877c(GTShareTradeDetailsActivity gTShareTradeDetailsActivity) {
                super(1);
                this.f62095d = gTShareTradeDetailsActivity;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                C28725f0 P2 = this.f62095d.f62065H;
                if (P2 == null) {
                    C41536l.m120506z("binding");
                    P2 = null;
                }
                P2.f73228h.mo53595c();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23874e(GTShareTradeDetailsActivity gTShareTradeDetailsActivity) {
            super(1);
            this.f62092d = gTShareTradeDetailsActivity;
        }

        /* renamed from: a */
        public final void mo60862a(C31128a aVar) {
            C41536l.m120488h(aVar, "portfolioResult");
            C31132b.m92648j(aVar, (int[]) null, new C23875a(this.f62092d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C23876b(this.f62092d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C23877c(this.f62092d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60862a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$f */
    static final class C23878f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeDetailsActivity f62096d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$f$a */
        static final class C23879a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTShareTradeDetailsActivity f62097d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23879a(GTShareTradeDetailsActivity gTShareTradeDetailsActivity) {
                super(1);
                this.f62097d = gTShareTradeDetailsActivity;
            }

            /* renamed from: a */
            public final void mo60867a(C29750h hVar) {
                boolean z;
                C41536l.m120489i(hVar, "it");
                this.f62097d.f62067J = hVar;
                GTShareTradeDetailsActivity gTShareTradeDetailsActivity = this.f62097d;
                String P = C32343x.m95408P(hVar.mo69796b(), hVar.mo69795a());
                String f = C28786c.m88250f(hVar.mo69797c());
                if (hVar.mo69797c().doubleValue() >= Utils.DOUBLE_EPSILON) {
                    z = true;
                } else {
                    z = false;
                }
                gTShareTradeDetailsActivity.m77094C3(P, f, z);
                C28725f0 P2 = this.f62097d.f62065H;
                if (P2 == null) {
                    C41536l.m120506z("binding");
                    P2 = null;
                }
                ((StateView) P2.f73236p.f68494e.findViewById(C25187g.shareDetailsState)).mo53595c();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60867a((C29750h) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$f$b */
        static final class C23880b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTShareTradeDetailsActivity f62098d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23880b(GTShareTradeDetailsActivity gTShareTradeDetailsActivity) {
                super(1);
                this.f62098d = gTShareTradeDetailsActivity;
            }

            /* renamed from: a */
            public final void mo60868a(C29750h hVar) {
                C28725f0 P2 = this.f62098d.f62065H;
                if (P2 == null) {
                    C41536l.m120506z("binding");
                    P2 = null;
                }
                ((StateView) P2.f73236p.f68494e.findViewById(C25187g.shareDetailsState)).mo53597e();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60868a((C29750h) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$f$c */
        static final class C23881c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTShareTradeDetailsActivity f62099d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23881c(GTShareTradeDetailsActivity gTShareTradeDetailsActivity) {
                super(1);
                this.f62099d = gTShareTradeDetailsActivity;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                C28725f0 P2 = this.f62099d.f62065H;
                if (P2 == null) {
                    C41536l.m120506z("binding");
                    P2 = null;
                }
                ((StateView) P2.f73236p.f68494e.findViewById(C25187g.shareDetailsState)).mo53595c();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23878f(GTShareTradeDetailsActivity gTShareTradeDetailsActivity) {
            super(1);
            this.f62096d = gTShareTradeDetailsActivity;
        }

        /* renamed from: a */
        public final void mo60866a(C31128a aVar) {
            C41536l.m120488h(aVar, "onlineData");
            C31132b.m92648j(aVar, (int[]) null, new C23879a(this.f62096d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C23880b(this.f62096d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C23881c(this.f62096d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60866a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$g */
    static final class C23882g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeDetailsActivity f62100d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$g$a */
        static final class C23883a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTShareTradeDetailsActivity f62101d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23883a(GTShareTradeDetailsActivity gTShareTradeDetailsActivity) {
                super(1);
                this.f62101d = gTShareTradeDetailsActivity;
            }

            /* renamed from: a */
            public final void mo60871a(C29756n nVar) {
                double d;
                C41536l.m120489i(nVar, "it");
                this.f62101d.f62066I = nVar;
                C28725f0 f0Var = null;
                if (this.f62101d.m77129e3() == C25192a.SELL_SHARE) {
                    C29747e a = nVar.mo69856a();
                    if (a != null) {
                        d = a.mo69778c();
                    } else {
                        d = Utils.DOUBLE_EPSILON;
                    }
                    C28725f0 P2 = this.f62101d.f62065H;
                    if (P2 == null) {
                        C41536l.m120506z("binding");
                        P2 = null;
                    }
                    P2.f73227g.setText(this.f62101d.getString(C25190j.gt_position_small_title) + " " + C28786c.m88251g(d));
                }
                C28725f0 P22 = this.f62101d.f62065H;
                if (P22 == null) {
                    C41536l.m120506z("binding");
                } else {
                    f0Var = P22;
                }
                f0Var.f73228h.mo53595c();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60871a((C29756n) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$g$b */
        static final class C23884b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTShareTradeDetailsActivity f62102d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23884b(GTShareTradeDetailsActivity gTShareTradeDetailsActivity) {
                super(1);
                this.f62102d = gTShareTradeDetailsActivity;
            }

            /* renamed from: a */
            public final void mo60872a(C29756n nVar) {
                C28725f0 P2 = this.f62102d.f62065H;
                if (P2 == null) {
                    C41536l.m120506z("binding");
                    P2 = null;
                }
                P2.f73228h.mo53597e();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60872a((C29756n) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$g$c */
        static final class C23885c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTShareTradeDetailsActivity f62103d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23885c(GTShareTradeDetailsActivity gTShareTradeDetailsActivity) {
                super(1);
                this.f62103d = gTShareTradeDetailsActivity;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                C28725f0 P2 = this.f62103d.f62065H;
                if (P2 == null) {
                    C41536l.m120506z("binding");
                    P2 = null;
                }
                P2.f73228h.mo53595c();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23882g(GTShareTradeDetailsActivity gTShareTradeDetailsActivity) {
            super(1);
            this.f62100d = gTShareTradeDetailsActivity;
        }

        /* renamed from: a */
        public final void mo60870a(C31128a aVar) {
            C41536l.m120488h(aVar, "metadata");
            C31132b.m92648j(aVar, (int[]) null, new C23883a(this.f62100d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C23884b(this.f62100d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C23885c(this.f62100d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60870a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$h */
    static final class C23886h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeDetailsActivity f62104d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23886h(GTShareTradeDetailsActivity gTShareTradeDetailsActivity) {
            super(1);
            this.f62104d = gTShareTradeDetailsActivity;
        }

        /* renamed from: a */
        public final void mo60874a(Integer num) {
            GTShareTradeDetailsActivity gTShareTradeDetailsActivity = this.f62104d;
            C41536l.m120488h(num, "it");
            gTShareTradeDetailsActivity.f62073P = num.intValue();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60874a((Integer) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$i */
    static final class C23887i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeDetailsActivity f62105d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$i$a */
        static final class C23888a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTShareTradeDetailsActivity f62106d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23888a(GTShareTradeDetailsActivity gTShareTradeDetailsActivity) {
                super(1);
                this.f62106d = gTShareTradeDetailsActivity;
            }

            /* JADX WARNING: Removed duplicated region for block: B:22:0x00dc  */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x00e0  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo60876a(xe0.C29745c r10) {
                /*
                    r9 = this;
                    kotlin.jvm.internal.C41536l.m120486f(r10)
                    int r0 = r10.mo69764c()
                    ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity r1 = r9.f62106d
                    int r1 = r1.f62073P
                    if (r0 != r1) goto L_0x00e7
                    ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity r0 = r9.f62106d
                    boolean r0 = r0.f62071N
                    java.lang.String r1 = " "
                    java.lang.String r2 = "USD"
                    if (r0 == 0) goto L_0x003e
                    double r3 = r10.mo69765d()
                    java.lang.String r0 = ug0.C28786c.m88251g(r3)
                    ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity r3 = r9.f62106d
                    int r4 = ie0.C25190j.gt_text_share
                    java.lang.String r3 = r3.getString(r4)
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    r4.append(r0)
                    r4.append(r1)
                    r4.append(r3)
                    java.lang.String r0 = r4.toString()
                    goto L_0x0054
                L_0x003e:
                    java.math.BigDecimal r0 = r10.mo69762a()
                    kotlin.jvm.internal.C41536l.m120486f(r0)
                    java.lang.String r3 = g91.C32343x.m95408P(r0, r2)
                    java.lang.String r4 = " "
                    java.lang.String r5 = ""
                    r6 = 0
                    r7 = 4
                    r8 = 0
                    java.lang.String r0 = cf1.C40439w.m117103B(r3, r4, r5, r6, r7, r8)
                L_0x0054:
                    ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity r3 = r9.f62106d
                    ue0.f0 r3 = r3.f62065H
                    java.lang.String r4 = "binding"
                    r5 = 0
                    if (r3 != 0) goto L_0x0063
                    kotlin.jvm.internal.C41536l.m120506z(r4)
                    r3 = r5
                L_0x0063:
                    ge.bog.designsystem.components.biginput.BigInputView r3 = r3.f73232l
                    r3.setDescText(r0)
                    ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity r0 = r9.f62106d
                    ue0.f0 r0 = r0.f62065H
                    if (r0 != 0) goto L_0x0074
                    kotlin.jvm.internal.C41536l.m120506z(r4)
                    r0 = r5
                L_0x0074:
                    ge.bog.designsystem.components.pagedescription.PageDescriptionView r0 = r0.f73230j
                    ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity r3 = r9.f62106d
                    int r6 = ie0.C25190j.gt_comission_small_title
                    java.lang.String r3 = r3.getString(r6)
                    java.math.BigDecimal r6 = r10.mo69763b()
                    java.lang.String r2 = g91.C32343x.m95408P(r6, r2)
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    r6.append(r3)
                    r6.append(r1)
                    r6.append(r2)
                    java.lang.String r1 = r6.toString()
                    r0.setText(r1)
                    ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity r0 = r9.f62106d
                    java.math.BigDecimal r1 = r10.mo69763b()
                    double r1 = r1.doubleValue()
                    r0.f62074Q = r1
                    ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity r0 = r9.f62106d
                    if0.a r1 = r0.m77129e3()
                    if0.a r2 = if0.C25192a.BUY_SHARE
                    if (r1 != r2) goto L_0x00d0
                    java.math.BigDecimal r1 = r10.mo69762a()
                    if (r1 == 0) goto L_0x00d0
                    java.math.BigDecimal r10 = r10.mo69763b()
                    java.math.BigDecimal r10 = r1.add(r10)
                    java.lang.String r1 = "this.add(other)"
                    kotlin.jvm.internal.C41536l.m120488h(r10, r1)
                    if (r10 == 0) goto L_0x00d0
                    double r1 = r10.doubleValue()
                    java.lang.Double r10 = java.lang.Double.valueOf(r1)
                    goto L_0x00d1
                L_0x00d0:
                    r10 = r5
                L_0x00d1:
                    r0.m77092A3(r10)
                    ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity r10 = r9.f62106d
                    ue0.f0 r10 = r10.f62065H
                    if (r10 != 0) goto L_0x00e0
                    kotlin.jvm.internal.C41536l.m120506z(r4)
                    goto L_0x00e1
                L_0x00e0:
                    r5 = r10
                L_0x00e1:
                    ge.bog.designsystem.components.buttons.Button r10 = r5.f73225e
                    r0 = 0
                    r10.setLoading(r0)
                L_0x00e7:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity.C23887i.C23888a.mo60876a(xe0.c):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60876a((C29745c) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$i$b */
        static final class C23889b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTShareTradeDetailsActivity f62107d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23889b(GTShareTradeDetailsActivity gTShareTradeDetailsActivity) {
                super(1);
                this.f62107d = gTShareTradeDetailsActivity;
            }

            /* renamed from: a */
            public final void mo60877a(C29745c cVar) {
                C28725f0 f0Var = null;
                GTShareTradeDetailsActivity.m77093B3(this.f62107d, (Double) null, 1, (Object) null);
                C28725f0 P2 = this.f62107d.f62065H;
                if (P2 == null) {
                    C41536l.m120506z("binding");
                } else {
                    f0Var = P2;
                }
                f0Var.f73225e.setLoading(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60877a((C29745c) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$i$c */
        static final class C23890c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTShareTradeDetailsActivity f62108d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23890c(GTShareTradeDetailsActivity gTShareTradeDetailsActivity) {
                super(1);
                this.f62108d = gTShareTradeDetailsActivity;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f62108d.mo74709H1(th);
                C28725f0 f0Var = null;
                GTShareTradeDetailsActivity.m77093B3(this.f62108d, (Double) null, 1, (Object) null);
                C28725f0 P2 = this.f62108d.f62065H;
                if (P2 == null) {
                    C41536l.m120506z("binding");
                } else {
                    f0Var = P2;
                }
                f0Var.f73225e.setLoading(false);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23887i(GTShareTradeDetailsActivity gTShareTradeDetailsActivity) {
            super(1);
            this.f62105d = gTShareTradeDetailsActivity;
        }

        /* renamed from: a */
        public final void mo60875a(C31128a aVar) {
            String str;
            C28725f0 f0Var = null;
            if (aVar != null) {
                C31132b.m92648j(aVar, (int[]) null, new C23888a(this.f62105d), 1, (Object) null);
                C31132b.m92646h(aVar, (int[]) null, new C23889b(this.f62105d), 1, (Object) null);
                C31132b.m92643e(aVar, (int[]) null, new C23890c(this.f62105d), 1, (Object) null);
                return;
            }
            C28725f0 P2 = this.f62105d.f62065H;
            if (P2 == null) {
                C41536l.m120506z("binding");
            } else {
                f0Var = P2;
            }
            BigInputView bigInputView = f0Var.f73232l;
            if (this.f62105d.f62071N) {
                str = "0 " + this.f62105d.getString(C25190j.gt_text_share);
            } else {
                str = "0USD";
            }
            bigInputView.setDescText(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60875a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$j */
    static final class C23891j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeDetailsActivity f62109d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$j$a */
        static final class C23892a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTShareTradeDetailsActivity f62110d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23892a(GTShareTradeDetailsActivity gTShareTradeDetailsActivity) {
                super(1);
                this.f62110d = gTShareTradeDetailsActivity;
            }

            /* renamed from: a */
            public final void mo60880a(C41224m mVar) {
                C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
                this.f62110d.m77127c3(((Boolean) mVar.mo95675a()).booleanValue(), (List) mVar.mo95676b());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60880a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$j$b */
        static final class C23893b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTShareTradeDetailsActivity f62111d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23893b(GTShareTradeDetailsActivity gTShareTradeDetailsActivity) {
                super(1);
                this.f62111d = gTShareTradeDetailsActivity;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f62111d.mo74709H1(th);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23891j(GTShareTradeDetailsActivity gTShareTradeDetailsActivity) {
            super(1);
            this.f62109d = gTShareTradeDetailsActivity;
        }

        /* renamed from: a */
        public final void mo60879a(C31128a aVar) {
            C41536l.m120488h(aVar, "res");
            C31132b.m92648j(aVar, (int[]) null, new C23892a(this.f62109d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C23893b(this.f62109d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60879a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$k */
    static final class C23894k implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f62112a;

        C23894k(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f62112a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f62112a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f62112a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$l */
    static final class C23895l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeDetailsActivity f62113d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23895l(GTShareTradeDetailsActivity gTShareTradeDetailsActivity) {
            super(0);
            this.f62113d = gTShareTradeDetailsActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = r0.getStringExtra("KEY_NAME");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String invoke() {
            /*
                r2 = this;
                ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity r0 = r2.f62113d
                android.content.Intent r0 = r0.getIntent()
                if (r0 == 0) goto L_0x0010
                java.lang.String r1 = "KEY_NAME"
                java.lang.String r0 = r0.getStringExtra(r1)
                if (r0 != 0) goto L_0x0012
            L_0x0010:
                java.lang.String r0 = ""
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity.C23895l.invoke():java.lang.String");
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$m */
    public static final class C23896m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f62114d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23896m(ComponentActivity componentActivity) {
            super(0);
            this.f62114d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f62114d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$n */
    public static final class C23897n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f62115d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23897n(ComponentActivity componentActivity) {
            super(0);
            this.f62115d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f62115d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$o */
    public static final class C23898o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62116d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f62117e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23898o(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f62116d = aVar;
            this.f62117e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f62116d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f62117e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity$p */
    static final class C23899p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeDetailsActivity f62118d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23899p(GTShareTradeDetailsActivity gTShareTradeDetailsActivity) {
            super(0);
            this.f62118d = gTShareTradeDetailsActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = r0.getStringExtra("KEY_SYMBOL");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String invoke() {
            /*
                r2 = this;
                ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity r0 = r2.f62118d
                android.content.Intent r0 = r0.getIntent()
                if (r0 == 0) goto L_0x0010
                java.lang.String r1 = "KEY_SYMBOL"
                java.lang.String r0 = r0.getStringExtra(r1)
                if (r0 != 0) goto L_0x0012
            L_0x0010:
                java.lang.String r0 = ""
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity.C23899p.invoke():java.lang.String");
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005b, code lost:
        if (r9 == null) goto L_0x005d;
     */
    /* renamed from: A3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m77092A3(java.lang.Double r9) {
        /*
            r8 = this;
            ue0.f0 r0 = r8.f62065H
            r1 = 0
            java.lang.String r2 = "binding"
            if (r0 != 0) goto L_0x000b
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r0 = r1
        L_0x000b:
            ge.bog.designsystem.components.buttons.Button r0 = r0.f73225e
            double r3 = r8.m77130f3()
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0019
            r3 = 1
            goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            r0.setEnabled(r3)
            int r0 = ie0.C25190j.gt_button_text_continue
            java.lang.String r0 = r8.getString(r0)
            java.lang.String r3 = "getString(R.string.gt_button_text_continue)"
            kotlin.jvm.internal.C41536l.m120488h(r0, r3)
            ue0.f0 r3 = r8.f62065H
            if (r3 != 0) goto L_0x0030
            kotlin.jvm.internal.C41536l.m120506z(r2)
            goto L_0x0031
        L_0x0030:
            r1 = r3
        L_0x0031:
            ge.bog.designsystem.components.buttons.Button r1 = r1.f73225e
            if (r9 == 0) goto L_0x005d
            r9.doubleValue()
            double r2 = r9.doubleValue()
            java.lang.String r4 = "USD"
            r5 = 0
            r6 = 2
            r7 = 0
            java.lang.String r9 = g91.C32343x.m95410Q(r2, r4, r5, r6, r7)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = " ("
            r2.append(r3)
            r2.append(r9)
            java.lang.String r9 = ")"
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            if (r9 != 0) goto L_0x005f
        L_0x005d:
            java.lang.String r9 = ""
        L_0x005f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            r1.setButtonText(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity.m77092A3(java.lang.Double):void");
    }

    /* renamed from: B3 */
    static /* synthetic */ void m77093B3(GTShareTradeDetailsActivity gTShareTradeDetailsActivity, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            d = null;
        }
        gTShareTradeDetailsActivity.m77092A3(d);
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public final void m77094C3(String str, String str2, boolean z) {
        String str3;
        int i;
        C28725f0 f0Var = this.f62065H;
        C28725f0 f0Var2 = null;
        if (f0Var == null) {
            C41536l.m120506z("binding");
            f0Var = null;
        }
        TextView textView = (TextView) f0Var.f73236p.f68494e.findViewById(C25187g.shareName);
        int i2 = C23869b.f62086a[m77129e3().ordinal()];
        if (i2 == 1) {
            str3 = getString(C25190j.gt_buy) + " " + m77133i3();
        } else if (i2 != 2) {
            str3 = "";
        } else {
            str3 = getString(C25190j.gt_sell) + " " + m77133i3();
        }
        textView.setText(str3);
        C28725f0 f0Var3 = this.f62065H;
        if (f0Var3 == null) {
            C41536l.m120506z("binding");
            f0Var3 = null;
        }
        ((TextView) f0Var3.f73236p.f68494e.findViewById(C25187g.sharePrice)).setText(str);
        C28725f0 f0Var4 = this.f62065H;
        if (f0Var4 == null) {
            C41536l.m120506z("binding");
            f0Var4 = null;
        }
        ToolbarView toolbarView = f0Var4.f73236p.f68494e;
        int i3 = C25187g.shareProfit;
        ((TextView) toolbarView.findViewById(i3)).setText(str2);
        C28725f0 f0Var5 = this.f62065H;
        if (f0Var5 == null) {
            C41536l.m120506z("binding");
        } else {
            f0Var2 = f0Var5;
        }
        TextView textView2 = (TextView) f0Var2.f73236p.f68494e.findViewById(i3);
        if (z) {
            i = C25191k.TextCaption1Positive500Left;
        } else {
            i = C25191k.f64743d;
        }
        C1314o.m4575q(textView2, i);
    }

    /* renamed from: D3 */
    static /* synthetic */ void m77095D3(GTShareTradeDetailsActivity gTShareTradeDetailsActivity, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        gTShareTradeDetailsActivity.m77094C3(str, str2, z);
    }

    /* renamed from: E3 */
    private final void m77097E3() {
        if (!this.f62071N) {
            m77126b3();
        }
    }

    /* renamed from: F3 */
    private final void m77099F3() {
        if (this.f62071N) {
            m77126b3();
        }
    }

    /* renamed from: G3 */
    private final void m77101G3() {
        int i;
        String str;
        boolean z;
        String str2;
        String str3;
        C28725f0 f0Var = this.f62065H;
        if (f0Var == null) {
            C41536l.m120506z("binding");
            f0Var = null;
        }
        boolean z2 = this.f62071N;
        if (z2) {
            i = 2;
        } else {
            i = 8;
        }
        this.f62072O = i;
        BigInputView bigInputView = f0Var.f73232l;
        if (z2) {
            str = getString(C25190j.gt_exchange_hint_amount);
            C41536l.m120488h(str, "{\n                getStr…int_amount)\n            }");
        } else {
            str = getString(C25190j.gt_text_share);
            C41536l.m120488h(str, "{\n                getStr…text_share)\n            }");
        }
        bigInputView.setInfoText(str);
        if (f0Var.f73232l.getDescText().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str4 = "0.00$";
        if (z) {
            BigInputView bigInputView2 = f0Var.f73232l;
            if (this.f62071N) {
                str3 = "0 " + getString(C25190j.gt_text_share);
            } else {
                str3 = str4;
            }
            bigInputView2.setDescText(str3);
        }
        boolean z3 = this.f62071N;
        if (z3) {
            str2 = this.f62068K;
        } else {
            str2 = "";
        }
        this.f62069L = str2;
        if (!z3) {
            str4 = "0.0";
        }
        this.f62070M = str4;
        f0Var.f73232l.setHint(str4);
        NumericKeyboardView numericKeyboardView = f0Var.f73234n;
        C41536l.m120488h(numericKeyboardView, "numericKeyboardView");
        String str5 = this.f62069L;
        int i2 = this.f62072O;
        BigInputView bigInputView3 = f0Var.f73232l;
        C41536l.m120488h(bigInputView3, "inputView");
        C28786c.m88246b(numericKeyboardView, str5, i2, bigInputView3);
        NumericKeyboardView numericKeyboardView2 = f0Var.f73234n;
        C41536l.m120488h(numericKeyboardView2, "numericKeyboardView");
        String str6 = this.f62069L;
        BigInputView bigInputView4 = f0Var.f73232l;
        C41536l.m120488h(bigInputView4, "inputView");
        C28786c.m88245a(numericKeyboardView2, str6, bigInputView4);
    }

    /* renamed from: H3 */
    private final void m77103H3() {
        String str;
        int i = C25188h.gt_toolbar_two_line_title;
        C28725f0 f0Var = this.f62065H;
        if (f0Var == null) {
            C41536l.m120506z("binding");
            f0Var = null;
        }
        View.inflate(this, i, f0Var.f73236p.f68494e);
        C28725f0 f0Var2 = this.f62065H;
        if (f0Var2 == null) {
            C41536l.m120506z("binding");
            f0Var2 = null;
        }
        PageDescriptionView pageDescriptionView = f0Var2.f73227g;
        int i2 = C23869b.f62086a[m77129e3().ordinal()];
        if (i2 == 1) {
            str = C32343x.m95388F("text.gt.buying.power", new Object[0]) + ":";
        } else if (i2 != 2) {
            str = "";
        } else {
            str = getString(C25190j.gt_position_small_title);
        }
        pageDescriptionView.setText(str);
        f0Var2.f73230j.setText(getString(C25190j.gt_comission_small_title));
        f0Var2.f73232l.mo34891i(false);
        f0Var2.f73232l.setFormatText(false);
        f0Var2.f73232l.setTextChangeListener(new C26482a(this));
        f0Var2.f73226f.setEnabled(true);
        f0Var2.f73226f.setOnClickListener(new C26483b(this));
        f0Var2.f73234n.setVibrationEnabled(true);
        f0Var2.f73234n.setAdditionalButtonEnabled(true);
        f0Var2.f73225e.setButtonText(getString(C25190j.gt_button_text_continue));
        f0Var2.f73225e.setOnClickListener(new C26484c(this));
        m77101G3();
        m77095D3(this, (String) null, (String) null, false, 7, (Object) null);
        m77093B3(this, (Double) null, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public static final void m77105I3(GTShareTradeDetailsActivity gTShareTradeDetailsActivity, String str) {
        C41536l.m120489i(gTShareTradeDetailsActivity, "this$0");
        double g3 = gTShareTradeDetailsActivity.m77131g3();
        C28725f0 f0Var = gTShareTradeDetailsActivity.f62065H;
        C28725f0 f0Var2 = null;
        if (f0Var == null) {
            C41536l.m120506z("binding");
            f0Var = null;
        }
        f0Var.f73230j.setText(gTShareTradeDetailsActivity.getString(C25190j.gt_comission_small_title) + " ");
        C28725f0 f0Var3 = gTShareTradeDetailsActivity.f62065H;
        if (f0Var3 == null) {
            C41536l.m120506z("binding");
            f0Var3 = null;
        }
        f0Var3.f73232l.setDescText(" ");
        gTShareTradeDetailsActivity.m77135k3().mo60811Pw(gTShareTradeDetailsActivity.m77129e3(), g3, gTShareTradeDetailsActivity.f62071N);
        C28725f0 f0Var4 = gTShareTradeDetailsActivity.f62065H;
        if (f0Var4 == null) {
            C41536l.m120506z("binding");
            f0Var4 = null;
        }
        f0Var4.f73225e.setEnabled(false);
        C28725f0 f0Var5 = gTShareTradeDetailsActivity.f62065H;
        if (f0Var5 == null) {
            C41536l.m120506z("binding");
        } else {
            f0Var2 = f0Var5;
        }
        f0Var2.f73226f.setEnabled(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public static final void m77107J3(GTShareTradeDetailsActivity gTShareTradeDetailsActivity, View view) {
        C41536l.m120489i(gTShareTradeDetailsActivity, "this$0");
        gTShareTradeDetailsActivity.m77126b3();
    }

    /* access modifiers changed from: private */
    /* renamed from: K3 */
    public static final void m77109K3(GTShareTradeDetailsActivity gTShareTradeDetailsActivity, View view) {
        C41536l.m120489i(gTShareTradeDetailsActivity, "this$0");
        gTShareTradeDetailsActivity.m77146v3();
    }

    /* renamed from: b3 */
    private final void m77126b3() {
        String str;
        C28725f0 f0Var = this.f62065H;
        if (f0Var == null) {
            C41536l.m120506z("binding");
            f0Var = null;
        }
        boolean z = true;
        this.f62071N = !this.f62071N;
        String c = C28786c.m88247c(f0Var.f73232l.getDescText(), this.f62068K, this);
        if (c.length() <= 0) {
            z = false;
        }
        String str2 = "";
        if (z) {
            BigDecimal bigDecimal = new BigDecimal(c);
            BigDecimal valueOf = BigDecimal.valueOf(0);
            C41536l.m120488h(valueOf, "valueOf(this.toLong())");
            if (bigDecimal.compareTo(valueOf) > 0) {
                if (this.f62071N) {
                    str2 = this.f62068K;
                }
                str2 = C28786c.m88249e(c + str2);
            }
        }
        String e = C28786c.m88249e(C28786c.m88247c(f0Var.f73232l.getText(), this.f62068K, this));
        if (this.f62071N) {
            str = " " + getString(C25190j.gt_text_share);
        } else {
            str = this.f62068K;
        }
        f0Var.f73232l.setText(str2);
        f0Var.f73232l.setDescText(e + str);
        m77101G3();
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public final void m77127c3(boolean z, List list) {
        C28725f0 f0Var = this.f62065H;
        C28725f0 f0Var2 = null;
        if (f0Var == null) {
            C41536l.m120506z("binding");
            f0Var = null;
        }
        ChipGroup chipGroup = f0Var.f73229i;
        chipGroup.mo35190t();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C29744b bVar = (C29744b) it.next();
            C28725f0 f0Var3 = this.f62065H;
            if (f0Var3 == null) {
                C41536l.m120506z("binding");
                f0Var3 = null;
            }
            ChipGroup chipGroup2 = f0Var3.f73229i;
            Context context = chipGroup.getContext();
            C41536l.m120488h(context, "context");
            Chip chip = new Chip(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            chip.setChipTitle(C32343x.m95420V(bVar.mo69758b(), C28786c.m88252h(bVar.mo69757a()), new Object[0]));
            chip.setActivated(true);
            chipGroup2.mo35183o(chip);
        }
        if (m77129e3() == C25192a.SELL_SHARE && z) {
            C28725f0 f0Var4 = this.f62065H;
            if (f0Var4 == null) {
                C41536l.m120506z("binding");
            } else {
                f0Var2 = f0Var4;
            }
            ChipGroup chipGroup3 = f0Var2.f73229i;
            Context context2 = chipGroup.getContext();
            C41536l.m120488h(context2, "context");
            Chip chip2 = new Chip(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            chip2.setChipTitle(getString(C25190j.gt_share_exchange_sell_all));
            chip2.setActivated(true);
            chipGroup3.mo35183o(chip2);
        }
        chipGroup.setOnChipActivatedChangedListener(new C26485d(list, this));
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public static final void m77128d3(List list, GTShareTradeDetailsActivity gTShareTradeDetailsActivity, Chip chip, int i) {
        C41536l.m120489i(list, "$chips");
        C41536l.m120489i(gTShareTradeDetailsActivity, "this$0");
        C41536l.m120489i(chip, "chip");
        boolean z = true;
        chip.setActivated(true);
        if (i < 0 || i >= list.size()) {
            z = false;
        }
        if (z) {
            C29744b bVar = (C29744b) C41358y.m120010Z(list, i);
            if (bVar != null) {
                gTShareTradeDetailsActivity.m77147w3(bVar.mo69757a());
                return;
            }
            return;
        }
        gTShareTradeDetailsActivity.m77148x3();
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public final C25192a m77129e3() {
        return (C25192a) this.f62079V.getValue();
    }

    /* renamed from: f3 */
    private final double m77130f3() {
        boolean z;
        C28725f0 f0Var = this.f62065H;
        C28725f0 f0Var2 = null;
        if (f0Var == null) {
            C41536l.m120506z("binding");
            f0Var = null;
        }
        if (C28786c.m88247c(f0Var.f73232l.getDescText(), this.f62068K, this).length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Utils.DOUBLE_EPSILON;
        }
        C28725f0 f0Var3 = this.f62065H;
        if (f0Var3 == null) {
            C41536l.m120506z("binding");
        } else {
            f0Var2 = f0Var3;
        }
        return Double.parseDouble(C28786c.m88247c(f0Var2.f73232l.getDescText(), this.f62068K, this));
    }

    /* renamed from: g3 */
    private final double m77131g3() {
        boolean z;
        C28725f0 f0Var = this.f62065H;
        C28725f0 f0Var2 = null;
        if (f0Var == null) {
            C41536l.m120506z("binding");
            f0Var = null;
        }
        if (C28786c.m88247c(f0Var.f73232l.getText(), this.f62068K, this).length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Utils.DOUBLE_EPSILON;
        }
        C28725f0 f0Var3 = this.f62065H;
        if (f0Var3 == null) {
            C41536l.m120506z("binding");
        } else {
            f0Var2 = f0Var3;
        }
        return Double.parseDouble(C28786c.m88247c(f0Var2.f73232l.getText(), this.f62068K, this));
    }

    /* renamed from: h3 */
    private final String m77132h3() {
        return (String) this.f62078U.getValue();
    }

    /* renamed from: i3 */
    private final String m77133i3() {
        return (String) this.f62077T.getValue();
    }

    /* renamed from: j3 */
    private final C23867a.C23868a m77134j3(double d, double d2) {
        double d3;
        boolean z;
        BigDecimal b;
        C29747e a;
        C29756n nVar = this.f62066I;
        double d4 = Utils.DOUBLE_EPSILON;
        if (nVar == null || (a = nVar.mo69856a()) == null) {
            d3 = 0.0d;
        } else {
            d3 = a.mo69778c();
        }
        C29750h hVar = this.f62067J;
        if (!(hVar == null || (b = hVar.mo69796b()) == null)) {
            d4 = b.doubleValue();
        }
        double d5 = d4 * d3;
        if (m77129e3() != C25192a.BUY_SHARE) {
            if (d2 == d3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return C23867a.C23868a.REGULAR;
            }
            if (d2 > d3) {
                return C23867a.C23868a.SELL_INSUFFICIENT_SHARES;
            }
            if (d5 - d < 1.0d) {
                return C23867a.C23868a.SELL_RECOMMEND_FULL_SALE;
            }
            if (d < 1.0d) {
                return C23867a.C23868a.BELOW_MINIMUM;
            }
            return C23867a.C23868a.REGULAR;
        } else if (d < 1.0d) {
            return C23867a.C23868a.BELOW_MINIMUM;
        } else {
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(d + this.f62074Q));
            BigDecimal bigDecimal2 = this.f62076S;
            if (bigDecimal2 == null) {
                C41536l.m120506z("buyPower");
                bigDecimal2 = null;
            }
            if (bigDecimal.compareTo(bigDecimal2) > 0) {
                return C23867a.C23868a.BUY_INSUFFICIENT_FUNDS;
            }
            return C23867a.C23868a.REGULAR;
        }
    }

    /* renamed from: k3 */
    private final GTShareTradeDetailsViewModel$ViewModel m77135k3() {
        return (GTShareTradeDetailsViewModel$ViewModel) this.f62064G.getValue();
    }

    /* renamed from: l3 */
    private final void m77136l3() {
        C13310d dVar = new C13310d();
        dVar.mo35647a2(C13310d.C13312b.TITLE_TWO_BUTTON);
        dVar.mo35648c2(getString(C25190j.gt_insufficient_shares_dialog_title));
        dVar.mo35639Q1(getString(m77135k3().mo60807Kw()));
        dVar.mo35646Z1(getString(C25190j.gt_text_yes));
        dVar.mo35642U1(getString(C25190j.gt_text_no));
        dVar.mo35645Y1(new C26486e(this, dVar));
        dVar.mo35641T1(new C26487f(dVar));
        dVar.mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public static final void m77137m3(GTShareTradeDetailsActivity gTShareTradeDetailsActivity, C13310d dVar, Button button) {
        double d;
        C29747e a;
        C41536l.m120489i(gTShareTradeDetailsActivity, "this$0");
        C41536l.m120489i(dVar, "$this_apply");
        C41536l.m120489i(button, "it");
        gTShareTradeDetailsActivity.m77099F3();
        C29756n nVar = gTShareTradeDetailsActivity.f62066I;
        if (nVar == null || (a = nVar.mo69856a()) == null) {
            d = Utils.DOUBLE_EPSILON;
        } else {
            d = a.mo69778c();
        }
        gTShareTradeDetailsActivity.m77149y3(d);
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public static final void m77138n3(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$this_apply");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
    }

    /* renamed from: o3 */
    private final void m77139o3() {
        int i;
        if (C23869b.f62086a[m77129e3().ordinal()] == 1) {
            i = C25190j.gt_share_trade_details_minimum_buy;
        } else {
            i = C25190j.gt_share_trade_details_minimum_sell;
        }
        String string = getString(i);
        C41536l.m120488h(string, "getString(\n             …          }\n            )");
        C12910e.m48790h(this, string, (C12902d.C12905b) null, false, 6, (Object) null);
    }

    /* renamed from: p3 */
    private final void m77140p3() {
        C25725b.f65487H.mo64306a().mo4576A1(getSupportFragmentManager(), "ADD_FUNDS");
    }

    /* renamed from: q3 */
    private final void m77141q3(double d) {
        C13310d.C13312b bVar;
        C13310d dVar = new C13310d();
        if (this.f62075R) {
            bVar = C13310d.C13312b.TITLE_TWO_BUTTON;
        } else {
            bVar = C13310d.C13312b.TITLE_SINGLE_BUTTON;
        }
        dVar.mo35647a2(bVar);
        dVar.mo35648c2(getString(C25190j.gt_sell_all_shares_dialog_title));
        if (this.f62075R) {
            dVar.mo35646Z1(C32343x.m95388F("text.gt.sell.little.amount.required.closed.market.sell.all.button", new Object[0]));
            dVar.mo35642U1(getString(C25190j.gt_sell_all_shares_neg));
            dVar.mo35639Q1(getString(C25190j.gt_sell_all_shares_desc));
            dVar.mo35645Y1(new C26488g(this, d, dVar));
            dVar.mo35641T1(new C26489h(dVar));
        } else {
            dVar.mo35639Q1(C32343x.m95388F("text.gt.sell.little.amount.required.closed.market", new Object[0]));
            dVar.mo35644X1(C32343x.m95388F("text.gt.sell.little.amount.required.closed.market.sell.all.button", new Object[0]));
            dVar.mo35643V1(new C26490i(dVar));
        }
        dVar.mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public static final void m77142r3(GTShareTradeDetailsActivity gTShareTradeDetailsActivity, double d, C13310d dVar, Button button) {
        C29747e a;
        C41536l.m120489i(gTShareTradeDetailsActivity, "this$0");
        C41536l.m120489i(dVar, "$this_apply");
        C41536l.m120489i(button, "it");
        gTShareTradeDetailsActivity.m77099F3();
        C29756n nVar = gTShareTradeDetailsActivity.f62066I;
        if (!(nVar == null || (a = nVar.mo69856a()) == null)) {
            d = a.mo69778c();
        }
        gTShareTradeDetailsActivity.m77149y3(d);
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public static final void m77143s3(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$this_apply");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public static final void m77144t3(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$this_apply");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
    }

    /* renamed from: u3 */
    private final void m77145u3() {
        m77135k3().mo60810Nw().mo60817u().mo4819k(this, new C23894k(new C23871d(this)));
        m77135k3().mo60810Nw().mo60813Vn().mo4819k(this, new C23894k(new C23874e(this)));
        m77135k3().mo60810Nw().mo60801Fo().mo4819k(this, new C23894k(new C23878f(this)));
        m77135k3().mo60810Nw().mo60816o8().mo4819k(this, new C23894k(new C23882g(this)));
        m77135k3().mo60810Nw().mo60812Uv().mo4819k(this, new C23894k(new C23886h(this)));
        m77135k3().mo60810Nw().mo60818xn().mo4819k(this, new C23894k(new C23887i(this)));
        m77135k3().mo60810Nw().mo60804I9().mo4819k(this, new C23894k(new C23891j(this)));
    }

    /* renamed from: v3 */
    private final void m77146v3() {
        double d;
        C28725f0 f0Var = this.f62065H;
        if (f0Var == null) {
            C41536l.m120506z("binding");
            f0Var = null;
        }
        if (!f0Var.f73225e.getLoading()) {
            double g3 = m77131g3();
            double f3 = m77130f3();
            boolean z = this.f62071N;
            if (z) {
                d = g3;
            } else {
                d = f3;
            }
            if (!z) {
                f3 = g3;
            }
            int i = C23869b.f62087b[m77134j3(d, f3).ordinal()];
            if (i == 1) {
                m77149y3(g3);
            } else if (i == 2) {
                m77139o3();
            } else if (i == 3) {
                m77140p3();
            } else if (i == 4) {
                m77141q3(g3);
            } else if (i == 5) {
                m77136l3();
            }
        }
    }

    /* renamed from: w3 */
    private final void m77147w3(double d) {
        m77097E3();
        m77150z3(d);
    }

    /* renamed from: x3 */
    private final void m77148x3() {
        double d;
        C29747e a;
        m77099F3();
        C29756n nVar = this.f62066I;
        if (nVar == null || (a = nVar.mo69856a()) == null) {
            d = Utils.DOUBLE_EPSILON;
        } else {
            d = a.mo69778c();
        }
        m77150z3(d);
        C28725f0 f0Var = this.f62065H;
        if (f0Var == null) {
            C41536l.m120506z("binding");
            f0Var = null;
        }
        f0Var.f73226f.setEnabled(false);
    }

    /* renamed from: y3 */
    private final void m77149y3(double d) {
        Double d2;
        GTShareTradeReviewActivity.C23907a aVar = GTShareTradeReviewActivity.f62131Q;
        String i3 = m77133i3();
        C25192a e3 = m77129e3();
        String h3 = m77132h3();
        Double d3 = null;
        if (this.f62071N) {
            d2 = Double.valueOf(d);
        } else {
            d2 = null;
        }
        if (!this.f62071N) {
            d3 = Double.valueOf(d);
        }
        aVar.mo60886a(i3, e3, h3, d2, d3, this);
    }

    /* renamed from: z3 */
    private final void m77150z3(double d) {
        String str;
        if (this.f62071N) {
            str = this.f62068K;
        } else {
            str = "";
        }
        C28725f0 f0Var = this.f62065H;
        if (f0Var == null) {
            C41536l.m120506z("binding");
            f0Var = null;
        }
        BigInputView bigInputView = f0Var.f73232l;
        String h = C28786c.m88252h(d);
        bigInputView.setText(h + str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C28725f0 d = C28725f0.m88020d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f62065H = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        mo86436g2();
        super.mo37451O1(bundle);
        m77103H3();
        m77145u3();
        m77135k3().mo60806Jw().mo60815kt(m77129e3());
        m77135k3().mo60806Jw().mo60800An(m77133i3());
        m77135k3().mo60806Jw().mo60814e2(m77129e3(), m77133i3());
    }
}
