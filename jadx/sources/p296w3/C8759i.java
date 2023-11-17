package p296w3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.view.C0267d;
import androidx.core.content.C0767a;
import androidx.core.content.res.C0808h;
import p045d.C5769a;

/* renamed from: w3.i */
public abstract class C8759i {

    /* renamed from: a */
    private static volatile boolean f24611a = true;

    /* renamed from: a */
    public static Drawable m32587a(Context context, int i, Resources.Theme theme) {
        return m32589c(context, context, i, theme);
    }

    /* renamed from: b */
    public static Drawable m32588b(Context context, Context context2, int i) {
        return m32589c(context, context2, i, (Resources.Theme) null);
    }

    /* renamed from: c */
    private static Drawable m32589c(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f24611a) {
                return m32591e(context2, i, theme);
            }
        } catch (NoClassDefFoundError unused) {
            f24611a = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return C0767a.m2895e(context2, i);
            }
            throw e;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m32590d(context2, i, theme);
    }

    /* renamed from: d */
    private static Drawable m32590d(Context context, int i, Resources.Theme theme) {
        return C0808h.m3031f(context.getResources(), i, theme);
    }

    /* renamed from: e */
    private static Drawable m32591e(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            C0267d dVar = new C0267d(context, theme);
            dVar.mo743a(theme.getResources().getConfiguration());
            context = dVar;
        }
        return C5769a.m23210b(context, i);
    }
}
