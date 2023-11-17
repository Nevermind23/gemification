package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.content.res.C0820l;
import androidx.preference.Preference;

public class ListPreference extends DialogPreference {

    /* renamed from: M */
    private CharSequence[] f4720M;

    /* renamed from: N */
    private CharSequence[] f4721N;

    /* renamed from: O */
    private String f4722O;

    /* renamed from: P */
    private String f4723P;

    /* renamed from: Q */
    private boolean f4724Q;

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1661a();

        /* renamed from: d */
        String f4725d;

        /* renamed from: androidx.preference.ListPreference$SavedState$a */
        class C1661a implements Parcelable.Creator {
            C1661a() {
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
            this.f4725d = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f4725d);
        }
    }

    /* renamed from: androidx.preference.ListPreference$a */
    public static final class C1662a implements Preference.C1666b {

        /* renamed from: a */
        private static C1662a f4726a;

        private C1662a() {
        }

        /* renamed from: b */
        public static C1662a m5805b() {
            if (f4726a == null) {
                f4726a = new C1662a();
            }
            return f4726a;
        }

        /* renamed from: c */
        public CharSequence mo5028a(ListPreference listPreference) {
            if (TextUtils.isEmpty(listPreference.mo5032M())) {
                return listPreference.mo5057c().getString(C1680f.not_set);
            }
            return listPreference.mo5032M();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1681g.f4906x, i, i2);
        this.f4720M = C0820l.m3074q(obtainStyledAttributes, C1681g.f4803A, C1681g.f4908y);
        this.f4721N = C0820l.m3074q(obtainStyledAttributes, C1681g.f4805B, C1681g.f4910z);
        int i3 = C1681g.f4807C;
        if (C0820l.m3059b(obtainStyledAttributes, i3, i3, false)) {
            mo5053H(C1662a.m5805b());
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C1681g.f4819I, i, i2);
        this.f4723P = C0820l.m3072o(obtainStyledAttributes2, C1681g.f4893q0, C1681g.f4835Q);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: P */
    private int m5794P() {
        return mo5030K(this.f4722O);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public Object mo5020A(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* renamed from: K */
    public int mo5030K(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f4721N) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.f4721N[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    /* renamed from: L */
    public CharSequence[] mo5031L() {
        return this.f4720M;
    }

    /* renamed from: M */
    public CharSequence mo5032M() {
        CharSequence[] charSequenceArr;
        int P = m5794P();
        if (P < 0 || (charSequenceArr = this.f4720M) == null) {
            return null;
        }
        return charSequenceArr[P];
    }

    /* renamed from: N */
    public CharSequence[] mo5033N() {
        return this.f4721N;
    }

    /* renamed from: O */
    public String mo5034O() {
        return this.f4722O;
    }

    /* renamed from: Q */
    public void mo5035Q(String str) {
        boolean z = !TextUtils.equals(this.f4722O, str);
        if (z || !this.f4724Q) {
            this.f4722O = str;
            this.f4724Q = true;
            mo5052G(str);
            if (z) {
                mo5017w();
            }
        }
    }

    /* renamed from: q */
    public CharSequence mo5036q() {
        if (mo5067r() != null) {
            return mo5067r().mo5028a(this);
        }
        Object M = mo5032M();
        CharSequence q = super.mo5036q();
        String str = this.f4723P;
        if (str == null) {
            return q;
        }
        Object[] objArr = new Object[1];
        if (M == null) {
            M = "";
        }
        objArr[0] = M;
        String format = String.format(str, objArr);
        if (TextUtils.equals(format, q)) {
            return q;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0820l.m3058a(context, C1677c.dialogPreferenceStyle, 16842897));
    }
}
