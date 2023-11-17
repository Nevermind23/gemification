package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CsDefaultDepartments */
public final class CsDefaultDepartments implements Parcelable {
    public static final Parcelable.Creator<CsDefaultDepartments> CREATOR = new C14208a();

    /* renamed from: d */
    private final Map f41669d;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CsDefaultDepartments$a */
    public static final class C14208a implements Parcelable.Creator {
        /* renamed from: a */
        public final CsDefaultDepartments createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(Long.valueOf(parcel.readLong()), parcel.readString());
            }
            return new CsDefaultDepartments(linkedHashMap);
        }

        /* renamed from: b */
        public final CsDefaultDepartments[] newArray(int i) {
            return new CsDefaultDepartments[i];
        }
    }

    public CsDefaultDepartments(Map map) {
        C41536l.m120489i(map, "map");
        this.f41669d = map;
    }

    /* renamed from: a */
    public final Map mo39474a() {
        return this.f41669d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CsDefaultDepartments) && C41536l.m120484d(this.f41669d, ((CsDefaultDepartments) obj).f41669d);
    }

    public int hashCode() {
        return this.f41669d.hashCode();
    }

    public String toString() {
        Map map = this.f41669d;
        return "CsDefaultDepartments(map=" + map + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        Map map = this.f41669d;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeLong(((Number) entry.getKey()).longValue());
            parcel.writeString((String) entry.getValue());
        }
    }
}
