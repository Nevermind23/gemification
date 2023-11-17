package p341ge.bog.mobilebank.loanactivation.presentation.subtypes;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import g91.C32286a1;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import np0.C37436b;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.LoanActivationActivity;
import p341ge.bog.mobilebank.loanactivation.presentation.subtypes.C32510b;
import p341ge.bog.mobilebank.loanactivation.presentation.subtypes.model.LoanSubtypeData;
import sp0.C38489h;
import ue1.C43064a;
import ue1.C43075l;
import uq0.C39063d;
import uq0.C39064e;
import uq0.C39065f;
import uq0.C39066g;
import vq0.C39437a;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.subtypes.LoanSubtypesActivity */
public final class LoanSubtypesActivity extends C32508a {

    /* renamed from: L */
    public static final C32497a f80114L = new C32497a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private C38489h f80115G;

    /* renamed from: H */
    public C39063d f80116H;

    /* renamed from: I */
    private final C41217g f80117I = C41219i.m119470b(new C32498b(this));

    /* renamed from: J */
    private final C41217g f80118J = new C1617p0(C41520a0.m120436b(C39066g.class), new C32504g(this), new C32506i(this), new C32505h((C43064a) null, this));

    /* renamed from: K */
    private final C41217g f80119K = C41219i.m119470b(new C32501e(this));

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.subtypes.LoanSubtypesActivity$a */
    public static final class C32497a {
        private C32497a() {
        }

        public /* synthetic */ C32497a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo73563a(Context context, ArrayList arrayList, String str, String str2, String str3, OfferProductCode offerProductCode) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(arrayList, "offers");
            C41536l.m120489i(str, "limitId");
            C41536l.m120489i(str3, "effectiveRate");
            C41536l.m120489i(offerProductCode, "productCode");
            Intent intent = new Intent(context, LoanSubtypesActivity.class);
            intent.putExtra("EXTRA_OFFERS", arrayList);
            intent.putExtra("EXTRA_LIMIT_ID", new LoanSubtypeData(str, str2, str3, offerProductCode));
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.subtypes.LoanSubtypesActivity$b */
    static final class C32498b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LoanSubtypesActivity f80120d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32498b(LoanSubtypesActivity loanSubtypesActivity) {
            super(0);
            this.f80120d = loanSubtypesActivity;
        }

        /* renamed from: b */
        public final LoanSubtypeData invoke() {
            Parcelable parcelableExtra = this.f80120d.getIntent().getParcelableExtra("EXTRA_LIMIT_ID");
            C41536l.m120486f(parcelableExtra);
            return (LoanSubtypeData) parcelableExtra;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.subtypes.LoanSubtypesActivity$c */
    /* synthetic */ class C32499c extends C41535k implements C43075l {
        C32499c(Object obj) {
            super(1, obj, C32510b.class, "submitList", "submitList(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo73565b(List list) {
            ((C32510b) this.receiver).mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73565b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.subtypes.LoanSubtypesActivity$d */
    static final class C32500d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LoanSubtypesActivity f80121d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32500d(LoanSubtypesActivity loanSubtypesActivity) {
            super(1);
            this.f80121d = loanSubtypesActivity;
        }

        /* renamed from: a */
        public final void mo73566a(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            LoanActivationActivity.C32396a aVar = LoanActivationActivity.f79851H;
            LoanSubtypesActivity loanSubtypesActivity = this.f80121d;
            aVar.mo73160a(loanSubtypesActivity, (String) mVar.mo95675a(), (String) mVar.mo95676b(), loanSubtypesActivity.m96090G2().mo73579d());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73566a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.subtypes.LoanSubtypesActivity$e */
    static final class C32501e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LoanSubtypesActivity f80122d;

        /* renamed from: ge.bog.mobilebank.loanactivation.presentation.subtypes.LoanSubtypesActivity$e$a */
        /* synthetic */ class C32502a implements C32510b.C32511a, C41532h {

            /* renamed from: a */
            final /* synthetic */ C39064e f80123a;

            C32502a(C39064e eVar) {
                this.f80123a = eVar;
            }

            /* renamed from: a */
            public final void mo73568a(C39437a aVar) {
                C41536l.m120489i(aVar, "p0");
                this.f80123a.mo92752u4(aVar);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C32510b.C32511a) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f80123a, C39064e.class, "onOfferClick", "onOfferClick(Lge/bog/mobilebank/loanactivation/presentation/subtypes/model/LoanSubtypeAdapterData;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32501e(LoanSubtypesActivity loanSubtypesActivity) {
            super(0);
            this.f80122d = loanSubtypesActivity;
        }

        /* renamed from: b */
        public final C32510b invoke() {
            return new C32510b(new C32502a(this.f80122d.m96092J2().mo92755dw()));
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.subtypes.LoanSubtypesActivity$f */
    static final class C32503f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f80124a;

        C32503f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f80124a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f80124a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f80124a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.subtypes.LoanSubtypesActivity$g */
    public static final class C32504g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f80125d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32504g(ComponentActivity componentActivity) {
            super(0);
            this.f80125d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f80125d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.subtypes.LoanSubtypesActivity$h */
    public static final class C32505h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f80126d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f80127e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32505h(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f80126d = aVar;
            this.f80127e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f80126d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f80127e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.subtypes.LoanSubtypesActivity$i */
    static final class C32506i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LoanSubtypesActivity f80128d;

        /* renamed from: ge.bog.mobilebank.loanactivation.presentation.subtypes.LoanSubtypesActivity$i$a */
        static final class C32507a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ LoanSubtypesActivity f80129d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32507a(LoanSubtypesActivity loanSubtypesActivity) {
                super(0);
                this.f80129d = loanSubtypesActivity;
            }

            /* renamed from: b */
            public final C39066g invoke() {
                C39063d H2 = this.f80129d.mo73562H2();
                ArrayList parcelableArrayListExtra = this.f80129d.getIntent().getParcelableArrayListExtra("EXTRA_OFFERS");
                C41536l.m120486f(parcelableArrayListExtra);
                return H2.mo32572a(parcelableArrayListExtra, this.f80129d.m96090G2());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32506i(LoanSubtypesActivity loanSubtypesActivity) {
            super(0);
            this.f80128d = loanSubtypesActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C32286a1.f79687a.mo72809a(new C32507a(this.f80128d));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public final LoanSubtypeData m96090G2() {
        return (LoanSubtypeData) this.f80117I.getValue();
    }

    /* renamed from: I2 */
    private final C32510b m96091I2() {
        return (C32510b) this.f80119K.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public final C39066g m96092J2() {
        return (C39066g) this.f80118J.getValue();
    }

    /* renamed from: K2 */
    private final void m96093K2() {
        C39065f ew = m96092J2().mo92756ew();
        ew.mo92753aq().mo4819k(this, new C32503f(new C32499c(m96091I2())));
        C37224b.m109963b(ew.mo92754sv(), this, new C32500d(this));
    }

    /* renamed from: H2 */
    public final C39063d mo73562H2() {
        C39063d dVar = this.f80116H;
        if (dVar != null) {
            return dVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C38489h d = C38489h.m112970d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f80115G = d;
        C38489h hVar = null;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        super.mo70996D2(bundle, d);
        mo86429X1(m96090G2().mo73581e());
        getWindow().setStatusBarColor(C32343x.m95418U(C37436b.f89967a, this));
        m96093K2();
        C38489h hVar2 = this.f80115G;
        if (hVar2 == null) {
            C41536l.m120506z("binding");
        } else {
            hVar = hVar2;
        }
        hVar.f92196e.setAdapter(m96091I2());
    }
}
