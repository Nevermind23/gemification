package p341ge.bog.mobilebank.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.KeyValue$$Parcelable */
public class KeyValue$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<KeyValue$$Parcelable> CREATOR = new Parcelable.Creator<KeyValue$$Parcelable>() {
        public KeyValue$$Parcelable createFromParcel(Parcel parcel) {
            return new KeyValue$$Parcelable(KeyValue$$Parcelable.read(parcel, new C42027a()));
        }

        public KeyValue$$Parcelable[] newArray(int i) {
            return new KeyValue$$Parcelable[i];
        }
    };
    private KeyValue keyValue$$0;

    public KeyValue$$Parcelable(KeyValue keyValue) {
        this.keyValue$$0 = keyValue;
    }

    public static KeyValue read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            KeyValue keyValue = new KeyValue();
            aVar.mo97501f(g, keyValue);
            keyValue.value = parcel.readString();
            keyValue.key = parcel.readString();
            aVar.mo97501f(readInt, keyValue);
            return keyValue;
        } else if (!aVar.mo97499d(readInt)) {
            return (KeyValue) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(KeyValue keyValue, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(keyValue);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(keyValue));
        parcel.writeString(keyValue.value);
        parcel.writeString(keyValue.key);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.keyValue$$0, parcel, i, new C42027a());
    }

    public KeyValue getParcel() {
        return this.keyValue$$0;
    }
}
