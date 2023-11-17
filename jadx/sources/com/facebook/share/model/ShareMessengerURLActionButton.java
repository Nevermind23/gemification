package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public final class ShareMessengerURLActionButton extends ShareMessengerActionButton {
    public static final Parcelable.Creator<ShareMessengerURLActionButton> CREATOR = new C2722a();

    /* renamed from: e */
    private final Uri f8525e;

    /* renamed from: f */
    private final Uri f8526f;

    /* renamed from: g */
    private final boolean f8527g;

    /* renamed from: h */
    private final boolean f8528h;

    /* renamed from: i */
    private final C2723b f8529i;

    /* renamed from: com.facebook.share.model.ShareMessengerURLActionButton$a */
    static class C2722a implements Parcelable.Creator {
        C2722a() {
        }

        /* renamed from: a */
        public ShareMessengerURLActionButton createFromParcel(Parcel parcel) {
            return new ShareMessengerURLActionButton(parcel);
        }

        /* renamed from: b */
        public ShareMessengerURLActionButton[] newArray(int i) {
            return new ShareMessengerURLActionButton[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareMessengerURLActionButton$b */
    public enum C2723b {
        WebviewHeightRatioFull,
        WebviewHeightRatioTall,
        WebviewHeightRatioCompact
    }

    ShareMessengerURLActionButton(Parcel parcel) {
        super(parcel);
        boolean z;
        Class<Uri> cls = Uri.class;
        this.f8525e = (Uri) parcel.readParcelable(cls.getClassLoader());
        boolean z2 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f8527g = z;
        this.f8526f = (Uri) parcel.readParcelable(cls.getClassLoader());
        this.f8529i = (C2723b) parcel.readSerializable();
        this.f8528h = parcel.readByte() == 0 ? false : z2;
    }
}
