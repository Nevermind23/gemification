package p341ge.bog.mobilebank.p975ui.wizard.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.model.KeyValue$$Parcelable;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;

/* renamed from: ge.bog.mobilebank.ui.wizard.model.WizardObject$$Parcelable */
public class WizardObject$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<WizardObject$$Parcelable> CREATOR = new C35890a();
    private WizardObject wizardObject$$0;

    /* renamed from: ge.bog.mobilebank.ui.wizard.model.WizardObject$$Parcelable$a */
    class C35890a implements Parcelable.Creator {
        C35890a() {
        }

        /* renamed from: a */
        public WizardObject$$Parcelable createFromParcel(Parcel parcel) {
            return new WizardObject$$Parcelable(WizardObject$$Parcelable.read(parcel, new C42027a()));
        }

        /* renamed from: b */
        public WizardObject$$Parcelable[] newArray(int i) {
            return new WizardObject$$Parcelable[i];
        }
    }

    public WizardObject$$Parcelable(WizardObject wizardObject) {
        this.wizardObject$$0 = wizardObject;
    }

    public static WizardObject read(Parcel parcel, C42027a aVar) {
        boolean z;
        ArrayList arrayList;
        Boolean bool;
        ArrayList<WizardSubTemplateObject> arrayList2;
        ArrayList<KeyValue> arrayList3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            WizardObject wizardObject = new WizardObject();
            aVar.mo97501f(g, wizardObject);
            wizardObject.minAmount = (BigDecimal) parcel.readSerializable();
            wizardObject.minDate = parcel.readLong();
            wizardObject.pageTitle = parcel.readString();
            wizardObject.descriptionText = parcel.readString();
            boolean z7 = true;
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            wizardObject.animate = z;
            wizardObject.subTemplateObjectsTitle = parcel.readString();
            wizardObject.nonSelectableString = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList4 = null;
            if (readInt2 < 0) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(readInt2);
                for (int i = 0; i < readInt2; i++) {
                    arrayList.add(parcel.readString());
                }
            }
            wizardObject.selectorOptionValues = arrayList;
            if (parcel.readInt() < 0) {
                bool = null;
            } else {
                if (parcel.readInt() == 1) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                bool = Boolean.valueOf(z6);
            }
            wizardObject.showMobileNumberIndexPrefix = bool;
            wizardObject.textLimit = parcel.readInt();
            wizardObject.mobileNumberInputContactPermissionTextId = parcel.readInt();
            wizardObject.inputType = parcel.readInt();
            wizardObject.f86824id = parcel.readString();
            wizardObject.tag = parcel.readString();
            wizardObject.iconUrl = parcel.readString();
            wizardObject.visibleInput = parcel.readString();
            wizardObject.maxAmount = (BigDecimal) parcel.readSerializable();
            wizardObject.value = parcel.readString();
            wizardObject.selectedSubTemplateItem = parcel.readInt();
            wizardObject.mask = parcel.readString();
            int readInt3 = parcel.readInt();
            if (readInt3 < 0) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList<>(readInt3);
                for (int i2 = 0; i2 < readInt3; i2++) {
                    arrayList2.add(WizardSubTemplateObject$$Parcelable.read(parcel, aVar));
                }
            }
            wizardObject.subTemplateObjects = arrayList2;
            int readInt4 = parcel.readInt();
            if (readInt4 < 0) {
                arrayList3 = null;
            } else {
                arrayList3 = new ArrayList<>(readInt4);
                for (int i3 = 0; i3 < readInt4; i3++) {
                    arrayList3.add(KeyValue$$Parcelable.read(parcel, aVar));
                }
            }
            wizardObject.infoListKeyValues = arrayList3;
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            wizardObject.selectByString = z2;
            wizardObject.inputTitle = parcel.readString();
            if (parcel.readInt() == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            wizardObject.skippable = z3;
            wizardObject.maxSelectableItems = parcel.readInt();
            wizardObject.customSelectorValues = new WizardObject.C35889a().mo88107a(parcel);
            if (parcel.readInt() == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            wizardObject.allowEmptyValue = z4;
            wizardObject.inputStyle = parcel.readInt();
            wizardObject.maxDate = parcel.readLong();
            wizardObject.selectorType = parcel.readInt();
            if (parcel.readInt() == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            wizardObject.skippableIfFilled = z5;
            wizardObject.validatePattern = parcel.readString();
            wizardObject.maskChar = parcel.readString();
            if (parcel.readInt() != 1) {
                z7 = false;
            }
            wizardObject.amountObject = z7;
            int readInt5 = parcel.readInt();
            if (readInt5 >= 0) {
                arrayList4 = new ArrayList(readInt5);
                for (int i4 = 0; i4 < readInt5; i4++) {
                    arrayList4.add(parcel.readString());
                }
            }
            wizardObject.selectorOptionPreviews = arrayList4;
            aVar.mo97501f(readInt, wizardObject);
            return wizardObject;
        } else if (!aVar.mo97499d(readInt)) {
            return (WizardObject) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(WizardObject wizardObject, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(wizardObject);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(wizardObject));
        parcel.writeSerializable(wizardObject.minAmount);
        parcel.writeLong(wizardObject.minDate);
        parcel.writeString(wizardObject.pageTitle);
        parcel.writeString(wizardObject.descriptionText);
        parcel.writeInt(wizardObject.animate ? 1 : 0);
        parcel.writeString(wizardObject.subTemplateObjectsTitle);
        parcel.writeString(wizardObject.nonSelectableString);
        List<String> list = wizardObject.selectorOptionValues;
        if (list == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(list.size());
            for (String writeString : wizardObject.selectorOptionValues) {
                parcel.writeString(writeString);
            }
        }
        if (wizardObject.showMobileNumberIndexPrefix == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(wizardObject.showMobileNumberIndexPrefix.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(wizardObject.textLimit);
        parcel.writeInt(wizardObject.mobileNumberInputContactPermissionTextId);
        parcel.writeInt(wizardObject.inputType);
        parcel.writeString(wizardObject.f86824id);
        parcel.writeString(wizardObject.tag);
        parcel.writeString(wizardObject.iconUrl);
        parcel.writeString(wizardObject.visibleInput);
        parcel.writeSerializable(wizardObject.maxAmount);
        parcel.writeString(wizardObject.value);
        parcel.writeInt(wizardObject.selectedSubTemplateItem);
        parcel.writeString(wizardObject.mask);
        ArrayList<WizardSubTemplateObject> arrayList = wizardObject.subTemplateObjects;
        if (arrayList == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(arrayList.size());
            Iterator<WizardSubTemplateObject> it = wizardObject.subTemplateObjects.iterator();
            while (it.hasNext()) {
                WizardSubTemplateObject$$Parcelable.write(it.next(), parcel, i, aVar);
            }
        }
        ArrayList<KeyValue> arrayList2 = wizardObject.infoListKeyValues;
        if (arrayList2 == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(arrayList2.size());
            Iterator<KeyValue> it2 = wizardObject.infoListKeyValues.iterator();
            while (it2.hasNext()) {
                KeyValue$$Parcelable.write(it2.next(), parcel, i, aVar);
            }
        }
        parcel.writeInt(wizardObject.selectByString ? 1 : 0);
        parcel.writeString(wizardObject.inputTitle);
        parcel.writeInt(wizardObject.skippable ? 1 : 0);
        parcel.writeInt(wizardObject.maxSelectableItems);
        new WizardObject.C35889a().mo88108b(wizardObject.customSelectorValues, parcel);
        parcel.writeInt(wizardObject.allowEmptyValue ? 1 : 0);
        parcel.writeInt(wizardObject.inputStyle);
        parcel.writeLong(wizardObject.maxDate);
        parcel.writeInt(wizardObject.selectorType);
        parcel.writeInt(wizardObject.skippableIfFilled ? 1 : 0);
        parcel.writeString(wizardObject.validatePattern);
        parcel.writeString(wizardObject.maskChar);
        parcel.writeInt(wizardObject.amountObject ? 1 : 0);
        List<String> list2 = wizardObject.selectorOptionPreviews;
        if (list2 == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(list2.size());
        for (String writeString2 : wizardObject.selectorOptionPreviews) {
            parcel.writeString(writeString2);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.wizardObject$$0, parcel, i, new C42027a());
    }

    public WizardObject getParcel() {
        return this.wizardObject$$0;
    }
}
