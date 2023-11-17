package p341ge.bog.mobilebank.p975ui.wizard.controllers;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.ui.wizard.controllers.BaseWizardPlugin$$Parcelable */
public class BaseWizardPlugin$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<BaseWizardPlugin$$Parcelable> CREATOR = new C35880a();
    private BaseWizardPlugin baseWizardPlugin$$0;

    /* renamed from: ge.bog.mobilebank.ui.wizard.controllers.BaseWizardPlugin$$Parcelable$a */
    class C35880a implements Parcelable.Creator {
        C35880a() {
        }

        /* renamed from: a */
        public BaseWizardPlugin$$Parcelable createFromParcel(Parcel parcel) {
            return new BaseWizardPlugin$$Parcelable(BaseWizardPlugin$$Parcelable.read(parcel, new C42027a()));
        }

        /* renamed from: b */
        public BaseWizardPlugin$$Parcelable[] newArray(int i) {
            return new BaseWizardPlugin$$Parcelable[i];
        }
    }

    public BaseWizardPlugin$$Parcelable(BaseWizardPlugin baseWizardPlugin) {
        this.baseWizardPlugin$$0 = baseWizardPlugin;
    }

    public static BaseWizardPlugin read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            BaseWizardPlugin baseWizardPlugin = new BaseWizardPlugin();
            aVar.mo97501f(g, baseWizardPlugin);
            aVar.mo97501f(readInt, baseWizardPlugin);
            return baseWizardPlugin;
        } else if (!aVar.mo97499d(readInt)) {
            return (BaseWizardPlugin) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(BaseWizardPlugin baseWizardPlugin, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(baseWizardPlugin);
        if (c != -1) {
            parcel.writeInt(c);
        } else {
            parcel.writeInt(aVar.mo97500e(baseWizardPlugin));
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.baseWizardPlugin$$0, parcel, i, new C42027a());
    }

    public BaseWizardPlugin getParcel() {
        return this.baseWizardPlugin$$0;
    }
}
