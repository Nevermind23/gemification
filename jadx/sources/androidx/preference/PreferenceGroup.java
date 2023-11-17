package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.C0820l;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.List;

public abstract class PreferenceGroup extends Preference {

    /* renamed from: G */
    final SimpleArrayMap f4761G;

    /* renamed from: H */
    private final Handler f4762H;

    /* renamed from: I */
    private final List f4763I;

    /* renamed from: J */
    private boolean f4764J;

    /* renamed from: K */
    private int f4765K;

    /* renamed from: L */
    private boolean f4766L;

    /* renamed from: M */
    private int f4767M;

    /* renamed from: N */
    private final Runnable f4768N;

    static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1667a();

        /* renamed from: d */
        int f4769d;

        /* renamed from: androidx.preference.PreferenceGroup$SavedState$a */
        class C1667a implements Parcelable.Creator {
            C1667a() {
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
            this.f4769d = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f4769d);
        }
    }

    /* renamed from: androidx.preference.PreferenceGroup$a */
    class C1668a implements Runnable {
        C1668a() {
        }

        public void run() {
            synchronized (this) {
                PreferenceGroup.this.f4761G.clear();
            }
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4761G = new SimpleArrayMap();
        this.f4762H = new Handler(Looper.getMainLooper());
        this.f4764J = true;
        this.f4765K = 0;
        this.f4766L = false;
        this.f4767M = Integer.MAX_VALUE;
        this.f4768N = new C1668a();
        this.f4763I = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1681g.f4903v0, i, i2);
        int i3 = C1681g.f4907x0;
        this.f4764J = C0820l.m3059b(obtainStyledAttributes, i3, i3, true);
        int i4 = C1681g.f4905w0;
        if (obtainStyledAttributes.hasValue(i4)) {
            mo5082M(C0820l.m3061d(obtainStyledAttributes, i4, i4, Integer.MAX_VALUE));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: K */
    public Preference mo5080K(int i) {
        return (Preference) this.f4763I.get(i);
    }

    /* renamed from: L */
    public int mo5081L() {
        return this.f4763I.size();
    }

    /* renamed from: M */
    public void mo5082M(int i) {
        if (i != Integer.MAX_VALUE && !mo5069t()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f4767M = i;
    }

    /* renamed from: x */
    public void mo5073x(boolean z) {
        super.mo5073x(z);
        int L = mo5081L();
        for (int i = 0; i < L; i++) {
            mo5080K(i).mo5048B(this, z);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
