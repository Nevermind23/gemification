package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class ShareContent<P extends ShareContent, E> implements ShareModel {

    /* renamed from: d */
    private final Uri f8489d;

    /* renamed from: e */
    private final List f8490e;

    /* renamed from: f */
    private final String f8491f;

    /* renamed from: g */
    private final String f8492g;

    /* renamed from: h */
    private final String f8493h;

    /* renamed from: i */
    private final ShareHashtag f8494i;

    protected ShareContent(Parcel parcel) {
        this.f8489d = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f8490e = m10514d(parcel);
        this.f8491f = parcel.readString();
        this.f8492g = parcel.readString();
        this.f8493h = parcel.readString();
        this.f8494i = new ShareHashtag.C2712b().mo8547c(parcel).mo8546b();
    }

    /* renamed from: d */
    private List m10514d(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.size() == 0) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public Uri mo8537a() {
        return this.f8489d;
    }

    /* renamed from: b */
    public ShareHashtag mo8538b() {
        return this.f8494i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f8489d, 0);
        parcel.writeStringList(this.f8490e);
        parcel.writeString(this.f8491f);
        parcel.writeString(this.f8492g);
        parcel.writeString(this.f8493h);
        parcel.writeParcelable(this.f8494i, 0);
    }
}
