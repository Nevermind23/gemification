package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;

public abstract class TwoStatePreference extends Preference {

    /* renamed from: G */
    protected boolean f4797G;

    /* renamed from: H */
    private CharSequence f4798H;

    /* renamed from: I */
    private CharSequence f4799I;

    /* renamed from: J */
    private boolean f4800J;

    /* renamed from: K */
    private boolean f4801K;

    static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1674a();

        /* renamed from: d */
        boolean f4802d;

        /* renamed from: androidx.preference.TwoStatePreference$SavedState$a */
        class C1674a implements Parcelable.Creator {
            C1674a() {
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
            this.f4802d = parcel.readInt() != 1 ? false : true;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f4802d ? 1 : 0);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public Object mo5020A(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    /* renamed from: I */
    public boolean mo5021I() {
        boolean z;
        if (this.f4801K) {
            z = this.f4797G;
        } else if (!this.f4797G) {
            z = true;
        } else {
            z = false;
        }
        if (z || super.mo5021I()) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public boolean mo5108K() {
        return this.f4797G;
    }

    /* renamed from: L */
    public void mo5109L(boolean z) {
        boolean z2;
        if (this.f4797G != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || !this.f4800J) {
            this.f4797G = z;
            this.f4800J = true;
            mo5050E(z);
            if (z2) {
                mo5073x(mo5021I());
                mo5017w();
            }
        }
    }

    /* renamed from: M */
    public void mo5110M(boolean z) {
        this.f4801K = z;
    }

    /* renamed from: N */
    public void mo5111N(CharSequence charSequence) {
        this.f4799I = charSequence;
        if (!mo5108K()) {
            mo5017w();
        }
    }

    /* renamed from: O */
    public void mo5112O(CharSequence charSequence) {
        this.f4798H = charSequence;
        if (mo5108K()) {
            mo5017w();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5113P(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r4.f4797G
            r1 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.CharSequence r0 = r4.f4798H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x001b
            java.lang.CharSequence r0 = r4.f4798H
            r5.setText(r0)
        L_0x0019:
            r0 = r1
            goto L_0x002e
        L_0x001b:
            boolean r0 = r4.f4797G
            if (r0 != 0) goto L_0x002d
            java.lang.CharSequence r0 = r4.f4799I
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x002d
            java.lang.CharSequence r0 = r4.f4799I
            r5.setText(r0)
            goto L_0x0019
        L_0x002d:
            r0 = 1
        L_0x002e:
            if (r0 == 0) goto L_0x003e
            java.lang.CharSequence r2 = r4.mo5036q()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x003e
            r5.setText(r2)
            r0 = r1
        L_0x003e:
            if (r0 != 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r1 = 8
        L_0x0043:
            int r0 = r5.getVisibility()
            if (r1 == r0) goto L_0x004c
            r5.setVisibility(r1)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.mo5113P(android.view.View):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo5015y() {
        super.mo5015y();
        boolean z = !mo5108K();
        if (mo5055a(Boolean.valueOf(z))) {
            mo5109L(z);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
