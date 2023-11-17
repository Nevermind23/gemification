package p341ge.bog.mobilebank.p975ui.fragments.importantterm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.C0808h;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10321j;
import p366bk.C10328q;
import p90.C27446v3;
import s81.C38458a;
import s81.C38459b;
import s81.C38460c;
import s81.C38461d;

/* renamed from: ge.bog.mobilebank.ui.fragments.importantterm.LoanImportantTermFragment */
public final class LoanImportantTermFragment extends Fragment {

    /* renamed from: f */
    public static final C35624a f86123f = new C35624a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private AmountTextData f86124d;

    /* renamed from: e */
    private C27446v3 f86125e;

    /* renamed from: ge.bog.mobilebank.ui.fragments.importantterm.LoanImportantTermFragment$a */
    public static final class C35624a {
        private C35624a() {
        }

        public /* synthetic */ C35624a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final LoanImportantTermFragment mo86704a(AmountTextData amountTextData) {
            C41536l.m120489i(amountTextData, "amountTextData");
            LoanImportantTermFragment loanImportantTermFragment = new LoanImportantTermFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("TOTAL_AMOUNT", amountTextData);
            loanImportantTermFragment.setArguments(bundle);
            return loanImportantTermFragment;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.fragments.importantterm.LoanImportantTermFragment$b */
    public /* synthetic */ class C35625b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f86130a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                s81.d[] r0 = s81.C38461d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                s81.d r1 = s81.C38461d.CONSUMER_LOAN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                s81.d r1 = s81.C38461d.CREDIT_CARD     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f86130a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.fragments.importantterm.LoanImportantTermFragment.C35625b.<clinit>():void");
        }
    }

    /* renamed from: j1 */
    private final void m105788j1() {
        int i;
        C27446v3 v3Var = this.f86125e;
        AmountTextData amountTextData = null;
        if (v3Var == null) {
            C41536l.m120506z("binding");
            v3Var = null;
        }
        v3Var.f70070f.f68741g.setOnClickListener(new C38459b(this));
        C27446v3 v3Var2 = this.f86125e;
        if (v3Var2 == null) {
            C41536l.m120506z("binding");
            v3Var2 = null;
        }
        v3Var2.f70069e.setOnClickListener(new C38460c(this));
        C27446v3 v3Var3 = this.f86125e;
        if (v3Var3 == null) {
            C41536l.m120506z("binding");
            v3Var3 = null;
        }
        BogTextView bogTextView = v3Var3.f70070f.f68742h;
        bogTextView.setText(getString(C10328q.important_terms));
        bogTextView.setTypeface(C0808h.m3033h(requireContext(), C10321j.bog_headline_medium));
        bogTextView.setAllCaps(true);
        C27446v3 v3Var4 = this.f86125e;
        if (v3Var4 == null) {
            C41536l.m120506z("binding");
            v3Var4 = null;
        }
        BogTextView bogTextView2 = v3Var4.f70082r;
        AmountTextData amountTextData2 = this.f86124d;
        if (amountTextData2 == null) {
            C41536l.m120506z("amountTextData");
            amountTextData2 = null;
        }
        int i2 = C35625b.f86130a[amountTextData2.mo86692b().ordinal()];
        if (i2 == 1) {
            i = C10328q.loan_amount;
        } else if (i2 != 2) {
            i = C10328q.loan_amount;
        } else {
            i = C10328q.credit_limit;
        }
        bogTextView2.setText(getString(i));
        C27446v3 v3Var5 = this.f86125e;
        if (v3Var5 == null) {
            C41536l.m120506z("binding");
            v3Var5 = null;
        }
        BogTextView bogTextView3 = v3Var5.f70081q;
        AmountTextData amountTextData3 = this.f86124d;
        if (amountTextData3 == null) {
            C41536l.m120506z("amountTextData");
            amountTextData3 = null;
        }
        bogTextView3.setText(amountTextData3.mo86695e());
        C27446v3 v3Var6 = this.f86125e;
        if (v3Var6 == null) {
            C41536l.m120506z("binding");
            v3Var6 = null;
        }
        BogTextView bogTextView4 = v3Var6.f70079o;
        AmountTextData amountTextData4 = this.f86124d;
        if (amountTextData4 == null) {
            C41536l.m120506z("amountTextData");
            amountTextData4 = null;
        }
        bogTextView4.setText(amountTextData4.mo86691a());
        C27446v3 v3Var7 = this.f86125e;
        if (v3Var7 == null) {
            C41536l.m120506z("binding");
            v3Var7 = null;
        }
        BogTextView bogTextView5 = v3Var7.f70083s;
        AmountTextData amountTextData5 = this.f86124d;
        if (amountTextData5 == null) {
            C41536l.m120506z("amountTextData");
        } else {
            amountTextData = amountTextData5;
        }
        bogTextView5.setText(amountTextData.mo86693d());
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public static final void m105789k1(LoanImportantTermFragment loanImportantTermFragment, View view) {
        C41536l.m120489i(loanImportantTermFragment, "this$0");
        C38458a aVar = (C38458a) loanImportantTermFragment.getActivity();
        if (aVar != null) {
            aVar.mo49767u(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public static final void m105790l1(LoanImportantTermFragment loanImportantTermFragment, View view) {
        C41536l.m120489i(loanImportantTermFragment, "this$0");
        C38458a aVar = (C38458a) loanImportantTermFragment.getActivity();
        if (aVar != null) {
            aVar.mo49767u(true);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Parcelable parcelable = arguments.getParcelable("TOTAL_AMOUNT");
            C41536l.m120486f(parcelable);
            this.f86124d = (AmountTextData) parcelable;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        return C27446v3.m85093d(layoutInflater).mo3946b();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        C27446v3 a = C27446v3.m85092a(view);
        C41536l.m120488h(a, "bind(view)");
        this.f86125e = a;
        m105788j1();
    }

    /* renamed from: ge.bog.mobilebank.ui.fragments.importantterm.LoanImportantTermFragment$AmountTextData */
    public static final class AmountTextData implements Parcelable {
        public static final Parcelable.Creator<AmountTextData> CREATOR = new C35623a();

        /* renamed from: d */
        private final String f86126d;

        /* renamed from: e */
        private final String f86127e;

        /* renamed from: f */
        private final String f86128f;

        /* renamed from: g */
        private final C38461d f86129g;

        /* renamed from: ge.bog.mobilebank.ui.fragments.importantterm.LoanImportantTermFragment$AmountTextData$a */
        public static final class C35623a implements Parcelable.Creator {
            /* renamed from: a */
            public final AmountTextData createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new AmountTextData(parcel.readString(), parcel.readString(), parcel.readString(), C38461d.valueOf(parcel.readString()));
            }

            /* renamed from: b */
            public final AmountTextData[] newArray(int i) {
                return new AmountTextData[i];
            }
        }

        public AmountTextData(String str, String str2, String str3, C38461d dVar) {
            C41536l.m120489i(str, "totalAmount");
            C41536l.m120489i(str2, "firstStageAmount");
            C41536l.m120489i(str3, "secondStageAmount");
            C41536l.m120489i(dVar, "loanOfferType");
            this.f86126d = str;
            this.f86127e = str2;
            this.f86128f = str3;
            this.f86129g = dVar;
        }

        /* renamed from: a */
        public final String mo86691a() {
            return this.f86127e;
        }

        /* renamed from: b */
        public final C38461d mo86692b() {
            return this.f86129g;
        }

        /* renamed from: d */
        public final String mo86693d() {
            return this.f86128f;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final String mo86695e() {
            return this.f86126d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AmountTextData)) {
                return false;
            }
            AmountTextData amountTextData = (AmountTextData) obj;
            return C41536l.m120484d(this.f86126d, amountTextData.f86126d) && C41536l.m120484d(this.f86127e, amountTextData.f86127e) && C41536l.m120484d(this.f86128f, amountTextData.f86128f) && this.f86129g == amountTextData.f86129g;
        }

        public int hashCode() {
            return (((((this.f86126d.hashCode() * 31) + this.f86127e.hashCode()) * 31) + this.f86128f.hashCode()) * 31) + this.f86129g.hashCode();
        }

        public String toString() {
            String str = this.f86126d;
            String str2 = this.f86127e;
            String str3 = this.f86128f;
            C38461d dVar = this.f86129g;
            return "AmountTextData(totalAmount=" + str + ", firstStageAmount=" + str2 + ", secondStageAmount=" + str3 + ", loanOfferType=" + dVar + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f86126d);
            parcel.writeString(this.f86127e);
            parcel.writeString(this.f86128f);
            parcel.writeString(this.f86129g.name());
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AmountTextData(String str, String str2, String str3, C38461d dVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? C38461d.CONSUMER_LOAN : dVar);
        }
    }
}
