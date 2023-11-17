package p341ge.bog.mobilebank.eventbus.events;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;
import p341ge.bog.mobilebank.eventbus.RootEvent$$PackageHelper;
import p341ge.bog.mobilebank.model.payment.PaymentDebtResponse$$Parcelable;

/* renamed from: ge.bog.mobilebank.eventbus.events.TemplateDebtEvent$$Parcelable */
public class TemplateDebtEvent$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<TemplateDebtEvent$$Parcelable> CREATOR = new Parcelable.Creator<TemplateDebtEvent$$Parcelable>() {
        public TemplateDebtEvent$$Parcelable createFromParcel(Parcel parcel) {
            return new TemplateDebtEvent$$Parcelable(TemplateDebtEvent$$Parcelable.read(parcel, new C42027a()));
        }

        public TemplateDebtEvent$$Parcelable[] newArray(int i) {
            return new TemplateDebtEvent$$Parcelable[i];
        }
    };
    private TemplateDebtEvent templateDebtEvent$$0;

    public TemplateDebtEvent$$Parcelable(TemplateDebtEvent templateDebtEvent) {
        this.templateDebtEvent$$0 = templateDebtEvent;
    }

    public static TemplateDebtEvent read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            TemplateDebtEvent templateDebtEvent = new TemplateDebtEvent();
            aVar.mo97501f(g, templateDebtEvent);
            templateDebtEvent.paymentDebt = PaymentDebtResponse$$Parcelable.read(parcel, aVar);
            RootEvent$$PackageHelper.accessRootEvent$FS$errorKey(templateDebtEvent, parcel.readString());
            templateDebtEvent.errorCode = parcel.readString();
            RootEvent$$PackageHelper.accessRootEvent$FS$currentState(templateDebtEvent, parcel.readInt());
            RootEvent$$PackageHelper.accessRootEvent$FS$error(templateDebtEvent, parcel.readString());
            aVar.mo97501f(readInt, templateDebtEvent);
            return templateDebtEvent;
        } else if (!aVar.mo97499d(readInt)) {
            return (TemplateDebtEvent) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(TemplateDebtEvent templateDebtEvent, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(templateDebtEvent);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(templateDebtEvent));
        PaymentDebtResponse$$Parcelable.write(templateDebtEvent.paymentDebt, parcel, i, aVar);
        parcel.writeString(RootEvent$$PackageHelper.accessRootEvent$FG$errorKey(templateDebtEvent));
        parcel.writeString(templateDebtEvent.errorCode);
        parcel.writeInt(RootEvent$$PackageHelper.accessRootEvent$FG$currentState(templateDebtEvent));
        parcel.writeString(RootEvent$$PackageHelper.accessRootEvent$FG$error(templateDebtEvent));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.templateDebtEvent$$0, parcel, i, new C42027a());
    }

    public TemplateDebtEvent getParcel() {
        return this.templateDebtEvent$$0;
    }
}
