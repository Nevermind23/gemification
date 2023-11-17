package p341ge.bog.mobilebank.payment.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.payment.model.ParameterType$$Parcelable */
public class ParameterType$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<ParameterType$$Parcelable> CREATOR = new C33621a();
    private ParameterType parameterType$$0;

    /* renamed from: ge.bog.mobilebank.payment.model.ParameterType$$Parcelable$a */
    class C33621a implements Parcelable.Creator {
        C33621a() {
        }

        /* renamed from: a */
        public ParameterType$$Parcelable createFromParcel(Parcel parcel) {
            return new ParameterType$$Parcelable(ParameterType$$Parcelable.read(parcel, new C42027a()));
        }

        /* renamed from: b */
        public ParameterType$$Parcelable[] newArray(int i) {
            return new ParameterType$$Parcelable[i];
        }
    }

    public ParameterType$$Parcelable(ParameterType parameterType) {
        this.parameterType$$0 = parameterType;
    }

    public static ParameterType read(Parcel parcel, C42027a aVar) {
        ParameterType parameterType;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            String readString = parcel.readString();
            if (readString == null) {
                parameterType = null;
            } else {
                parameterType = (ParameterType) Enum.valueOf(ParameterType.class, readString);
            }
            aVar.mo97501f(readInt, parameterType);
            return parameterType;
        } else if (!aVar.mo97499d(readInt)) {
            return (ParameterType) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(ParameterType parameterType, Parcel parcel, int i, C42027a aVar) {
        String str;
        int c = aVar.mo97498c(parameterType);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(parameterType));
        if (parameterType == null) {
            str = null;
        } else {
            str = parameterType.name();
        }
        parcel.writeString(str);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.parameterType$$0, parcel, i, new C42027a());
    }

    public ParameterType getParcel() {
        return this.parameterType$$0;
    }
}
