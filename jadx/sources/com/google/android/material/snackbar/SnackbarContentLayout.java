package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import p009a8.C0076f;

public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: d */
    private TextView f16450d;

    /* renamed from: e */
    private Button f16451e;

    /* renamed from: f */
    private int f16452f;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private static void m20131a(View view, int i, int i2) {
        if (ViewCompat.m3581X(view)) {
            ViewCompat.m3552G0(view, ViewCompat.m3551G(view), i, ViewCompat.m3549F(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* renamed from: b */
    private boolean m20132b(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f16450d.getPaddingTop() == i2 && this.f16450d.getPaddingBottom() == i3) {
            return z;
        }
        m20131a(this.f16450d, i2, i3);
        return true;
    }

    public Button getActionView() {
        return this.f16451e;
    }

    public TextView getMessageView() {
        return this.f16450d;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f16450d = (TextView) findViewById(C0076f.f253T);
        this.f16451e = (Button) findViewById(C0076f.f252S);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (m20132b(1, r0, r0 - r2) != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (m20132b(0, r0, r0) != false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto L_0x000b
            return
        L_0x000b:
            android.content.res.Resources r0 = r7.getResources()
            int r2 = p009a8.C0074d.f214k
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            int r3 = p009a8.C0074d.f212j
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.f16450d
            android.text.Layout r3 = r3.getLayout()
            r4 = 0
            if (r3 == 0) goto L_0x0030
            int r3 = r3.getLineCount()
            if (r3 <= r1) goto L_0x0030
            r3 = r1
            goto L_0x0031
        L_0x0030:
            r3 = r4
        L_0x0031:
            if (r3 == 0) goto L_0x004a
            int r5 = r7.f16452f
            if (r5 <= 0) goto L_0x004a
            android.widget.Button r5 = r7.f16451e
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f16452f
            if (r5 <= r6) goto L_0x004a
            int r2 = r0 - r2
            boolean r0 = r7.m20132b(r1, r0, r2)
            if (r0 == 0) goto L_0x0055
            goto L_0x0056
        L_0x004a:
            if (r3 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r0 = r2
        L_0x004e:
            boolean r0 = r7.m20132b(r4, r0, r0)
            if (r0 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r1 = r4
        L_0x0056:
            if (r1 == 0) goto L_0x005b
            super.onMeasure(r8, r9)
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i) {
        this.f16452f = i;
    }
}
