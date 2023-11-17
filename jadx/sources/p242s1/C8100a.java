package p242s1;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import p048d2.C5807i;

/* renamed from: s1.a */
public class C8100a extends Paint {
    public C8100a() {
    }

    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT < 30) {
            setColor((C5807i.m23364c(i, 0, C11051p3.f31759c) << 24) | (getColor() & 16777215));
            return;
        }
        super.setAlpha(C5807i.m23364c(i, 0, C11051p3.f31759c));
    }

    public void setTextLocales(LocaleList localeList) {
    }

    public C8100a(int i) {
        super(i);
    }

    public C8100a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public C8100a(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
