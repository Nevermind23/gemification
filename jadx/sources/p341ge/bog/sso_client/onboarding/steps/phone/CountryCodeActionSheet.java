package p341ge.bog.sso_client.onboarding.steps.phone;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0767a;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ba1.C10211p;
import ba1.C10214s;
import he1.C41233s;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.designsystem.components.search.SearchView;
import p341ge.bog.sso_client.models.CountryCode;
import p349ah.C9860d;
import p615tg.C17963d;
import p642vh.C18368l;
import ua1.C28638e1;
import ua1.C28668o1;
import ue1.C43075l;

/* renamed from: ge.bog.sso_client.onboarding.steps.phone.CountryCodeActionSheet */
public final class CountryCodeActionSheet extends C9860d {

    /* renamed from: G */
    public static final C35991a f87075G = new C35991a((DefaultConstructorMarker) null);

    /* renamed from: B */
    private C28668o1 f87076B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C35992b f87077C = new C35992b();

    /* renamed from: D */
    private boolean f87078D;

    /* renamed from: E */
    private CountryCode f87079E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public final C1644x f87080F = new C1644x();

    /* renamed from: ge.bog.sso_client.onboarding.steps.phone.CountryCodeActionSheet$Codes */
    private static final class Codes implements Parcelable {
        public static final Parcelable.Creator<Codes> CREATOR = new C35990a();

        /* renamed from: d */
        private final List f87081d;

        /* renamed from: ge.bog.sso_client.onboarding.steps.phone.CountryCodeActionSheet$Codes$a */
        public static final class C35990a implements Parcelable.Creator {
            /* renamed from: a */
            public final Codes createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(CountryCode.CREATOR.createFromParcel(parcel));
                }
                return new Codes(arrayList);
            }

            /* renamed from: b */
            public final Codes[] newArray(int i) {
                return new Codes[i];
            }
        }

        public Codes(List list) {
            C41536l.m120489i(list, "codes");
            this.f87081d = list;
        }

        /* renamed from: a */
        public final List mo88694a() {
            return this.f87081d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Codes) && C41536l.m120484d(this.f87081d, ((Codes) obj).f87081d);
        }

        public int hashCode() {
            return this.f87081d.hashCode();
        }

        public String toString() {
            return "Codes(codes=" + this.f87081d + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            List<CountryCode> list = this.f87081d;
            parcel.writeInt(list.size());
            for (CountryCode writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
    }

    /* renamed from: ge.bog.sso_client.onboarding.steps.phone.CountryCodeActionSheet$a */
    public static final class C35991a {
        private C35991a() {
        }

        public /* synthetic */ C35991a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final CountryCodeActionSheet mo88704a(List list) {
            C41536l.m120489i(list, "codes");
            CountryCodeActionSheet countryCodeActionSheet = new CountryCodeActionSheet();
            countryCodeActionSheet.setArguments(C0908e.m3336b(C41233s.m119492a("BUNDLE_PARAM_COUNTRY_CODES", new Codes(list))));
            return countryCodeActionSheet;
        }
    }

    /* renamed from: ge.bog.sso_client.onboarding.steps.phone.CountryCodeActionSheet$b */
    public final class C35992b extends C1819o {

        /* renamed from: f */
        private final ArrayList f87082f = new ArrayList();

        /* renamed from: g */
        private CountryCode f87083g;

        /* renamed from: h */
        private List f87084h;

        /* renamed from: ge.bog.sso_client.onboarding.steps.phone.CountryCodeActionSheet$b$a */
        public static final class C35993a implements Comparator {
            public final int compare(Object obj, Object obj2) {
                return C41506d.m120406e(((CountryCode) obj).mo88225f(), ((CountryCode) obj2).mo88225f());
            }
        }

        public C35992b() {
            super(C17963d.f51158a.mo45633d());
        }

        public int getItemCount() {
            List list = this.f87084h;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
            if (r3 != false) goto L_0x003c;
         */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo88705k(java.lang.String r9) {
            /*
                r8 = this;
                java.lang.String r0 = "search"
                kotlin.jvm.internal.C41536l.m120489i(r9, r0)
                java.util.ArrayList r0 = r8.f87082f
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r0 = r0.iterator()
            L_0x0010:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0043
                java.lang.Object r2 = r0.next()
                r3 = r2
                ge.bog.sso_client.models.CountryCode r3 = (p341ge.bog.sso_client.models.CountryCode) r3
                java.lang.String r4 = r3.mo88223e()
                r5 = 0
                r6 = 2
                r7 = 0
                if (r4 == 0) goto L_0x002b
                boolean r4 = cf1.C40440x.m117139M(r4, r9, r7, r6, r5)
                goto L_0x002c
            L_0x002b:
                r4 = r7
            L_0x002c:
                if (r4 != 0) goto L_0x003c
                java.lang.String r3 = r3.mo88219a()
                if (r3 == 0) goto L_0x0039
                boolean r3 = cf1.C40440x.m117139M(r3, r9, r7, r6, r5)
                goto L_0x003a
            L_0x0039:
                r3 = r7
            L_0x003a:
                if (r3 == 0) goto L_0x003d
            L_0x003c:
                r7 = 1
            L_0x003d:
                if (r7 == 0) goto L_0x0010
                r1.add(r2)
                goto L_0x0010
            L_0x0043:
                r8.f87084h = r1
                r8.notifyDataSetChanged()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.sso_client.onboarding.steps.phone.CountryCodeActionSheet.C35992b.mo88705k(java.lang.String):void");
        }

        /* renamed from: l */
        public final List mo88706l() {
            return this.f87084h;
        }

        /* renamed from: m */
        public void onBindViewHolder(C35994c cVar, int i) {
            CountryCode countryCode;
            String str;
            C41536l.m120489i(cVar, "holder");
            List list = this.f87084h;
            String str2 = null;
            if (list != null) {
                countryCode = (CountryCode) list.get(i);
            } else {
                countryCode = null;
            }
            if (countryCode != null) {
                str = countryCode.mo88220b();
            } else {
                str = null;
            }
            CountryCode countryCode2 = this.f87083g;
            if (countryCode2 != null) {
                str2 = countryCode2.mo88220b();
            }
            cVar.mo88712i(countryCode, C41536l.m120484d(str, str2));
        }

        /* renamed from: n */
        public C35994c onCreateViewHolder(ViewGroup viewGroup, int i) {
            C41536l.m120489i(viewGroup, "parent");
            CountryCodeActionSheet countryCodeActionSheet = CountryCodeActionSheet.this;
            C28638e1 d = C28638e1.m87653d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …, false\n                )");
            return new C35994c(countryCodeActionSheet, d);
        }

        /* renamed from: o */
        public final void mo88709o(CountryCode countryCode) {
            this.f87083g = countryCode;
            notifyDataSetChanged();
        }

        /* renamed from: p */
        public final void mo88710p(List list) {
            C41536l.m120489i(list, "data");
            this.f87082f.clear();
            this.f87082f.addAll(list);
            ArrayList arrayList = this.f87082f;
            if (arrayList.size() > 1) {
                C41349u.m119946y(arrayList, new C35993a());
            }
            this.f87084h = this.f87082f;
            notifyDataSetChanged();
        }
    }

    /* renamed from: ge.bog.sso_client.onboarding.steps.phone.CountryCodeActionSheet$c */
    public final class C35994c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C28638e1 f87086d;

        /* renamed from: e */
        final /* synthetic */ CountryCodeActionSheet f87087e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35994c(CountryCodeActionSheet countryCodeActionSheet, C28638e1 e1Var) {
            super(e1Var.mo3946b());
            C41536l.m120489i(e1Var, "binding");
            this.f87087e = countryCodeActionSheet;
            this.f87086d = e1Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m107153j(CountryCodeActionSheet countryCodeActionSheet, CountryCode countryCode, View view) {
            C41536l.m120489i(countryCodeActionSheet, "this$0");
            countryCodeActionSheet.f87080F.mo4826r(countryCode);
            C1533o.m5445b(countryCodeActionSheet, "FRAGMENT_RESULT_TAG_CODE_SUBMITTED", C0908e.m3336b(C41233s.m119492a("FRAGMENT_RESULT_BUNDLE_CODE", countryCode)));
            countryCodeActionSheet.mo4577k1();
        }

        /* renamed from: i */
        public final void mo88712i(CountryCode countryCode, boolean z) {
            String str;
            String str2;
            AppCompatTextView appCompatTextView = this.f87086d.f72720e;
            StringBuilder sb = new StringBuilder();
            sb.append('+');
            if (countryCode != null) {
                str = countryCode.mo88219a();
            } else {
                str = null;
            }
            sb.append(str);
            appCompatTextView.setText(sb.toString());
            if (z) {
                Context context = appCompatTextView.getContext();
                C41536l.m120488h(context, "context");
                appCompatTextView.setTextColor(C18368l.m62755d(context, C10211p.f28265d));
            } else {
                Context context2 = appCompatTextView.getContext();
                C41536l.m120488h(context2, "context");
                appCompatTextView.setTextColor(C18368l.m62755d(context2, C10211p.f28264b));
            }
            AppCompatTextView appCompatTextView2 = this.f87086d.f72722g;
            CountryCodeActionSheet countryCodeActionSheet = this.f87087e;
            if (countryCode == null || (str2 = countryCode.mo88223e()) == null) {
                str2 = "";
            }
            appCompatTextView2.setText(str2);
            if (z) {
                Context requireContext = countryCodeActionSheet.requireContext();
                C41536l.m120488h(requireContext, "requireContext()");
                appCompatTextView2.setTextColor(C18368l.m62755d(requireContext, C10211p.f28265d));
            } else {
                Context requireContext2 = countryCodeActionSheet.requireContext();
                C41536l.m120488h(requireContext2, "requireContext()");
                appCompatTextView2.setTextColor(C18368l.m62755d(requireContext2, C10211p.f28264b));
            }
            this.f87086d.mo3946b().setOnClickListener(new C35997b(this.f87087e, countryCode));
        }
    }

    /* renamed from: ge.bog.sso_client.onboarding.steps.phone.CountryCodeActionSheet$d */
    static final class C35995d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CountryCodeActionSheet f87088d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35995d(CountryCodeActionSheet countryCodeActionSheet) {
            super(1);
            this.f87088d = countryCodeActionSheet;
        }

        /* renamed from: a */
        public final void mo88713a(String str) {
            C41536l.m120489i(str, "it");
            this.f87088d.f87077C.mo88705k(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo88713a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public static final void m107137h2(CountryCodeActionSheet countryCodeActionSheet, int i) {
        C41536l.m120489i(countryCodeActionSheet, "this$0");
        C28668o1 o1Var = countryCodeActionSheet.f87076B;
        if (o1Var == null) {
            C41536l.m120506z("binding");
            o1Var = null;
        }
        RecyclerView.C1747p layoutManager = o1Var.f72874e.getLayoutManager();
        if (layoutManager != null) {
            ((LinearLayoutManager) layoutManager).mo5201P2(i, 0);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Codes codes;
        List a;
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        C28668o1 d = C28668o1.m87785d(layoutInflater, viewGroup, true);
        C41536l.m120488h(d, "inflate(inflater, container, true)");
        this.f87076B = d;
        C28668o1 o1Var = null;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        SearchView searchView = d.f72875f;
        searchView.setEnabled(this.f87078D);
        searchView.setOnTextChangeListener(new C35995d(this));
        C28668o1 o1Var2 = this.f87076B;
        if (o1Var2 == null) {
            C41536l.m120506z("binding");
        } else {
            o1Var = o1Var2;
        }
        RecyclerView recyclerView = o1Var.f72874e;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.f87077C);
        Drawable e = C0767a.m2895e(recyclerView.getContext(), C10214s.f28277I);
        if (e != null) {
            recyclerView.mo5351j(new C13364a(e, true, false));
            Bundle arguments = getArguments();
            if (arguments != null && (codes = (Codes) arguments.getParcelable("BUNDLE_PARAM_COUNTRY_CODES")) != null && (a = codes.mo88694a()) != null) {
                mo88693j2(a);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: g2 */
    public final LiveData mo88691g2() {
        return this.f87080F;
    }

    /* renamed from: i2 */
    public final void mo88692i2(CountryCode countryCode) {
        C41536l.m120489i(countryCode, "country");
        this.f87079E = countryCode;
    }

    /* renamed from: j2 */
    public final void mo88693j2(List list) {
        C41536l.m120489i(list, "data");
        this.f87077C.mo88710p(list);
        this.f87078D = true;
        C28668o1 o1Var = this.f87076B;
        if (o1Var != null) {
            if (o1Var == null) {
                C41536l.m120506z("binding");
                o1Var = null;
            }
            o1Var.f72875f.setEnabled(true);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        int b0;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        List l = this.f87077C.mo88706l();
        if (!(l == null || (b0 = C41358y.m120012b0(l, this.f87079E)) == -1)) {
            C28668o1 o1Var = this.f87076B;
            if (o1Var == null) {
                C41536l.m120506z("binding");
                o1Var = null;
            }
            o1Var.f72874e.post(new C35996a(this, b0));
        }
        this.f87077C.mo88709o(this.f87079E);
    }
}
