package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.C0630d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import p009a8.C0076f;
import p009a8.C0078h;

class TimePickerView extends ConstraintLayout {

    /* renamed from: d */
    private final Chip f16758d;

    /* renamed from: e */
    private final Chip f16759e;

    /* renamed from: f */
    private final ClockHandView f16760f;

    /* renamed from: g */
    private final ClockFaceView f16761g;

    /* renamed from: h */
    private final MaterialButtonToggleGroup f16762h;

    /* renamed from: i */
    private final View.OnClickListener f16763i;

    /* renamed from: com.google.android.material.timepicker.TimePickerView$a */
    class C5223a implements View.OnClickListener {
        C5223a() {
        }

        public void onClick(View view) {
            C5227e unused = TimePickerView.this.getClass();
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$b */
    class C5224b extends GestureDetector.SimpleOnGestureListener {
        C5224b() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            C5226d unused = TimePickerView.this.getClass();
            return false;
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$c */
    class C5225c implements View.OnTouchListener {

        /* renamed from: d */
        final /* synthetic */ GestureDetector f16766d;

        C5225c(GestureDetector gestureDetector) {
            this.f16766d = gestureDetector;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f16766d.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$d */
    interface C5226d {
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$e */
    interface C5227e {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m20645k(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
    }

    /* renamed from: l */
    private void m20646l() {
        Chip chip = this.f16758d;
        int i = C0076f.f251R;
        chip.setTag(i, 12);
        this.f16759e.setTag(i, 10);
        this.f16758d.setOnClickListener(this.f16763i);
        this.f16759e.setOnClickListener(this.f16763i);
        this.f16758d.setAccessibilityClassName("android.view.View");
        this.f16759e.setAccessibilityClassName("android.view.View");
    }

    /* renamed from: m */
    private void m20647m() {
        C5225c cVar = new C5225c(new GestureDetector(getContext(), new C5224b()));
        this.f16758d.setOnTouchListener(cVar);
        this.f16759e.setOnTouchListener(cVar);
    }

    /* renamed from: n */
    private void m20648n() {
        boolean z;
        if (this.f16762h.getVisibility() == 0) {
            C0630d dVar = new C0630d();
            dVar.mo2942h(this);
            int i = 1;
            if (ViewCompat.m3541B(this) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 2;
            }
            dVar.mo2940f(C0076f.f273k, i);
            dVar.mo2937c(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m20648n();
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            m20648n();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16763i = new C5223a();
        LayoutInflater.from(context).inflate(C0078h.f303m, this);
        this.f16761g = (ClockFaceView) findViewById(C0076f.f274l);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(C0076f.f276n);
        this.f16762h = materialButtonToggleGroup;
        materialButtonToggleGroup.mo15689b(new C5232e(this));
        this.f16758d = (Chip) findViewById(C0076f.f279q);
        this.f16759e = (Chip) findViewById(C0076f.f277o);
        this.f16760f = (ClockHandView) findViewById(C0076f.f275m);
        m20647m();
        m20646l();
    }
}
