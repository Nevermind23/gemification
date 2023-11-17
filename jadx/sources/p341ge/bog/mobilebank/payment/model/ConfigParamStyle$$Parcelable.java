package p341ge.bog.mobilebank.payment.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.payment.model.ConfigParamStyle$$Parcelable */
public class ConfigParamStyle$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<ConfigParamStyle$$Parcelable> CREATOR = new C33620a();
    private ConfigParamStyle configParamStyle$$0;

    /* renamed from: ge.bog.mobilebank.payment.model.ConfigParamStyle$$Parcelable$a */
    class C33620a implements Parcelable.Creator {
        C33620a() {
        }

        /* renamed from: a */
        public ConfigParamStyle$$Parcelable createFromParcel(Parcel parcel) {
            return new ConfigParamStyle$$Parcelable(ConfigParamStyle$$Parcelable.read(parcel, new C42027a()));
        }

        /* renamed from: b */
        public ConfigParamStyle$$Parcelable[] newArray(int i) {
            return new ConfigParamStyle$$Parcelable[i];
        }
    }

    public ConfigParamStyle$$Parcelable(ConfigParamStyle configParamStyle) {
        this.configParamStyle$$0 = configParamStyle;
    }

    public static ConfigParamStyle read(Parcel parcel, C42027a aVar) {
        ParameterType parameterType;
        boolean z;
        boolean z2;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            ConfigParamStyle configParamStyle = new ConfigParamStyle();
            aVar.mo97501f(g, configParamStyle);
            String readString = parcel.readString();
            if (readString == null) {
                parameterType = null;
            } else {
                parameterType = (ParameterType) Enum.valueOf(ParameterType.class, readString);
            }
            configParamStyle.parameterType = parameterType;
            boolean z3 = false;
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            configParamStyle.editable = z;
            configParamStyle.weight = parcel.readFloat();
            configParamStyle.inputType = parcel.readInt();
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            configParamStyle.needsDebtFormatting = z2;
            configParamStyle.maxSelectableItems = parcel.readInt();
            if (parcel.readInt() == 1) {
                z3 = true;
            }
            configParamStyle.packages = z3;
            configParamStyle.mask = parcel.readString();
            aVar.mo97501f(readInt, configParamStyle);
            return configParamStyle;
        } else if (!aVar.mo97499d(readInt)) {
            return (ConfigParamStyle) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(ConfigParamStyle configParamStyle, Parcel parcel, int i, C42027a aVar) {
        String str;
        int c = aVar.mo97498c(configParamStyle);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(configParamStyle));
        ParameterType parameterType = configParamStyle.parameterType;
        if (parameterType == null) {
            str = null;
        } else {
            str = parameterType.name();
        }
        parcel.writeString(str);
        parcel.writeInt(configParamStyle.editable ? 1 : 0);
        parcel.writeFloat(configParamStyle.weight);
        parcel.writeInt(configParamStyle.inputType);
        parcel.writeInt(configParamStyle.needsDebtFormatting ? 1 : 0);
        parcel.writeInt(configParamStyle.maxSelectableItems);
        parcel.writeInt(configParamStyle.packages ? 1 : 0);
        parcel.writeString(configParamStyle.mask);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.configParamStyle$$0, parcel, i, new C42027a());
    }

    public ConfigParamStyle getParcel() {
        return this.configParamStyle$$0;
    }
}
