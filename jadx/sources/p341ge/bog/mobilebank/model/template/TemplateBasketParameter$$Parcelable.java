package p341ge.bog.mobilebank.model.template;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.template.TemplateBasketParameter$$Parcelable */
public class TemplateBasketParameter$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<TemplateBasketParameter$$Parcelable> CREATOR = new Parcelable.Creator<TemplateBasketParameter$$Parcelable>() {
        public TemplateBasketParameter$$Parcelable createFromParcel(Parcel parcel) {
            return new TemplateBasketParameter$$Parcelable(TemplateBasketParameter$$Parcelable.read(parcel, new C42027a()));
        }

        public TemplateBasketParameter$$Parcelable[] newArray(int i) {
            return new TemplateBasketParameter$$Parcelable[i];
        }
    };
    private TemplateBasketParameter templateBasketParameter$$0;

    public TemplateBasketParameter$$Parcelable(TemplateBasketParameter templateBasketParameter) {
        this.templateBasketParameter$$0 = templateBasketParameter;
    }

    public static TemplateBasketParameter read(Parcel parcel, C42027a aVar) {
        Long l;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            TemplateBasketParameter templateBasketParameter = new TemplateBasketParameter();
            aVar.mo97501f(g, templateBasketParameter);
            templateBasketParameter.parameterType = parcel.readString();
            templateBasketParameter.verifyParameterData = parcel.readString();
            templateBasketParameter.parameterKey = parcel.readString();
            if (parcel.readInt() < 0) {
                l = null;
            } else {
                l = Long.valueOf(parcel.readLong());
            }
            templateBasketParameter.f81378id = l;
            templateBasketParameter.parameterValue = parcel.readString();
            templateBasketParameter.parameterIndex = parcel.readInt();
            aVar.mo97501f(readInt, templateBasketParameter);
            return templateBasketParameter;
        } else if (!aVar.mo97499d(readInt)) {
            return (TemplateBasketParameter) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(TemplateBasketParameter templateBasketParameter, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(templateBasketParameter);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(templateBasketParameter));
        parcel.writeString(templateBasketParameter.parameterType);
        parcel.writeString(templateBasketParameter.verifyParameterData);
        parcel.writeString(templateBasketParameter.parameterKey);
        if (templateBasketParameter.f81378id == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(templateBasketParameter.f81378id.longValue());
        }
        parcel.writeString(templateBasketParameter.parameterValue);
        parcel.writeInt(templateBasketParameter.parameterIndex);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.templateBasketParameter$$0, parcel, i, new C42027a());
    }

    public TemplateBasketParameter getParcel() {
        return this.templateBasketParameter$$0;
    }
}
