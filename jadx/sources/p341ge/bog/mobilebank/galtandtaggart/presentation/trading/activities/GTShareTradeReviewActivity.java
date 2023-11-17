package p341ge.bog.mobilebank.galtandtaggart.presentation.trading.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
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
import he1.C41238w;
import ie0.C25190j;
import if0.C25192a;
import java.io.Serializable;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng0.C26492k;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeViewModel$ViewModel;
import ue0.C28729h0;
import ue1.C43064a;
import ue1.C43075l;
import ug0.C28786c;
import xe0.C29745c;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeReviewActivity */
public final class GTShareTradeReviewActivity extends C23929b {

    /* renamed from: Q */
    public static final C23907a f62131Q = new C23907a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private final C41217g f62132G = new C1617p0(C41520a0.m120436b(GTShareTradeViewModel$ViewModel.class), new C23924m(this), new C23923l(this), new C23925n((C43064a) null, this));

    /* renamed from: H */
    private final C41217g f62133H = C41219i.m119470b(new C23911e(this));
    /* access modifiers changed from: private */

    /* renamed from: I */
    public double f62134I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public double f62135J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public double f62136K;

    /* renamed from: L */
    private final C41217g f62137L = C41219i.m119470b(new C23926o(this));

    /* renamed from: M */
    private final C41217g f62138M = C41219i.m119470b(new C23922k(this));

    /* renamed from: N */
    private final C41217g f62139N = C41219i.m119470b(new C23909c(this));

    /* renamed from: O */
    private final C41217g f62140O = C41219i.m119470b(new C23910d(this));

    /* renamed from: P */
    private final C41217g f62141P = C41219i.m119470b(new C23920i(this));

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeReviewActivity$a */
    public static final class C23907a {
        private C23907a() {
        }

        public /* synthetic */ C23907a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo60886a(String str, C25192a aVar, String str2, Double d, Double d2, Context context) {
            C41536l.m120489i(aVar, "actionType");
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, GTShareTradeReviewActivity.class);
            intent.putExtra("KEY_ACTION_TYPE", aVar);
            intent.putExtra("KEY_SYMBOL", str);
            intent.putExtra("KEY_NAME", str2);
            intent.putExtra("KEY_AMOUNT", d);
            intent.putExtra("KEY_QUANTITY", d2);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeReviewActivity$b */
    public /* synthetic */ class C23908b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f62142a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                if0.a[] r0 = if0.C25192a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                if0.a r1 = if0.C25192a.BUY_SHARE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                if0.a r1 = if0.C25192a.SELL_SHARE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f62142a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeReviewActivity.C23908b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeReviewActivity$c */
    static final class C23909c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeReviewActivity f62143d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23909c(GTShareTradeReviewActivity gTShareTradeReviewActivity) {
            super(0);
            this.f62143d = gTShareTradeReviewActivity;
        }

        /* renamed from: b */
        public final C25192a invoke() {
            Intent intent = this.f62143d.getIntent();
            Serializable serializableExtra = intent != null ? intent.getSerializableExtra("KEY_ACTION_TYPE") : null;
            C41536l.m120487g(serializableExtra, "null cannot be cast to non-null type ge.bog.mobilebank.galtandtaggart.domain.shared.GTActionType");
            return (C25192a) serializableExtra;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeReviewActivity$d */
    static final class C23910d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeReviewActivity f62144d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23910d(GTShareTradeReviewActivity gTShareTradeReviewActivity) {
            super(0);
            this.f62144d = gTShareTradeReviewActivity;
        }

        /* renamed from: b */
        public final Double invoke() {
            Intent intent = this.f62144d.getIntent();
            if (intent != null) {
                return Double.valueOf(intent.getDoubleExtra("KEY_AMOUNT", -1.0d));
            }
            return null;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeReviewActivity$e */
    static final class C23911e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeReviewActivity f62145d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23911e(GTShareTradeReviewActivity gTShareTradeReviewActivity) {
            super(0);
            this.f62145d = gTShareTradeReviewActivity;
        }

        /* renamed from: b */
        public final C28729h0 invoke() {
            C28729h0 d = C28729h0.m88038d(this.f62145d.getLayoutInflater());
            C41536l.m120488h(d, "inflate(\n            layoutInflater\n        )");
            return d;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeReviewActivity$f */
    static final class C23912f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeReviewActivity f62146d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeReviewActivity$f$a */
        static final class C23913a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTShareTradeReviewActivity f62147d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23913a(GTShareTradeReviewActivity gTShareTradeReviewActivity) {
                super(1);
                this.f62147d = gTShareTradeReviewActivity;
            }

            /* renamed from: a */
            public final void mo60891a(boolean z) {
                InlineFeedback inlineFeedback = this.f62147d.m77196U2().f73275j;
                C41536l.m120488h(inlineFeedback, "binding.infoClosedMarket");
                C32343x.m95483r1(inlineFeedback, !z, false, 2, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60891a(((Boolean) obj).booleanValue());
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeReviewActivity$f$b */
        static final class C23914b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTShareTradeReviewActivity f62148d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23914b(GTShareTradeReviewActivity gTShareTradeReviewActivity) {
                super(1);
                this.f62148d = gTShareTradeReviewActivity;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Boolean) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Boolean bool) {
                InlineFeedback inlineFeedback = this.f62148d.m77196U2().f73275j;
                C41536l.m120488h(inlineFeedback, "binding.infoClosedMarket");
                C32343x.m95483r1(inlineFeedback, false, false, 2, (Object) null);
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeReviewActivity$f$c */
        static final class C23915c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTShareTradeReviewActivity f62149d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23915c(GTShareTradeReviewActivity gTShareTradeReviewActivity) {
                super(1);
                this.f62149d = gTShareTradeReviewActivity;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                InlineFeedback inlineFeedback = this.f62149d.m77196U2().f73275j;
                C41536l.m120488h(inlineFeedback, "binding.infoClosedMarket");
                C32343x.m95483r1(inlineFeedback, false, false, 2, (Object) null);
                this.f62149d.mo74709H1(th);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23912f(GTShareTradeReviewActivity gTShareTradeReviewActivity) {
            super(1);
            this.f62146d = gTShareTradeReviewActivity;
        }

        /* renamed from: a */
        public final void mo60890a(C31128a aVar) {
            C41536l.m120488h(aVar, "res");
            C31132b.m92648j(aVar, (int[]) null, new C23913a(this.f62146d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C23914b(this.f62146d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C23915c(this.f62146d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60890a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeReviewActivity$g */
    static final class C23916g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeReviewActivity f62150d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeReviewActivity$g$a */
        public /* synthetic */ class C23917a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f62151a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    if0.a[] r0 = if0.C25192a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    if0.a r1 = if0.C25192a.SELL_SHARE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    if0.a r1 = if0.C25192a.BUY_SHARE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f62151a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeReviewActivity.C23916g.C23917a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23916g(GTShareTradeReviewActivity gTShareTradeReviewActivity) {
            super(1);
            this.f62150d = gTShareTradeReviewActivity;
        }

        /* renamed from: a */
        public final void mo60894a(C31128a aVar) {
            double d;
            if (aVar instanceof C31128a.C31130b) {
                this.f62150d.m77196U2().f73270e.setLoading(true);
                this.f62150d.m77196U2().f73270e.setEnabled(false);
            } else if (aVar instanceof C31128a.C31129a) {
                this.f62150d.m77196U2().f73270e.setLoading(false);
                this.f62150d.m77196U2().f73270e.setEnabled(true);
                this.f62150d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
            } else if (aVar instanceof C31128a.C31131c) {
                this.f62150d.m77196U2().f73270e.setLoading(false);
                this.f62150d.m77196U2().f73270e.setEnabled(false);
                int i = C23917a.f62151a[this.f62150d.m77193R2().ordinal()];
                if (i == 1) {
                    d = this.f62150d.f62135J - this.f62150d.f62134I;
                } else if (i == 2) {
                    d = this.f62150d.f62135J + this.f62150d.f62134I;
                } else {
                    throw new UnsupportedOperationException();
                }
                GTShareTradeResultActivity.f62119J.mo60884a(this.f62150d.m77200Y2(), this.f62150d.m77193R2(), this.f62150d.m77199X2(), Double.valueOf(this.f62150d.f62135J), Double.valueOf(this.f62150d.f62136K), Double.valueOf(d), Double.valueOf(this.f62150d.f62134I), this.f62150d);
                this.f62150d.finish();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60894a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeReviewActivity$h */
    static final class C23918h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeReviewActivity f62152d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeReviewActivity$h$a */
        public /* synthetic */ class C23919a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f62153a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    if0.a[] r0 = if0.C25192a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    if0.a r1 = if0.C25192a.BUY_SHARE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    if0.a r1 = if0.C25192a.SELL_SHARE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f62153a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeReviewActivity.C23918h.C23919a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23918h(GTShareTradeReviewActivity gTShareTradeReviewActivity) {
            super(1);
            this.f62152d = gTShareTradeReviewActivity;
        }

        /* renamed from: a */
        public final void mo60895a(C31128a aVar) {
            double d;
            String str;
            String str2;
            BigDecimal bigDecimal;
            BigDecimal bigDecimal2;
            BigDecimal b;
            String str3;
            Double d2;
            String str4;
            BigDecimal bigDecimal3;
            BigDecimal a;
            BigDecimal b2;
            BigDecimal bigDecimal4 = null;
            if (aVar instanceof C31128a.C31130b) {
                Button button = this.f62152d.m77196U2().f73270e;
                C41536l.m120488h(button, "binding.actionButton");
                C32343x.m95483r1(button, false, false, 2, (Object) null);
                this.f62152d.m77196U2().f73283r.mo53597e();
            } else if (aVar instanceof C31128a.C31129a) {
                Button button2 = this.f62152d.m77196U2().f73270e;
                C41536l.m120488h(button2, "binding.actionButton");
                C32343x.m95483r1(button2, false, false, 2, (Object) null);
                this.f62152d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
                this.f62152d.m77196U2().f73283r.mo53595c();
            } else if (aVar instanceof C31128a.C31131c) {
                this.f62152d.m77196U2().f73283r.mo53595c();
                Button button3 = this.f62152d.m77196U2().f73270e;
                C41536l.m120488h(button3, "binding.actionButton");
                C32343x.m95483r1(button3, true, false, 2, (Object) null);
                GTShareTradeReviewActivity gTShareTradeReviewActivity = this.f62152d;
                C29745c cVar = (C29745c) aVar.mo71340a();
                if (cVar == null || (b2 = cVar.mo69763b()) == null) {
                    d = Utils.DOUBLE_EPSILON;
                } else {
                    d = b2.doubleValue();
                }
                gTShareTradeReviewActivity.f62134I = d;
                if (this.f62152d.m77198W2() != null) {
                    TwoLineTextItem twoLineTextItem = this.f62152d.m77196U2().f73272g;
                    C29745c cVar2 = (C29745c) aVar.mo71340a();
                    if (cVar2 == null || (a = cVar2.mo69762a()) == null) {
                        str4 = null;
                    } else {
                        str4 = C32343x.m95408P(a, "USD");
                    }
                    twoLineTextItem.setText(str4);
                    GTShareTradeReviewActivity gTShareTradeReviewActivity2 = this.f62152d;
                    C29745c cVar3 = (C29745c) aVar.mo71340a();
                    if (cVar3 != null) {
                        bigDecimal3 = cVar3.mo69762a();
                    } else {
                        bigDecimal3 = null;
                    }
                    C41536l.m120486f(bigDecimal3);
                    gTShareTradeReviewActivity2.f62135J = bigDecimal3.doubleValue();
                }
                if (this.f62152d.m77195T2() != null) {
                    TwoLineTextItem twoLineTextItem2 = this.f62152d.m77196U2().f73278m;
                    C29745c cVar4 = (C29745c) aVar.mo71340a();
                    if (cVar4 != null) {
                        str3 = C28786c.m88251g(cVar4.mo69765d());
                    } else {
                        str3 = null;
                    }
                    twoLineTextItem2.setText(str3);
                    GTShareTradeReviewActivity gTShareTradeReviewActivity3 = this.f62152d;
                    C29745c cVar5 = (C29745c) aVar.mo71340a();
                    if (cVar5 != null) {
                        d2 = Double.valueOf(cVar5.mo69765d());
                    } else {
                        d2 = null;
                    }
                    C41536l.m120486f(d2);
                    gTShareTradeReviewActivity3.f62136K = d2.doubleValue();
                }
                TwoLineTextItem twoLineTextItem3 = this.f62152d.m77196U2().f73273h;
                C29745c cVar6 = (C29745c) aVar.mo71340a();
                if (cVar6 == null || (b = cVar6.mo69763b()) == null) {
                    str = null;
                } else {
                    str = C32343x.m95408P(b, "USD");
                }
                twoLineTextItem3.setText(str);
                if (this.f62152d.m77195T2() != null) {
                    Double G2 = this.f62152d.m77195T2();
                    C41536l.m120486f(G2);
                    bigDecimal4 = new BigDecimal(String.valueOf(G2.doubleValue()));
                } else {
                    C29745c cVar7 = (C29745c) aVar.mo71340a();
                    if (cVar7 != null) {
                        bigDecimal4 = cVar7.mo69762a();
                    }
                }
                if (bigDecimal4 == null) {
                    bigDecimal4 = BigDecimal.valueOf(0);
                    C41536l.m120488h(bigDecimal4, "valueOf(this.toLong())");
                }
                TwoLineTextItem twoLineTextItem4 = this.f62152d.m77196U2().f73286u;
                int i = C23919a.f62153a[this.f62152d.m77193R2().ordinal()];
                if (i == 1) {
                    C29745c cVar8 = (C29745c) aVar.mo71340a();
                    if (cVar8 == null || (bigDecimal = cVar8.mo69763b()) == null) {
                        bigDecimal = BigDecimal.valueOf(0);
                        C41536l.m120488h(bigDecimal, "valueOf(this.toLong())");
                    }
                    BigDecimal add = bigDecimal4.add(bigDecimal);
                    C41536l.m120488h(add, "this.add(other)");
                    str2 = C32343x.m95408P(add, "USD");
                } else if (i != 2) {
                    str2 = "";
                } else {
                    C29745c cVar9 = (C29745c) aVar.mo71340a();
                    if (cVar9 == null || (bigDecimal2 = cVar9.mo69763b()) == null) {
                        bigDecimal2 = BigDecimal.valueOf(0);
                        C41536l.m120488h(bigDecimal2, "valueOf(this.toLong())");
                    }
                    BigDecimal subtract = bigDecimal4.subtract(bigDecimal2);
                    C41536l.m120488h(subtract, "this.subtract(other)");
                    str2 = C32343x.m95408P(subtract, "USD");
                }
                twoLineTextItem4.setText(str2);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60895a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeReviewActivity$i */
    static final class C23920i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeReviewActivity f62154d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23920i(GTShareTradeReviewActivity gTShareTradeReviewActivity) {
            super(0);
            this.f62154d = gTShareTradeReviewActivity;
        }

        /* renamed from: b */
        public final Double invoke() {
            Intent intent = this.f62154d.getIntent();
            if (intent != null) {
                return Double.valueOf(intent.getDoubleExtra("KEY_QUANTITY", -1.0d));
            }
            return null;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeReviewActivity$j */
    static final class C23921j implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f62155a;

        C23921j(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f62155a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f62155a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f62155a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeReviewActivity$k */
    static final class C23922k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeReviewActivity f62156d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23922k(GTShareTradeReviewActivity gTShareTradeReviewActivity) {
            super(0);
            this.f62156d = gTShareTradeReviewActivity;
        }

        public final String invoke() {
            return this.f62156d.getIntent().getStringExtra("KEY_NAME");
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeReviewActivity$l */
    public static final class C23923l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f62157d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23923l(ComponentActivity componentActivity) {
            super(0);
            this.f62157d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f62157d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeReviewActivity$m */
    public static final class C23924m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f62158d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23924m(ComponentActivity componentActivity) {
            super(0);
            this.f62158d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f62158d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeReviewActivity$n */
    public static final class C23925n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62159d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f62160e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23925n(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f62159d = aVar;
            this.f62160e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f62159d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f62160e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeReviewActivity$o */
    static final class C23926o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeReviewActivity f62161d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23926o(GTShareTradeReviewActivity gTShareTradeReviewActivity) {
            super(0);
            this.f62161d = gTShareTradeReviewActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = r0.getStringExtra("KEY_SYMBOL");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String invoke() {
            /*
                r2 = this;
                ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeReviewActivity r0 = r2.f62161d
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
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeReviewActivity.C23926o.invoke():java.lang.String");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public final C25192a m77193R2() {
        return (C25192a) this.f62139N.getValue();
    }

    /* renamed from: S2 */
    private final Double m77194S2() {
        return (Double) this.f62140O.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public final Double m77195T2() {
        Double S2 = m77194S2();
        C41536l.m120486f(S2);
        if (S2.doubleValue() < Utils.DOUBLE_EPSILON) {
            return null;
        }
        return S2;
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public final C28729h0 m77196U2() {
        return (C28729h0) this.f62133H.getValue();
    }

    /* renamed from: V2 */
    private final Double m77197V2() {
        return (Double) this.f62141P.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public final Double m77198W2() {
        Double V2 = m77197V2();
        C41536l.m120486f(V2);
        if (V2.doubleValue() < Utils.DOUBLE_EPSILON) {
            return null;
        }
        return V2;
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public final String m77199X2() {
        return (String) this.f62138M.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public final String m77200Y2() {
        return (String) this.f62137L.getValue();
    }

    /* renamed from: Z2 */
    private final GTShareTradeViewModel$ViewModel m77201Z2() {
        return (GTShareTradeViewModel$ViewModel) this.f62132G.getValue();
    }

    /* renamed from: a3 */
    private final void m77202a3() {
        m77201Z2().mo60842uw().mo60841u().mo4819k(this, new C23921j(new C23912f(this)));
        m77201Z2().mo60842uw().mo60837ge().mo4819k(this, new C23921j(new C23916g(this)));
        m77201Z2().mo60842uw().mo60835Ba().mo4819k(this, new C23921j(new C23918h(this)));
    }

    /* renamed from: b3 */
    private final void m77203b3() {
        String str;
        m77196U2().f73275j.setTitleText(C32343x.m95388F("text.gt.working.hours.banner", new Object[0]));
        m77196U2().f73284s.setText(m77199X2());
        if (m77198W2() != null) {
            TwoLineTextItem twoLineTextItem = m77196U2().f73278m;
            Double W2 = m77198W2();
            C41536l.m120486f(W2);
            twoLineTextItem.setText(C28786c.m88249e(String.valueOf(W2.doubleValue())));
        }
        if (m77195T2() != null) {
            TwoLineTextItem twoLineTextItem2 = m77196U2().f73272g;
            Double T2 = m77195T2();
            C41536l.m120486f(T2);
            twoLineTextItem2.setText(C32343x.m95410Q(T2.doubleValue(), "USD", false, 2, (Object) null));
        }
        Button button = m77196U2().f73270e;
        C25192a R2 = m77193R2();
        int[] iArr = C23908b.f62142a;
        int i = iArr[R2.ordinal()];
        String str2 = "";
        if (i == 1) {
            str = getString(C25190j.gt_button_text_task_buy);
        } else if (i != 2) {
            str = str2;
        } else {
            str = getString(C25190j.gt_button_text_task_sell);
        }
        button.setButtonText(str);
        m77196U2().f73270e.setOnClickListener(new C26492k(this));
        TwoLineTextItem twoLineTextItem3 = m77196U2().f73286u;
        int i2 = iArr[m77193R2().ordinal()];
        if (i2 == 1) {
            str2 = getString(C25190j.gt_review_title_total);
        } else if (i2 == 2) {
            str2 = getString(C25190j.gt_review_title_total_after_comission);
        }
        twoLineTextItem3.setTitle(str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public static final void m77204c3(GTShareTradeReviewActivity gTShareTradeReviewActivity, View view) {
        C41536l.m120489i(gTShareTradeReviewActivity, "this$0");
        gTShareTradeReviewActivity.m77201Z2().mo60839sw().mo60836Is();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m77196U2().mo3946b());
        mo86436g2();
        super.mo37451O1(bundle);
        m77203b3();
        m77202a3();
        if (m77194S2() != null) {
            Double S2 = m77194S2();
            C41536l.m120486f(S2);
            if (S2.doubleValue() > Utils.DOUBLE_EPSILON) {
                Double S22 = m77194S2();
                C41536l.m120486f(S22);
                this.f62135J = S22.doubleValue();
            }
        }
        if (m77197V2() != null) {
            Double V2 = m77197V2();
            C41536l.m120486f(V2);
            if (V2.doubleValue() > Utils.DOUBLE_EPSILON) {
                Double V22 = m77197V2();
                C41536l.m120486f(V22);
                this.f62136K = V22.doubleValue();
            }
        }
        m77201Z2().mo60839sw().mo60838lf(m77200Y2(), m77193R2(), m77195T2(), m77198W2());
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        int i = C23908b.f62142a[m77193R2().ordinal()];
        if (i == 1) {
            String string = getString(C25190j.gt_buy);
            String Y2 = m77200Y2();
            return string + " " + Y2;
        } else if (i != 2) {
            return "";
        } else {
            String string2 = getString(C25190j.gt_sell);
            String Y22 = m77200Y2();
            return string2 + " " + Y22;
        }
    }
}
