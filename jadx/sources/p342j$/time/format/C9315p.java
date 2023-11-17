package p342j$.time.format;

import java.util.Locale;
import p342j$.time.chrono.C9294f;
import p342j$.time.chrono.C9295g;
import p342j$.time.temporal.C9333a;
import p342j$.time.temporal.C9343k;
import p342j$.time.temporal.TemporalField;

/* renamed from: j$.time.format.p */
final class C9315p implements C9306g {

    /* renamed from: a */
    private final TemporalField f25810a;

    /* renamed from: b */
    private final TextStyle f25811b;

    /* renamed from: c */
    private final C9323x f25812c;

    /* renamed from: d */
    private volatile C9310k f25813d;

    C9315p(TemporalField temporalField, TextStyle textStyle, C9323x xVar) {
        this.f25810a = temporalField;
        this.f25811b = textStyle;
        this.f25812c = xVar;
    }

    /* renamed from: a */
    public final boolean mo25039a(C9321v vVar, StringBuilder sb) {
        String str;
        C9295g gVar;
        Long e = vVar.mo25080e(this.f25810a);
        if (e == null) {
            return false;
        }
        C9294f fVar = (C9294f) vVar.mo25079d().mo24922i(C9343k.m34499a());
        if (fVar == null || fVar == (gVar = C9295g.f25767a)) {
            str = this.f25812c.mo25037c(this.f25810a, e.longValue(), this.f25811b, vVar.mo25078c());
        } else {
            C9323x xVar = this.f25812c;
            TemporalField temporalField = this.f25810a;
            long longValue = e.longValue();
            TextStyle textStyle = this.f25811b;
            Locale c = vVar.mo25078c();
            xVar.getClass();
            str = (fVar == gVar || !(temporalField instanceof C9333a)) ? xVar.mo25037c(temporalField, longValue, textStyle, c) : null;
        }
        if (str == null) {
            if (this.f25813d == null) {
                this.f25813d = new C9310k(this.f25810a, 1, 19, C9299A.NORMAL);
            }
            return this.f25813d.mo25039a(vVar, sb);
        }
        sb.append(str);
        return true;
    }

    public final String toString() {
        StringBuilder sb;
        TextStyle textStyle = TextStyle.FULL;
        TemporalField temporalField = this.f25810a;
        TextStyle textStyle2 = this.f25811b;
        if (textStyle2 == textStyle) {
            sb = new StringBuilder("Text(");
            sb.append(temporalField);
        } else {
            sb = new StringBuilder("Text(");
            sb.append(temporalField);
            sb.append(",");
            sb.append(textStyle2);
        }
        sb.append(")");
        return sb.toString();
    }
}
