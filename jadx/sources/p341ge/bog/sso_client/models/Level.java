package p341ge.bog.sso_client.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.sso_client.models.Level */
public final class Level implements Parcelable {
    public static final Parcelable.Creator<Level> CREATOR = new C35926a();

    /* renamed from: d */
    private final String f86893d;

    /* renamed from: e */
    private final String f86894e;

    /* renamed from: f */
    private final Integer f86895f;

    /* renamed from: g */
    private final List f86896g;

    /* renamed from: ge.bog.sso_client.models.Level$a */
    public static final class C35926a implements Parcelable.Creator {
        /* renamed from: a */
        public final Level createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(parcel.createStringArrayList());
                }
                arrayList = arrayList2;
            }
            return new Level(readString, readString2, valueOf, arrayList);
        }

        /* renamed from: b */
        public final Level[] newArray(int i) {
            return new Level[i];
        }
    }

    public Level(String str, String str2, Integer num, List list) {
        this.f86893d = str;
        this.f86894e = str2;
        this.f86895f = num;
        this.f86896g = list;
    }

    /* renamed from: a */
    public final String mo88263a() {
        return this.f86894e;
    }

    /* renamed from: b */
    public final List mo88264b() {
        return this.f86896g;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Level)) {
            return false;
        }
        Level level = (Level) obj;
        return C41536l.m120484d(this.f86893d, level.f86893d) && C41536l.m120484d(this.f86894e, level.f86894e) && C41536l.m120484d(this.f86895f, level.f86895f) && C41536l.m120484d(this.f86896g, level.f86896g);
    }

    public int hashCode() {
        String str = this.f86893d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f86894e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f86895f;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.f86896g;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "Level(description=" + this.f86893d + ", levelKey=" + this.f86894e + ", priority=" + this.f86895f + ", supportedRules=" + this.f86896g + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f86893d);
        parcel.writeString(this.f86894e);
        Integer num = this.f86895f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<List> list = this.f86896g;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        for (List writeStringList : list) {
            parcel.writeStringList(writeStringList);
        }
    }
}
