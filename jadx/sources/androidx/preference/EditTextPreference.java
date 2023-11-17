package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.content.res.C0820l;
import androidx.preference.Preference;

public class EditTextPreference extends DialogPreference {

    /* renamed from: M */
    private String f4717M;

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1659a();

        /* renamed from: d */
        String f4718d;

        /* renamed from: androidx.preference.EditTextPreference$SavedState$a */
        class C1659a implements Parcelable.Creator {
            C1659a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f4718d = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f4718d);
        }
    }

    /* renamed from: androidx.preference.EditTextPreference$a */
    public static final class C1660a implements Preference.C1666b {

        /* renamed from: a */
        private static C1660a f4719a;

        private C1660a() {
        }

        /* renamed from: b */
        public static C1660a m5791b() {
            if (f4719a == null) {
                f4719a = new C1660a();
            }
            return f4719a;
        }

        /* renamed from: c */
        public CharSequence mo5028a(EditTextPreference editTextPreference) {
            if (TextUtils.isEmpty(editTextPreference.mo5022K())) {
                return editTextPreference.mo5057c().getString(C1680f.not_set);
            }
            return editTextPreference.mo5022K();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1681g.f4902v, i, i2);
        int i3 = C1681g.f4904w;
        if (C0820l.m3059b(obtainStyledAttributes, i3, i3, false)) {
            mo5053H(C1660a.m5791b());
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public Object mo5020A(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* renamed from: I */
    public boolean mo5021I() {
        return TextUtils.isEmpty(this.f4717M) || super.mo5021I();
    }

    /* renamed from: K */
    public String mo5022K() {
        return this.f4717M;
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0820l.m3058a(context, C1677c.editTextPreferenceStyle, 16842898));
    }
}
