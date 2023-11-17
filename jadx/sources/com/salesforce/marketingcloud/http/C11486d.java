package com.salesforce.marketingcloud.http;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.salesforce.marketingcloud.http.d */
public final class C11486d implements Parcelable {
    public static final Parcelable.Creator<C11486d> CREATOR = new C11489c();

    /* renamed from: g */
    public static final C11488b f33402g = new C11488b((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final int f33403a;

    /* renamed from: b */
    private final String f33404b;

    /* renamed from: c */
    private final String f33405c;

    /* renamed from: d */
    private final long f33406d;

    /* renamed from: e */
    private final long f33407e;

    /* renamed from: f */
    private final Map<String, List<String>> f33408f;

    /* renamed from: com.salesforce.marketingcloud.http.d$a */
    public static final class C11487a {

        /* renamed from: a */
        private int f33409a;

        /* renamed from: b */
        private String f33410b;

        /* renamed from: c */
        private String f33411c;

        /* renamed from: d */
        private long f33412d;

        /* renamed from: e */
        private long f33413e;

        /* renamed from: f */
        private Map<String, ? extends List<String>> f33414f;

        /* renamed from: a */
        public final C11487a mo30036a(int i) {
            this.f33409a = i;
            return this;
        }

        /* renamed from: b */
        public final C11487a mo30041b(long j) {
            this.f33412d = j;
            return this;
        }

        /* renamed from: a */
        public final C11487a mo30037a(long j) {
            this.f33413e = j;
            return this;
        }

        /* renamed from: b */
        public final C11487a mo30042b(String str) {
            C41536l.m120489i(str, "message");
            this.f33411c = str;
            return this;
        }

        /* renamed from: a */
        public final C11487a mo30038a(String str) {
            C41536l.m120489i(str, "body");
            this.f33410b = str;
            return this;
        }

        /* renamed from: a */
        public final C11487a mo30039a(Map<String, ? extends List<String>> map) {
            C41536l.m120489i(map, "headers");
            this.f33414f = map;
            return this;
        }

        /* renamed from: a */
        public final C11486d mo30040a() {
            int i = this.f33409a;
            String str = this.f33410b;
            String str2 = this.f33411c;
            long j = this.f33412d;
            long j2 = this.f33413e;
            Map<String, ? extends List<String>> map = this.f33414f;
            if (map == null) {
                map = C41344r0.m119928j();
            }
            return new C11486d(i, str, str2, j, j2, map);
        }
    }

    /* renamed from: com.salesforce.marketingcloud.http.d$b */
    public static final class C11488b {
        private C11488b() {
        }

        public /* synthetic */ C11488b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C11487a mo30043a() {
            return new C11487a();
        }

        /* renamed from: a */
        public final C11486d mo30044a(String str, int i) {
            C41536l.m120489i(str, "message");
            long currentTimeMillis = System.currentTimeMillis();
            return mo30043a().mo30036a(i).mo30042b(str).mo30041b(currentTimeMillis).mo30037a(currentTimeMillis).mo30040a();
        }
    }

    /* renamed from: com.salesforce.marketingcloud.http.d$c */
    public static final class C11489c implements Parcelable.Creator<C11486d> {
        /* renamed from: a */
        public final C11486d createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
            for (int i = 0; i != readInt2; i++) {
                linkedHashMap.put(parcel.readString(), parcel.createStringArrayList());
            }
            return new C11486d(readInt, readString, readString2, readLong, readLong2, linkedHashMap);
        }

        /* renamed from: a */
        public final C11486d[] newArray(int i) {
            return new C11486d[i];
        }
    }

    public C11486d(int i, String str, String str2, long j, long j2, Map<String, ? extends List<String>> map) {
        C41536l.m120489i(map, "headers");
        this.f33403a = i;
        this.f33404b = str;
        this.f33405c = str2;
        this.f33406d = j;
        this.f33407e = j2;
        this.f33408f = map;
    }

    /* renamed from: a */
    public static final C11486d m41978a(String str, int i) {
        return f33402g.mo30044a(str, i);
    }

    /* renamed from: b */
    public final int mo30027b() {
        return this.f33403a;
    }

    /* renamed from: c */
    public final long mo30028c() {
        return this.f33407e;
    }

    /* renamed from: d */
    public final Map<String, List<String>> mo30029d() {
        return this.f33408f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo30031e() {
        return this.f33405c;
    }

    /* renamed from: f */
    public final long mo30032f() {
        return this.f33406d;
    }

    /* renamed from: g */
    public final boolean mo30033g() {
        int i = this.f33403a;
        return 200 <= i && i <= 299;
    }

    /* renamed from: h */
    public final long mo30034h() {
        return this.f33407e - this.f33406d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeInt(this.f33403a);
        parcel.writeString(this.f33404b);
        parcel.writeString(this.f33405c);
        parcel.writeLong(this.f33406d);
        parcel.writeLong(this.f33407e);
        Map<String, List<String>> map = this.f33408f;
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeStringList((List) next.getValue());
        }
    }

    /* renamed from: a */
    public final String mo30026a() {
        return this.f33404b;
    }
}
