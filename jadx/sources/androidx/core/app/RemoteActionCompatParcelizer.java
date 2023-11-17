package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f3242a = (IconCompat) versionedParcel.mo6460v(remoteActionCompat.f3242a, 1);
        remoteActionCompat.f3243b = versionedParcel.mo6450l(remoteActionCompat.f3243b, 2);
        remoteActionCompat.f3244c = versionedParcel.mo6450l(remoteActionCompat.f3244c, 3);
        remoteActionCompat.f3245d = (PendingIntent) versionedParcel.mo6456r(remoteActionCompat.f3245d, 4);
        remoteActionCompat.f3246e = versionedParcel.mo6446h(remoteActionCompat.f3246e, 5);
        remoteActionCompat.f3247f = versionedParcel.mo6446h(remoteActionCompat.f3247f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.mo6462x(false, false);
        versionedParcel.mo6441M(remoteActionCompat.f3242a, 1);
        versionedParcel.mo6432D(remoteActionCompat.f3243b, 2);
        versionedParcel.mo6432D(remoteActionCompat.f3244c, 3);
        versionedParcel.mo6436H(remoteActionCompat.f3245d, 4);
        versionedParcel.mo6464z(remoteActionCompat.f3246e, 5);
        versionedParcel.mo6464z(remoteActionCompat.f3247f, 6);
    }
}
