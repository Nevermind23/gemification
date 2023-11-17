package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.C0297g;
import androidx.appcompat.view.menu.C0301i;
import androidx.appcompat.view.menu.C0313m;
import androidx.appcompat.view.menu.C0322r;
import com.google.android.material.badge.C4935b;
import com.google.android.material.internal.ParcelableSparseArray;

public class NavigationBarPresenter implements C0313m {

    /* renamed from: d */
    private C0297g f16263d;

    /* renamed from: e */
    private C5109c f16264e;

    /* renamed from: f */
    private boolean f16265f = false;

    /* renamed from: g */
    private int f16266g;

    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C5096a();

        /* renamed from: d */
        int f16267d;

        /* renamed from: e */
        ParcelableSparseArray f16268e;

        /* renamed from: com.google.android.material.navigation.NavigationBarPresenter$SavedState$a */
        class C5096a implements Parcelable.Creator {
            C5096a() {
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

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.f16267d = parcel.readInt();
            this.f16268e = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f16267d);
            parcel.writeParcelable(this.f16268e, 0);
        }
    }

    /* renamed from: a */
    public int mo900a() {
        return this.f16266g;
    }

    /* renamed from: b */
    public void mo16536b(int i) {
        this.f16266g = i;
    }

    /* renamed from: c */
    public void mo902c(C0297g gVar, boolean z) {
    }

    /* renamed from: d */
    public void mo16537d(C5109c cVar) {
        this.f16264e = cVar;
    }

    /* renamed from: e */
    public boolean mo904e(C0297g gVar, C0301i iVar) {
        return false;
    }

    /* renamed from: g */
    public void mo925g(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f16264e.mo16682p(savedState.f16267d);
            this.f16264e.mo16680o(C4935b.m18852b(this.f16264e.getContext(), savedState.f16268e));
        }
    }

    /* renamed from: h */
    public boolean mo906h(C0322r rVar) {
        return false;
    }

    /* renamed from: i */
    public Parcelable mo926i() {
        SavedState savedState = new SavedState();
        savedState.f16267d = this.f16264e.getSelectedItemId();
        savedState.f16268e = C4935b.m18853c(this.f16264e.getBadgeDrawables());
        return savedState;
    }

    /* renamed from: j */
    public void mo907j(boolean z) {
        if (!this.f16265f) {
            if (z) {
                this.f16264e.mo16651d();
            } else {
                this.f16264e.mo16683q();
            }
        }
    }

    /* renamed from: k */
    public boolean mo927k() {
        return false;
    }

    /* renamed from: l */
    public boolean mo908l(C0297g gVar, C0301i iVar) {
        return false;
    }

    /* renamed from: m */
    public void mo909m(Context context, C0297g gVar) {
        this.f16263d = gVar;
        this.f16264e.mo826a(gVar);
    }

    /* renamed from: n */
    public void mo16538n(boolean z) {
        this.f16265f = z;
    }
}
