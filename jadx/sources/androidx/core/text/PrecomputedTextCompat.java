package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.util.C1002c;

public abstract class PrecomputedTextCompat implements Spannable {

    public static final class Params {

        /* renamed from: a */
        private final TextPaint f3602a;

        /* renamed from: b */
        private final TextDirectionHeuristic f3603b;

        /* renamed from: c */
        private final int f3604c;

        /* renamed from: d */
        private final int f3605d;

        /* renamed from: e */
        final PrecomputedText.Params f3606e;

        /* renamed from: androidx.core.text.PrecomputedTextCompat$Params$a */
        public static class C0962a {

            /* renamed from: a */
            private final TextPaint f3607a;

            /* renamed from: b */
            private TextDirectionHeuristic f3608b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            /* renamed from: c */
            private int f3609c = 1;

            /* renamed from: d */
            private int f3610d = 1;

            public C0962a(TextPaint textPaint) {
                this.f3607a = textPaint;
            }

            /* renamed from: a */
            public Params mo3419a() {
                return new Params(this.f3607a, this.f3608b, this.f3609c, this.f3610d);
            }

            /* renamed from: b */
            public C0962a mo3420b(int i) {
                this.f3609c = i;
                return this;
            }

            /* renamed from: c */
            public C0962a mo3421c(int i) {
                this.f3610d = i;
                return this;
            }

            /* renamed from: d */
            public C0962a mo3422d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f3608b = textDirectionHeuristic;
                return this;
            }
        }

        Params(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                C0980m.m3485a();
                this.f3606e = C0979l.m3484a(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f3606e = null;
            }
            this.f3602a = textPaint;
            this.f3603b = textDirectionHeuristic;
            this.f3604c = i;
            this.f3605d = i2;
        }

        /* renamed from: a */
        public boolean mo3411a(Params params) {
            int i = Build.VERSION.SDK_INT;
            if (this.f3604c != params.mo3412b() || this.f3605d != params.mo3413c() || this.f3602a.getTextSize() != params.mo3415e().getTextSize() || this.f3602a.getTextScaleX() != params.mo3415e().getTextScaleX() || this.f3602a.getTextSkewX() != params.mo3415e().getTextSkewX() || this.f3602a.getLetterSpacing() != params.mo3415e().getLetterSpacing() || !TextUtils.equals(this.f3602a.getFontFeatureSettings(), params.mo3415e().getFontFeatureSettings()) || this.f3602a.getFlags() != params.mo3415e().getFlags()) {
                return false;
            }
            if (i >= 24) {
                if (!this.f3602a.getTextLocales().equals(params.mo3415e().getTextLocales())) {
                    return false;
                }
            } else if (!this.f3602a.getTextLocale().equals(params.mo3415e().getTextLocale())) {
                return false;
            }
            if (this.f3602a.getTypeface() == null) {
                if (params.mo3415e().getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f3602a.getTypeface().equals(params.mo3415e().getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        /* renamed from: b */
        public int mo3412b() {
            return this.f3604c;
        }

        /* renamed from: c */
        public int mo3413c() {
            return this.f3605d;
        }

        /* renamed from: d */
        public TextDirectionHeuristic mo3414d() {
            return this.f3603b;
        }

        /* renamed from: e */
        public TextPaint mo3415e() {
            return this.f3602a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            if (mo3411a(params) && this.f3603b == params.mo3414d()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return C1002c.m3510b(Float.valueOf(this.f3602a.getTextSize()), Float.valueOf(this.f3602a.getTextScaleX()), Float.valueOf(this.f3602a.getTextSkewX()), Float.valueOf(this.f3602a.getLetterSpacing()), Integer.valueOf(this.f3602a.getFlags()), this.f3602a.getTextLocales(), this.f3602a.getTypeface(), Boolean.valueOf(this.f3602a.isElegantTextHeight()), this.f3603b, Integer.valueOf(this.f3604c), Integer.valueOf(this.f3605d));
            }
            return C1002c.m3510b(Float.valueOf(this.f3602a.getTextSize()), Float.valueOf(this.f3602a.getTextScaleX()), Float.valueOf(this.f3602a.getTextSkewX()), Float.valueOf(this.f3602a.getLetterSpacing()), Integer.valueOf(this.f3602a.getFlags()), this.f3602a.getTextLocale(), this.f3602a.getTypeface(), Boolean.valueOf(this.f3602a.isElegantTextHeight()), this.f3603b, Integer.valueOf(this.f3604c), Integer.valueOf(this.f3605d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f3602a.getTextSize());
            sb.append(", textScaleX=" + this.f3602a.getTextScaleX());
            sb.append(", textSkewX=" + this.f3602a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f3602a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f3602a.isElegantTextHeight());
            if (i >= 24) {
                sb.append(", textLocale=" + this.f3602a.getTextLocales());
            } else {
                sb.append(", textLocale=" + this.f3602a.getTextLocale());
            }
            sb.append(", typeface=" + this.f3602a.getTypeface());
            if (i >= 26) {
                sb.append(", variationSettings=" + this.f3602a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f3603b);
            sb.append(", breakStrategy=" + this.f3604c);
            sb.append(", hyphenationFrequency=" + this.f3605d);
            sb.append("}");
            return sb.toString();
        }

        public Params(PrecomputedText.Params params) {
            this.f3602a = params.getTextPaint();
            this.f3603b = params.getTextDirection();
            this.f3604c = params.getBreakStrategy();
            this.f3605d = params.getHyphenationFrequency();
            this.f3606e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
