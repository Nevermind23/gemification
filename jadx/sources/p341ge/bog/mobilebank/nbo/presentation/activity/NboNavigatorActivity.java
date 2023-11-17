package p341ge.bog.mobilebank.nbo.presentation.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.ProgressBar;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1613n0;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import av0.C31074a;
import av0.C31076c;
import av0.C31080g;
import b41.C31128a;
import b41.C31132b;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import j31.C36726b;
import j31.C36727c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import o31.C37613p;
import org.parceler.C42035e;
import p163m0.C7047a;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p341ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import pu0.C38020a;
import q31.C38125h;
import su0.C38536a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.nbo.presentation.activity.NboNavigatorActivity */
public final class NboNavigatorActivity extends C33302a {

    /* renamed from: K */
    public static final C33286a f81390K = new C33286a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C31074a f81391G;

    /* renamed from: H */
    private final C41217g f81392H = C41219i.m119470b(new C33291f(this));

    /* renamed from: I */
    private final C41217g f81393I = C41219i.m119470b(new C33292g(this));

    /* renamed from: J */
    private final C41217g f81394J;

    /* renamed from: ge.bog.mobilebank.nbo.presentation.activity.NboNavigatorActivity$OfferData */
    private static final class OfferData implements Parcelable {
        public static final Parcelable.Creator<OfferData> CREATOR = new C33285a();

        /* renamed from: d */
        private final long f81395d;

        /* renamed from: ge.bog.mobilebank.nbo.presentation.activity.NboNavigatorActivity$OfferData$a */
        public static final class C33285a implements Parcelable.Creator {
            /* renamed from: a */
            public final OfferData createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new OfferData(parcel.readLong());
            }

            /* renamed from: b */
            public final OfferData[] newArray(int i) {
                return new OfferData[i];
            }
        }

        public OfferData(long j) {
            this.f81395d = j;
        }

        /* renamed from: a */
        public final long mo78919a() {
            return this.f81395d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OfferData) && this.f81395d == ((OfferData) obj).f81395d;
        }

        public int hashCode() {
            return C7397t.m28148a(this.f81395d);
        }

        public String toString() {
            long j = this.f81395d;
            return "OfferData(id=" + j + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeLong(this.f81395d);
        }
    }

    /* renamed from: ge.bog.mobilebank.nbo.presentation.activity.NboNavigatorActivity$a */
    public static final class C33286a {
        private C33286a() {
        }

        public /* synthetic */ C33286a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo78929a(Activity activity, long j) {
            C41536l.m120489i(activity, "activity");
            activity.startActivity(C37613p.m110614a(new Intent(activity, NboNavigatorActivity.class), C41233s.m119492a("ARG_ID", new OfferData(j))));
            activity.overridePendingTransition(0, 0);
        }
    }

    /* renamed from: ge.bog.mobilebank.nbo.presentation.activity.NboNavigatorActivity$b */
    /* synthetic */ class C33287b extends C41535k implements C43075l {
        C33287b(Object obj) {
            super(1, obj, NboNavigatorActivity.class, "openLoan", "openLoan(Lge/bog/mobilebank/cleanarch/domain/offer/model/OfferInfo;)V", 0);
        }

        /* renamed from: b */
        public final void mo78930b(OfferInfo offerInfo) {
            C41536l.m120489i(offerInfo, "p0");
            ((NboNavigatorActivity) this.receiver).m97927L2(offerInfo);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo78930b((OfferInfo) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.nbo.presentation.activity.NboNavigatorActivity$c */
    /* synthetic */ class C33288c extends C41535k implements C43075l {
        C33288c(Object obj) {
            super(1, obj, NboNavigatorActivity.class, "onNboOfferResult", "onNboOfferResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo78931b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((NboNavigatorActivity) this.receiver).m97926K2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo78931b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.nbo.presentation.activity.NboNavigatorActivity$d */
    static final class C33289d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ NboNavigatorActivity f81396d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33289d(NboNavigatorActivity nboNavigatorActivity) {
            super(1);
            this.f81396d = nboNavigatorActivity;
        }

        /* renamed from: a */
        public final void mo78932a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f81396d.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo78932a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.nbo.presentation.activity.NboNavigatorActivity$e */
    /* synthetic */ class C33290e extends C41535k implements C43075l {
        C33290e(Object obj) {
            super(1, obj, NboNavigatorActivity.class, "openOffer", "openOffer(Lge/bog/mobilebank/nbo/domain/model/NboOffer;)V", 0);
        }

        /* renamed from: b */
        public final void mo78933b(C38536a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((NboNavigatorActivity) this.receiver).m97928M2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo78933b((C38536a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.nbo.presentation.activity.NboNavigatorActivity$f */
    static final class C33291f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ NboNavigatorActivity f81397d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33291f(NboNavigatorActivity nboNavigatorActivity) {
            super(0);
            this.f81397d = nboNavigatorActivity;
        }

        /* renamed from: b */
        public final C38020a invoke() {
            return C38020a.m111790d(this.f81397d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.nbo.presentation.activity.NboNavigatorActivity$g */
    static final class C33292g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ NboNavigatorActivity f81398d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33292g(NboNavigatorActivity nboNavigatorActivity) {
            super(0);
            this.f81398d = nboNavigatorActivity;
        }

        /* renamed from: b */
        public final OfferData invoke() {
            Intent intent = this.f81398d.getIntent();
            if (intent != null) {
                return (OfferData) intent.getParcelableExtra("ARG_ID");
            }
            return null;
        }
    }

    /* renamed from: ge.bog.mobilebank.nbo.presentation.activity.NboNavigatorActivity$h */
    static final class C33293h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ NboNavigatorActivity f81399d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33293h(NboNavigatorActivity nboNavigatorActivity) {
            super(1);
            this.f81399d = nboNavigatorActivity;
        }

        /* renamed from: a */
        public final void mo78936a(C38536a aVar) {
            ProgressBar progressBar = this.f81399d.m97923G2().f91359e;
            C41536l.m120488h(progressBar, "binding.loader");
            C32343x.m95447f1(progressBar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo78936a((C38536a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.nbo.presentation.activity.NboNavigatorActivity$i */
    static final class C33294i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ NboNavigatorActivity f81400d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33294i(NboNavigatorActivity nboNavigatorActivity) {
            super(1);
            this.f81400d = nboNavigatorActivity;
        }

        /* renamed from: a */
        public final void mo78937a(C38536a aVar) {
            C41536l.m120489i(aVar, "it");
            ProgressBar progressBar = this.f81400d.m97923G2().f91359e;
            C41536l.m120488h(progressBar, "binding.loader");
            C32343x.m95455i0(progressBar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo78937a((C38536a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.nbo.presentation.activity.NboNavigatorActivity$j */
    static final class C33295j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ NboNavigatorActivity f81401d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33295j(NboNavigatorActivity nboNavigatorActivity) {
            super(1);
            this.f81401d = nboNavigatorActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f81401d.finish();
        }
    }

    /* renamed from: ge.bog.mobilebank.nbo.presentation.activity.NboNavigatorActivity$k */
    static final class C33296k implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f81402a;

        C33296k(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f81402a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f81402a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f81402a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.nbo.presentation.activity.NboNavigatorActivity$l */
    public static final class C33297l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f81403d;

        /* renamed from: ge.bog.mobilebank.nbo.presentation.activity.NboNavigatorActivity$l$a */
        public static final class C33298a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C43064a f81404d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C33298a(C43064a aVar) {
                super(0);
                this.f81404d = aVar;
            }

            /* renamed from: b */
            public final C1613n0 invoke() {
                return (C1613n0) this.f81404d.invoke();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33297l(C43064a aVar) {
            super(0);
            this.f81403d = aVar;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C33298a(this.f81403d));
        }
    }

    /* renamed from: ge.bog.mobilebank.nbo.presentation.activity.NboNavigatorActivity$m */
    public static final class C33299m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f81405d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33299m(ComponentActivity componentActivity) {
            super(0);
            this.f81405d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f81405d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.nbo.presentation.activity.NboNavigatorActivity$n */
    public static final class C33300n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f81406d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f81407e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33300n(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f81406d = aVar;
            this.f81407e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f81406d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f81407e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.nbo.presentation.activity.NboNavigatorActivity$o */
    static final class C33301o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ NboNavigatorActivity f81408d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33301o(NboNavigatorActivity nboNavigatorActivity) {
            super(0);
            this.f81408d = nboNavigatorActivity;
        }

        /* renamed from: b */
        public final C31080g invoke() {
            C31074a I2 = this.f81408d.mo78918I2();
            OfferData C2 = this.f81408d.m97924H2();
            return I2.mo32535a(C2 != null ? C2.mo78919a() : -1);
        }
    }

    public NboNavigatorActivity() {
        C37588a0 a0Var = C37588a0.f90326a;
        this.f81394J = new C1617p0(C41520a0.m120436b(C31080g.class), new C33299m(this), new C33297l(new C33301o(this)), new C33300n((C43064a) null, this));
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public final C38020a m97923G2() {
        return (C38020a) this.f81392H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public final OfferData m97924H2() {
        return (OfferData) this.f81393I.getValue();
    }

    /* renamed from: J2 */
    private final C31080g m97925J2() {
        return (C31080g) this.f81394J.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public final void m97926K2(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C33293h(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C33294i(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C33295j(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public final void m97927L2(OfferInfo offerInfo) {
        if (offerInfo.getOfferScheme() == OfferInfo.C20999b.BNPL) {
            C38125h.m112238c(this).mo91558K(this);
        } else {
            OfferNavigatorActivity.f58469H.mo54606a(this, offerInfo);
        }
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public final void m97928M2(C38536a aVar) {
        String str;
        ArrayList arrayList;
        List<C36727c> a;
        Intent intent = new Intent("PUSH_NOTIF_INTENT");
        intent.putExtra("PUSH_NOTIFS_OPEN", true);
        C36726b C = aVar.mo92121C();
        if (C != null) {
            str = C.mo89547b();
        } else {
            str = null;
        }
        intent.putExtra("type", str);
        C36726b C2 = aVar.mo92121C();
        if (C2 == null || (a = C2.mo89546a()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(C41343r.m119925u(a, 10));
            for (C36727c cVar : a) {
                arrayList.add(new KeyValue(cVar.mo89551a(), cVar.mo89552b()));
            }
        }
        intent.putExtra("parameters", C42035e.m122121c(arrayList));
        C35388f2.m105048S1(this, intent, false, 2, (Object) null);
        finish();
    }

    /* renamed from: l1 */
    private final void m97929l1() {
        C31076c hw = m97925J2().mo71281hw();
        C37224b.m109963b(hw.mo71277Mp(), this, new C33287b(this));
        hw.mo71278Qp().mo4819k(this, new C33296k(new C33288c(this)));
        C37224b.m109963b(hw.mo71279X7(), this, new C33289d(this));
        C37224b.m109963b(hw.mo71280v4(), this, new C33290e(this));
    }

    /* renamed from: I2 */
    public final C31074a mo78918I2() {
        C31074a aVar = this.f81391G;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        setContentView((View) m97923G2().mo3946b());
        m97929l1();
    }
}
