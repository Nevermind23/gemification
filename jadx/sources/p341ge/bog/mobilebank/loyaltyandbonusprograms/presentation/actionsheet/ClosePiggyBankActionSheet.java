package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import com.github.mikephil.charting.utils.Utils;
import ct0.C31411c;
import g91.C32303f;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.C33055d;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.ClosePiggyBankFragment;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.ClosePiggyBankSuccessFragment;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.CasDetailsUiModel;
import p341ge.bog.mobilebank.shared2.network.ApiError;
import pt0.C37984g;
import pt0.C37996r;
import rs0.C38338e;
import ue1.C43064a;
import ue1.C43075l;
import vs0.C39462u;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ClosePiggyBankActionSheet */
public final class ClosePiggyBankActionSheet extends C32792a {

    /* renamed from: O */
    public static final C32779b f80614O = new C32779b((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C39462u f80615K;

    /* renamed from: L */
    private final C41217g f80616L = C41219i.m119470b(new C32787g(this));

    /* renamed from: M */
    private final C41217g f80617M = C1514j0.m5374c(this, C41520a0.m120436b(C37996r.class), new C32789i(this), new C32790j((C43064a) null, this), new C32791k(this));
    /* access modifiers changed from: private */

    /* renamed from: N */
    public boolean f80618N;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ClosePiggyBankActionSheet$ClosePiggyBankResources */
    public static final class ClosePiggyBankResources implements Parcelable {
        public static final Parcelable.Creator<ClosePiggyBankResources> CREATOR = new C32777a();

        /* renamed from: d */
        private final CasDetailsUiModel f80619d;

        /* renamed from: e */
        private final List f80620e;

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ClosePiggyBankActionSheet$ClosePiggyBankResources$a */
        public static final class C32777a implements Parcelable.Creator {
            /* renamed from: a */
            public final ClosePiggyBankResources createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                CasDetailsUiModel createFromParcel = CasDetailsUiModel.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(ClosePiggyBankFragment.ClosePiggyBankAccount.CREATOR.createFromParcel(parcel));
                }
                return new ClosePiggyBankResources(createFromParcel, arrayList);
            }

            /* renamed from: b */
            public final ClosePiggyBankResources[] newArray(int i) {
                return new ClosePiggyBankResources[i];
            }
        }

        public ClosePiggyBankResources(CasDetailsUiModel casDetailsUiModel, List list) {
            C41536l.m120489i(casDetailsUiModel, "details");
            C41536l.m120489i(list, "accounts");
            this.f80619d = casDetailsUiModel;
            this.f80620e = list;
        }

        /* renamed from: a */
        public final List mo74664a() {
            return this.f80620e;
        }

        /* renamed from: b */
        public final CasDetailsUiModel mo74665b() {
            return this.f80619d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClosePiggyBankResources)) {
                return false;
            }
            ClosePiggyBankResources closePiggyBankResources = (ClosePiggyBankResources) obj;
            return C41536l.m120484d(this.f80619d, closePiggyBankResources.f80619d) && C41536l.m120484d(this.f80620e, closePiggyBankResources.f80620e);
        }

        public int hashCode() {
            return (this.f80619d.hashCode() * 31) + this.f80620e.hashCode();
        }

        public String toString() {
            CasDetailsUiModel casDetailsUiModel = this.f80619d;
            List list = this.f80620e;
            return "ClosePiggyBankResources(details=" + casDetailsUiModel + ", accounts=" + list + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            this.f80619d.writeToParcel(parcel, i);
            List<ClosePiggyBankFragment.ClosePiggyBankAccount> list = this.f80620e;
            parcel.writeInt(list.size());
            for (ClosePiggyBankFragment.ClosePiggyBankAccount writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ClosePiggyBankActionSheet$a */
    public enum C32778a implements Serializable {
        PAUSE,
        CHANGE_AMOUNT,
        DEACTIVATE
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ClosePiggyBankActionSheet$b */
    public static final class C32779b {
        private C32779b() {
        }

        public /* synthetic */ C32779b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ClosePiggyBankActionSheet mo74675a(ClosePiggyBankResources closePiggyBankResources) {
            C41536l.m120489i(closePiggyBankResources, "resources");
            ClosePiggyBankActionSheet closePiggyBankActionSheet = new ClosePiggyBankActionSheet();
            closePiggyBankActionSheet.setArguments(C0908e.m3336b(C41233s.m119492a("ARG_RESOURCES", closePiggyBankResources)));
            return closePiggyBankActionSheet;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ClosePiggyBankActionSheet$c */
    static final class C32780c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClosePiggyBankActionSheet f80625d;

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ClosePiggyBankActionSheet$c$a */
        public /* synthetic */ class C32781a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f80626a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ClosePiggyBankActionSheet$a[] r0 = p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ClosePiggyBankActionSheet.C32778a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ClosePiggyBankActionSheet$a r1 = p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ClosePiggyBankActionSheet.C32778a.PAUSE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ClosePiggyBankActionSheet$a r1 = p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ClosePiggyBankActionSheet.C32778a.CHANGE_AMOUNT     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ClosePiggyBankActionSheet$a r1 = p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ClosePiggyBankActionSheet.C32778a.DEACTIVATE     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f80626a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ClosePiggyBankActionSheet.C32780c.C32781a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32780c(ClosePiggyBankActionSheet closePiggyBankActionSheet) {
            super(1);
            this.f80625d = closePiggyBankActionSheet;
        }

        /* renamed from: a */
        public final void mo74676a(Bundle bundle) {
            C32778a aVar;
            int i;
            C41536l.m120489i(bundle, "it");
            Serializable serializable = bundle.getSerializable("RESULT_KEY_DESTINATION");
            if (serializable instanceof C32778a) {
                aVar = (C32778a) serializable;
            } else {
                aVar = null;
            }
            if (aVar == null) {
                i = -1;
            } else {
                i = C32781a.f80626a[aVar.ordinal()];
            }
            if (i == 1 || i == 2) {
                this.f80625d.m96848v2(aVar);
                this.f80625d.mo4577k1();
            } else if (i == 3) {
                this.f80625d.m96841o2();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74676a((Bundle) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ClosePiggyBankActionSheet$d */
    static final class C32782d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClosePiggyBankActionSheet f80627d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32782d(ClosePiggyBankActionSheet closePiggyBankActionSheet) {
            super(1);
            this.f80627d = closePiggyBankActionSheet;
        }

        /* renamed from: a */
        public final void mo74677a(Bundle bundle) {
            C41536l.m120489i(bundle, "it");
            long j = bundle.getLong("RESULT_KEY_CLOSE_PIGGY_BANK_CHOSEN_ACCOUNT_KEY", -1);
            if (j != -1) {
                C1533o.m5445b(this.f80627d, "REQUEST_KEY_CLOSE_PIGGY_BANK_ACTION_SHEET_CHOOSE_ACCOUNT", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_CLOSE_PIGGY_BANK_CHOSEN_ACCOUNT_KEY", Long.valueOf(j))));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74677a((Bundle) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ClosePiggyBankActionSheet$e */
    static final class C32783e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClosePiggyBankActionSheet f80628d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32783e(ClosePiggyBankActionSheet closePiggyBankActionSheet) {
            super(1);
            this.f80628d = closePiggyBankActionSheet;
        }

        /* renamed from: a */
        public final void mo74678a(Bundle bundle) {
            C41536l.m120489i(bundle, "it");
            if (bundle.containsKey("RESULT_KEY_CLOSE_PIGGY_BANK_FINISH")) {
                this.f80628d.f80618N = bundle.getBoolean("RESULT_KEY_CLOSE_PIGGY_BANK_FINISH");
                this.f80628d.mo4577k1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74678a((Bundle) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ClosePiggyBankActionSheet$f */
    static final class C32784f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClosePiggyBankActionSheet f80629d;

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ClosePiggyBankActionSheet$f$a */
        static final class C32785a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ClosePiggyBankActionSheet f80630d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32785a(ClosePiggyBankActionSheet closePiggyBankActionSheet) {
                super(1);
                this.f80630d = closePiggyBankActionSheet;
            }

            /* renamed from: a */
            public final void mo74680a(String str) {
                C41536l.m120489i(str, "it");
                this.f80630d.m96849w2(str);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo74680a((String) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ClosePiggyBankActionSheet$f$b */
        static final class C32786b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ClosePiggyBankActionSheet f80631d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32786b(ClosePiggyBankActionSheet closePiggyBankActionSheet) {
                super(1);
                this.f80631d = closePiggyBankActionSheet;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                String str;
                C41536l.m120489i(th, "err");
                if (th instanceof ApiError) {
                    str = C32343x.m95420V(((ApiError) th).mo84685a().getKey(), C32343x.m95452h0(C38338e.f91908g, new Object[0]), new Object[0]);
                } else {
                    str = C32343x.m95452h0(C38338e.f91908g, new Object[0]);
                }
                this.f80631d.m96850x2(str, true);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32784f(ClosePiggyBankActionSheet closePiggyBankActionSheet) {
            super(1);
            this.f80629d = closePiggyBankActionSheet;
        }

        /* renamed from: a */
        public final void mo74679a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C32785a(this.f80629d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C32786b(this.f80629d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74679a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ClosePiggyBankActionSheet$g */
    static final class C32787g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ClosePiggyBankActionSheet f80632d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32787g(ClosePiggyBankActionSheet closePiggyBankActionSheet) {
            super(0);
            this.f80632d = closePiggyBankActionSheet;
        }

        /* renamed from: b */
        public final ClosePiggyBankResources invoke() {
            Bundle arguments = this.f80632d.getArguments();
            if (arguments != null) {
                return (ClosePiggyBankResources) arguments.getParcelable("ARG_RESOURCES");
            }
            return null;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ClosePiggyBankActionSheet$h */
    static final class C32788h implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f80633a;

        C32788h(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f80633a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f80633a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f80633a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ClosePiggyBankActionSheet$i */
    public static final class C32789i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f80634d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32789i(Fragment fragment) {
            super(0);
            this.f80634d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f80634d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ClosePiggyBankActionSheet$j */
    public static final class C32790j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f80635d;

        /* renamed from: e */
        final /* synthetic */ Fragment f80636e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32790j(C43064a aVar, Fragment fragment) {
            super(0);
            this.f80635d = aVar;
            this.f80636e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f80635d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f80636e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ClosePiggyBankActionSheet$k */
    public static final class C32791k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f80637d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32791k(Fragment fragment) {
            super(0);
            this.f80637d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f80637d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: k2 */
    private final void m96837k2(String str, C43075l lVar) {
        getChildFragmentManager().mo4367F1(str, getViewLifecycleOwner(), new C31411c(lVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public static final void m96838l2(C43075l lVar, String str, Bundle bundle) {
        C41536l.m120489i(lVar, "$action");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        lVar.invoke(bundle);
    }

    /* renamed from: m2 */
    private final void m96839m2() {
        m96837k2("REQUEST_KEY_CHANGE_DESTINATION", new C32780c(this));
        m96837k2("REQUEST_KEY_CLOSE_PIGGY_BANK_FRAGMENT", new C32782d(this));
        m96837k2("REQUEST_KEY_CLOSE_PIGGY_BANK_SUCCESS_FRAGMENT", new C32783e(this));
    }

    /* renamed from: n2 */
    private final void m96840n2() {
        m96845s2().mo91369Iw().mo91362tv().mo4819k(getViewLifecycleOwner(), new C32788h(new C32784f(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public final void m96841o2() {
        ClosePiggyBankResources r2 = m96844r2();
        C41536l.m120486f(r2);
        if (r2.mo74665b().mo75132i().mo75085d() > Utils.DOUBLE_EPSILON) {
            m96846t2(ClosePiggyBankFragment.f80917k.mo74926a(m96843q2()), "CLOSE_FRAGMENT_TAG");
        } else {
            C37984g.C37985a.m111676a(m96845s2().mo91368Hw(), (Long) null, 1, (Object) null);
        }
    }

    /* renamed from: p2 */
    private final C39462u m96842p2() {
        C39462u uVar = this.f80615K;
        C41536l.m120486f(uVar);
        return uVar;
    }

    /* renamed from: q2 */
    private final ClosePiggyBankFragment.ClosePiggyBankData m96843q2() {
        double d;
        List list;
        CasDetailsUiModel b;
        ClosePiggyBankResources r2 = m96844r2();
        if (r2 == null || (b = r2.mo74665b()) == null) {
            d = Utils.DOUBLE_EPSILON;
        } else {
            d = b.mo75136m();
        }
        String k = C32303f.m95200k(d, "GEL");
        C41536l.m120488h(k, "resources?.details?.tota…L\n            )\n        }");
        ClosePiggyBankResources r22 = m96844r2();
        if (r22 == null || (list = r22.mo74664a()) == null) {
            list = C41341q.m119907j();
        }
        return new ClosePiggyBankFragment.ClosePiggyBankData(k, list);
    }

    /* renamed from: r2 */
    private final ClosePiggyBankResources m96844r2() {
        return (ClosePiggyBankResources) this.f80616L.getValue();
    }

    /* renamed from: s2 */
    private final C37996r m96845s2() {
        return (C37996r) this.f80617M.getValue();
    }

    /* renamed from: t2 */
    private final void m96846t2(Fragment fragment, String str) {
        getChildFragmentManager().mo4428p().mo4640s(m96842p2().f93851e.getId(), fragment, str).mo4515i();
    }

    /* renamed from: u2 */
    static /* synthetic */ void m96847u2(ClosePiggyBankActionSheet closePiggyBankActionSheet, Fragment fragment, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        closePiggyBankActionSheet.m96846t2(fragment, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public final void m96848v2(C32778a aVar) {
        C1533o.m5445b(this, "REQUEST_KEY_CLOSE_PIGGY_BANK_ACTION_SHEET_ACTION", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_CLOSE_PIGGY_BANK_ACTION", aVar)));
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public final void m96849w2(String str) {
        ClosePiggyBankResources r2 = m96844r2();
        C41536l.m120486f(r2);
        if (r2.mo74665b().mo75132i().mo75085d() > Utils.DOUBLE_EPSILON) {
            m96850x2(C32343x.m95388F("cas.deactivate.success.message", str), false);
            return;
        }
        m96850x2(C32343x.m95388F("cas.deactivate.success.message.0", new Object[0]), false);
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public final void m96850x2(String str, boolean z) {
        m96847u2(this, ClosePiggyBankSuccessFragment.f80942f.mo74951a(str, z), (String) null, 2, (Object) null);
        this.f80618N = !z;
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f80615K = C39462u.m114704d(layoutInflater, viewGroup, true);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f80615K = null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C41536l.m120489i(dialogInterface, "dialog");
        boolean z = this.f80618N;
        if (z) {
            C1533o.m5445b(this, "REQUEST_KEY_CLOSE_PIGGY_BANK_ACTION_SHEET", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_CLOSE_PIGGY_BANK_FINISH_ACTIVITY", Boolean.valueOf(z))));
        }
        super.onDismiss(dialogInterface);
    }

    public void onViewCreated(View view, Bundle bundle) {
        CasDetailsUiModel b;
        C41536l.m120489i(view, "view");
        boolean z = false;
        mo26370a2(C32343x.m95388F("cas.deactivate.actionsheet.title", new Object[0]));
        super.onViewCreated(view, bundle);
        if (m96844r2() == null) {
            mo4577k1();
            return;
        }
        m96839m2();
        m96840n2();
        C33055d.C33056a aVar = C33055d.f80950i;
        ClosePiggyBankResources r2 = m96844r2();
        if (!(r2 == null || (b = r2.mo74665b()) == null || !b.mo75137p())) {
            z = true;
        }
        m96847u2(this, aVar.mo74955a(z), (String) null, 2, (Object) null);
    }
}
