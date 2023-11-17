package p341ge.bog.mobilebank.cardapplications.presentation.activity.instantcards;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.activity.ComponentActivity;
import androidx.activity.result.C0173b;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ld0.C25950a;
import m41.C37224b;
import o00.C26656a;
import o00.C26657b;
import o31.C37588a0;
import o31.C37613p;
import p00.C27113k;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.actionsheet.additionalactions.model.SelectorConfig;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonCheckboxView;
import p341ge.bog.mobilebank.cardapplications.presentation.actionsheet.AddressChooserActionSheet;
import p341ge.bog.mobilebank.cardapplications.presentation.activity.OrderCardResultActivity;
import p341ge.bog.mobilebank.cardapplications.presentation.model.AddressAdapterModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.OrderCardResult;
import p341ge.bog.mobilebank.cardapplications.presentation.model.OrderDebitCardData;
import p341ge.bog.mobilebank.model.offers.Summary;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p363bh.C10282f;
import p380ck.C10464h;
import p392dh.C12129b;
import p411em.C12490g;
import p412en.C12515e2;
import p412en.C12684x1;
import p412en.C12712z1;
import p481jm.C16231j;
import p607sm.C17877r;
import p607sm.C17878s;
import p607sm.C17879t;
import p607sm.C17880u;
import p607sm.C17881v;
import p607sm.C17882w;
import p621tm.C18008j;
import p674xm.C18781a;
import p674xm.C18813o;
import p702zm.C19074c;
import p702zm.C19079d;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity */
public final class InstantDeliveryApplicationActivity extends C14184c implements C26656a, C26657b {

    /* renamed from: M */
    public static final C14131a f41531M = new C14131a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private final C41217g f41532G = C41219i.m119470b(new C14146m(this));

    /* renamed from: H */
    private final C41217g f41533H = C41219i.m119470b(new C14147n(this));

    /* renamed from: I */
    public C12684x1 f41534I;

    /* renamed from: J */
    private final C41217g f41535J = new C1617p0(C41520a0.m120436b(C12515e2.class), new C14159z(this), new C14134b0(this), new C14132a0((C43064a) null, this));

    /* renamed from: K */
    private TextWatcher f41536K;

    /* renamed from: L */
    private final C41217g f41537L = C41219i.m119470b(C14148o.f41546d);

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity$a */
    public static final class C14131a {
        private C14131a() {
        }

        public /* synthetic */ C14131a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo39214a(Context context, OrderDebitCardData orderDebitCardData, C0173b bVar) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(orderDebitCardData, "data");
            C41536l.m120489i(bVar, "launcher");
            bVar.mo404a(C37613p.m110614a(new Intent(context, InstantDeliveryApplicationActivity.class), C41233s.m119492a("ARG_DATA", orderDebitCardData)));
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity$a0 */
    public static final class C14132a0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f41538d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f41539e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14132a0(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f41538d = aVar;
            this.f41539e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f41538d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f41539e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity$b */
    public /* synthetic */ class C14133b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41540a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                xm.p[] r0 = p674xm.C18814p.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                xm.p r1 = p674xm.C18814p.DISABLED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                xm.p r1 = p674xm.C18814p.ENABLED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                xm.p r1 = p674xm.C18814p.LOADING     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f41540a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity.C14133b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity$b0 */
    static final class C14134b0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ InstantDeliveryApplicationActivity f41541d;

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity$b0$a */
        static final class C14135a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ InstantDeliveryApplicationActivity f41542d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14135a(InstantDeliveryApplicationActivity instantDeliveryApplicationActivity) {
                super(0);
                this.f41542d = instantDeliveryApplicationActivity;
            }

            /* renamed from: b */
            public final C12515e2 invoke() {
                return this.f41542d.mo39213j3().mo32567a(this.f41542d.m52383i3());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14134b0(InstantDeliveryApplicationActivity instantDeliveryApplicationActivity) {
            super(0);
            this.f41541d = instantDeliveryApplicationActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C14135a(this.f41541d));
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity$c */
    public static final class C14136c implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ InstantDeliveryApplicationActivity f41543d;

        public C14136c(InstantDeliveryApplicationActivity instantDeliveryApplicationActivity) {
            this.f41543d = instantDeliveryApplicationActivity;
        }

        public void afterTextChanged(Editable editable) {
            String obj;
            if (editable != null && (obj = editable.toString()) != null) {
                this.f41543d.m52386l3().mo33130Ew().mo33136Jt(obj);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity$d */
    /* synthetic */ class C14137d extends C41535k implements C43075l {
        C14137d(Object obj) {
            super(1, obj, InstantDeliveryApplicationActivity.class, "onApiRequestResult", "onApiRequestResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo39219b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((InstantDeliveryApplicationActivity) this.receiver).m52388n3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39219b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity$e */
    /* synthetic */ class C14138e extends C41535k implements C43075l {
        C14138e(Object obj) {
            super(1, obj, InstantDeliveryApplicationActivity.class, "onInputChange", "onInputChange(Lge/bog/mobilebank/cardapplications/presentation/model/instantdelivery/InstantDeliveryInput;)V", 0);
        }

        /* renamed from: b */
        public final void mo39220b(C19079d dVar) {
            C41536l.m120489i(dVar, "p0");
            ((InstantDeliveryApplicationActivity) this.receiver).m52389o3(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39220b((C19079d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity$f */
    /* synthetic */ class C14139f extends C41535k implements C43075l {
        C14139f(Object obj) {
            super(1, obj, InstantDeliveryApplicationActivity.class, "openAddressChooserActionSheet", "openAddressChooserActionSheet(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo39221b(List list) {
            C41536l.m120489i(list, "p0");
            ((InstantDeliveryApplicationActivity) this.receiver).m52394t3(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39221b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity$g */
    /* synthetic */ class C14140g extends C41535k implements C43075l {
        C14140g(Object obj) {
            super(1, obj, InstantDeliveryApplicationActivity.class, "openPinPhoneChooser", "openPinPhoneChooser(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo39222b(List list) {
            C41536l.m120489i(list, "p0");
            ((InstantDeliveryApplicationActivity) this.receiver).m52395u3(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39222b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity$h */
    /* synthetic */ class C14141h extends C41535k implements C43075l {
        C14141h(Object obj) {
            super(1, obj, C18008j.class, "submitList", "submitList(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo39223b(List list) {
            ((C18008j) this.receiver).mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39223b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity$i */
    /* synthetic */ class C14142i extends C41535k implements C43075l {
        C14142i(Object obj) {
            super(1, obj, InstantDeliveryApplicationActivity.class, "setNextButtonData", "setNextButtonData(Lge/bog/mobilebank/cardapplications/presentation/model/NextButtonData;)V", 0);
        }

        /* renamed from: b */
        public final void mo39224b(C18813o oVar) {
            C41536l.m120489i(oVar, "p0");
            ((InstantDeliveryApplicationActivity) this.receiver).m52399y3(oVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39224b((C18813o) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity$j */
    /* synthetic */ class C14143j extends C41535k implements C43075l {
        C14143j(Object obj) {
            super(1, obj, InstantDeliveryApplicationActivity.class, "onPreContractResult", "onPreContractResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo39225b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((InstantDeliveryApplicationActivity) this.receiver).m52392r3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39225b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity$k */
    /* synthetic */ class C14144k extends C41535k implements C43075l {
        C14144k(Object obj) {
            super(1, obj, InstantDeliveryApplicationActivity.class, "openPreContract", "openPreContract(Lge/bog/mobilebank/domain/precontract/model/PreContract;)V", 0);
        }

        /* renamed from: b */
        public final void mo39226b(C25950a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((InstantDeliveryApplicationActivity) this.receiver).m52396v3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39226b((C25950a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity$l */
    /* synthetic */ class C14145l extends C41535k implements C43075l {
        C14145l(Object obj) {
            super(1, obj, InstantDeliveryApplicationActivity.class, "onOrderCardResult", "onOrderCardResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo39227b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((InstantDeliveryApplicationActivity) this.receiver).m52390p3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39227b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity$m */
    static final class C14146m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ InstantDeliveryApplicationActivity f41544d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14146m(InstantDeliveryApplicationActivity instantDeliveryApplicationActivity) {
            super(0);
            this.f41544d = instantDeliveryApplicationActivity;
        }

        /* renamed from: b */
        public final C16231j invoke() {
            return C16231j.m57855d(this.f41544d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity$n */
    static final class C14147n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ InstantDeliveryApplicationActivity f41545d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14147n(InstantDeliveryApplicationActivity instantDeliveryApplicationActivity) {
            super(0);
            this.f41545d = instantDeliveryApplicationActivity;
        }

        /* renamed from: b */
        public final OrderDebitCardData invoke() {
            Parcelable parcelableExtra = this.f41545d.getIntent().getParcelableExtra("ARG_DATA");
            C41536l.m120486f(parcelableExtra);
            return (OrderDebitCardData) parcelableExtra;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity$o */
    static final class C14148o extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C14148o f41546d = new C14148o();

        C14148o() {
            super(0);
        }

        /* renamed from: b */
        public final C18008j invoke() {
            return new C18008j();
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity$p */
    static final class C14149p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31128a f41547d;

        /* renamed from: e */
        final /* synthetic */ InstantDeliveryApplicationActivity f41548e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14149p(C31128a aVar, InstantDeliveryApplicationActivity instantDeliveryApplicationActivity) {
            super(1);
            this.f41547d = aVar;
            this.f41548e = instantDeliveryApplicationActivity;
        }

        /* renamed from: a */
        public final void mo39231a(C41238w wVar) {
            int b = this.f41547d.mo71341b();
            if (b == 1 || b == 6) {
                this.f41548e.m52382h3().f45874h.mo53597e();
            } else {
                this.f41548e.m52350A3(true);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39231a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity$q */
    static final class C14150q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31128a f41549d;

        /* renamed from: e */
        final /* synthetic */ InstantDeliveryApplicationActivity f41550e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14150q(C31128a aVar, InstantDeliveryApplicationActivity instantDeliveryApplicationActivity) {
            super(1);
            this.f41549d = aVar;
            this.f41550e = instantDeliveryApplicationActivity;
        }

        /* renamed from: a */
        public final void mo39232a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            int b = this.f41549d.mo71341b();
            if (b == 1 || b == 6) {
                this.f41550e.m52382h3().f45874h.mo53595c();
            } else {
                this.f41550e.m52350A3(false);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39232a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity$r */
    static final class C14151r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31128a f41551d;

        /* renamed from: e */
        final /* synthetic */ InstantDeliveryApplicationActivity f41552e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14151r(C31128a aVar, InstantDeliveryApplicationActivity instantDeliveryApplicationActivity) {
            super(1);
            this.f41551d = aVar;
            this.f41552e = instantDeliveryApplicationActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            int b = this.f41551d.mo71341b();
            if (b == 1 || b == 6) {
                this.f41552e.m52382h3().f45874h.mo53596d();
                this.f41552e.m52352C3(th);
                return;
            }
            this.f41552e.m52350A3(false);
            this.f41552e.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity$s */
    static final class C14152s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ InstantDeliveryApplicationActivity f41553d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14152s(InstantDeliveryApplicationActivity instantDeliveryApplicationActivity) {
            super(1);
            this.f41553d = instantDeliveryApplicationActivity;
        }

        /* renamed from: a */
        public final void mo39234a(OrderCardResult orderCardResult) {
            InstantDeliveryApplicationActivity.m52391q3(this.f41553d, true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39234a((OrderCardResult) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity$t */
    static final class C14153t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ InstantDeliveryApplicationActivity f41554d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14153t(InstantDeliveryApplicationActivity instantDeliveryApplicationActivity) {
            super(1);
            this.f41554d = instantDeliveryApplicationActivity;
        }

        /* renamed from: a */
        public final void mo39235a(OrderCardResult orderCardResult) {
            C41536l.m120489i(orderCardResult, "it");
            C32343x.m95393H0(this.f41554d, "Instant_Delivery", "success", "Finish_order", C10464h.C10465a.FIREBASE, (Bundle) null, 16, (Object) null);
            InstantDeliveryApplicationActivity.m52391q3(this.f41554d, false);
            this.f41554d.setResult(3);
            OrderCardResultActivity.f41431N.mo39121a(this.f41554d, orderCardResult);
            this.f41554d.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39235a((OrderCardResult) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity$u */
    static final class C14154u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ InstantDeliveryApplicationActivity f41555d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14154u(InstantDeliveryApplicationActivity instantDeliveryApplicationActivity) {
            super(1);
            this.f41555d = instantDeliveryApplicationActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C32343x.m95393H0(this.f41555d, "Instant_Delivery", "fail", "Finish_order", C10464h.C10465a.FIREBASE, (Bundle) null, 16, (Object) null);
            InstantDeliveryApplicationActivity.m52391q3(this.f41555d, false);
            this.f41555d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity$v */
    static final class C14155v extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ InstantDeliveryApplicationActivity f41556d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14155v(InstantDeliveryApplicationActivity instantDeliveryApplicationActivity) {
            super(1);
            this.f41556d = instantDeliveryApplicationActivity;
        }

        /* renamed from: a */
        public final void mo39237a(C25950a aVar) {
            InstantDeliveryApplicationActivity.m52393s3(this.f41556d, true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39237a((C25950a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity$w */
    static final class C14156w extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ InstantDeliveryApplicationActivity f41557d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14156w(InstantDeliveryApplicationActivity instantDeliveryApplicationActivity) {
            super(1);
            this.f41557d = instantDeliveryApplicationActivity;
        }

        /* renamed from: a */
        public final void mo39238a(C25950a aVar) {
            C41536l.m120489i(aVar, "it");
            InstantDeliveryApplicationActivity.m52393s3(this.f41557d, false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39238a((C25950a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity$x */
    static final class C14157x extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ InstantDeliveryApplicationActivity f41558d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14157x(InstantDeliveryApplicationActivity instantDeliveryApplicationActivity) {
            super(1);
            this.f41558d = instantDeliveryApplicationActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            InstantDeliveryApplicationActivity.m52393s3(this.f41558d, false);
            this.f41558d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity$y */
    static final class C14158y implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f41559a;

        C14158y(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f41559a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f41559a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f41559a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity$z */
    public static final class C14159z extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f41560d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14159z(ComponentActivity componentActivity) {
            super(0);
            this.f41560d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f41560d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public final void m52350A3(boolean z) {
        FrameLayout frameLayout = m52382h3().f45889w;
        C41536l.m120488h(frameLayout, "binding.regularLoader");
        C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
        ProgressBar progressBar = m52382h3().f45890x;
        C41536l.m120488h(progressBar, "binding.regularLoaderProgress");
        C32343x.m95483r1(progressBar, z, false, 2, (Object) null);
    }

    /* renamed from: B3 */
    private final void m52351B3() {
        C16231j h3 = m52382h3();
        h3.f45871e.setTitle(C32343x.m95388F("card.instant.delivery.address.details", new Object[0]));
        h3.f45875i.setHintText((CharSequence) C32343x.m95388F("text.card.applications.delivery.region", new Object[0]));
        h3.f45880n.setHintText((CharSequence) C32343x.m95388F("text.card.applications.delivery.address", new Object[0]));
        h3.f45880n.setInfoText(C32343x.m95388F("text.card.applications.instant.delivery.address.description", new Object[0]));
        h3.f45888v.setTitle(C32343x.m95388F("text.applications.pin.delivery.types", new Object[0]));
        h3.f45885s.setHintText((CharSequence) C32343x.m95388F("text.card.applications.pin.delivery.phone", new Object[0]));
        h3.f45885s.setInfoText(C32343x.m95388F("text.card.applications.pin.delivery.phone.desc", new Object[0]));
        FixedButtonCheckboxView fixedButtonCheckboxView = h3.f45886t;
        fixedButtonCheckboxView.getButton().setButtonText(C32343x.m95388F("text.card.applications.button.order", new Object[0]));
        fixedButtonCheckboxView.getCheckbox().mo35145g(C32343x.m95388F("text.card.applications.agree", new Object[0]), C32343x.m95388F("text.card.applications.agree.with.terms", new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public final void m52352C3(Throwable th) {
        m52382h3().f45876j.setText(C32343x.m95428Z(th, C32343x.m95452h0(C12490g.f37227b, new Object[0])));
    }

    /* renamed from: Z2 */
    private final void m52374Z2() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.mo4367F1("ADDRESS_SELECTED", this, new C17877r(this));
        supportFragmentManager.mo4367F1("REQUEST_KEY_DELIVERY_PHONE", this, new C17878s(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public static final void m52375a3(InstantDeliveryApplicationActivity instantDeliveryApplicationActivity, String str, Bundle bundle) {
        C41536l.m120489i(instantDeliveryApplicationActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        AddressAdapterModel addressAdapterModel = (AddressAdapterModel) bundle.getParcelable("SELECTED_ADDRESS");
        if (addressAdapterModel != null) {
            instantDeliveryApplicationActivity.m52386l3().mo33130Ew().mo33144bg(addressAdapterModel);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public static final void m52376b3(InstantDeliveryApplicationActivity instantDeliveryApplicationActivity, String str, Bundle bundle) {
        List list;
        Object Y;
        C41536l.m120489i(instantDeliveryApplicationActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        Serializable serializable = bundle.getSerializable("SELECTOR_RESULT_KEY");
        if (serializable instanceof List) {
            list = (List) serializable;
        } else {
            list = null;
        }
        if (list != null && (Y = C41358y.m120009Y(list)) != null) {
            instantDeliveryApplicationActivity.m52386l3().mo33130Ew().mo33129C2(Y.toString());
        }
    }

    /* renamed from: c3 */
    private final void m52377c3() {
        C16231j h3 = m52382h3();
        h3.f45875i.setOnClickListener(new C17879t(this));
        EditText textInput = h3.f45880n.getTextInput();
        C14136c cVar = new C14136c(this);
        textInput.addTextChangedListener(cVar);
        this.f41536K = cVar;
        h3.f45885s.setOnClickListener(new C17880u(this));
        h3.f45886t.getCheckbox().setOnCheckedStateChangeListener(new C17881v(this));
        h3.f45886t.getButton().setOnClickListener(new C17882w(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public static final void m52378d3(InstantDeliveryApplicationActivity instantDeliveryApplicationActivity, View view) {
        C41536l.m120489i(instantDeliveryApplicationActivity, "this$0");
        instantDeliveryApplicationActivity.m52386l3().mo33130Ew().mo33143X5();
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public static final void m52379e3(InstantDeliveryApplicationActivity instantDeliveryApplicationActivity, View view) {
        C41536l.m120489i(instantDeliveryApplicationActivity, "this$0");
        instantDeliveryApplicationActivity.m52386l3().mo33130Ew().mo33150u6();
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public static final void m52380f3(InstantDeliveryApplicationActivity instantDeliveryApplicationActivity, CompoundButton compoundButton, boolean z, boolean z2) {
        C41536l.m120489i(instantDeliveryApplicationActivity, "this$0");
        C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
        instantDeliveryApplicationActivity.m52386l3().mo33130Ew().mo33138K0(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public static final void m52381g3(InstantDeliveryApplicationActivity instantDeliveryApplicationActivity, View view) {
        C41536l.m120489i(instantDeliveryApplicationActivity, "this$0");
        instantDeliveryApplicationActivity.m52386l3().mo33130Ew().mo33152w3();
        C32343x.m95393H0(instantDeliveryApplicationActivity, "Instant_Delivery", "", "Click_order", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 16, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public final C16231j m52382h3() {
        return (C16231j) this.f41532G.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public final OrderDebitCardData m52383i3() {
        return (OrderDebitCardData) this.f41533H.getValue();
    }

    /* renamed from: k3 */
    private final C18008j m52384k3() {
        return (C18008j) this.f41537L.getValue();
    }

    /* renamed from: l1 */
    private final void m52385l1() {
        C12712z1 Mw = m52386l3().mo33140Mw();
        Mw.mo33148i().mo4819k(this, new C14158y(new C14137d(this)));
        Mw.mo33147f().mo4819k(this, new C14158y(new C14138e(this)));
        C37224b.m109963b(Mw.mo33149j9(), this, new C14139f(this));
        C37224b.m109963b(Mw.mo33128Bm(), this, new C14140g(this));
        Mw.mo33153y0().mo4819k(this, new C14158y(new C14141h(m52384k3())));
        Mw.mo33135J1().mo4819k(this, new C14158y(new C14142i(this)));
        Mw.mo33146ee().mo4819k(this, new C14158y(new C14143j(this)));
        C37224b.m109963b(Mw.mo33151w2(), this, new C14144k(this));
        Mw.mo33142Vg().mo4819k(this, new C14158y(new C14145l(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public final C12515e2 m52386l3() {
        return (C12515e2) this.f41535J.getValue();
    }

    /* renamed from: m3 */
    private final void m52387m3() {
        Object systemService = getSystemService("input_method");
        C41536l.m120487g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(m52382h3().mo3946b().getWindowToken(), 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public final void m52388n3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C14149p(aVar, this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C14150q(aVar, this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C14151r(aVar, this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0036, code lost:
        if (r1 == null) goto L_0x0038;
     */
    /* renamed from: o3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m52389o3(p702zm.C19079d r6) {
        /*
            r5 = this;
            jm.j r0 = r5.m52382h3()
            ge.bog.designsystem.components.input.Input r0 = r0.f45875i
            zm.c$b r1 = r6.mo47283c()
            zm.a r1 = r1.mo47271b()
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0038
            pm.d r3 = r1.mo47256a()
            java.lang.String r3 = r3.mo44908b()
            pm.d r1 = r1.mo47257b()
            java.lang.String r1 = r1.mo44908b()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = ", "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            if (r1 != 0) goto L_0x0039
        L_0x0038:
            r1 = r2
        L_0x0039:
            r0.setInputText(r1)
            zm.c$d r0 = r6.mo47284d()
            r5.m52397w3(r0)
            jm.j r0 = r5.m52382h3()
            ge.bog.designsystem.components.input.Input r0 = r0.f45885s
            zm.c$d r6 = r6.mo47285e()
            java.lang.String r6 = r6.mo47275a()
            if (r6 != 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r2 = r6
        L_0x0055:
            r0.setInputText(r2)
            jm.j r6 = r5.m52382h3()
            ge.bog.designsystem.components.input.Input r6 = r6.f45885s
            r0 = 0
            r6.setEnabled(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity.m52389o3(zm.d):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public final void m52390p3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C14152s(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C14153t(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C14154u(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public static final void m52391q3(InstantDeliveryApplicationActivity instantDeliveryApplicationActivity, boolean z) {
        instantDeliveryApplicationActivity.m52398x3(z);
        instantDeliveryApplicationActivity.m52382h3().f45886t.getButton().setLoading(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public final void m52392r3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C14155v(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C14156w(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C14157x(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public static final void m52393s3(InstantDeliveryApplicationActivity instantDeliveryApplicationActivity, boolean z) {
        instantDeliveryApplicationActivity.m52398x3(z);
        instantDeliveryApplicationActivity.m52382h3().f45886t.getButton().setLoading(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public final void m52394t3(List list) {
        m52387m3();
        AddressChooserActionSheet.C13935a.m51910b(AddressChooserActionSheet.f41314P, list, C18781a.INSTANT_DELIVERY_DISTRICT, (Set) null, (String) null, 12, (Object) null).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public final void m52395u3(List list) {
        C10282f e = C10282f.C10283a.m37495e(C10282f.f28515F, new SelectorConfig(C32343x.m95388F("text.card.applications.pin.delivery.phone", new Object[0]), false, (String) null, false, false, (String) null, "REQUEST_KEY_DELIVERY_PHONE", false, false, 446, (DefaultConstructorMarker) null), (C12129b) null, 2, (Object) null);
        m52387m3();
        e.mo26881q2(list);
        e.mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public final void m52396v3(C25950a aVar) {
        m52387m3();
        C27113k c = C27113k.C27114a.m84066c(C27113k.f68083P, aVar.mo64864a(), false, (String) null, (ArrayList) null, (Summary) null, mo38120z1(), 30, (Object) null);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        c.mo4576A1(supportFragmentManager, (String) null);
    }

    /* renamed from: w3 */
    private final void m52397w3(C19074c.C19078d dVar) {
        EditText textInput = m52382h3().f45880n.getTextInput();
        TextWatcher textWatcher = this.f41536K;
        TextWatcher textWatcher2 = null;
        if (textWatcher == null) {
            C41536l.m120506z("addressChangedWatcher");
            textWatcher = null;
        }
        textInput.removeTextChangedListener(textWatcher);
        EditText textInput2 = m52382h3().f45880n.getTextInput();
        String a = dVar.mo47275a();
        String str = "";
        if (a == null) {
            a = str;
        }
        textInput2.setText(a);
        EditText textInput3 = m52382h3().f45880n.getTextInput();
        String a2 = dVar.mo47275a();
        if (a2 != null) {
            str = a2;
        }
        textInput3.setSelection(str.length());
        EditText textInput4 = m52382h3().f45880n.getTextInput();
        TextWatcher textWatcher3 = this.f41536K;
        if (textWatcher3 == null) {
            C41536l.m120506z("addressChangedWatcher");
        } else {
            textWatcher2 = textWatcher3;
        }
        textInput4.addTextChangedListener(textWatcher2);
    }

    /* renamed from: x3 */
    private final void m52398x3(boolean z) {
        FrameLayout frameLayout = m52382h3().f45889w;
        C41536l.m120488h(frameLayout, "binding.regularLoader");
        C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
        ProgressBar progressBar = m52382h3().f45890x;
        C41536l.m120488h(progressBar, "binding.regularLoaderProgress");
        C32343x.m95455i0(progressBar);
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public final void m52399y3(C18813o oVar) {
        FixedButtonCheckboxView fixedButtonCheckboxView = m52382h3().f45886t;
        C32343x.m95483r1(fixedButtonCheckboxView.getCheckbox(), oVar.mo46663a(), false, 2, (Object) null);
        fixedButtonCheckboxView.getButton().setButtonText(oVar.mo46665c());
        fixedButtonCheckboxView.getButton().setLoading(false);
        int i = C14133b.f41540a[oVar.mo46664b().ordinal()];
        if (i == 1) {
            m52400z3(fixedButtonCheckboxView, false);
        } else if (i == 2) {
            m52400z3(fixedButtonCheckboxView, true);
        } else if (i == 3) {
            fixedButtonCheckboxView.getButton().setLoading(true);
        }
    }

    /* renamed from: z3 */
    private static final void m52400z3(FixedButtonCheckboxView fixedButtonCheckboxView, boolean z) {
        fixedButtonCheckboxView.setEnabled(z);
        fixedButtonCheckboxView.getButton().setEnabled(z);
        fixedButtonCheckboxView.setClickable(z);
        fixedButtonCheckboxView.setFocusable(z);
    }

    /* renamed from: C */
    public void mo39136C() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        C27113k e0 = C32343x.m95443e0(supportFragmentManager, (String) null, 1, (Object) null);
        if (e0 != null) {
            e0.mo4577k1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo70996D2(bundle, m52382h3());
        m52351B3();
        m52382h3().f45872f.setAdapter(m52384k3());
        m52385l1();
        m52377c3();
        m52374Z2();
    }

    /* renamed from: j3 */
    public final C12684x1 mo39213j3() {
        C12684x1 x1Var = this.f41534I;
        if (x1Var != null) {
            return x1Var;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* renamed from: m */
    public void mo39137m() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        C27113k e0 = C32343x.m95443e0(supportFragmentManager, (String) null, 1, (Object) null);
        if (e0 != null) {
            e0.mo4577k1();
        }
        m52386l3().mo33130Ew().mo33145dm();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C34646b.m101752f(m52383i3().mo39780a().mo39287b(), (Context) null, 1, (Object) null);
    }
}
