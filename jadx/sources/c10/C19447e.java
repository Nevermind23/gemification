package c10;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.app.C0218d;
import he1.C41232r;
import he1.C41238w;
import i10.C25100c;
import java.util.Calendar;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p366bk.C10328q;
import ue1.C43079p;

/* renamed from: c10.e */
public final class C19447e implements C19445c {

    /* renamed from: a */
    private final Context f53666a;

    /* renamed from: b */
    private final C19452i f53667b;

    /* renamed from: c10.e$a */
    static final class C19448a extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ Boolean f53668d;

        /* renamed from: e */
        final /* synthetic */ int f53669e;

        /* renamed from: f */
        final /* synthetic */ int f53670f;

        /* renamed from: g */
        final /* synthetic */ int f53671g;

        /* renamed from: h */
        final /* synthetic */ C19454j f53672h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19448a(Boolean bool, int i, int i2, int i3, C19454j jVar) {
            super(2);
            this.f53668d = bool;
            this.f53669e = i;
            this.f53670f = i2;
            this.f53671g = i3;
            this.f53672h = jVar;
        }

        /* renamed from: a */
        public final void mo47664a(int i, int i2) {
            Calendar a = C19446d.m64949a();
            a.set(1, i);
            a.set(2, i2);
            if (C41536l.m120484d(this.f53668d, Boolean.TRUE)) {
                a.set(5, a.getActualMinimum(5));
            } else if (i == this.f53669e && i2 == this.f53670f) {
                a.set(5, this.f53671g);
            } else {
                a.set(5, a.getActualMaximum(5));
            }
            this.f53672h.mo47670a(a.getTimeInMillis());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo47664a(((Number) obj).intValue(), ((Number) obj2).intValue());
            return C41238w.f97225a;
        }
    }

    public C19447e(Context context, long j, long j2, long j3, Boolean bool, C19454j jVar) {
        String string;
        Boolean bool2 = bool;
        C41536l.m120489i(context, "context");
        C41536l.m120489i(jVar, "dateSetListener");
        this.f53666a = context;
        if (bool2 == null) {
            string = context.getString(C10328q.month_picker_default);
        } else if (C41536l.m120484d(bool2, Boolean.TRUE)) {
            string = context.getString(C10328q.month_picker_start_period);
        } else {
            string = context.getString(C10328q.month_picker_end_period);
        }
        String str = string;
        C41536l.m120488h(str, "when (startDatePicker) {…ker_end_period)\n        }");
        C41232r b = C19446d.m64950b(j3);
        int intValue = ((Number) b.mo95688a()).intValue();
        int intValue2 = ((Number) b.mo95689b()).intValue();
        int intValue3 = ((Number) b.mo95690c()).intValue();
        C19452i a = C19452i.f53683y.mo47669a(j, j2, j3, str);
        this.f53667b = a;
        a.mo47668H1(new C19448a(bool, intValue, intValue2, intValue3, jVar));
    }

    /* renamed from: d */
    public void mo47662d() {
        C19452i iVar = this.f53667b;
        Activity b = C25100c.m80063b(this.f53666a);
        C41536l.m120487g(b, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        iVar.mo4576A1(((C0218d) b).getSupportFragmentManager(), (String) null);
    }
}
