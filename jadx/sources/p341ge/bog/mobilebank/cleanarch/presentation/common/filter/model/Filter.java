package p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.model.Filter */
public abstract class Filter implements Parcelable {

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.model.Filter$AccountsSelectModel */
    public static final class AccountsSelectModel extends Filter {
        public static final Parcelable.Creator<AccountsSelectModel> CREATOR = new C21531a();

        /* renamed from: d */
        private final String f57570d;

        /* renamed from: e */
        private final String f57571e;

        /* renamed from: f */
        private final FilterValue.MultiSelect f57572f;

        /* renamed from: g */
        private final FilterValue.MultiSelect f57573g;

        /* renamed from: h */
        private final ArrayList f57574h;

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.model.Filter$AccountsSelectModel$a */
        public static final class C21531a implements Parcelable.Creator {
            /* renamed from: a */
            public final AccountsSelectModel createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Parcelable.Creator<FilterValue.MultiSelect> creator = FilterValue.MultiSelect.CREATOR;
                FilterValue.MultiSelect createFromParcel = creator.createFromParcel(parcel);
                FilterValue.MultiSelect createFromParcel2 = creator.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(AccountFilterItemModel.CREATOR.createFromParcel(parcel));
                }
                return new AccountsSelectModel(readString, readString2, createFromParcel, createFromParcel2, arrayList);
            }

            /* renamed from: b */
            public final AccountsSelectModel[] newArray(int i) {
                return new AccountsSelectModel[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AccountsSelectModel(String str, String str2, FilterValue.MultiSelect multiSelect, FilterValue.MultiSelect multiSelect2, ArrayList arrayList) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "id");
            C41536l.m120489i(multiSelect, C11755a.C11756a.f34100b);
            C41536l.m120489i(multiSelect2, "initialValue");
            C41536l.m120489i(arrayList, "items");
            this.f57570d = str;
            this.f57571e = str2;
            this.f57572f = multiSelect;
            this.f57573g = multiSelect2;
            this.f57574h = arrayList;
        }

        /* renamed from: a */
        public String mo53763a() {
            return this.f57570d;
        }

        /* renamed from: d */
        public String mo53765d() {
            return this.f57571e;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccountsSelectModel)) {
                return false;
            }
            AccountsSelectModel accountsSelectModel = (AccountsSelectModel) obj;
            return C41536l.m120484d(this.f57570d, accountsSelectModel.f57570d) && C41536l.m120484d(this.f57571e, accountsSelectModel.f57571e) && C41536l.m120484d(this.f57572f, accountsSelectModel.f57572f) && C41536l.m120484d(this.f57573g, accountsSelectModel.f57573g) && C41536l.m120484d(this.f57574h, accountsSelectModel.f57574h);
        }

        /* renamed from: f */
        public FilterValue.MultiSelect mo53764b() {
            return this.f57573g;
        }

        /* renamed from: g */
        public final ArrayList mo53770g() {
            return this.f57574h;
        }

        /* renamed from: h */
        public FilterValue.MultiSelect mo53766e() {
            return this.f57572f;
        }

        public int hashCode() {
            int hashCode = this.f57570d.hashCode() * 31;
            String str = this.f57571e;
            return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f57572f.hashCode()) * 31) + this.f57573g.hashCode()) * 31) + this.f57574h.hashCode();
        }

        public String toString() {
            String str = this.f57570d;
            String str2 = this.f57571e;
            FilterValue.MultiSelect multiSelect = this.f57572f;
            FilterValue.MultiSelect multiSelect2 = this.f57573g;
            ArrayList arrayList = this.f57574h;
            return "AccountsSelectModel(id=" + str + ", title=" + str2 + ", value=" + multiSelect + ", initialValue=" + multiSelect2 + ", items=" + arrayList + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f57570d);
            parcel.writeString(this.f57571e);
            this.f57572f.writeToParcel(parcel, i);
            this.f57573g.writeToParcel(parcel, i);
            ArrayList arrayList = this.f57574h;
            parcel.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AccountFilterItemModel) it.next()).writeToParcel(parcel, i);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.model.Filter$CalendarFilterModel */
    public static final class CalendarFilterModel extends Filter {
        public static final Parcelable.Creator<CalendarFilterModel> CREATOR = new C21532a();

        /* renamed from: d */
        private final String f57575d;

        /* renamed from: e */
        private final String f57576e;

        /* renamed from: f */
        private final FilterValue.Calendar f57577f;

        /* renamed from: g */
        private final FilterValue.Calendar f57578g;

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.model.Filter$CalendarFilterModel$a */
        public static final class C21532a implements Parcelable.Creator {
            /* renamed from: a */
            public final CalendarFilterModel createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Parcelable.Creator<FilterValue.Calendar> creator = FilterValue.Calendar.CREATOR;
                return new CalendarFilterModel(readString, readString2, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
            }

            /* renamed from: b */
            public final CalendarFilterModel[] newArray(int i) {
                return new CalendarFilterModel[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CalendarFilterModel(String str, String str2, FilterValue.Calendar calendar, FilterValue.Calendar calendar2) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "id");
            C41536l.m120489i(calendar, C11755a.C11756a.f34100b);
            C41536l.m120489i(calendar2, "initialValue");
            this.f57575d = str;
            this.f57576e = str2;
            this.f57577f = calendar;
            this.f57578g = calendar2;
        }

        /* renamed from: a */
        public String mo53763a() {
            return this.f57575d;
        }

        /* renamed from: d */
        public String mo53765d() {
            return this.f57576e;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CalendarFilterModel)) {
                return false;
            }
            CalendarFilterModel calendarFilterModel = (CalendarFilterModel) obj;
            return C41536l.m120484d(this.f57575d, calendarFilterModel.f57575d) && C41536l.m120484d(this.f57576e, calendarFilterModel.f57576e) && C41536l.m120484d(this.f57577f, calendarFilterModel.f57577f) && C41536l.m120484d(this.f57578g, calendarFilterModel.f57578g);
        }

        /* renamed from: f */
        public FilterValue.Calendar mo53764b() {
            return this.f57578g;
        }

        /* renamed from: g */
        public FilterValue.Calendar mo53766e() {
            return this.f57577f;
        }

        public int hashCode() {
            int hashCode = this.f57575d.hashCode() * 31;
            String str = this.f57576e;
            return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f57577f.hashCode()) * 31) + this.f57578g.hashCode();
        }

        public String toString() {
            String str = this.f57575d;
            String str2 = this.f57576e;
            FilterValue.Calendar calendar = this.f57577f;
            FilterValue.Calendar calendar2 = this.f57578g;
            return "CalendarFilterModel(id=" + str + ", title=" + str2 + ", value=" + calendar + ", initialValue=" + calendar2 + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f57575d);
            parcel.writeString(this.f57576e);
            this.f57577f.writeToParcel(parcel, i);
            this.f57578g.writeToParcel(parcel, i);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.model.Filter$MultiSelectModel */
    public static final class MultiSelectModel extends Filter {
        public static final Parcelable.Creator<MultiSelectModel> CREATOR = new C21533a();

        /* renamed from: d */
        private final String f57579d;

        /* renamed from: e */
        private final String f57580e;

        /* renamed from: f */
        private final FilterValue.MultiSelect f57581f;

        /* renamed from: g */
        private final FilterValue.MultiSelect f57582g;

        /* renamed from: h */
        private final ArrayList f57583h;

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.model.Filter$MultiSelectModel$a */
        public static final class C21533a implements Parcelable.Creator {
            /* renamed from: a */
            public final MultiSelectModel createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Parcelable.Creator<FilterValue.MultiSelect> creator = FilterValue.MultiSelect.CREATOR;
                return new MultiSelectModel(readString, readString2, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.createStringArrayList());
            }

            /* renamed from: b */
            public final MultiSelectModel[] newArray(int i) {
                return new MultiSelectModel[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MultiSelectModel(String str, String str2, FilterValue.MultiSelect multiSelect, FilterValue.MultiSelect multiSelect2, ArrayList arrayList) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "id");
            C41536l.m120489i(multiSelect, C11755a.C11756a.f34100b);
            C41536l.m120489i(multiSelect2, "initialValue");
            C41536l.m120489i(arrayList, "items");
            this.f57579d = str;
            this.f57580e = str2;
            this.f57581f = multiSelect;
            this.f57582g = multiSelect2;
            this.f57583h = arrayList;
        }

        /* renamed from: a */
        public String mo53763a() {
            return this.f57579d;
        }

        /* renamed from: d */
        public String mo53765d() {
            return this.f57580e;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MultiSelectModel)) {
                return false;
            }
            MultiSelectModel multiSelectModel = (MultiSelectModel) obj;
            return C41536l.m120484d(this.f57579d, multiSelectModel.f57579d) && C41536l.m120484d(this.f57580e, multiSelectModel.f57580e) && C41536l.m120484d(this.f57581f, multiSelectModel.f57581f) && C41536l.m120484d(this.f57582g, multiSelectModel.f57582g) && C41536l.m120484d(this.f57583h, multiSelectModel.f57583h);
        }

        /* renamed from: f */
        public FilterValue.MultiSelect mo53764b() {
            return this.f57582g;
        }

        /* renamed from: g */
        public final ArrayList mo53793g() {
            return this.f57583h;
        }

        /* renamed from: h */
        public FilterValue.MultiSelect mo53766e() {
            return this.f57581f;
        }

        public int hashCode() {
            int hashCode = this.f57579d.hashCode() * 31;
            String str = this.f57580e;
            return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f57581f.hashCode()) * 31) + this.f57582g.hashCode()) * 31) + this.f57583h.hashCode();
        }

        public String toString() {
            String str = this.f57579d;
            String str2 = this.f57580e;
            FilterValue.MultiSelect multiSelect = this.f57581f;
            FilterValue.MultiSelect multiSelect2 = this.f57582g;
            ArrayList arrayList = this.f57583h;
            return "MultiSelectModel(id=" + str + ", title=" + str2 + ", value=" + multiSelect + ", initialValue=" + multiSelect2 + ", items=" + arrayList + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f57579d);
            parcel.writeString(this.f57580e);
            this.f57581f.writeToParcel(parcel, i);
            this.f57582g.writeToParcel(parcel, i);
            parcel.writeStringList(this.f57583h);
        }
    }

    private Filter() {
    }

    public /* synthetic */ Filter(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract String mo53763a();

    /* renamed from: b */
    public abstract FilterValue mo53764b();

    /* renamed from: d */
    public abstract String mo53765d();

    /* renamed from: e */
    public abstract FilterValue mo53766e();
}
