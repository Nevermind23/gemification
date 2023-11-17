package ew0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import ew0.C31865h;
import fw0.C32020b;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37588a0;
import p163m0.C7047a;
import ue1.C43064a;
import ue1.C43075l;
import yv0.C40077b;

/* renamed from: ew0.a */
public final class C31846a extends C31869i {

    /* renamed from: L */
    public static final C31847a f78554L = new C31847a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C31865h.C31868c f78555G;

    /* renamed from: H */
    private C40077b f78556H;

    /* renamed from: I */
    private final C41217g f78557I = C41219i.m119470b(new C31850c(this));

    /* renamed from: J */
    private final C41217g f78558J;

    /* renamed from: K */
    private final C41217g f78559K;

    /* renamed from: ew0.a$a */
    public static final class C31847a {
        private C31847a() {
        }

        public /* synthetic */ C31847a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C31846a mo72287a(int i, String str) {
            C41536l.m120489i(str, "errorText");
            C31846a aVar = new C31846a();
            aVar.setArguments(C0908e.m3336b(C41233s.m119492a("INLINE_ERROR_FEEDBACK_KEY", str), C41233s.m119492a("SELECTED_POSITION_KEY", Integer.valueOf(i))));
            return aVar;
        }
    }

    /* renamed from: ew0.a$b */
    static final class C31848b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C31846a f78560d;

        /* renamed from: ew0.a$b$a */
        static final class C31849a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C31846a f78561d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31849a(C31846a aVar) {
                super(1);
                this.f78561d = aVar;
            }

            /* renamed from: a */
            public final void mo72289a(int i) {
                C1533o.m5445b(this.f78561d, "REQUEST_KEY_SELECTED_POSITION", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_SELECTED_POSITION", Integer.valueOf(i))));
                this.f78561d.mo4577k1();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo72289a(((Number) obj).intValue());
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31848b(C31846a aVar) {
            super(0);
            this.f78560d = aVar;
        }

        /* renamed from: b */
        public final C32020b invoke() {
            return new C32020b(new C31849a(this.f78560d));
        }
    }

    /* renamed from: ew0.a$c */
    static final class C31850c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C31846a f78562d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31850c(C31846a aVar) {
            super(0);
            this.f78562d = aVar;
        }

        public final String invoke() {
            Bundle arguments = this.f78562d.getArguments();
            String string = arguments != null ? arguments.getString("INLINE_ERROR_FEEDBACK_KEY", "") : null;
            return string == null ? "" : string;
        }
    }

    /* renamed from: ew0.a$d */
    static final class C31851d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31846a f78563d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31851d(C31846a aVar) {
            super(1);
            this.f78563d = aVar;
        }

        /* renamed from: a */
        public final void mo72290a(List list) {
            this.f78563d.m94174e2().mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72290a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ew0.a$e */
    static final class C31852e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f78564a;

        C31852e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f78564a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f78564a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f78564a.invoke(obj);
        }
    }

    /* renamed from: ew0.a$f */
    public static final class C31853f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f78565d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31853f(Fragment fragment) {
            super(0);
            this.f78565d = fragment;
        }

        public final Fragment invoke() {
            return this.f78565d;
        }
    }

    /* renamed from: ew0.a$g */
    public static final class C31854g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f78566d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31854g(C43064a aVar) {
            super(0);
            this.f78566d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f78566d.invoke();
        }
    }

    /* renamed from: ew0.a$h */
    public static final class C31855h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f78567d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31855h(C41217g gVar) {
            super(0);
            this.f78567d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f78567d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ew0.a$i */
    public static final class C31856i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f78568d;

        /* renamed from: e */
        final /* synthetic */ C41217g f78569e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31856i(C43064a aVar, C41217g gVar) {
            super(0);
            this.f78568d = aVar;
            this.f78569e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f78568d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f78569e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ew0.a$j */
    static final class C31857j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C31846a f78570d;

        /* renamed from: ew0.a$j$a */
        static final class C31858a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C31846a f78571d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31858a(C31846a aVar) {
                super(0);
                this.f78571d = aVar;
            }

            /* renamed from: b */
            public final C31865h invoke() {
                C31865h.C31868c i2 = this.f78571d.mo72286i2();
                Bundle arguments = this.f78571d.getArguments();
                return i2.mo32838a(arguments != null ? arguments.getInt("SELECTED_POSITION_KEY") : 0);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31857j(C31846a aVar) {
            super(0);
            this.f78570d = aVar;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C31858a(this.f78570d));
        }
    }

    public C31846a() {
        C31857j jVar = new C31857j(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C31854g(new C31853f(this)));
        this.f78558J = C1514j0.m5374c(this, C41520a0.m120436b(C31865h.class), new C31855h(a), new C31856i((C43064a) null, a), jVar);
        this.f78559K = C41219i.m119470b(new C31848b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: e2 */
    public final C32020b m94174e2() {
        return (C32020b) this.f78559K.getValue();
    }

    /* renamed from: f2 */
    private final C40077b m94175f2() {
        C40077b bVar = this.f78556H;
        C41536l.m120486f(bVar);
        return bVar;
    }

    /* renamed from: g2 */
    private final String m94176g2() {
        return (String) this.f78557I.getValue();
    }

    /* renamed from: h2 */
    private final C31865h m94177h2() {
        return (C31865h) this.f78558J.getValue();
    }

    /* renamed from: j2 */
    private final void m94178j2() {
        boolean z;
        mo26370a2(C32343x.m95388F("text.p2p.payment.send.request.chooseCard.modal", new Object[0]));
        C40077b f2 = m94175f2();
        if (m94176g2().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f2.f95254e.setVisibility(0);
            f2.f95254e.setTitleText(C32343x.m95388F("text.p2p.payment.card.error", new Object[0]));
            f2.f95254e.setCaptionText(m94176g2());
        } else {
            f2.f95254e.setVisibility(8);
        }
        f2.f95255f.setAdapter(m94174e2());
    }

    private final void observeData() {
        m94177h2().mo72296iw().mo72294s().mo4819k(getViewLifecycleOwner(), new C31852e(new C31851d(this)));
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f78556H = C40077b.m116114d(layoutInflater, viewGroup, true);
    }

    /* renamed from: i2 */
    public final C31865h.C31868c mo72286i2() {
        C31865h.C31868c cVar = this.f78555G;
        if (cVar != null) {
            return cVar;
        }
        C41536l.m120506z("viewModelAssistedFactory");
        return null;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f78556H = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m94178j2();
        observeData();
    }
}
