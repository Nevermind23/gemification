package p341ge.bog.designsystem.components.progressbar;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.designsystem.components.progressbar.ProgressBarSavedState */
public final class ProgressBarSavedState implements Parcelable {
    public static final Parcelable.Creator<ProgressBarSavedState> CREATOR = new C13499a();

    /* renamed from: d */
    private final Parcelable f40259d;

    /* renamed from: e */
    private final int f40260e;

    /* renamed from: f */
    private final float f40261f;

    /* renamed from: ge.bog.designsystem.components.progressbar.ProgressBarSavedState$a */
    public static final class C13499a implements Parcelable.Creator {
        /* renamed from: a */
        public final ProgressBarSavedState createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new ProgressBarSavedState(parcel.readParcelable(ProgressBarSavedState.class.getClassLoader()), parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: b */
        public final ProgressBarSavedState[] newArray(int i) {
            return new ProgressBarSavedState[i];
        }
    }

    public ProgressBarSavedState(Parcelable parcelable, int i, float f) {
        this.f40259d = parcelable;
        this.f40260e = i;
        this.f40261f = f;
    }

    /* renamed from: a */
    public final int mo36656a() {
        return this.f40260e;
    }

    /* renamed from: b */
    public final float mo36657b() {
        return this.f40261f;
    }

    /* renamed from: d */
    public final Parcelable mo36658d() {
        return this.f40259d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeParcelable(this.f40259d, i);
        parcel.writeInt(this.f40260e);
        parcel.writeFloat(this.f40261f);
    }
}
