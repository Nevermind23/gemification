package p341ge.bog.sso_client.onboarding.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.sso_client.onboarding.model.DocumentResp */
public final class DocumentResp implements Parcelable {
    public static final Parcelable.Creator<DocumentResp> CREATOR = new C35984a();

    /* renamed from: d */
    private final List f87055d;

    /* renamed from: ge.bog.sso_client.onboarding.model.DocumentResp$a */
    public static final class C35984a implements Parcelable.Creator {
        /* renamed from: a */
        public final DocumentResp createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(DocumentType.CREATOR.createFromParcel(parcel));
            }
            return new DocumentResp(arrayList);
        }

        /* renamed from: b */
        public final DocumentResp[] newArray(int i) {
            return new DocumentResp[i];
        }
    }

    public DocumentResp(List list) {
        C41536l.m120489i(list, "documentTypes");
        this.f87055d = list;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DocumentResp) && C41536l.m120484d(this.f87055d, ((DocumentResp) obj).f87055d);
    }

    public int hashCode() {
        return this.f87055d.hashCode();
    }

    public String toString() {
        return "DocumentResp(documentTypes=" + this.f87055d + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        List<DocumentType> list = this.f87055d;
        parcel.writeInt(list.size());
        for (DocumentType writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }
}
