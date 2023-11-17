package com.google.android.material.navigation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

public class NavigationView$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<NavigationView$SavedState> CREATOR = new C5101a();

    /* renamed from: f */
    public Bundle f16276f;

    /* renamed from: com.google.android.material.navigation.NavigationView$SavedState$a */
    class C5101a implements Parcelable.ClassLoaderCreator {
        C5101a() {
        }

        /* renamed from: a */
        public NavigationView$SavedState createFromParcel(Parcel parcel) {
            return new NavigationView$SavedState(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public NavigationView$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new NavigationView$SavedState(parcel, classLoader);
        }

        /* renamed from: c */
        public NavigationView$SavedState[] newArray(int i) {
            return new NavigationView$SavedState[i];
        }
    }

    public NavigationView$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f16276f = parcel.readBundle(classLoader);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.f16276f);
    }
}
