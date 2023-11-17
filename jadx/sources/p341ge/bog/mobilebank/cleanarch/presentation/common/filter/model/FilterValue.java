package p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue */
public abstract class FilterValue implements Parcelable {

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue$Calendar */
    public static final class Calendar extends FilterValue {
        public static final Parcelable.Creator<Calendar> CREATOR = new C21534a();

        /* renamed from: d */
        private final long f57584d;

        /* renamed from: e */
        private final Long f57585e;

        /* renamed from: f */
        private final Long f57586f;

        /* renamed from: g */
        private final Long f57587g;

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue$Calendar$a */
        public static final class C21534a implements Parcelable.Creator {
            /* renamed from: a */
            public final Calendar createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new Calendar(parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            /* renamed from: b */
            public final Calendar[] newArray(int i) {
                return new Calendar[i];
            }
        }

        public Calendar(long j, Long l, Long l2, Long l3) {
            super((DefaultConstructorMarker) null);
            this.f57584d = j;
            this.f57585e = l;
            this.f57586f = l2;
            this.f57587g = l3;
        }

        /* renamed from: a */
        public final Long mo53802a() {
            return this.f57585e;
        }

        /* renamed from: b */
        public final Long mo53803b() {
            return this.f57587g;
        }

        /* renamed from: d */
        public final long mo53804d() {
            return this.f57584d;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final Long mo53806e() {
            return this.f57586f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Calendar)) {
                return false;
            }
            Calendar calendar = (Calendar) obj;
            return this.f57584d == calendar.f57584d && C41536l.m120484d(this.f57585e, calendar.f57585e) && C41536l.m120484d(this.f57586f, calendar.f57586f) && C41536l.m120484d(this.f57587g, calendar.f57587g);
        }

        public int hashCode() {
            int a = C7397t.m28148a(this.f57584d) * 31;
            Long l = this.f57585e;
            int i = 0;
            int hashCode = (a + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.f57586f;
            int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
            Long l3 = this.f57587g;
            if (l3 != null) {
                i = l3.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            long j = this.f57584d;
            Long l = this.f57585e;
            Long l2 = this.f57586f;
            Long l3 = this.f57587g;
            return "Calendar(startDate=" + j + ", endDate=" + l + ", startLimit=" + l2 + ", endLimit=" + l3 + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeLong(this.f57584d);
            Long l = this.f57585e;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
            Long l2 = this.f57586f;
            if (l2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l2.longValue());
            }
            Long l3 = this.f57587g;
            if (l3 == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue$Checkable */
    public static final class Checkable extends FilterValue {
        public static final Parcelable.Creator<Checkable> CREATOR = new C21535a();

        /* renamed from: d */
        private final boolean f57588d;

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue$Checkable$a */
        public static final class C21535a implements Parcelable.Creator {
            /* renamed from: a */
            public final Checkable createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new Checkable(parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final Checkable[] newArray(int i) {
                return new Checkable[i];
            }
        }

        public Checkable(boolean z) {
            super((DefaultConstructorMarker) null);
            this.f57588d = z;
        }

        /* renamed from: a */
        public final boolean mo53815a() {
            return this.f57588d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Checkable) && this.f57588d == ((Checkable) obj).f57588d;
        }

        public int hashCode() {
            boolean z = this.f57588d;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            boolean z = this.f57588d;
            return "Checkable(isChecked=" + z + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(this.f57588d ? 1 : 0);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue$MultiSelect */
    public static final class MultiSelect extends FilterValue {
        public static final Parcelable.Creator<MultiSelect> CREATOR = new C21536a();

        /* renamed from: d */
        private final HashSet f57589d;

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue$MultiSelect$a */
        public static final class C21536a implements Parcelable.Creator {
            /* renamed from: a */
            public final MultiSelect createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                int readInt = parcel.readInt();
                HashSet hashSet = new HashSet(readInt);
                for (int i = 0; i != readInt; i++) {
                    hashSet.add(Integer.valueOf(parcel.readInt()));
                }
                return new MultiSelect(hashSet);
            }

            /* renamed from: b */
            public final MultiSelect[] newArray(int i) {
                return new MultiSelect[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MultiSelect(HashSet hashSet) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(hashSet, "selectedItems");
            this.f57589d = hashSet;
        }

        /* renamed from: b */
        public static /* synthetic */ MultiSelect m69651b(MultiSelect multiSelect, HashSet hashSet, int i, Object obj) {
            if ((i & 1) != 0) {
                hashSet = multiSelect.f57589d;
            }
            return multiSelect.mo53825a(hashSet);
        }

        /* renamed from: a */
        public final MultiSelect mo53825a(HashSet hashSet) {
            C41536l.m120489i(hashSet, "selectedItems");
            return new MultiSelect(hashSet);
        }

        /* renamed from: d */
        public final HashSet mo53826d() {
            return this.f57589d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MultiSelect) && C41536l.m120484d(this.f57589d, ((MultiSelect) obj).f57589d);
        }

        public int hashCode() {
            return this.f57589d.hashCode();
        }

        public String toString() {
            HashSet hashSet = this.f57589d;
            return "MultiSelect(selectedItems=" + hashSet + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            HashSet hashSet = this.f57589d;
            parcel.writeInt(hashSet.size());
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                parcel.writeInt(((Number) it.next()).intValue());
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue$SingleSelect */
    public static final class SingleSelect extends FilterValue {
        public static final Parcelable.Creator<SingleSelect> CREATOR = new C21537a();

        /* renamed from: d */
        private final long f57590d;

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue$SingleSelect$a */
        public static final class C21537a implements Parcelable.Creator {
            /* renamed from: a */
            public final SingleSelect createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new SingleSelect(parcel.readLong());
            }

            /* renamed from: b */
            public final SingleSelect[] newArray(int i) {
                return new SingleSelect[i];
            }
        }

        public SingleSelect(long j) {
            super((DefaultConstructorMarker) null);
            this.f57590d = j;
        }

        /* renamed from: a */
        public final long mo53836a() {
            return this.f57590d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SingleSelect) && this.f57590d == ((SingleSelect) obj).f57590d;
        }

        public int hashCode() {
            return C7397t.m28148a(this.f57590d);
        }

        public String toString() {
            long j = this.f57590d;
            return "SingleSelect(selectedItem=" + j + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeLong(this.f57590d);
        }
    }

    private FilterValue() {
    }

    public /* synthetic */ FilterValue(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
