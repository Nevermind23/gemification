package p615tg;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import androidx.core.content.C0767a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p045d.C5769a;
import p341ge.bog.designsystem.components.common.Color;
import p601sg.C17777b;
import p601sg.C17778c;
import p601sg.C17780e;
import p642vh.C18368l;

/* renamed from: tg.e */
public abstract class C17964e {
    /* renamed from: a */
    public static final Drawable m61888a(Context context, Color color, int i, int i2) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(color, "color");
        Drawable b = C5769a.m23210b(context, C17780e.rounded_stroke_radius_16_invert_component_solid_1dp);
        GradientDrawable gradientDrawable = null;
        if (b == null) {
            return null;
        }
        if (b instanceof GradientDrawable) {
            gradientDrawable = (GradientDrawable) b;
        }
        if (gradientDrawable == null) {
            return b;
        }
        gradientDrawable.setStroke(i, color.mo35260a(context));
        gradientDrawable.setCornerRadius((float) i2);
        return b;
    }

    /* renamed from: b */
    public static /* synthetic */ Drawable m61889b(Context context, Color color, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = C18368l.m62762k(1);
        }
        if ((i3 & 8) != 0) {
            i2 = C18368l.m62762k(16);
        }
        return m61888a(context, color, i, i2);
    }

    /* renamed from: c */
    public static final CharSequence m61890c(List list) {
        Object obj;
        C41536l.m120489i(list, "<this>");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        for (Object next : list) {
            if (next == null) {
                obj = "";
            } else if (next instanceof CharSequence) {
                obj = (CharSequence) next;
            } else {
                obj = next.toString();
            }
            arrayList.add(obj);
        }
        Object[] array = arrayList.toArray(new CharSequence[0]);
        C41536l.m120487g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        CharSequence[] charSequenceArr = (CharSequence[]) array;
        CharSequence concat = TextUtils.concat((CharSequence[]) Arrays.copyOf(charSequenceArr, charSequenceArr.length));
        C41536l.m120488h(concat, "concat(\n        *(map {\n…  }.toTypedArray())\n    )");
        return concat;
    }

    /* renamed from: d */
    public static final void m61891d(String str, Context context) {
        C41536l.m120489i(str, "<this>");
        C41536l.m120489i(context, "context");
        Object systemService = context.getSystemService("clipboard");
        C41536l.m120487g(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("", str));
    }

    /* renamed from: e */
    public static final ColorStateList m61892e(TypedArray typedArray, int i, Context context, int i2, Color color) {
        C41536l.m120489i(typedArray, "<this>");
        C41536l.m120489i(context, "context");
        C41536l.m120489i(color, "defaultColorRes");
        ColorStateList colorStateList = typedArray.getColorStateList(i);
        if (colorStateList == null) {
            colorStateList = C0767a.m2894d(context, i2);
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ColorStateList valueOf = ColorStateList.valueOf(color.mo35260a(context));
        C41536l.m120488h(valueOf, "valueOf(defaultColorRes.getRawColor(context))");
        return valueOf;
    }

    /* renamed from: f */
    public static /* synthetic */ ColorStateList m61893f(TypedArray typedArray, int i, Context context, int i2, Color color, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = C17778c.selector_text_item_color;
        }
        if ((i3 & 8) != 0) {
            color = new Color.Attribute(C17777b.f49601r);
        }
        return m61892e(typedArray, i, context, i2, color);
    }

    /* renamed from: g */
    public static final ColorStateList m61894g(TypedArray typedArray, int i, Context context) {
        C41536l.m120489i(typedArray, "<this>");
        C41536l.m120489i(context, "context");
        return m61892e(typedArray, i, context, C17778c.selector_text_item_subtitle_color, new Color.Attribute(C17777b.f49599p));
    }
}
