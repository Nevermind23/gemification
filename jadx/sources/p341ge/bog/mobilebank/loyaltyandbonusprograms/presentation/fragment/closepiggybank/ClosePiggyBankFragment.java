package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import g91.C32303f;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p190o1.C7397t;
import p341ge.bog.designsystem.components.actionsheet.additionalactions.model.SelectorConfig;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p363bh.C10282f;
import p392dh.C12129b;
import pt0.C37986h;
import pt0.C37996r;
import ue1.C43064a;
import ue1.C43075l;
import vs0.C39449h;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.ClosePiggyBankFragment */
public final class ClosePiggyBankFragment extends C33067l {

    /* renamed from: k */
    public static final C33035a f80917k = new C33035a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C39449h f80918g;

    /* renamed from: h */
    private final C41217g f80919h = C41219i.m119470b(new C33045e(this));

    /* renamed from: i */
    private final C41217g f80920i = C1514j0.m5374c(this, C41520a0.m120436b(C37996r.class), new C33047g(this), new C33048h((C43064a) null, this), new C33049i(this));

    /* renamed from: j */
    private long f80921j = -1;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.ClosePiggyBankFragment$ClosePiggyBankAccount */
    public static final class ClosePiggyBankAccount implements Parcelable {
        public static final Parcelable.Creator<ClosePiggyBankAccount> CREATOR = new C33033a();

        /* renamed from: d */
        private final String f80922d;

        /* renamed from: e */
        private final long f80923e;

        /* renamed from: f */
        private final double f80924f;

        /* renamed from: g */
        private final String f80925g;

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.ClosePiggyBankFragment$ClosePiggyBankAccount$a */
        public static final class C33033a implements Parcelable.Creator {
            /* renamed from: a */
            public final ClosePiggyBankAccount createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new ClosePiggyBankAccount(parcel.readString(), parcel.readLong(), parcel.readDouble(), parcel.readString());
            }

            /* renamed from: b */
            public final ClosePiggyBankAccount[] newArray(int i) {
                return new ClosePiggyBankAccount[i];
            }
        }

        public ClosePiggyBankAccount(String str, long j, double d, String str2) {
            C41536l.m120489i(str, "acctName");
            C41536l.m120489i(str2, "ccy");
            this.f80922d = str;
            this.f80923e = j;
            this.f80924f = d;
            this.f80925g = str2;
        }

        /* renamed from: a */
        public final long mo74903a() {
            return this.f80923e;
        }

        /* renamed from: b */
        public final String mo74904b() {
            return this.f80922d;
        }

        /* renamed from: d */
        public final double mo74905d() {
            return this.f80924f;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final String mo74907e() {
            return this.f80925g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClosePiggyBankAccount)) {
                return false;
            }
            ClosePiggyBankAccount closePiggyBankAccount = (ClosePiggyBankAccount) obj;
            return C41536l.m120484d(this.f80922d, closePiggyBankAccount.f80922d) && this.f80923e == closePiggyBankAccount.f80923e && Double.compare(this.f80924f, closePiggyBankAccount.f80924f) == 0 && C41536l.m120484d(this.f80925g, closePiggyBankAccount.f80925g);
        }

        public int hashCode() {
            return (((((this.f80922d.hashCode() * 31) + C7397t.m28148a(this.f80923e)) * 31) + Double.doubleToLongBits(this.f80924f)) * 31) + this.f80925g.hashCode();
        }

        public String toString() {
            String str = this.f80922d;
            long j = this.f80923e;
            double d = this.f80924f;
            String str2 = this.f80925g;
            return "ClosePiggyBankAccount(acctName=" + str + ", acctKey=" + j + ", amount=" + d + ", ccy=" + str2 + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f80922d);
            parcel.writeLong(this.f80923e);
            parcel.writeDouble(this.f80924f);
            parcel.writeString(this.f80925g);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.ClosePiggyBankFragment$ClosePiggyBankData */
    public static final class ClosePiggyBankData implements Parcelable {
        public static final Parcelable.Creator<ClosePiggyBankData> CREATOR = new C33034a();

        /* renamed from: d */
        private final String f80926d;

        /* renamed from: e */
        private final List f80927e;

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.ClosePiggyBankFragment$ClosePiggyBankData$a */
        public static final class C33034a implements Parcelable.Creator {
            /* renamed from: a */
            public final ClosePiggyBankData createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(ClosePiggyBankAccount.CREATOR.createFromParcel(parcel));
                }
                return new ClosePiggyBankData(readString, arrayList);
            }

            /* renamed from: b */
            public final ClosePiggyBankData[] newArray(int i) {
                return new ClosePiggyBankData[i];
            }
        }

        public ClosePiggyBankData(String str, List list) {
            C41536l.m120489i(str, "amount");
            C41536l.m120489i(list, "accounts");
            this.f80926d = str;
            this.f80927e = list;
        }

        /* renamed from: a */
        public final List mo74916a() {
            return this.f80927e;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClosePiggyBankData)) {
                return false;
            }
            ClosePiggyBankData closePiggyBankData = (ClosePiggyBankData) obj;
            return C41536l.m120484d(this.f80926d, closePiggyBankData.f80926d) && C41536l.m120484d(this.f80927e, closePiggyBankData.f80927e);
        }

        public int hashCode() {
            return (this.f80926d.hashCode() * 31) + this.f80927e.hashCode();
        }

        public String toString() {
            String str = this.f80926d;
            List list = this.f80927e;
            return "ClosePiggyBankData(amount=" + str + ", accounts=" + list + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f80926d);
            List<ClosePiggyBankAccount> list = this.f80927e;
            parcel.writeInt(list.size());
            for (ClosePiggyBankAccount writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.ClosePiggyBankFragment$a */
    public static final class C33035a {
        private C33035a() {
        }

        public /* synthetic */ C33035a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ClosePiggyBankFragment mo74926a(ClosePiggyBankData closePiggyBankData) {
            C41536l.m120489i(closePiggyBankData, "data");
            ClosePiggyBankFragment closePiggyBankFragment = new ClosePiggyBankFragment();
            closePiggyBankFragment.setArguments(C0908e.m3336b(C41233s.m119492a("ARG_DATA", closePiggyBankData)));
            return closePiggyBankFragment;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.ClosePiggyBankFragment$b */
    public static final class C33036b implements C12129b {
        C33036b() {
        }

        /* renamed from: c */
        public String mo26885a(ClosePiggyBankAccount closePiggyBankAccount) {
            C41536l.m120489i(closePiggyBankAccount, "item");
            return closePiggyBankAccount.mo74904b();
        }

        /* renamed from: d */
        public String mo26886b(ClosePiggyBankAccount closePiggyBankAccount) {
            C41536l.m120489i(closePiggyBankAccount, "item");
            String k = C32303f.m95200k(closePiggyBankAccount.mo74905d(), closePiggyBankAccount.mo74907e());
            C41536l.m120488h(k, "getFormattedAmount(item.amount, item.ccy)");
            return k;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.ClosePiggyBankFragment$c */
    static final class C33037c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClosePiggyBankFragment f80928d;

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.ClosePiggyBankFragment$c$a */
        static final class C33038a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ClosePiggyBankFragment f80929d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33038a(ClosePiggyBankFragment closePiggyBankFragment) {
                super(1);
                this.f80929d = closePiggyBankFragment;
            }

            /* renamed from: a */
            public final void mo74930a(String str) {
                this.f80929d.m97411v1(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo74930a((String) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.ClosePiggyBankFragment$c$b */
        static final class C33039b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ClosePiggyBankFragment f80930d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33039b(ClosePiggyBankFragment closePiggyBankFragment) {
                super(1);
                this.f80930d = closePiggyBankFragment;
            }

            /* renamed from: a */
            public final void mo74931a(String str) {
                C41536l.m120489i(str, "it");
                this.f80930d.m97411v1(false);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo74931a((String) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.ClosePiggyBankFragment$c$c */
        static final class C33040c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ClosePiggyBankFragment f80931d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33040c(ClosePiggyBankFragment closePiggyBankFragment) {
                super(1);
                this.f80931d = closePiggyBankFragment;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f80931d.m97411v1(false);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33037c(ClosePiggyBankFragment closePiggyBankFragment) {
            super(1);
            this.f80928d = closePiggyBankFragment;
        }

        /* renamed from: a */
        public final void mo74929a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92646h(aVar, (int[]) null, new C33038a(this.f80928d), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C33039b(this.f80928d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C33040c(this.f80928d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74929a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.ClosePiggyBankFragment$d */
    static final class C33041d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClosePiggyBankFragment f80932d;

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.ClosePiggyBankFragment$d$a */
        static final class C33042a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ClosePiggyBankFragment f80933d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33042a(ClosePiggyBankFragment closePiggyBankFragment) {
                super(1);
                this.f80933d = closePiggyBankFragment;
            }

            /* renamed from: a */
            public final void mo74934a(String str) {
                C33041d.m97431c(this.f80933d, true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo74934a((String) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.ClosePiggyBankFragment$d$b */
        static final class C33043b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ClosePiggyBankFragment f80934d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33043b(ClosePiggyBankFragment closePiggyBankFragment) {
                super(1);
                this.f80934d = closePiggyBankFragment;
            }

            /* renamed from: a */
            public final void mo74935a(String str) {
                C41536l.m120489i(str, "it");
                C33041d.m97431c(this.f80934d, false);
                this.f80934d.m97408s1().f93768f.setText(str);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo74935a((String) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.ClosePiggyBankFragment$d$c */
        static final class C33044c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ClosePiggyBankFragment f80935d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33044c(ClosePiggyBankFragment closePiggyBankFragment) {
                super(1);
                this.f80935d = closePiggyBankFragment;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                C33041d.m97431c(this.f80935d, false);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33041d(ClosePiggyBankFragment closePiggyBankFragment) {
            super(1);
            this.f80932d = closePiggyBankFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m97431c(ClosePiggyBankFragment closePiggyBankFragment, boolean z) {
            closePiggyBankFragment.m97408s1().f93767e.setEnabled(!z);
            LoadingView loadingView = closePiggyBankFragment.m97408s1().f93770h;
            C41536l.m120488h(loadingView, "binding.amountLoader");
            C32343x.m95483r1(loadingView, z, false, 2, (Object) null);
            AppCompatTextView appCompatTextView = closePiggyBankFragment.m97408s1().f93768f;
            C41536l.m120488h(appCompatTextView, "binding.amount");
            C32343x.m95483r1(appCompatTextView, !z, false, 2, (Object) null);
        }

        /* renamed from: b */
        public final void mo74933b(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92646h(aVar, (int[]) null, new C33042a(this.f80932d), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C33043b(this.f80932d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C33044c(this.f80932d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74933b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.ClosePiggyBankFragment$e */
    static final class C33045e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ClosePiggyBankFragment f80936d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33045e(ClosePiggyBankFragment closePiggyBankFragment) {
            super(0);
            this.f80936d = closePiggyBankFragment;
        }

        /* renamed from: b */
        public final ClosePiggyBankData invoke() {
            Bundle arguments = this.f80936d.getArguments();
            ClosePiggyBankData closePiggyBankData = arguments != null ? (ClosePiggyBankData) arguments.getParcelable("ARG_DATA") : null;
            return closePiggyBankData == null ? new ClosePiggyBankData("", C41341q.m119907j()) : closePiggyBankData;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.ClosePiggyBankFragment$f */
    static final class C33046f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f80937a;

        C33046f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f80937a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f80937a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f80937a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.ClosePiggyBankFragment$g */
    public static final class C33047g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f80938d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33047g(Fragment fragment) {
            super(0);
            this.f80938d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f80938d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.ClosePiggyBankFragment$h */
    public static final class C33048h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f80939d;

        /* renamed from: e */
        final /* synthetic */ Fragment f80940e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33048h(C43064a aVar, Fragment fragment) {
            super(0);
            this.f80939d = aVar;
            this.f80940e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f80939d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f80940e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.ClosePiggyBankFragment$i */
    public static final class C33049i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f80941d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33049i(Fragment fragment) {
            super(0);
            this.f80941d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f80941d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: n1 */
    private final void m97403n1() {
        m97408s1().f93767e.setOnClickListener(new C33061f(this));
        m97408s1().f93771i.setOnClickListener(new C33062g(this));
        getChildFragmentManager().mo4367F1("SELECTOR_REQUEST_KEY", getViewLifecycleOwner(), new C33063h(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public static final void m97404o1(ClosePiggyBankFragment closePiggyBankFragment, View view) {
        C41536l.m120489i(closePiggyBankFragment, "this$0");
        C10282f c = C10282f.f28515F.mo26883c(new SelectorConfig(C32343x.m95388F("cas.deactivate.actionsheet.choose.account", new Object[0]), false, (String) null, false, false, (String) null, (String) null, false, false, 510, (DefaultConstructorMarker) null), new C33036b());
        c.mo26881q2(closePiggyBankFragment.m97409t1().mo74916a());
        c.mo4576A1(closePiggyBankFragment.getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public static final void m97405p1(ClosePiggyBankFragment closePiggyBankFragment, View view) {
        C41536l.m120489i(closePiggyBankFragment, "this$0");
        C1533o.m5445b(closePiggyBankFragment, "REQUEST_KEY_CLOSE_PIGGY_BANK_FRAGMENT", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_CLOSE_PIGGY_BANK_CHOSEN_ACCOUNT_KEY", Long.valueOf(closePiggyBankFragment.f80921j))));
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public static final void m97406q1(ClosePiggyBankFragment closePiggyBankFragment, String str, Bundle bundle) {
        ClosePiggyBankAccount closePiggyBankAccount;
        C41536l.m120489i(closePiggyBankFragment, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("SELECTOR_RESULT_KEY");
        if (parcelableArrayList != null) {
            closePiggyBankAccount = (ClosePiggyBankAccount) C41358y.m120009Y(parcelableArrayList);
        } else {
            closePiggyBankAccount = null;
        }
        if (closePiggyBankAccount != null) {
            closePiggyBankFragment.m97408s1().f93771i.setEnabled(true);
            closePiggyBankFragment.f80921j = closePiggyBankAccount.mo74903a();
            closePiggyBankFragment.m97408s1().f93767e.setHintText((CharSequence) closePiggyBankAccount.mo74904b());
            return;
        }
        closePiggyBankFragment.m97408s1().f93771i.setEnabled(false);
    }

    /* renamed from: r1 */
    private final void m97407r1() {
        C37986h Iw = m97410u1().mo91369Iw();
        Iw.mo91362tv().mo4819k(getViewLifecycleOwner(), new C33046f(new C33037c(this)));
        Iw.mo91356L5().mo4819k(getViewLifecycleOwner(), new C33046f(new C33041d(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public final C39449h m97408s1() {
        C39449h hVar = this.f80918g;
        C41536l.m120486f(hVar);
        return hVar;
    }

    /* renamed from: t1 */
    private final ClosePiggyBankData m97409t1() {
        return (ClosePiggyBankData) this.f80919h.getValue();
    }

    /* renamed from: u1 */
    private final C37996r m97410u1() {
        return (C37996r) this.f80920i.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public final void m97411v1(boolean z) {
        Button button;
        C39449h hVar = this.f80918g;
        Input input = null;
        if (hVar != null) {
            button = hVar.f93771i;
        } else {
            button = null;
        }
        if (button != null) {
            button.setLoading(z);
        }
        C39449h hVar2 = this.f80918g;
        if (hVar2 != null) {
            input = hVar2.f93767e;
        }
        if (input != null) {
            input.setEnabled(!z);
        }
    }

    /* renamed from: x1 */
    private final void m97412x1() {
        m97408s1().f93772j.setText(C32343x.m95388F("cas.deactivate.actionsheet.choose.account.desc", new Object[0]));
        m97408s1().f93767e.setHintText((CharSequence) C32343x.m95388F("cas.deactivate.actionsheet.choose.account", new Object[0]));
        m97408s1().f93771i.setButtonText(C32343x.m95388F("cas.deactivate.actionsheet.choose.account.button", new Object[0]));
        m97408s1().f93771i.setEnabled(false);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f80918g = C39449h.m114652d(layoutInflater, viewGroup, false);
        m97412x1();
        m97407r1();
        m97403n1();
        C39449h hVar = this.f80918g;
        C41536l.m120486f(hVar);
        ConstraintLayout c = hVar.mo3946b();
        C41536l.m120488h(c, "_binding!!.root");
        return c;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f80918g = null;
    }
}
