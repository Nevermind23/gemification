package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0297g;
import androidx.appcompat.view.menu.C0301i;

/* renamed from: com.google.android.material.navigation.b */
public final class C5108b extends C0297g {

    /* renamed from: B */
    private final Class f16315B;

    /* renamed from: C */
    private final int f16316C;

    public C5108b(Context context, Class cls, int i) {
        super(context);
        this.f16315B = cls;
        this.f16316C = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo992a(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= this.f16316C) {
            mo1018h0();
            MenuItem a = super.mo992a(i, i2, i3, charSequence);
            if (a instanceof C0301i) {
                ((C0301i) a).mo1099t(true);
            }
            mo1015g0();
            return a;
        }
        String simpleName = this.f16315B.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.f16316C + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f16315B.getSimpleName() + " does not support submenus");
    }
}
