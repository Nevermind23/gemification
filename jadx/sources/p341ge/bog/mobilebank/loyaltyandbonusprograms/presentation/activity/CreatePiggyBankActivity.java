package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.C1493e0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import ba1.C10210o;
import ba1.C10216u;
import ba1.C10220y;
import dt0.C31598n;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import java.util.ArrayList;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import mt0.C37259c;
import mt0.C37260d;
import o00.C26656a;
import o00.C26657b;
import ot0.C37799x;
import p00.C27113k;
import p163m0.C7047a;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.C33072h;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.C33092j;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankResourcesUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankResult;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.CreatePiggyBankViewModel$ViewModel;
import p341ge.bog.mobilebank.model.offers.Summary;
import p341ge.bog.mobilebank.shared2.network.ApiError;
import p380ck.C10464h;
import p745er.C20288a;
import ue1.C43064a;
import ue1.C43075l;
import vs0.C39443b;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreatePiggyBankActivity */
public final class CreatePiggyBankActivity extends C32901c implements C26656a, C26657b {

    /* renamed from: I */
    public static final C32846a f80696I = new C32846a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private final C41217g f80697G = C41219i.m119470b(new C32857i(this));

    /* renamed from: H */
    private final C41217g f80698H = new C1617p0(C41520a0.m120436b(CreatePiggyBankViewModel$ViewModel.class), new C32866r(this), new C32865q(this), new C32867s((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreatePiggyBankActivity$a */
    public static final class C32846a {
        private C32846a() {
        }

        public /* synthetic */ C32846a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo74736a(Context context) {
            C41536l.m120489i(context, "context");
            context.startActivity(new Intent(context, CreatePiggyBankActivity.class));
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreatePiggyBankActivity$b */
    public /* synthetic */ class C32847b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f80699a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                mt0.b[] r0 = mt0.C37258b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                mt0.b r1 = mt0.C37258b.INFO_CARDS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                mt0.b r1 = mt0.C37258b.OPEN_PIGGY_BANK     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                mt0.b r1 = mt0.C37258b.FINISH_ACTIVITY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f80699a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreatePiggyBankActivity.C32847b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreatePiggyBankActivity$c */
    static final class C32848c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreatePiggyBankActivity f80700d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32848c(CreatePiggyBankActivity createPiggyBankActivity) {
            super(1);
            this.f80700d = createPiggyBankActivity;
        }

        /* renamed from: a */
        public final void mo74737a(C37223a aVar) {
            C37260d dVar = (C37260d) aVar.mo90296a();
            if (dVar != null) {
                this.f80700d.m96993Q2(dVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74737a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreatePiggyBankActivity$d */
    static final class C32849d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreatePiggyBankActivity f80701d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32849d(CreatePiggyBankActivity createPiggyBankActivity) {
            super(1);
            this.f80701d = createPiggyBankActivity;
        }

        /* renamed from: a */
        public final void mo74738a(C37259c cVar) {
            this.f80701d.m96991O2().f93681e.getButton().setButtonText(cVar.mo90351b());
            this.f80701d.m96991O2().f93681e.getButton().setEnabled(cVar.mo90350a());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74738a((C37259c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreatePiggyBankActivity$e */
    static final class C32850e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreatePiggyBankActivity f80702d;

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreatePiggyBankActivity$e$a */
        static final class C32851a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ CreatePiggyBankActivity f80703d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32851a(CreatePiggyBankActivity createPiggyBankActivity) {
                super(1);
                this.f80703d = createPiggyBankActivity;
            }

            /* renamed from: a */
            public final void mo74740a(PiggyBankResourcesUiModel piggyBankResourcesUiModel) {
                this.f80703d.m96997U2(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo74740a((PiggyBankResourcesUiModel) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreatePiggyBankActivity$e$b */
        static final class C32852b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ CreatePiggyBankActivity f80704d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32852b(CreatePiggyBankActivity createPiggyBankActivity) {
                super(1);
                this.f80704d = createPiggyBankActivity;
            }

            /* renamed from: a */
            public final void mo74741a(PiggyBankResourcesUiModel piggyBankResourcesUiModel) {
                C41536l.m120489i(piggyBankResourcesUiModel, "it");
                this.f80704d.m96991O2().f93683g.setVisibility(8);
                this.f80704d.m96997U2(false);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo74741a((PiggyBankResourcesUiModel) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreatePiggyBankActivity$e$c */
        static final class C32853c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ CreatePiggyBankActivity f80705d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32853c(CreatePiggyBankActivity createPiggyBankActivity) {
                super(1);
                this.f80705d = createPiggyBankActivity;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "err");
                this.f80705d.m96997U2(false);
                this.f80705d.m96999W2(th);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32850e(CreatePiggyBankActivity createPiggyBankActivity) {
            super(1);
            this.f80702d = createPiggyBankActivity;
        }

        /* renamed from: a */
        public final void mo74739a(C31128a aVar) {
            C41536l.m120488h(aVar, "it");
            C31132b.m92646h(aVar, (int[]) null, new C32851a(this.f80702d), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C32852b(this.f80702d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C32853c(this.f80702d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74739a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreatePiggyBankActivity$f */
    /* synthetic */ class C32854f extends C41535k implements C43075l {
        C32854f(Object obj) {
            super(1, obj, CreatePiggyBankActivity.class, "onPiggyBankResult", "onPiggyBankResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo74743b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((CreatePiggyBankActivity) this.receiver).m96994R2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74743b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreatePiggyBankActivity$g */
    /* synthetic */ class C32855g extends C41535k implements C43075l {
        C32855g(Object obj) {
            super(1, obj, CreatePiggyBankActivity.class, "onPreContract", "onPreContract(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo74744b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((CreatePiggyBankActivity) this.receiver).m96995S2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74744b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreatePiggyBankActivity$h */
    static final class C32856h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreatePiggyBankActivity f80706d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32856h(CreatePiggyBankActivity createPiggyBankActivity) {
            super(1);
            this.f80706d = createPiggyBankActivity;
        }

        /* renamed from: a */
        public final void mo74745a(C37223a aVar) {
            String str = (String) aVar.mo90296a();
            if (str != null) {
                this.f80706d.m96996T2(str);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74745a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreatePiggyBankActivity$i */
    static final class C32857i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CreatePiggyBankActivity f80707d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32857i(CreatePiggyBankActivity createPiggyBankActivity) {
            super(0);
            this.f80707d = createPiggyBankActivity;
        }

        /* renamed from: b */
        public final C39443b invoke() {
            return C39443b.m114622d(this.f80707d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreatePiggyBankActivity$j */
    static final class C32858j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreatePiggyBankActivity f80708d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32858j(CreatePiggyBankActivity createPiggyBankActivity) {
            super(1);
            this.f80708d = createPiggyBankActivity;
        }

        /* renamed from: a */
        public final void mo74747a(PiggyBankResult piggyBankResult) {
            this.f80708d.m96997U2(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74747a((PiggyBankResult) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreatePiggyBankActivity$k */
    static final class C32859k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreatePiggyBankActivity f80709d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32859k(CreatePiggyBankActivity createPiggyBankActivity) {
            super(1);
            this.f80709d = createPiggyBankActivity;
        }

        /* renamed from: a */
        public final void mo74748a(PiggyBankResult piggyBankResult) {
            C41536l.m120489i(piggyBankResult, "it");
            this.f80709d.m96997U2(false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74748a((PiggyBankResult) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreatePiggyBankActivity$l */
    static final class C32860l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreatePiggyBankActivity f80710d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32860l(CreatePiggyBankActivity createPiggyBankActivity) {
            super(1);
            this.f80710d = createPiggyBankActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f80710d.m96997U2(false);
            this.f80710d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreatePiggyBankActivity$m */
    static final class C32861m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreatePiggyBankActivity f80711d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32861m(CreatePiggyBankActivity createPiggyBankActivity) {
            super(1);
            this.f80711d = createPiggyBankActivity;
        }

        /* renamed from: a */
        public final void mo74750a(String str) {
            C41536l.m120489i(str, "it");
            this.f80711d.m96997U2(false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74750a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreatePiggyBankActivity$n */
    static final class C32862n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreatePiggyBankActivity f80712d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32862n(CreatePiggyBankActivity createPiggyBankActivity) {
            super(1);
            this.f80712d = createPiggyBankActivity;
        }

        /* renamed from: a */
        public final void mo74751a(String str) {
            this.f80712d.m96997U2(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74751a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreatePiggyBankActivity$o */
    static final class C32863o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreatePiggyBankActivity f80713d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32863o(CreatePiggyBankActivity createPiggyBankActivity) {
            super(1);
            this.f80713d = createPiggyBankActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f80713d.m96997U2(false);
            this.f80713d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreatePiggyBankActivity$p */
    static final class C32864p implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f80714a;

        C32864p(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f80714a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f80714a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f80714a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreatePiggyBankActivity$q */
    public static final class C32865q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f80715d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32865q(ComponentActivity componentActivity) {
            super(0);
            this.f80715d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f80715d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreatePiggyBankActivity$r */
    public static final class C32866r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f80716d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32866r(ComponentActivity componentActivity) {
            super(0);
            this.f80716d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f80716d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreatePiggyBankActivity$s */
    public static final class C32867s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f80717d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f80718e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32867s(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f80717d = aVar;
            this.f80718e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f80717d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f80718e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: M2 */
    private final void m96989M2() {
        m96991O2().f93681e.getButton().setOnClickListener(new C31598n(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public static final void m96990N2(CreatePiggyBankActivity createPiggyBankActivity, View view) {
        C41536l.m120489i(createPiggyBankActivity, "this$0");
        Fragment j0 = createPiggyBankActivity.getSupportFragmentManager().mo4415j0(C10216u.f28298P0);
        if (j0 instanceof C33092j) {
            C32343x.m95393H0(createPiggyBankActivity, "piggy_bank", (String) null, "piggy_bank_intro_page_next_button", C10464h.C10465a.FIREBASE, (Bundle) null, 18, (Object) null);
        } else if (j0 instanceof C33072h) {
            C32343x.m95393H0(createPiggyBankActivity, "piggy_bank", (String) null, "piggy_bank_select_amount_and_account_next_button", C10464h.C10465a.FIREBASE, (Bundle) null, 18, (Object) null);
        }
        createPiggyBankActivity.m96992P2().mo75225Cw().mo75231S7();
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public final C39443b m96991O2() {
        return (C39443b) this.f80697G.getValue();
    }

    /* renamed from: P2 */
    private final CreatePiggyBankViewModel$ViewModel m96992P2() {
        return (CreatePiggyBankViewModel$ViewModel) this.f80698H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public final void m96993Q2(C37260d dVar) {
        int i = C32847b.f80699a[dVar.mo90355a().ordinal()];
        if (i == 1) {
            m96998V2(C33092j.f81001j.mo74973a(), dVar.mo90356b(), C10210o.f28262e);
        } else if (i == 2) {
            m96998V2(C33072h.f80979i.mo74959a(), dVar.mo90356b(), C10210o.f28261d);
        } else if (i == 3) {
            finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public final void m96994R2(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C32858j(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C32859k(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C32860l(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public final void m96995S2(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C32861m(this), 1, (Object) null);
        C31132b.m92646h(aVar, (int[]) null, new C32862n(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C32863o(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public final void m96996T2(String str) {
        C27113k c = C27113k.C27114a.m84066c(C27113k.f68083P, str, false, (String) null, (ArrayList) null, (Summary) null, C32343x.m95388F("cas.service.open.title", new Object[0]), 30, (Object) null);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        c.mo4576A1(supportFragmentManager, "PreContractDialogFragment");
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public final void m96997U2(boolean z) {
        m96991O2().f93681e.getButton().setLoading(z);
        m96991O2().f93686j.setLoading(z);
    }

    /* renamed from: V2 */
    private final void m96998V2(Fragment fragment, boolean z, int i) {
        C1493e0 p = getSupportFragmentManager().mo4428p();
        if (z) {
            p.mo4642u(i, 0, 0, 0);
        }
        p.mo4639r(m96991O2().f93685i.getId(), fragment).mo4636g((String) null).mo4515i();
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public final void m96999W2(Throwable th) {
        String str;
        mo74709H1(th);
        m96991O2().f93683g.setVisibility(0);
        if (th instanceof ApiError) {
            str = C32343x.m95420V(((ApiError) th).mo84685a().getKey(), C32343x.m95452h0(C10220y.f28366O0, new Object[0]), new Object[0]);
        } else {
            str = C32343x.m95452h0(C10220y.f28366O0, new Object[0]);
        }
        m96991O2().f93684h.setText(str);
    }

    /* renamed from: l1 */
    private final void m97000l1() {
        C37799x Dw = m96992P2().mo75226Dw();
        Dw.mo75234dp().mo4819k(this, new C32864p(new C32848c(this)));
        Dw.mo75232Ui().mo4819k(this, new C32864p(new C32849d(this)));
        Dw.mo75239vs().mo4819k(this, new C32864p(new C32850e(this)));
        Dw.mo75230Pk().mo4819k(this, new C32864p(new C32854f(this)));
        Dw.mo75237pv().mo4819k(this, new C32864p(new C32855g(this)));
        Dw.mo75238v6().mo4819k(this, new C32864p(new C32856h(this)));
    }

    /* renamed from: C */
    public void mo39136C() {
        m96992P2().mo75225Cw().mo75227Gg();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m96991O2().mo3946b());
        super.mo37451O1(bundle);
        m97000l1();
        m96989M2();
    }

    /* renamed from: m */
    public void mo39137m() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        C27113k c = C20288a.m66328c(supportFragmentManager, (String) null, 2, (Object) null);
        if (c != null) {
            c.mo4577k1();
        }
        C32343x.m95393H0(this, "piggy_bank", (String) null, "piggy_bank_create", C10464h.C10465a.FIREBASE, (Bundle) null, 18, (Object) null);
        m96992P2().mo75225Cw().mo75231S7();
    }

    public void onBackPressed() {
        super.onBackPressed();
        m96992P2().mo75227Gg();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("cas.service.open.title", new Object[0]);
    }
}
