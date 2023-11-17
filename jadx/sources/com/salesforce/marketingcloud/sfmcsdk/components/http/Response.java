package com.salesforce.marketingcloud.sfmcsdk.components.http;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Response implements Parcelable {
    public static final Parcelable.Creator<Response> CREATOR = new Creator();
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final String body;
    private final int code;
    private final long endTimeMillis;
    private final Map<String, List<String>> headers;
    private final String message;
    private final long startTimeMillis;

    public static final class Builder {
        private String body;
        private int code;
        private long endTimeMillis;
        private Map<String, ? extends List<String>> headers;
        private String message;
        private long startTimeMillis;

        public final Builder body(String str) {
            C41536l.m120489i(str, "body");
            this.body = str;
            return this;
        }

        public final Response build() {
            int i = this.code;
            String str = this.body;
            String str2 = this.message;
            long j = this.startTimeMillis;
            long j2 = this.endTimeMillis;
            Map<String, ? extends List<String>> map = this.headers;
            if (map == null) {
                map = C41344r0.m119928j();
            }
            return new Response(i, str, str2, j, j2, map);
        }

        public final Builder code(int i) {
            this.code = i;
            return this;
        }

        public final Builder endTimeMillis(long j) {
            this.endTimeMillis = j;
            return this;
        }

        public final Builder headers(Map<String, ? extends List<String>> map) {
            C41536l.m120489i(map, "headers");
            this.headers = map;
            return this;
        }

        public final Builder message(String str) {
            C41536l.m120489i(str, "message");
            this.message = str;
            return this;
        }

        public final Builder startTimeMillis(long j) {
            this.startTimeMillis = j;
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Response error$sfmcsdk_release(String str, int i) {
            C41536l.m120489i(str, "message");
            long currentTimeMillis = System.currentTimeMillis();
            return new Builder().code(i).message(str).startTimeMillis(currentTimeMillis).endTimeMillis(currentTimeMillis).build();
        }
    }

    public static final class Creator implements Parcelable.Creator<Response> {
        public final Response createFromParcel(Parcel parcel) {
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
            return new Response(readInt, readString, readString2, readLong, readLong2, linkedHashMap);
        }

        public final Response[] newArray(int i) {
            return new Response[i];
        }
    }

    public Response(int i, String str, String str2, long j, long j2, Map<String, ? extends List<String>> map) {
        C41536l.m120489i(map, "headers");
        this.code = i;
        this.body = str;
        this.message = str2;
        this.startTimeMillis = j;
        this.endTimeMillis = j2;
        this.headers = map;
    }

    public static final Response error$sfmcsdk_release(String str, int i) {
        return Companion.error$sfmcsdk_release(str, i);
    }

    public int describeContents() {
        return 0;
    }

    public final String getBody() {
        return this.body;
    }

    public final int getCode() {
        return this.code;
    }

    public final long getEndTimeMillis() {
        return this.endTimeMillis;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final String getMessage() {
        return this.message;
    }

    public final long getStartTimeMillis() {
        return this.startTimeMillis;
    }

    public final boolean isSuccessful() {
        int i = this.code;
        return 200 <= i && i <= 299;
    }

    public final long timeToExecute() {
        return this.endTimeMillis - this.startTimeMillis;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeInt(this.code);
        parcel.writeString(this.body);
        parcel.writeString(this.message);
        parcel.writeLong(this.startTimeMillis);
        parcel.writeLong(this.endTimeMillis);
        Map<String, List<String>> map = this.headers;
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeStringList((List) next.getValue());
        }
    }
}
