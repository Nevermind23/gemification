package p341ge.bog.mobilebank.model.notification;

import android.os.Parcel;
import android.os.Parcelable;
import hd0.C24978b;
import org.parceler.C42027a;
import org.parceler.C42028b;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.notification.PushNotification$$Parcelable */
public class PushNotification$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<PushNotification$$Parcelable> CREATOR = new Parcelable.Creator<PushNotification$$Parcelable>() {
        public PushNotification$$Parcelable createFromParcel(Parcel parcel) {
            return new PushNotification$$Parcelable(PushNotification$$Parcelable.read(parcel, new C42027a()));
        }

        public PushNotification$$Parcelable[] newArray(int i) {
            return new PushNotification$$Parcelable[i];
        }
    };
    private PushNotification pushNotification$$0;

    public PushNotification$$Parcelable(PushNotification pushNotification) {
        this.pushNotification$$0 = pushNotification;
    }

    public static PushNotification read(Parcel parcel, C42027a aVar) {
        Long l;
        Enum enumR;
        Long l2;
        Enum enumR2;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            PushNotification pushNotification = new PushNotification();
            aVar.mo97501f(g, pushNotification);
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            pushNotification.isStillValid = z;
            Class<PushNotification> cls = PushNotification.class;
            C42028b.m122113b(cls, pushNotification, "androidCustomData", parcel.readString());
            Long l3 = null;
            if (parcel.readInt() < 0) {
                l = null;
            } else {
                l = Long.valueOf(parcel.readLong());
            }
            C42028b.m122113b(cls, pushNotification, "productId", l);
            C42028b.m122113b(cls, pushNotification, "channel", parcel.readString());
            String readString = parcel.readString();
            Class cls2 = C24978b.class;
            if (readString == null) {
                enumR = null;
            } else {
                enumR = Enum.valueOf(cls2, readString);
            }
            C42028b.m122113b(cls, pushNotification, "isRead", enumR);
            C42028b.m122113b(cls, pushNotification, "messageTitle", parcel.readString());
            C42028b.m122113b(cls, pushNotification, "recipientReference", parcel.readString());
            C42028b.m122113b(cls, pushNotification, "message", parcel.readString());
            if (parcel.readInt() < 0) {
                l2 = null;
            } else {
                l2 = Long.valueOf(parcel.readLong());
            }
            C42028b.m122113b(cls, pushNotification, "headerId", l2);
            C42028b.m122113b(cls, pushNotification, "messageType", parcel.readString());
            C42028b.m122113b(cls, pushNotification, "recipientId", parcel.readString());
            String readString2 = parcel.readString();
            if (readString2 == null) {
                enumR2 = null;
            } else {
                enumR2 = Enum.valueOf(cls2, readString2);
            }
            C42028b.m122113b(cls, pushNotification, "isMessageRead", enumR2);
            C42028b.m122113b(cls, pushNotification, "id", parcel.readString());
            C42028b.m122113b(cls, pushNotification, "additionalData", parcel.readString());
            if (parcel.readInt() >= 0) {
                l3 = Long.valueOf(parcel.readLong());
            }
            C42028b.m122113b(cls, pushNotification, "createDate", l3);
            aVar.mo97501f(readInt, pushNotification);
            return pushNotification;
        } else if (!aVar.mo97499d(readInt)) {
            return (PushNotification) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(PushNotification pushNotification, Parcel parcel, int i, C42027a aVar) {
        String str;
        int c = aVar.mo97498c(pushNotification);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(pushNotification));
        parcel.writeInt(pushNotification.isStillValid ? 1 : 0);
        Class<String> cls = String.class;
        Class<PushNotification> cls2 = PushNotification.class;
        parcel.writeString((String) C42028b.m122112a(cls, cls2, pushNotification, "androidCustomData"));
        Class<Long> cls3 = Long.class;
        if (C42028b.m122112a(cls3, cls2, pushNotification, "productId") == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(((Long) C42028b.m122112a(cls3, cls2, pushNotification, "productId")).longValue());
        }
        parcel.writeString((String) C42028b.m122112a(cls, cls2, pushNotification, "channel"));
        Class<C24978b> cls4 = C24978b.class;
        C24978b bVar = (C24978b) C42028b.m122112a(cls4, cls2, pushNotification, "isRead");
        String str2 = null;
        if (bVar == null) {
            str = null;
        } else {
            str = bVar.name();
        }
        parcel.writeString(str);
        parcel.writeString((String) C42028b.m122112a(cls, cls2, pushNotification, "messageTitle"));
        parcel.writeString((String) C42028b.m122112a(cls, cls2, pushNotification, "recipientReference"));
        parcel.writeString((String) C42028b.m122112a(cls, cls2, pushNotification, "message"));
        if (C42028b.m122112a(cls3, cls2, pushNotification, "headerId") == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(((Long) C42028b.m122112a(cls3, cls2, pushNotification, "headerId")).longValue());
        }
        parcel.writeString((String) C42028b.m122112a(cls, cls2, pushNotification, "messageType"));
        parcel.writeString((String) C42028b.m122112a(cls, cls2, pushNotification, "recipientId"));
        C24978b bVar2 = (C24978b) C42028b.m122112a(cls4, cls2, pushNotification, "isMessageRead");
        if (bVar2 != null) {
            str2 = bVar2.name();
        }
        parcel.writeString(str2);
        parcel.writeString((String) C42028b.m122112a(cls, cls2, pushNotification, "id"));
        parcel.writeString((String) C42028b.m122112a(cls, cls2, pushNotification, "additionalData"));
        if (C42028b.m122112a(cls3, cls2, pushNotification, "createDate") == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(1);
        parcel.writeLong(((Long) C42028b.m122112a(cls3, cls2, pushNotification, "createDate")).longValue());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.pushNotification$$0, parcel, i, new C42027a());
    }

    public PushNotification getParcel() {
        return this.pushNotification$$0;
    }
}
