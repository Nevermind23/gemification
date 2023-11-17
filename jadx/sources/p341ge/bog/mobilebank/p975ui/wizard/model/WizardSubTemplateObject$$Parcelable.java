package p341ge.bog.mobilebank.p975ui.wizard.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.model.KeyValue$$Parcelable;

/* renamed from: ge.bog.mobilebank.ui.wizard.model.WizardSubTemplateObject$$Parcelable */
public class WizardSubTemplateObject$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<WizardSubTemplateObject$$Parcelable> CREATOR = new C35891a();
    private WizardSubTemplateObject wizardSubTemplateObject$$0;

    /* renamed from: ge.bog.mobilebank.ui.wizard.model.WizardSubTemplateObject$$Parcelable$a */
    class C35891a implements Parcelable.Creator {
        C35891a() {
        }

        /* renamed from: a */
        public WizardSubTemplateObject$$Parcelable createFromParcel(Parcel parcel) {
            return new WizardSubTemplateObject$$Parcelable(WizardSubTemplateObject$$Parcelable.read(parcel, new C42027a()));
        }

        /* renamed from: b */
        public WizardSubTemplateObject$$Parcelable[] newArray(int i) {
            return new WizardSubTemplateObject$$Parcelable[i];
        }
    }

    public WizardSubTemplateObject$$Parcelable(WizardSubTemplateObject wizardSubTemplateObject) {
        this.wizardSubTemplateObject$$0 = wizardSubTemplateObject;
    }

    public static WizardSubTemplateObject read(Parcel parcel, C42027a aVar) {
        ArrayList<KeyValue> arrayList;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            WizardSubTemplateObject wizardSubTemplateObject = new WizardSubTemplateObject();
            aVar.mo97501f(g, wizardSubTemplateObject);
            wizardSubTemplateObject.preview = parcel.readString();
            wizardSubTemplateObject.subTitle = parcel.readString();
            wizardSubTemplateObject.imageUrl = parcel.readString();
            wizardSubTemplateObject.title = parcel.readString();
            int readInt2 = parcel.readInt();
            if (readInt2 < 0) {
                arrayList = null;
            } else {
                ArrayList<KeyValue> arrayList2 = new ArrayList<>(readInt2);
                for (int i = 0; i < readInt2; i++) {
                    arrayList2.add(KeyValue$$Parcelable.read(parcel, aVar));
                }
                arrayList = arrayList2;
            }
            wizardSubTemplateObject.keyValues = arrayList;
            wizardSubTemplateObject.value = parcel.readString();
            aVar.mo97501f(readInt, wizardSubTemplateObject);
            return wizardSubTemplateObject;
        } else if (!aVar.mo97499d(readInt)) {
            return (WizardSubTemplateObject) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(WizardSubTemplateObject wizardSubTemplateObject, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(wizardSubTemplateObject);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(wizardSubTemplateObject));
        parcel.writeString(wizardSubTemplateObject.preview);
        parcel.writeString(wizardSubTemplateObject.subTitle);
        parcel.writeString(wizardSubTemplateObject.imageUrl);
        parcel.writeString(wizardSubTemplateObject.title);
        ArrayList<KeyValue> arrayList = wizardSubTemplateObject.keyValues;
        if (arrayList == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(arrayList.size());
            Iterator<KeyValue> it = wizardSubTemplateObject.keyValues.iterator();
            while (it.hasNext()) {
                KeyValue$$Parcelable.write(it.next(), parcel, i, aVar);
            }
        }
        parcel.writeString(wizardSubTemplateObject.value);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.wizardSubTemplateObject$$0, parcel, i, new C42027a());
    }

    public WizardSubTemplateObject getParcel() {
        return this.wizardSubTemplateObject$$0;
    }
}
