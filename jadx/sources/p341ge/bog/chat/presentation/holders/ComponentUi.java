package p341ge.bog.chat.presentation.holders;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.chat.domain.model.components.PreContractComponent;
import ue1.C43075l;

/* renamed from: ge.bog.chat.presentation.holders.ComponentUi */
public abstract class ComponentUi {

    /* renamed from: ge.bog.chat.presentation.holders.ComponentUi$FAQComponentUi */
    public static final class FAQComponentUi extends ComponentUi implements Parcelable {
        public static final Parcelable.Creator<FAQComponentUi> CREATOR = new C13072a();

        /* renamed from: d */
        private final String f38469d;

        /* renamed from: e */
        private final List f38470e;

        /* renamed from: ge.bog.chat.presentation.holders.ComponentUi$FAQComponentUi$a */
        public static final class C13072a implements Parcelable.Creator {
            /* renamed from: a */
            public final FAQComponentUi createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(FAQItemUI.CREATOR.createFromParcel(parcel));
                }
                return new FAQComponentUi(readString, arrayList);
            }

            /* renamed from: b */
            public final FAQComponentUi[] newArray(int i) {
                return new FAQComponentUi[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FAQComponentUi(String str, List list) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "pageTitle");
            C41536l.m120489i(list, "faqData");
            this.f38469d = str;
            this.f38470e = list;
        }

        /* renamed from: a */
        public final List mo34347a() {
            return this.f38470e;
        }

        /* renamed from: b */
        public final String mo34348b() {
            return this.f38469d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FAQComponentUi)) {
                return false;
            }
            FAQComponentUi fAQComponentUi = (FAQComponentUi) obj;
            return C41536l.m120484d(this.f38469d, fAQComponentUi.f38469d) && C41536l.m120484d(this.f38470e, fAQComponentUi.f38470e);
        }

        public int hashCode() {
            return (this.f38469d.hashCode() * 31) + this.f38470e.hashCode();
        }

        public String toString() {
            String str = this.f38469d;
            List list = this.f38470e;
            return "FAQComponentUi(pageTitle=" + str + ", faqData=" + list + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f38469d);
            List<FAQItemUI> list = this.f38470e;
            parcel.writeInt(list.size());
            for (FAQItemUI writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
    }

    /* renamed from: ge.bog.chat.presentation.holders.ComponentUi$PreContractComponentUi */
    public static final class PreContractComponentUi extends ComponentUi implements Parcelable {
        public static final Parcelable.Creator<PreContractComponentUi> CREATOR = new C13075b();

        /* renamed from: h */
        public static final C13074a f38474h = new C13074a((DefaultConstructorMarker) null);

        /* renamed from: d */
        private final String f38475d;

        /* renamed from: e */
        private final String f38476e;

        /* renamed from: f */
        private final String f38477f;

        /* renamed from: g */
        private final String f38478g;

        /* renamed from: ge.bog.chat.presentation.holders.ComponentUi$PreContractComponentUi$a */
        public static final class C13074a {
            private C13074a() {
            }

            public /* synthetic */ C13074a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final PreContractComponentUi mo34378a(PreContractComponent preContractComponent) {
                C41536l.m120489i(preContractComponent, "preContractComponent");
                return new PreContractComponentUi(preContractComponent.getPreContractHeader(), preContractComponent.getPreContractHtml(), preContractComponent.getButton().getTitle(), preContractComponent.getButton().getPayload());
            }
        }

        /* renamed from: ge.bog.chat.presentation.holders.ComponentUi$PreContractComponentUi$b */
        public static final class C13075b implements Parcelable.Creator {
            /* renamed from: a */
            public final PreContractComponentUi createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new PreContractComponentUi(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* renamed from: b */
            public final PreContractComponentUi[] newArray(int i) {
                return new PreContractComponentUi[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PreContractComponentUi(String str, String str2, String str3, String str4) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "contractToolbarTitle");
            C41536l.m120489i(str2, "preContractHtml");
            C41536l.m120489i(str3, "buttonTitle");
            C41536l.m120489i(str4, "payload");
            this.f38475d = str;
            this.f38476e = str2;
            this.f38477f = str3;
            this.f38478g = str4;
        }

        /* renamed from: a */
        public final String mo34369a() {
            return this.f38477f;
        }

        /* renamed from: b */
        public final String mo34370b() {
            return this.f38475d;
        }

        /* renamed from: d */
        public final String mo34371d() {
            return this.f38478g;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final String mo34373e() {
            return this.f38476e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PreContractComponentUi)) {
                return false;
            }
            PreContractComponentUi preContractComponentUi = (PreContractComponentUi) obj;
            return C41536l.m120484d(this.f38475d, preContractComponentUi.f38475d) && C41536l.m120484d(this.f38476e, preContractComponentUi.f38476e) && C41536l.m120484d(this.f38477f, preContractComponentUi.f38477f) && C41536l.m120484d(this.f38478g, preContractComponentUi.f38478g);
        }

        public int hashCode() {
            return (((((this.f38475d.hashCode() * 31) + this.f38476e.hashCode()) * 31) + this.f38477f.hashCode()) * 31) + this.f38478g.hashCode();
        }

        public String toString() {
            String str = this.f38475d;
            String str2 = this.f38476e;
            String str3 = this.f38477f;
            String str4 = this.f38478g;
            return "PreContractComponentUi(contractToolbarTitle=" + str + ", preContractHtml=" + str2 + ", buttonTitle=" + str3 + ", payload=" + str4 + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f38475d);
            parcel.writeString(this.f38476e);
            parcel.writeString(this.f38477f);
            parcel.writeString(this.f38478g);
        }
    }

    /* renamed from: ge.bog.chat.presentation.holders.ComponentUi$a */
    public static final class C13076a extends ComponentUi {

        /* renamed from: d */
        private final List f38479d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13076a(List list) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "accounts");
            this.f38479d = list;
        }

        /* renamed from: a */
        public final List mo34383a() {
            return this.f38479d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13076a) && C41536l.m120484d(this.f38479d, ((C13076a) obj).f38479d);
        }

        public int hashCode() {
            return this.f38479d.hashCode();
        }

        public String toString() {
            List list = this.f38479d;
            return "AccountsSelectorComponentUi(accounts=" + list + ")";
        }
    }

    /* renamed from: ge.bog.chat.presentation.holders.ComponentUi$b */
    public static final class C13077b extends ComponentUi {

        /* renamed from: d */
        private final boolean f38480d;

        /* renamed from: e */
        private final String f38481e;

        /* renamed from: f */
        private final String f38482f;

        /* renamed from: g */
        private final C43075l f38483g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13077b(boolean z, String str, String str2, C43075l lVar) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "rangeFormat");
            C41536l.m120489i(str2, "datePattern");
            C41536l.m120489i(lVar, "onDateChosen");
            this.f38480d = z;
            this.f38481e = str;
            this.f38482f = str2;
            this.f38483g = lVar;
        }

        /* renamed from: a */
        public final String mo34387a() {
            return this.f38482f;
        }

        /* renamed from: b */
        public final C43075l mo34388b() {
            return this.f38483g;
        }

        /* renamed from: d */
        public final String mo34389d() {
            return this.f38481e;
        }

        /* renamed from: e */
        public final boolean mo34390e() {
            return this.f38480d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13077b)) {
                return false;
            }
            C13077b bVar = (C13077b) obj;
            return this.f38480d == bVar.f38480d && C41536l.m120484d(this.f38481e, bVar.f38481e) && C41536l.m120484d(this.f38482f, bVar.f38482f) && C41536l.m120484d(this.f38483g, bVar.f38483g);
        }

        public int hashCode() {
            boolean z = this.f38480d;
            if (z) {
                z = true;
            }
            return ((((((z ? 1 : 0) * true) + this.f38481e.hashCode()) * 31) + this.f38482f.hashCode()) * 31) + this.f38483g.hashCode();
        }

        public String toString() {
            boolean z = this.f38480d;
            String str = this.f38481e;
            String str2 = this.f38482f;
            C43075l lVar = this.f38483g;
            return "CalendarRangeComponentUi(isStartDate=" + z + ", rangeFormat=" + str + ", datePattern=" + str2 + ", onDateChosen=" + lVar + ")";
        }
    }

    /* renamed from: ge.bog.chat.presentation.holders.ComponentUi$c */
    public static final class C13078c extends ComponentUi {

        /* renamed from: d */
        private final String f38484d;

        /* renamed from: e */
        private final String f38485e;

        /* renamed from: f */
        private final boolean f38486f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13078c(String str, String str2, boolean z) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "title");
            C41536l.m120489i(str2, "payload");
            this.f38484d = str;
            this.f38485e = str2;
            this.f38486f = z;
        }

        /* renamed from: a */
        public final String mo34394a() {
            return this.f38485e;
        }

        /* renamed from: b */
        public final String mo34395b() {
            return this.f38484d;
        }

        /* renamed from: d */
        public final boolean mo34396d() {
            return this.f38486f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13078c)) {
                return false;
            }
            C13078c cVar = (C13078c) obj;
            return C41536l.m120484d(this.f38484d, cVar.f38484d) && C41536l.m120484d(this.f38485e, cVar.f38485e) && this.f38486f == cVar.f38486f;
        }

        public int hashCode() {
            int hashCode = ((this.f38484d.hashCode() * 31) + this.f38485e.hashCode()) * 31;
            boolean z = this.f38486f;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            String str = this.f38484d;
            String str2 = this.f38485e;
            boolean z = this.f38486f;
            return "ChipsComponentUi(title=" + str + ", payload=" + str2 + ", isLikeDislike=" + z + ")";
        }
    }

    /* renamed from: ge.bog.chat.presentation.holders.ComponentUi$d */
    public static final class C13079d extends ComponentUi {

        /* renamed from: d */
        private final String f38487d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13079d(String str) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "productTitle");
            this.f38487d = str;
        }

        /* renamed from: a */
        public final String mo34400a() {
            return this.f38487d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13079d) && C41536l.m120484d(this.f38487d, ((C13079d) obj).f38487d);
        }

        public int hashCode() {
            return this.f38487d.hashCode();
        }

        public String toString() {
            String str = this.f38487d;
            return "ProductsSliderComponentUi(productTitle=" + str + ")";
        }
    }

    private ComponentUi() {
    }

    public /* synthetic */ ComponentUi(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: ge.bog.chat.presentation.holders.ComponentUi$FAQItemUI */
    public static final class FAQItemUI implements Parcelable {
        public static final Parcelable.Creator<FAQItemUI> CREATOR = new C13073a();

        /* renamed from: d */
        private final String f38471d;

        /* renamed from: e */
        private final String f38472e;

        /* renamed from: f */
        private final boolean f38473f;

        /* renamed from: ge.bog.chat.presentation.holders.ComponentUi$FAQItemUI$a */
        public static final class C13073a implements Parcelable.Creator {
            /* renamed from: a */
            public final FAQItemUI createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new FAQItemUI(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final FAQItemUI[] newArray(int i) {
                return new FAQItemUI[i];
            }
        }

        public FAQItemUI(String str, String str2, boolean z) {
            C41536l.m120489i(str, "question");
            C41536l.m120489i(str2, "answer");
            this.f38471d = str;
            this.f38472e = str2;
            this.f38473f = z;
        }

        /* renamed from: a */
        public final String mo34358a() {
            return this.f38472e;
        }

        /* renamed from: b */
        public final String mo34359b() {
            return this.f38471d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FAQItemUI)) {
                return false;
            }
            FAQItemUI fAQItemUI = (FAQItemUI) obj;
            return C41536l.m120484d(this.f38471d, fAQItemUI.f38471d) && C41536l.m120484d(this.f38472e, fAQItemUI.f38472e) && this.f38473f == fAQItemUI.f38473f;
        }

        public int hashCode() {
            int hashCode = ((this.f38471d.hashCode() * 31) + this.f38472e.hashCode()) * 31;
            boolean z = this.f38473f;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            String str = this.f38471d;
            String str2 = this.f38472e;
            boolean z = this.f38473f;
            return "FAQItemUI(question=" + str + ", answer=" + str2 + ", showAnswer=" + z + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f38471d);
            parcel.writeString(this.f38472e);
            parcel.writeInt(this.f38473f ? 1 : 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FAQItemUI(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? false : z);
        }
    }
}
