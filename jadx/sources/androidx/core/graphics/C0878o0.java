package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.core.content.res.C0799e;
import androidx.core.provider.C0953g;
import java.io.IOException;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;

/* renamed from: androidx.core.graphics.o0 */
public class C0878o0 extends C0880p0 {
    /* renamed from: h */
    private Font m3247h(FontFamily fontFamily, int i) {
        int i2;
        int i3;
        C0831d0.m3111a();
        if ((i & 1) != 0) {
            i2 = 700;
        } else {
            i2 = TextTypeView.SEPARATOR_FULL;
        }
        if ((i & 2) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        FontStyle a = C0826b0.m3102a(i2, i3);
        Font a2 = fontFamily.getFont(0);
        int i4 = m3248i(a, a2.getStyle());
        for (int i5 = 1; i5 < fontFamily.getSize(); i5++) {
            Font a3 = fontFamily.getFont(i5);
            int i6 = m3248i(a, a3.getStyle());
            if (i6 < i4) {
                a2 = a3;
                i4 = i6;
            }
        }
        return a2;
    }

    /* renamed from: i */
    private static int m3248i(FontStyle fontStyle, FontStyle fontStyle2) {
        int i;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i = 0;
        } else {
            i = 2;
        }
        return abs + i;
    }

    /* renamed from: a */
    public Typeface mo3331a(Context context, C0799e.C0802c cVar, Resources resources, int i) {
        int i2;
        try {
            FontFamily.Builder builder = null;
            for (C0799e.C0803d dVar : cVar.mo3269a()) {
                try {
                    C0893y.m3301a();
                    Font.Builder a = C0890v.m3298a(resources, dVar.mo3271b()).setWeight(dVar.mo3274e());
                    if (dVar.mo3275f()) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    Font a2 = a.setSlant(i2).setTtcIndex(dVar.mo3272c()).setFontVariationSettings(dVar.mo3273d()).build();
                    if (builder == null) {
                        C0894z.m3302a();
                        builder = C0891w.m3299a(a2);
                    } else {
                        FontFamily.Builder unused = builder.addFont(a2);
                    }
                } catch (IOException unused2) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily a3 = builder.build();
            C0892x.m3300a();
            return C0889u.m3297a(a3).setStyle(m3247h(a3, i).getStyle()).build();
        } catch (Exception unused3) {
            return null;
        }
    }

    /* renamed from: b */
    public Typeface mo3332b(Context context, CancellationSignal cancellationSignal, C0953g.C0955b[] bVarArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        int i2;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C0953g.C0955b bVar : bVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(bVar.mo3404d(), "r", cancellationSignal);
                    if (openFileDescriptor != null) {
                        C0893y.m3301a();
                        Font.Builder a = C0824a0.m3091a(openFileDescriptor).setWeight(bVar.mo3405e());
                        if (bVar.mo3406f()) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        Font a2 = a.setSlant(i2).setTtcIndex(bVar.mo3403c()).build();
                        if (builder == null) {
                            C0894z.m3302a();
                            builder = C0891w.m3299a(a2);
                        } else {
                            FontFamily.Builder unused = builder.addFont(a2);
                        }
                    } else if (openFileDescriptor == null) {
                    }
                    openFileDescriptor.close();
                } catch (IOException unused2) {
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily a3 = builder.build();
            C0892x.m3300a();
            return C0889u.m3297a(a3).setStyle(m3247h(a3, i).getStyle()).build();
            throw th;
        } catch (Exception unused3) {
            return null;
        }
    }

    /* renamed from: d */
    public Typeface mo3333d(Context context, Resources resources, int i, String str, int i2) {
        try {
            C0893y.m3301a();
            Font a = C0890v.m3298a(resources, i).build();
            C0894z.m3302a();
            FontFamily a2 = C0891w.m3299a(a).build();
            C0892x.m3300a();
            return C0889u.m3297a(a2).setStyle(a.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C0953g.C0955b mo3334g(C0953g.C0955b[] bVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
