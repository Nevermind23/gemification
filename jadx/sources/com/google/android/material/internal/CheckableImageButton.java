package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.C1055a;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import com.salesforce.marketingcloud.C11398b;
import p030c.C2210a;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: j */
    private static final int[] f16130j = {16842912};

    /* renamed from: g */
    private boolean f16131g;

    /* renamed from: h */
    private boolean f16132h;

    /* renamed from: i */
    private boolean f16133i;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C5065a();

        /* renamed from: f */
        boolean f16134f;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$SavedState$a */
        class C5065a implements Parcelable.ClassLoaderCreator {
            C5065a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m19742b(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f16134f = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f16134f ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m19742b(parcel);
        }
    }

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    class C5066a extends C1055a {
        C5066a() {
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.mo3590W(CheckableImageButton.this.mo16392a());
            accessibilityNodeInfoCompat.mo3591X(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2210a.f6431B);
    }

    /* renamed from: a */
    public boolean mo16392a() {
        return this.f16132h;
    }

    public boolean isChecked() {
        return this.f16131g;
    }

    public int[] onCreateDrawableState(int i) {
        if (!this.f16131g) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = f16130j;
        return View.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3880a());
        setChecked(savedState.f16134f);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f16134f = this.f16131g;
        return savedState;
    }

    public void setCheckable(boolean z) {
        if (this.f16132h != z) {
            this.f16132h = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.f16132h && this.f16131g != z) {
            this.f16131g = z;
            refreshDrawableState();
            sendAccessibilityEvent(C11398b.f33142u);
        }
    }

    public void setPressable(boolean z) {
        this.f16133i = z;
    }

    public void setPressed(boolean z) {
        if (this.f16133i) {
            super.setPressed(z);
        }
    }

    public void toggle() {
        setChecked(!this.f16131g);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16132h = true;
        this.f16133i = true;
        ViewCompat.m3619r0(this, new C5066a());
    }
}
