package p341ge.bog.mobilebank.googlepay.presentation.actionsheet;

import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import ek0.C20262b;
import g91.C32343x;
import hc1.C41143c;
import hc1.C41185v;
import hd0.C24978b;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import ik0.C25221b;
import java.util.List;
import kk0.C25741a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import nk0.C26525e;
import nk0.C26527g;
import nk0.C26532l;
import o31.C37588a0;
import p163m0.C7047a;
import p313x7.C8973b;
import p341ge.bog.mobilebank.cleanarch.domain.products.model.CardBlockStatus;
import p341ge.bog.mobilebank.googlepay.data.entity.ApproveOpcParams;
import p420fh.C12902d;
import p420fh.C12910e;
import ue1.C43064a;
import ue1.C43075l;
import yj0.C30082d;

/* renamed from: ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet */
public final class GooglePlayActionSheet extends C24431d implements C41185v.C41186a {

    /* renamed from: P */
    public static final C24404a f62988P = new C24404a((DefaultConstructorMarker) null);

    /* renamed from: K */
    public C8973b f62989K;

    /* renamed from: L */
    public C26525e f62990L;

    /* renamed from: M */
    private C30082d f62991M;

    /* renamed from: N */
    private final C41217g f62992N;

    /* renamed from: O */
    private final C41217g f62993O = C41219i.m119470b(new C24405b(this));

    /* renamed from: ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet$ActionSheetData */
    private static final class ActionSheetData implements Parcelable {
        public static final Parcelable.Creator<ActionSheetData> CREATOR = new C24403a();

        /* renamed from: d */
        private final Long f62994d;

        /* renamed from: ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet$ActionSheetData$a */
        public static final class C24403a implements Parcelable.Creator {
            /* renamed from: a */
            public final ActionSheetData createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new ActionSheetData(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            /* renamed from: b */
            public final ActionSheetData[] newArray(int i) {
                return new ActionSheetData[i];
            }
        }

        public ActionSheetData(Long l) {
            this.f62994d = l;
        }

        /* renamed from: a */
        public final Long mo62158a() {
            return this.f62994d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionSheetData) && C41536l.m120484d(this.f62994d, ((ActionSheetData) obj).f62994d);
        }

        public int hashCode() {
            Long l = this.f62994d;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        public String toString() {
            Long l = this.f62994d;
            return "ActionSheetData(acctKey=" + l + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            Long l = this.f62994d;
            if (l == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet$a */
    public static final class C24404a {
        private C24404a() {
        }

        public /* synthetic */ C24404a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final GooglePlayActionSheet mo62168a(Long l) {
            GooglePlayActionSheet googlePlayActionSheet = new GooglePlayActionSheet();
            googlePlayActionSheet.setArguments(C0908e.m3336b(C41233s.m119492a("ARG_DATA", new ActionSheetData(l))));
            return googlePlayActionSheet;
        }
    }

    /* renamed from: ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet$b */
    static final class C24405b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GooglePlayActionSheet f62995d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24405b(GooglePlayActionSheet googlePlayActionSheet) {
            super(0);
            this.f62995d = googlePlayActionSheet;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m78441c(GooglePlayActionSheet googlePlayActionSheet, C25741a aVar) {
            C41536l.m120489i(googlePlayActionSheet, "this$0");
            C41536l.m120489i(aVar, "it");
            googlePlayActionSheet.m78422s2().mo65806xw().mo65791v3(aVar);
        }

        /* renamed from: b */
        public final C25221b invoke() {
            return new C25221b(new C24428a(this.f62995d));
        }
    }

    /* renamed from: ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet$c */
    static final class C24406c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GooglePlayActionSheet f62996d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24406c(GooglePlayActionSheet googlePlayActionSheet) {
            super(1);
            this.f62996d = googlePlayActionSheet;
        }

        /* renamed from: a */
        public final void mo62170a(C31128a aVar) {
            GooglePlayActionSheet googlePlayActionSheet = this.f62996d;
            C41536l.m120488h(aVar, "it");
            googlePlayActionSheet.m78423t2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62170a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet$d */
    /* synthetic */ class C24407d extends C41535k implements C43075l {
        C24407d(Object obj) {
            super(1, obj, GooglePlayActionSheet.class, "onCardDetailsResult", "onCardDetailsResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo62171b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((GooglePlayActionSheet) this.receiver).m78424u2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62171b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet$e */
    static final class C24408e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GooglePlayActionSheet f62997d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24408e(GooglePlayActionSheet googlePlayActionSheet) {
            super(1);
            this.f62997d = googlePlayActionSheet;
        }

        /* renamed from: a */
        public final void mo62172a(PushTokenizeRequest pushTokenizeRequest) {
            C41536l.m120489i(pushTokenizeRequest, "it");
            this.f62997d.mo62157r2().mo21126d(this.f62997d.requireActivity(), pushTokenizeRequest, 10036);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62172a((PushTokenizeRequest) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet$f */
    /* synthetic */ class C24409f extends C41535k implements C43075l {
        C24409f(Object obj) {
            super(1, obj, GooglePlayActionSheet.class, "openSca", "openSca(Lge/bog/mobilebank/googlepay/data/entity/ApproveOpcParams;)V", 0);
        }

        /* renamed from: b */
        public final void mo62173b(ApproveOpcParams approveOpcParams) {
            C41536l.m120489i(approveOpcParams, "p0");
            ((GooglePlayActionSheet) this.receiver).m78426w2(approveOpcParams);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62173b((ApproveOpcParams) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet$g */
    /* synthetic */ class C24410g extends C41535k implements C43075l {
        C24410g(Object obj) {
            super(1, obj, GooglePlayActionSheet.class, "onOpcResult", "onOpcResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo62174b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((GooglePlayActionSheet) this.receiver).m78425v2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62174b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet$h */
    /* synthetic */ class C24411h extends C41535k implements C43075l {
        C24411h(Object obj) {
            super(1, obj, GooglePlayActionSheet.class, "resumeGooglePayTokenize", "resumeGooglePayTokenize(Lge/bog/mobilebank/googlepay/domain/model/token/ResumeTokenizeData;)V", 0);
        }

        /* renamed from: b */
        public final void mo62175b(C20262b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((GooglePlayActionSheet) this.receiver).m78427x2(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62175b((C20262b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet$i */
    static final class C24412i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GooglePlayActionSheet f62998d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24412i(GooglePlayActionSheet googlePlayActionSheet) {
            super(1);
            this.f62998d = googlePlayActionSheet;
        }

        /* renamed from: a */
        public final void mo62176a(CardBlockStatus cardBlockStatus) {
            this.f62998d.m78428y2(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62176a((CardBlockStatus) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet$j */
    static final class C24413j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GooglePlayActionSheet f62999d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24413j(GooglePlayActionSheet googlePlayActionSheet) {
            super(1);
            this.f62999d = googlePlayActionSheet;
        }

        /* renamed from: a */
        public final void mo62177a(CardBlockStatus cardBlockStatus) {
            C41536l.m120489i(cardBlockStatus, "status");
            this.f62999d.m78428y2(false);
            if (cardBlockStatus.mo52083b() == C24978b.NO) {
                this.f62999d.m78422s2().mo65806xw().mo65790H3();
                return;
            }
            C1505h requireActivity = this.f62999d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            C12910e.m48790h(requireActivity, C32343x.m95388F("google.pay.error.card.is.blocked", new Object[0]), C12902d.C12905b.C12907b.f38104a, false, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62177a((CardBlockStatus) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet$k */
    static final class C24414k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GooglePlayActionSheet f63000d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24414k(GooglePlayActionSheet googlePlayActionSheet) {
            super(1);
            this.f63000d = googlePlayActionSheet;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f63000d.m78428y2(false);
            this.f63000d.handleError(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet$l */
    static final class C24415l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GooglePlayActionSheet f63001d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24415l(GooglePlayActionSheet googlePlayActionSheet) {
            super(1);
            this.f63001d = googlePlayActionSheet;
        }

        /* renamed from: a */
        public final void mo62179a(List list) {
            this.f63001d.m78421p2().f75916h.mo53597e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62179a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet$m */
    static final class C24416m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GooglePlayActionSheet f63002d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24416m(GooglePlayActionSheet googlePlayActionSheet) {
            super(1);
            this.f63002d = googlePlayActionSheet;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f63002d.m78421p2().f75916h.mo53596d();
        }
    }

    /* renamed from: ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet$n */
    static final class C24417n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GooglePlayActionSheet f63003d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24417n(GooglePlayActionSheet googlePlayActionSheet) {
            super(1);
            this.f63003d = googlePlayActionSheet;
        }

        /* renamed from: a */
        public final void mo62181a(List list) {
            C41536l.m120489i(list, "cards");
            this.f63003d.m78421p2().f75916h.mo53595c();
            this.f63003d.m78420o2().mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62181a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet$o */
    static final class C24418o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GooglePlayActionSheet f63004d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24418o(GooglePlayActionSheet googlePlayActionSheet) {
            super(1);
            this.f63004d = googlePlayActionSheet;
        }

        /* renamed from: a */
        public final void mo62182a(Object obj) {
            this.f63004d.m78428y2(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62182a(obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet$p */
    static final class C24419p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GooglePlayActionSheet f63005d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24419p(GooglePlayActionSheet googlePlayActionSheet) {
            super(1);
            this.f63005d = googlePlayActionSheet;
        }

        /* renamed from: a */
        public final void mo62183a(Object obj) {
            this.f63005d.m78428y2(false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62183a(obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet$q */
    static final class C24420q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GooglePlayActionSheet f63006d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24420q(GooglePlayActionSheet googlePlayActionSheet) {
            super(1);
            this.f63006d = googlePlayActionSheet;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f63006d.m78428y2(false);
            this.f63006d.handleError(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet$r */
    static final class C24421r implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f63007a;

        C24421r(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f63007a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f63007a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f63007a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet$s */
    public static final class C24422s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f63008d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24422s(Fragment fragment) {
            super(0);
            this.f63008d = fragment;
        }

        public final Fragment invoke() {
            return this.f63008d;
        }
    }

    /* renamed from: ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet$t */
    public static final class C24423t extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f63009d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24423t(C43064a aVar) {
            super(0);
            this.f63009d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f63009d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet$u */
    public static final class C24424u extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f63010d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24424u(C41217g gVar) {
            super(0);
            this.f63010d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f63010d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet$v */
    public static final class C24425v extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f63011d;

        /* renamed from: e */
        final /* synthetic */ C41217g f63012e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24425v(C43064a aVar, C41217g gVar) {
            super(0);
            this.f63011d = aVar;
            this.f63012e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f63011d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f63012e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet$w */
    static final class C24426w extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GooglePlayActionSheet f63013d;

        /* renamed from: ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet$w$a */
        static final class C24427a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ GooglePlayActionSheet f63014d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24427a(GooglePlayActionSheet googlePlayActionSheet) {
                super(0);
                this.f63014d = googlePlayActionSheet;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
                r1 = (p341ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet.ActionSheetData) r1.getParcelable("ARG_DATA");
             */
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final nk0.C26532l invoke() {
                /*
                    r3 = this;
                    ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet r0 = r3.f63014d
                    nk0.e r0 = r0.mo62156q2()
                    ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet r1 = r3.f63014d
                    android.os.Bundle r1 = r1.getArguments()
                    if (r1 == 0) goto L_0x001d
                    java.lang.String r2 = "ARG_DATA"
                    android.os.Parcelable r1 = r1.getParcelable(r2)
                    ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet$ActionSheetData r1 = (p341ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet.ActionSheetData) r1
                    if (r1 == 0) goto L_0x001d
                    java.lang.Long r1 = r1.mo62158a()
                    goto L_0x001e
                L_0x001d:
                    r1 = 0
                L_0x001e:
                    nk0.l r0 = r0.mo32841a(r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet.C24426w.C24427a.invoke():nk0.l");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24426w(GooglePlayActionSheet googlePlayActionSheet) {
            super(0);
            this.f63013d = googlePlayActionSheet;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C24427a(this.f63013d));
        }
    }

    public GooglePlayActionSheet() {
        C24426w wVar = new C24426w(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C24423t(new C24422s(this)));
        this.f62992N = C1514j0.m5374c(this, C41520a0.m120436b(C26532l.class), new C24424u(a), new C24425v((C43064a) null, a), wVar);
    }

    /* renamed from: n2 */
    private final void m78419n2() {
        C26527g Bw = m78422s2().mo65800Bw();
        Bw.mo65798y1().mo4819k(getViewLifecycleOwner(), new C24421r(new C24406c(this)));
        Bw.mo65796g3().mo4819k(getViewLifecycleOwner(), new C24421r(new C24407d(this)));
        LiveData b4 = Bw.mo65795b4();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(b4, viewLifecycleOwner, new C24408e(this));
        LiveData t = Bw.mo65797t();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(t, viewLifecycleOwner2, new C24409f(this));
        Bw.mo65794Zi().mo4819k(getViewLifecycleOwner(), new C24421r(new C24410g(this)));
        LiveData V2 = Bw.mo65793V2();
        C1619q viewLifecycleOwner3 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner3, "viewLifecycleOwner");
        C37224b.m109963b(V2, viewLifecycleOwner3, new C24411h(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public final C25221b m78420o2() {
        return (C25221b) this.f62993O.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public final C30082d m78421p2() {
        C30082d dVar = this.f62991M;
        C41536l.m120486f(dVar);
        return dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public final C26532l m78422s2() {
        return (C26532l) this.f62992N.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public final void m78423t2(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C24412i(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C24413j(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C24414k(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public final void m78424u2(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C24415l(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C24416m(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C24417n(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public final void m78425v2(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C24418o(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C24419p(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C24420q(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public final void m78426w2(ApproveOpcParams approveOpcParams) {
        C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, approveOpcParams.getServiceId(), m78422s2().mo65799Aw(approveOpcParams), (C41143c) null, 4, (Object) null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        e.mo4576A1(childFragmentManager, (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public final void m78427x2(C20262b bVar) {
        mo62157r2().mo21127e(requireActivity(), bVar.mo48734c(), bVar.mo48735d(), bVar.mo48733b(), bVar.mo48732a(), 10036);
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public final void m78428y2(boolean z) {
        FrameLayout frameLayout = m78421p2().f75915g;
        C41536l.m120488h(frameLayout, "binding.regularLoaderContainer");
        C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
    }

    /* renamed from: z2 */
    private final void m78429z2() {
        m78421p2().f75913e.setAdapter(m78420o2());
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        C41185v g0 = C32343x.m95449g0(childFragmentManager, (String) null, 1, (Object) null);
        if (g0 != null) {
            g0.mo4577k1();
        }
        m78422s2().mo65806xw().mo65792yk(str, str2, str3);
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        C41185v g0 = C32343x.m95449g0(childFragmentManager, (String) null, 1, (Object) null);
        if (g0 != null) {
            g0.mo4577k1();
        }
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        m78428y2(z);
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f62991M = C30082d.m91056d(layoutInflater, viewGroup, true);
        mo26370a2(C32343x.m95388F("text.payments.card.please.select", new Object[0]));
        m78429z2();
        m78419n2();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f62991M = null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C41536l.m120489i(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        C1533o.m5445b(this, "REQUEST_KEY_GOOGLE_PAY_DISMISSED", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_GOOGLE_PAY_DISMISSED", Boolean.TRUE)));
    }

    /* renamed from: q2 */
    public final C26525e mo62156q2() {
        C26525e eVar = this.f62990L;
        if (eVar != null) {
            return eVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* renamed from: r2 */
    public final C8973b mo62157r2() {
        C8973b bVar = this.f62989K;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("tapAndPayClient");
        return null;
    }
}
