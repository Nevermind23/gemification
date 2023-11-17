package p341ge.bog.mobilebank.model.template;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.parceler.C42027a;
import org.parceler.C42028b;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;
import p341ge.bog.mobilebank.eventbus.events.TemplateDebtEvent$$Parcelable;

/* renamed from: ge.bog.mobilebank.model.template.TemplateBasketItem$$Parcelable */
public class TemplateBasketItem$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<TemplateBasketItem$$Parcelable> CREATOR = new Parcelable.Creator<TemplateBasketItem$$Parcelable>() {
        public TemplateBasketItem$$Parcelable createFromParcel(Parcel parcel) {
            return new TemplateBasketItem$$Parcelable(TemplateBasketItem$$Parcelable.read(parcel, new C42027a()));
        }

        public TemplateBasketItem$$Parcelable[] newArray(int i) {
            return new TemplateBasketItem$$Parcelable[i];
        }
    };
    private TemplateBasketItem templateBasketItem$$0;

    public TemplateBasketItem$$Parcelable(TemplateBasketItem templateBasketItem) {
        this.templateBasketItem$$0 = templateBasketItem;
    }

    public static TemplateBasketItem read(Parcel parcel, C42027a aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        ArrayList arrayList;
        Integer num;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            TemplateBasketItem templateBasketItem = new TemplateBasketItem();
            aVar.mo97501f(g, templateBasketItem);
            templateBasketItem.templateType = parcel.readString();
            boolean z6 = false;
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            templateBasketItem.isUserPaying = z;
            templateBasketItem.channel = parcel.readString();
            templateBasketItem.benefProfilePicture = parcel.readString();
            templateBasketItem.templateImage = parcel.readString();
            templateBasketItem.templateDebtEvent = TemplateDebtEvent$$Parcelable.read(parcel, aVar);
            templateBasketItem.templateId = parcel.readString();
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            templateBasketItem.isCTPark1Week = z2;
            if (parcel.readInt() == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            templateBasketItem.removeImage = z3;
            templateBasketItem.modificationDate = parcel.readString();
            if (parcel.readInt() == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            templateBasketItem.canGetDebt = z4;
            if (parcel.readInt() == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            templateBasketItem.isEditable = z5;
            templateBasketItem.templateName = parcel.readString();
            int readInt2 = parcel.readInt();
            Long l = null;
            if (readInt2 < 0) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(readInt2);
                for (int i = 0; i < readInt2; i++) {
                    arrayList.add(TemplateBasketParameter$$Parcelable.read(parcel, aVar));
                }
            }
            templateBasketItem.templateParameters = arrayList;
            if (parcel.readInt() < 0) {
                num = null;
            } else {
                num = Integer.valueOf(parcel.readInt());
            }
            C42028b.m122113b(TemplateBasketItem.class, templateBasketItem, "templateOrder", num);
            if (parcel.readInt() == 1) {
                z6 = true;
            }
            templateBasketItem.isCTParkItem = z6;
            templateBasketItem.customerId = parcel.readString();
            templateBasketItem.logo = parcel.readString();
            if (parcel.readInt() >= 0) {
                l = Long.valueOf(parcel.readLong());
            }
            templateBasketItem.f81377id = l;
            templateBasketItem.additionalData = parcel.readString();
            templateBasketItem.serviceId = parcel.readString();
            templateBasketItem.debtAmount = parcel.readInt();
            aVar.mo97501f(readInt, templateBasketItem);
            return templateBasketItem;
        } else if (!aVar.mo97499d(readInt)) {
            return (TemplateBasketItem) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(TemplateBasketItem templateBasketItem, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(templateBasketItem);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(templateBasketItem));
        parcel.writeString(templateBasketItem.templateType);
        parcel.writeInt(templateBasketItem.isUserPaying ? 1 : 0);
        parcel.writeString(templateBasketItem.channel);
        parcel.writeString(templateBasketItem.benefProfilePicture);
        parcel.writeString(templateBasketItem.templateImage);
        TemplateDebtEvent$$Parcelable.write(templateBasketItem.templateDebtEvent, parcel, i, aVar);
        parcel.writeString(templateBasketItem.templateId);
        parcel.writeInt(templateBasketItem.isCTPark1Week ? 1 : 0);
        parcel.writeInt(templateBasketItem.removeImage ? 1 : 0);
        parcel.writeString(templateBasketItem.modificationDate);
        parcel.writeInt(templateBasketItem.canGetDebt ? 1 : 0);
        parcel.writeInt(templateBasketItem.isEditable ? 1 : 0);
        parcel.writeString(templateBasketItem.templateName);
        List<TemplateBasketParameter> list = templateBasketItem.templateParameters;
        if (list == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(list.size());
            for (TemplateBasketParameter write : templateBasketItem.templateParameters) {
                TemplateBasketParameter$$Parcelable.write(write, parcel, i, aVar);
            }
        }
        Class<Integer> cls = Integer.class;
        Class<TemplateBasketItem> cls2 = TemplateBasketItem.class;
        if (C42028b.m122112a(cls, cls2, templateBasketItem, "templateOrder") == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(((Integer) C42028b.m122112a(cls, cls2, templateBasketItem, "templateOrder")).intValue());
        }
        parcel.writeInt(templateBasketItem.isCTParkItem ? 1 : 0);
        parcel.writeString(templateBasketItem.customerId);
        parcel.writeString(templateBasketItem.logo);
        if (templateBasketItem.f81377id == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(templateBasketItem.f81377id.longValue());
        }
        parcel.writeString(templateBasketItem.additionalData);
        parcel.writeString(templateBasketItem.serviceId);
        parcel.writeInt(templateBasketItem.debtAmount);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.templateBasketItem$$0, parcel, i, new C42027a());
    }

    public TemplateBasketItem getParcel() {
        return this.templateBasketItem$$0;
    }
}
