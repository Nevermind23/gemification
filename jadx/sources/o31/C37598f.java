package o31;

import android.text.InputFilter;
import android.text.Spanned;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C41536l;

/* renamed from: o31.f */
public final class C37598f implements InputFilter {

    /* renamed from: a */
    private final Pattern f90344a;

    public C37598f(Pattern pattern) {
        C41536l.m120489i(pattern, "pattern");
        this.f90344a = pattern;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        C41536l.m120489i(charSequence, "source");
        C41536l.m120489i(spanned, "dest");
        CharSequence subSequence = spanned.subSequence(0, i3);
        CharSequence subSequence2 = spanned.subSequence(i4, spanned.length());
        StringBuilder sb = new StringBuilder();
        sb.append(subSequence);
        sb.append(charSequence);
        sb.append(subSequence2);
        Matcher matcher = this.f90344a.matcher(sb.toString());
        C41536l.m120488h(matcher, "pattern.matcher(result)");
        if (!matcher.matches()) {
            return spanned.subSequence(i3, i4);
        }
        return null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C37598f(java.util.regex.Pattern r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L_0x000f
            java.lang.String r1 = "(^\\d+(?:\\.\\d{0,2})?$)*"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.lang.String r2 = "compile(\"(^\\\\d+(?:\\\\.\\\\d{0,2})?\\$)*\")"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
        L_0x000f:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o31.C37598f.<init>(java.util.regex.Pattern, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
