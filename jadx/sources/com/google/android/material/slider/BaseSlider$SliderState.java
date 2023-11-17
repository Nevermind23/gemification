package com.google.android.material.slider;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

class BaseSlider$SliderState extends View.BaseSavedState {
    public static final Parcelable.Creator<BaseSlider$SliderState> CREATOR = new C5133a();

    /* renamed from: d */
    float f16427d;

    /* renamed from: e */
    float f16428e;

    /* renamed from: f */
    ArrayList f16429f;

    /* renamed from: g */
    float f16430g;

    /* renamed from: h */
    boolean f16431h;

    /* renamed from: com.google.android.material.slider.BaseSlider$SliderState$a */
    class C5133a implements Parcelable.Creator {
        C5133a() {
        }

        /* renamed from: a */
        public BaseSlider$SliderState createFromParcel(Parcel parcel) {
            return new BaseSlider$SliderState(parcel, (C5135a) null);
        }

        /* renamed from: b */
        public BaseSlider$SliderState[] newArray(int i) {
            return new BaseSlider$SliderState[i];
        }
    }

    /* synthetic */ BaseSlider$SliderState(Parcel parcel, C5135a aVar) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f16427d);
        parcel.writeFloat(this.f16428e);
        parcel.writeList(this.f16429f);
        parcel.writeFloat(this.f16430g);
        parcel.writeBooleanArray(new boolean[]{this.f16431h});
    }

    private BaseSlider$SliderState(Parcel parcel) {
        super(parcel);
        this.f16427d = parcel.readFloat();
        this.f16428e = parcel.readFloat();
        ArrayList arrayList = new ArrayList();
        this.f16429f = arrayList;
        parcel.readList(arrayList, Float.class.getClassLoader());
        this.f16430g = parcel.readFloat();
        this.f16431h = parcel.createBooleanArray()[0];
    }
}
