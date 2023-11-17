package p341ge.bog.mobilebank.shared.helper;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.shared.helper.StringSource */
public abstract class StringSource implements Parcelable {

    /* renamed from: d */
    private final Object[] f83741d;

    /* renamed from: ge.bog.mobilebank.shared.helper.StringSource$Raw */
    public static final class Raw extends StringSource {
        public static final Parcelable.Creator<Raw> CREATOR = new C34643a();

        /* renamed from: e */
        private final String f83745e;

        /* renamed from: ge.bog.mobilebank.shared.helper.StringSource$Raw$a */
        public static final class C34643a implements Parcelable.Creator {
            /* renamed from: a */
            public final Raw createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new Raw(parcel.readString());
            }

            /* renamed from: b */
            public final Raw[] newArray(int i) {
                return new Raw[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Raw(String str) {
            super((Object[]) null, 1, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            this.f83745e = str;
        }

        /* renamed from: b */
        public final String mo84410b() {
            return this.f83745e;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Raw) && C41536l.m120484d(this.f83745e, ((Raw) obj).f83745e);
        }

        public int hashCode() {
            return this.f83745e.hashCode();
        }

        public String toString() {
            String str = this.f83745e;
            return "Raw(value=" + str + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f83745e);
        }
    }

    public /* synthetic */ StringSource(Object[] objArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(objArr);
    }

    /* renamed from: a */
    public final Object[] mo84398a() {
        return this.f83741d;
    }

    /* renamed from: ge.bog.mobilebank.shared.helper.StringSource$Resource */
    public static final class Resource extends StringSource {
        public static final Parcelable.Creator<Resource> CREATOR = new C34644a();

        /* renamed from: e */
        private final int f83746e;

        /* renamed from: f */
        private final List f83747f;

        /* renamed from: ge.bog.mobilebank.shared.helper.StringSource$Resource$a */
        public static final class C34644a implements Parcelable.Creator {
            /* renamed from: a */
            public final Resource createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new Resource(parcel.readInt(), (List) null, 2, (DefaultConstructorMarker) null);
            }

            /* renamed from: b */
            public final Resource[] newArray(int i) {
                return new Resource[i];
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Resource(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? C41341q.m119907j() : list);
        }

        /* renamed from: b */
        public final int mo84420b() {
            return this.f83746e;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Resource)) {
                return false;
            }
            Resource resource = (Resource) obj;
            return this.f83746e == resource.f83746e && C41536l.m120484d(this.f83747f, resource.f83747f);
        }

        public int hashCode() {
            return (this.f83746e * 31) + this.f83747f.hashCode();
        }

        public String toString() {
            int i = this.f83746e;
            List list = this.f83747f;
            return "Resource(resId=" + i + ", variables=" + list + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(this.f83746e);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Resource(int i, List list) {
            super(list.toArray(new Object[0]), (DefaultConstructorMarker) null);
            C41536l.m120489i(list, "variables");
            this.f83746e = i;
            this.f83747f = list;
        }
    }

    private StringSource(Object[] objArr) {
        this.f83741d = objArr;
    }

    /* renamed from: ge.bog.mobilebank.shared.helper.StringSource$Dictionary */
    public static final class Dictionary extends StringSource {
        public static final Parcelable.Creator<Dictionary> CREATOR = new C34642a();

        /* renamed from: e */
        private final String f83742e;

        /* renamed from: f */
        private final Boolean f83743f;

        /* renamed from: g */
        private final List f83744g;

        /* renamed from: ge.bog.mobilebank.shared.helper.StringSource$Dictionary$a */
        public static final class C34642a implements Parcelable.Creator {
            /* renamed from: a */
            public final Dictionary createFromParcel(Parcel parcel) {
                Boolean valueOf;
                C41536l.m120489i(parcel, "parcel");
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Dictionary(readString, valueOf, (List) null, 4, (DefaultConstructorMarker) null);
            }

            /* renamed from: b */
            public final Dictionary[] newArray(int i) {
                return new Dictionary[i];
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Dictionary(String str, Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? Boolean.FALSE : bool, (i & 4) != 0 ? C41341q.m119907j() : list);
        }

        /* renamed from: b */
        public final String mo84399b() {
            return this.f83742e;
        }

        /* renamed from: d */
        public final Boolean mo84400d() {
            return this.f83743f;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dictionary)) {
                return false;
            }
            Dictionary dictionary = (Dictionary) obj;
            return C41536l.m120484d(this.f83742e, dictionary.f83742e) && C41536l.m120484d(this.f83743f, dictionary.f83743f) && C41536l.m120484d(this.f83744g, dictionary.f83744g);
        }

        public int hashCode() {
            int hashCode = this.f83742e.hashCode() * 31;
            Boolean bool = this.f83743f;
            return ((hashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.f83744g.hashCode();
        }

        public String toString() {
            String str = this.f83742e;
            Boolean bool = this.f83743f;
            List list = this.f83744g;
            return "Dictionary(key=" + str + ", isProvider=" + bool + ", variables=" + list + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            boolean booleanValue;
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f83742e);
            Boolean bool = this.f83743f;
            if (bool == null) {
                booleanValue = false;
            } else {
                parcel.writeInt(1);
                booleanValue = bool.booleanValue();
            }
            parcel.writeInt(booleanValue ? 1 : 0);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Dictionary(String str, Boolean bool, List list) {
            super(list.toArray(new Object[0]), (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "key");
            C41536l.m120489i(list, "variables");
            this.f83742e = str;
            this.f83743f = bool;
            this.f83744g = list;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StringSource(Object[] objArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Object[0] : objArr, (DefaultConstructorMarker) null);
    }
}
