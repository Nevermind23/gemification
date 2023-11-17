package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import p182n6.C7258g;
import p195o6.C7461a;

public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new C4050s();

    /* renamed from: d */
    private final Attachment f12892d;

    /* renamed from: e */
    private final Boolean f12893e;

    /* renamed from: f */
    private final zzay f12894f;

    /* renamed from: g */
    private final ResidentKeyRequirement f12895g;

    AuthenticatorSelectionCriteria(String str, Boolean bool, String str2, String str3) {
        Attachment attachment;
        zzay zzay;
        ResidentKeyRequirement residentKeyRequirement = null;
        if (str == null) {
            attachment = null;
        } else {
            try {
                attachment = Attachment.m15292a(str);
            } catch (Attachment.UnsupportedAttachmentException | ResidentKeyRequirement.UnsupportedResidentKeyRequirementException | zzax e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.f12892d = attachment;
        this.f12893e = bool;
        if (str2 == null) {
            zzay = null;
        } else {
            zzay = zzay.m15381a(str2);
        }
        this.f12894f = zzay;
        if (str3 != null) {
            residentKeyRequirement = ResidentKeyRequirement.m15371a(str3);
        }
        this.f12895g = residentKeyRequirement;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        if (!C7258g.m27880a(this.f12892d, authenticatorSelectionCriteria.f12892d) || !C7258g.m27880a(this.f12893e, authenticatorSelectionCriteria.f12893e) || !C7258g.m27880a(this.f12894f, authenticatorSelectionCriteria.f12894f) || !C7258g.m27880a(this.f12895g, authenticatorSelectionCriteria.f12895g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f12892d, this.f12893e, this.f12894f, this.f12895g);
    }

    /* renamed from: v */
    public String mo12462v() {
        Attachment attachment = this.f12892d;
        if (attachment == null) {
            return null;
        }
        return attachment.toString();
    }

    /* renamed from: w */
    public Boolean mo12463w() {
        return this.f12893e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str;
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 2, mo12462v(), false);
        C7461a.m28373e(parcel, 3, mo12463w(), false);
        zzay zzay = this.f12894f;
        if (zzay == null) {
            str = null;
        } else {
            str = zzay.toString();
        }
        C7461a.m28392x(parcel, 4, str, false);
        C7461a.m28392x(parcel, 5, mo12465x(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public String mo12465x() {
        ResidentKeyRequirement residentKeyRequirement = this.f12895g;
        if (residentKeyRequirement == null) {
            return null;
        }
        return residentKeyRequirement.toString();
    }
}
