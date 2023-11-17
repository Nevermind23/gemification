package com.google.android.material.slider;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

class RangeSlider$RangeSliderState extends AbsSavedState {
    public static final Parcelable.Creator<RangeSlider$RangeSliderState> CREATOR = new C5134a();

    /* renamed from: d */
    private float f16432d;

    /* renamed from: e */
    private int f16433e;

    /* renamed from: com.google.android.material.slider.RangeSlider$RangeSliderState$a */
    class C5134a implements Parcelable.Creator {
        C5134a() {
        }

        /* renamed from: a */
        public RangeSlider$RangeSliderState createFromParcel(Parcel parcel) {
            return new RangeSlider$RangeSliderState(parcel);
        }

        /* renamed from: b */
        public RangeSlider$RangeSliderState[] newArray(int i) {
            return new RangeSlider$RangeSliderState[i];
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f16432d);
        parcel.writeInt(this.f16433e);
    }

    private RangeSlider$RangeSliderState(Parcel parcel) {
        super(parcel.readParcelable(RangeSlider$RangeSliderState.class.getClassLoader()));
        this.f16432d = parcel.readFloat();
        this.f16433e = parcel.readInt();
    }
}
