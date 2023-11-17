package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7264i;
import p195o6.C7461a;

@Deprecated
public class ChannelIdValue extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ChannelIdValue> CREATOR = new C4058b();

    /* renamed from: g */
    public static final ChannelIdValue f13008g = new ChannelIdValue();

    /* renamed from: h */
    public static final ChannelIdValue f13009h = new ChannelIdValue("unavailable");

    /* renamed from: i */
    public static final ChannelIdValue f13010i = new ChannelIdValue("unused");

    /* renamed from: d */
    private final ChannelIdValueType f13011d;

    /* renamed from: e */
    private final String f13012e;

    /* renamed from: f */
    private final String f13013f;

    public enum ChannelIdValueType implements Parcelable {
        ABSENT(0),
        STRING(1),
        OBJECT(2);
        
        public static final Parcelable.Creator<ChannelIdValueType> CREATOR = null;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final int f13018d;

        static {
            CREATOR = new C4057a();
        }

        private ChannelIdValueType(int i) {
            this.f13018d = i;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f13018d);
        }
    }

    public static class UnsupportedChannelIdValueTypeException extends Exception {
        public UnsupportedChannelIdValueTypeException(int i) {
            super(String.format("ChannelIdValueType %s not supported", new Object[]{Integer.valueOf(i)}));
        }
    }

    private ChannelIdValue() {
        this.f13011d = ChannelIdValueType.ABSENT;
        this.f13013f = null;
        this.f13012e = null;
    }

    /* renamed from: R */
    public static ChannelIdValueType m15382R(int i) {
        for (ChannelIdValueType channelIdValueType : ChannelIdValueType.values()) {
            if (i == channelIdValueType.f13018d) {
                return channelIdValueType;
            }
        }
        throw new UnsupportedChannelIdValueTypeException(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelIdValue)) {
            return false;
        }
        ChannelIdValue channelIdValue = (ChannelIdValue) obj;
        if (!this.f13011d.equals(channelIdValue.f13011d)) {
            return false;
        }
        int ordinal = this.f13011d.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            return this.f13012e.equals(channelIdValue.f13012e);
        }
        if (ordinal != 2) {
            return false;
        }
        return this.f13013f.equals(channelIdValue.f13013f);
    }

    public int hashCode() {
        int i;
        int hashCode;
        int hashCode2 = this.f13011d.hashCode() + 31;
        int ordinal = this.f13011d.ordinal();
        if (ordinal == 1) {
            i = hashCode2 * 31;
            hashCode = this.f13012e.hashCode();
        } else if (ordinal != 2) {
            return hashCode2;
        } else {
            i = hashCode2 * 31;
            hashCode = this.f13013f.hashCode();
        }
        return i + hashCode;
    }

    /* renamed from: v */
    public String mo12671v() {
        return this.f13013f;
    }

    /* renamed from: w */
    public String mo12672w() {
        return this.f13012e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 2, mo12674x());
        C7461a.m28392x(parcel, 3, mo12672w(), false);
        C7461a.m28392x(parcel, 4, mo12671v(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public int mo12674x() {
        return this.f13011d.f13018d;
    }

    ChannelIdValue(int i, String str, String str2) {
        try {
            this.f13011d = m15382R(i);
            this.f13012e = str;
            this.f13013f = str2;
        } catch (UnsupportedChannelIdValueTypeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private ChannelIdValue(String str) {
        this.f13012e = (String) C7264i.m27902k(str);
        this.f13011d = ChannelIdValueType.STRING;
        this.f13013f = null;
    }
}
