package c10;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.app.C0218d;
import com.google.android.material.datepicker.C5023l;
import com.google.android.material.datepicker.CalendarConstraints;
import he1.C41238w;
import i10.C25100c;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.util.MinMaxDateValidator;
import ue1.C43075l;

/* renamed from: c10.b */
public final class C19443b implements C19445c {

    /* renamed from: a */
    private final Context f53663a;

    /* renamed from: b */
    private final C5023l f53664b;

    /* renamed from: c10.b$a */
    static final class C19444a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19454j f53665d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19444a(C19454j jVar) {
            super(1);
            this.f53665d = jVar;
        }

        /* renamed from: a */
        public final void mo47663a(Long l) {
            C19454j jVar = this.f53665d;
            C41536l.m120488h(l, "it");
            jVar.mo47670a(l.longValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47663a((Long) obj);
            return C41238w.f97225a;
        }
    }

    public C19443b(Context context, long j, long j2, long j3, C19454j jVar) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(jVar, "dateSetListener");
        this.f53663a = context;
        C5023l a = C5023l.C5029f.m19565c().mo16276e(m64944b(j, j2, j3)).mo16278g(Long.valueOf(j)).mo16275a();
        a.mo16267J1(new C19442a(new C19444a(jVar)));
        C41536l.m120488h(a, "datePicker()\n           …          }\n            }");
        this.f53664b = a;
    }

    /* renamed from: b */
    private final CalendarConstraints m64944b(long j, long j2, long j3) {
        CalendarConstraints a = new CalendarConstraints.C4986b().mo16156c(j).mo16157d(j2).mo16155b(j3).mo16158e(new MinMaxDateValidator(Long.valueOf(j2), Long.valueOf(j3))).mo16154a();
        C41536l.m120488h(a, "Builder()\n            .s…te))\n            .build()");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m64945c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: d */
    public void mo47662d() {
        C5023l lVar = this.f53664b;
        Activity b = C25100c.m80063b(this.f53663a);
        C41536l.m120487g(b, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        lVar.mo4576A1(((C0218d) b).getSupportFragmentManager(), (String) null);
    }
}
