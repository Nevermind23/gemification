package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p105h7.C6458i;
import p182n6.C7264i;
import p195o6.C7461a;

public class TokenBinding extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TokenBinding> CREATOR = new C4040i();

    /* renamed from: f */
    public static final TokenBinding f12974f = new TokenBinding(TokenBindingStatus.SUPPORTED.toString(), (String) null);

    /* renamed from: g */
    public static final TokenBinding f12975g = new TokenBinding(TokenBindingStatus.NOT_SUPPORTED.toString(), (String) null);

    /* renamed from: d */
    private final TokenBindingStatus f12976d;

    /* renamed from: e */
    private final String f12977e;

    public enum TokenBindingStatus implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");
        
        public static final Parcelable.Creator<TokenBindingStatus> CREATOR = null;

        /* renamed from: d */
        private final String f12982d;

        static {
            CREATOR = new C4039h();
        }

        private TokenBindingStatus(String str) {
            this.f12982d = str;
        }

        /* renamed from: a */
        public static TokenBindingStatus m15374a(String str) {
            for (TokenBindingStatus tokenBindingStatus : values()) {
                if (str.equals(tokenBindingStatus.f12982d)) {
                    return tokenBindingStatus;
                }
            }
            throw new UnsupportedTokenBindingStatusException(str);
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return this.f12982d;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f12982d);
        }
    }

    public static class UnsupportedTokenBindingStatusException extends Exception {
        public UnsupportedTokenBindingStatusException(String str) {
            super(String.format("TokenBindingStatus %s not supported", new Object[]{str}));
        }
    }

    TokenBinding(String str, String str2) {
        C7264i.m27902k(str);
        try {
            this.f12976d = TokenBindingStatus.m15374a(str);
            this.f12977e = str2;
        } catch (UnsupportedTokenBindingStatusException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenBinding)) {
            return false;
        }
        TokenBinding tokenBinding = (TokenBinding) obj;
        if (!C6458i.m25553a(this.f12976d, tokenBinding.f12976d) || !C6458i.m25553a(this.f12977e, tokenBinding.f12977e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12976d, this.f12977e});
    }

    /* renamed from: v */
    public String mo12567v() {
        return this.f12977e;
    }

    /* renamed from: w */
    public String mo12568w() {
        return this.f12976d.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 2, mo12568w(), false);
        C7461a.m28392x(parcel, 3, mo12567v(), false);
        C7461a.m28370b(parcel, a);
    }
}
