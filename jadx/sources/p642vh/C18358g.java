package p642vh;

import android.content.res.ColorStateList;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.common.Color;

/* renamed from: vh.g */
public abstract class C18358g {
    /* renamed from: a */
    public static final Color m62727a(int i) {
        return new Color.Attribute(i);
    }

    /* renamed from: b */
    public static final Color m62728b(int i) {
        return new Color.Raw(i);
    }

    /* renamed from: c */
    public static final Color m62729c(int i) {
        return new Color.Resource(i);
    }

    /* renamed from: d */
    public static final Color m62730d(ColorStateList colorStateList) {
        C41536l.m120489i(colorStateList, "<this>");
        return new Color.StateList(colorStateList);
    }
}
