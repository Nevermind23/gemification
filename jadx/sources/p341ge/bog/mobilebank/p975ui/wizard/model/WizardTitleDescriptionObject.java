package p341ge.bog.mobilebank.p975ui.wizard.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.ui.wizard.model.WizardTitleDescriptionObject */
public final class WizardTitleDescriptionObject implements Parcelable {
    public static final Parcelable.Creator<WizardTitleDescriptionObject> CREATOR = new C35892a();

    /* renamed from: d */
    private String f86825d;

    /* renamed from: e */
    private CharSequence f86826e;

    /* renamed from: ge.bog.mobilebank.ui.wizard.model.WizardTitleDescriptionObject$a */
    public static final class C35892a implements Parcelable.Creator {
        /* renamed from: a */
        public final WizardTitleDescriptionObject createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new WizardTitleDescriptionObject(parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public final WizardTitleDescriptionObject[] newArray(int i) {
            return new WizardTitleDescriptionObject[i];
        }
    }

    public WizardTitleDescriptionObject(String str, CharSequence charSequence) {
        C41536l.m120489i(str, "title");
        C41536l.m120489i(charSequence, "description");
        this.f86825d = str;
        this.f86826e = charSequence;
    }

    /* renamed from: a */
    public final CharSequence mo88123a() {
        return this.f86826e;
    }

    /* renamed from: b */
    public final String mo88124b() {
        return this.f86825d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WizardTitleDescriptionObject)) {
            return false;
        }
        WizardTitleDescriptionObject wizardTitleDescriptionObject = (WizardTitleDescriptionObject) obj;
        return C41536l.m120484d(this.f86825d, wizardTitleDescriptionObject.f86825d) && C41536l.m120484d(this.f86826e, wizardTitleDescriptionObject.f86826e);
    }

    public int hashCode() {
        return (this.f86825d.hashCode() * 31) + this.f86826e.hashCode();
    }

    public String toString() {
        String str = this.f86825d;
        CharSequence charSequence = this.f86826e;
        return "WizardTitleDescriptionObject(title=" + str + ", description=" + charSequence + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f86825d);
        TextUtils.writeToParcel(this.f86826e, parcel, i);
    }
}
